/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlatihan;

import java.util.Scanner;

/**
 *
 * @author irfanasidiq
 */
public class LatihanLatihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mobil mobil = new Mobil();
        mobil.nama = "Avanza";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan jumlah Roda :");
        int number = input.nextInt();
        
        System.out.println("mobil "+mobil.nama+
                           "\nmemiliki roda "+number+
                           "\n"+mobil.getRoda(number));
    }
    
}
