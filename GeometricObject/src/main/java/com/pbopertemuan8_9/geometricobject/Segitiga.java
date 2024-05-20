/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopertemuan8_9.geometricobject;

/**
 *
 * @author ASUS
 */
public class Segitiga extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Konstruktor tanpa argumen
    public Segitiga() {
        super();
    }

    // Konstruktor dengan argumen untuk sisi-sisi segitiga
    public Segitiga(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Metode pengakses untuk ketiga bidang data
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Metode untuk menghitung luas segitiga menggunakan rumus Heron
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Metode untuk menghitung keliling segitiga
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Metode untuk mengembalikan deskripsi string untuk segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}
