<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>GuestBook (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧</title>
            <link rel="stylesheet" href="css/style.css">
        </head>
        <body>
            <div class="container">
                <h1>Sign My GuestBook (⁀ᗢ⁀)</h1>
                <form action="guestbook" method="post">
                    <input type="text" name="nama" placeholder="Your Name (⌒‿⌒)" required><br>
                    <input type="email" name="email" placeholder="Your Email (•‿•)" required><br>
                    <textarea name="pesan" placeholder="Say something nice! (ღ✪v✪)ღ" required></textarea><br>
                    <button type="submit">Post Message (∩^o^)⊃━☆ﾟ.*･｡ﾟ</button>
                </form>
                <a href="messages">(｡♥‿♥｡) View Messages</a>
            </div>
        </body>
    </html>