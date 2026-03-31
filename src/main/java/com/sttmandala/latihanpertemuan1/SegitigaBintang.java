/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sttmandala.latihanpertemuan1;

/**
 *
 * @author LENOVO
 */
public class SegitigaBintang {
    public static void main(String[] args) {
        int tinggi = 5;
        
        for (int i = 1; 1 <= tinggi; i++) {          // Loop Baris
            for (int j = 1; j <= i; j++) {          // Loop Kolom
                System.out.print("* ");
            }
            System.out.println(); // Ganti baris baru
        }
    }
}
