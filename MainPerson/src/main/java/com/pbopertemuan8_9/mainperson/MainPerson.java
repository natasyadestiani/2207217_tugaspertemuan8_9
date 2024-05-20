/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbopertemuan8_9.mainperson;

/**
 *
 * @author ASUS
 */

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Natasya Destiani", "Jl. Cempaka No.114", "085724940244", "ntsydstn@gmail.com");
        Student student = new Student("Dimas Nur Rizki", "Jl. Cicalengka No.9", "08123398156", "dimasnr@gmail.com", Student.JUNIOR);
        MyDate tanggalDipekerjakan = new MyDate(2022, 2, 22);
        Employee employee =new Employee("Desti", "Jl. Kencana No.12", "081322412345", "desti@gmail.com", "ITB Cabang", 
                3500000, tanggalDipekerjakan);
        Faculty faculty = new Faculty("Dewi Kurniasih", "Jl. Pahlawan No.3", "085790885689", "dewi@gmail.com", "ITB Pusat", 
                7500000, tanggalDipekerjakan, "9-4", "Profesor");
        Staff staff = new Staff("Anggia Rahma", "Jl. Soekarno Hatta No.145", "089622245621", "anggiar@gmail.com", "ITB Cabang", 2700000, 
                tanggalDipekerjakan, "Manajer");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
