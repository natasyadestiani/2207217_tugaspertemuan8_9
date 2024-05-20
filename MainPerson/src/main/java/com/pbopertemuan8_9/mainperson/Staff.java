/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan8_9.mainperson;

/**
 *
 * @author ASUS
 */

public class Staff extends Employee {
    private final String gelar;

    public Staff(String nama, String alamat, String telepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, telepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gelar: " + gelar;
    }
}