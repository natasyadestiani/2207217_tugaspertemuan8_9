/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan8_9.mainperson;

/**
 *
 * @author ASUS
 */

public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN_KEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status; // menyimpan salah satu dari empat nilai konstan yang dideklarasikan sebelumnya.

    public Student(String nama, String alamat, String telepon, String email, String status) {
        super(nama, alamat, telepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}