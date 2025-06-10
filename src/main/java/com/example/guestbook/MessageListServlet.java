package com.example.guestbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;
import java.util.*;

@WebServlet("/messages")
public class MessageListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<GuestEntry> entries = new ArrayList<>();

        try (Connection conn = DBConnection.initializeDatabase();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM guestbook")) {

            while (rs.next()) {
                entries.add(new GuestEntry(
                        rs.getString("nama"),
                        rs.getString("email"),
                        rs.getString("pesan")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("entries", entries);
        RequestDispatcher dispatcher = request.getRequestDispatcher("messages.jsp");
        dispatcher.forward(request, response);
    }
}
