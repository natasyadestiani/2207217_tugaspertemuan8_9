/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan8_9.mainperson;

/**
 *
 * @author ASUS
 */

public class Faculty extends Employee {
    private final String jamKerja;
    private final String pangkat;

    public Faculty(String nama, String alamat, String telepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, telepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jam Kerja: " + jamKerja + ", Pangkat: " + pangkat;
    }
}