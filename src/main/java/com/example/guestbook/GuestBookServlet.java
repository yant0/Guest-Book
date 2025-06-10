package com.example.guestbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/guestbook")
public class GuestBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nama = request.getParameter("nama");
        String email = request.getParameter("email");
        String pesan = request.getParameter("pesan");

        try (Connection conn = DBConnection.initializeDatabase()) {
            PreparedStatement stmt = conn
                    .prepareStatement("INSERT INTO guestbook (nama, email, pesan) VALUES (?, ?, ?)");
            stmt.setString(1, nama);
            stmt.setString(2, email);
            stmt.setString(3, pesan);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("messages");
    }
}
