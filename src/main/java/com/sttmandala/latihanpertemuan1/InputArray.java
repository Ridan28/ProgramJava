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
public class InputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berapa banyak data yang mau disimpan? ");
        int jumlah = scan.nextInt();
        
        //Buat array kosong dengan panjang sesuai input user
        int[] data = new int[jumlah];
        
        // loop untuk mengisi array
        for (int i = 0; i < jumlah; i++)  {
            System.out.print("Masukkan data ke-" + (i + i) + ": ");
            data[i] = scan.nextInt();
        }
        
        // Loop untuk menampilkan kembali isi array
        System.out.print("\n--- Data yang tersimpan ---");
        for (int i = 0; i < jumlah; i++)  {
            System.out.print("Data[" + i + "] = " + data[i]);
        }
        
        scan.close();
    }
}
