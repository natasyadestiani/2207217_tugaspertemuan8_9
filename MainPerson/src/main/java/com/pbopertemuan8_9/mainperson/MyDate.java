/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan8_9.mainperson;

/**
 *
 * @author ASUS
 */

public class MyDate {
    private final int tahun;
    private final int bulan;
    private final int hari;

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return tahun + "-" + String.format("%02d", bulan) + "-" + String.format("%02d", hari);
    }
}