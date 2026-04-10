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
public class DaftarNamaTamu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. input jumlah tamu
        System.out.print("Masukkan jumlah tamu : ");
        int jumlahTamu = scan.nextInt();
        
        // 2. buat array untuk menyimpan nama
        String[] namaTamu = new String[jumlahTamu];
        
        // input nama tamu satu per satu 
        for (int i = 0; i < jumlahTamu; i++){
            System.out.println("\n== Daptar Nama Tamu ==");
        }
            
       // 3. Tampilkan semua nama tamu
        for (int i = 0; i < jumlahTamu; i++){
            System.out.println("Tamu " + (i+ i) + ": " + namaTamu[i]);
        }
            
        //. Hitung nama yang dijadwali huruf 'A'
        int jumlahA = 0;
        for (int i = 0; i < jumlahTamu; i++){
            if (namaTamu[i].toUpperCase().startsWith("A")) {
                jumlahA++;
            }
        }
            System.out.println("\njumlah tamu dengan nama diawali huruf 'A': " + jumlahA);
            
            scan.close(); 
        }
    }
