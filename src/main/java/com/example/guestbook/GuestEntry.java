package com.example.guestbook;

public class GuestEntry {
    private String nama, email, pesan;

    public GuestEntry(String nama, String email, String pesan) {
        this.nama = nama;
        this.email = email;
        this.pesan = pesan;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPesan() {
        return pesan;
    }
}
