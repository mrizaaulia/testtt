/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rizaps;

/**
 *
 * @author ASUS
 */
public abstract class Orang {
    // ENCAPSULATION: atribut private, diakses lewat getter/setter
    private String nama;
    private String telepon;

    public Orang(String nama, String telepon) {
        this.nama = nama;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    // method abstract: wajib ditimpa oleh subclass
    public abstract String getPeran();

    public void tampilkanInfo() {
        System.out.println("Peran    : " + getPeran());
        System.out.println("Nama     : " + nama);
        System.out.println("Telepon  : " + telepon);
    }
}
