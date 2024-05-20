/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan8_9.mainperson;

/**
 *
 * @author ASUS
 */

public class Employee extends Person {
    private final String kantor;
    private final double gaji;
    private final MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String telepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, telepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kantor: " + kantor + ", Gaji: " + gaji + 
                ", Tanggal Dipekerjakan: " + tanggalDipekerjakan;
    }
}
