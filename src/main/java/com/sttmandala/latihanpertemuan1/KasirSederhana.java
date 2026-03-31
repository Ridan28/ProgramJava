/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sttmandala.latihanpertemuan1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int harga;
        String pilihan;

        System.out.println("--- Program Kasir Sederhana ---");

        do {
            // 1. Meminta user memasukkan harga barang
            System.out.print("Masukkan harga barang: ");
            harga = scan.nextInt();
            
            // Menjumlahkan harga ke total
            total = total + harga;

            // 2. Bertanya: "Ada barang lagi? (y/n)"
            System.out.print("Ada barang lagi? (y/n): ");
            pilihan = scan.next();

            // 3. Jika 'y', loop akan berulang (syarat di while)
        } while (pilihan.equalsIgnoreCase("y"));

        // 4. Jika 'n', tampilkan total harga
        System.out.println("\n----------------------------");
        System.out.println("Total Harga: Rp " + total);
        System.out.println("Terima kasih sudah berbelanja!");

        scan.close();
    }
}