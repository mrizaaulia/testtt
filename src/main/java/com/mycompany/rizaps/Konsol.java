package com.mycompany.rizaps;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public abstract class Konsol {
    private String kode;
    private double tarifPerJam;
    private String status;

    public Konsol(String kode, double tarifPerJam) {
        this.kode = kode;
        setTarifPerJam(tarifPerJam);
        this.status = "Tersedia";
    }

    public String getKode() {
        return kode;
    }

    public double getTarifPerJam() {
        return tarifPerJam;
    }

    // ENCAPSULATION: setter memvalidasi data sebelum disimpan
    public void setTarifPerJam(double tarifPerJam) {
        if (tarifPerJam > 0) {
            this.tarifPerJam = tarifPerJam;
        } else {
            throw new IllegalArgumentException("Tarif harus lebih dari 0");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Tersedia") || status.equals("Disewa") || status.equals("Rusak")) {
            this.status = status;
        } else {
            System.out.println("Status tidak valid: " + status);
        }
    }

    // method abstract: tiap jenis konsol menentukan namanya sendiri
    public abstract String getJenis();

    // method yang akan di-override (dasar polymorphism)
    public double hitungBiaya(int durasiJam) {
        return tarifPerJam * durasiJam;
    }

    public void tampilkanInfo() {
        System.out.println("Kode     : " + kode);
        System.out.println("Jenis    : " + getJenis());
        System.out.println("Tarif/jam: Rp" + String.format("%.0f", tarifPerJam));
        System.out.println("Status   : " + status);
    }
}