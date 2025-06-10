<%@ page import="java.util.List, com.example.guestbook.GuestEntry" %>
    <%@ page contentType="text/html;charset=UTF-8" %>
        <!DOCTYPE html>
        <html lang="en">
            <head>
                <meta charset="UTF-8">
                <title>Guest Messages (｡･ω･｡)ﾉ♡</title>
                <link rel="stylesheet" href="css/style.css">
            </head>
            <body>
                <div class="container">
                    <h1>Guest Messages (≧◡≦) ♡</h1>
                    <% List<GuestEntry> entries = (List<GuestEntry>) request.getAttribute("entries");
                            if (entries == null || entries.isEmpty()) {
                            %>
                            <p>(╥﹏╥) No messages yet... Be the first to post!</p>
                            <% } else { for (GuestEntry entry : entries) { %>
                                <div class="message">
                                    <h3>✉️ <%= entry.getNama() %> <small>(<%= entry.getEmail() %>)</small></h3>
                                    <p>💬 "<%= entry.getPesan() %>"</p>
                                </div>
                                <% } } %>
                                    <a href="index.jsp">← Go back and leave your own message (•̀ᴗ•́)و ̑̑</a>
                </div>
            </body>
        </html>