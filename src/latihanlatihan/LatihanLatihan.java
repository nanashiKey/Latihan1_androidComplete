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
        Scanner input = new Scanner(System.in);
        
        System.out.prit("masukkan jumlah Roda : ");
        int number = input.nextInt();

        System.out.print("masukkan nama mobil : ");
        String namaMobil = input.next();
        mobil.nama = Namamobil;
        System.out.print("masukkan jenis mobil : ");
        String jenisMobil = input.next();
        mobil.setJenis(jenisMobil);
        
        System.out.println(
                           "\n\n=========data output=========="+
                           "\nmobil = "+mobil.nama+
                           "\njenis mobil = "+mobil.getJenis()+
                           "\nmemiliki roda = "+mobil.getRoda()+
                           "\n"+mobil.getRoda(number));
        
        //uncomment
//        Motor motor = new Motor();
//        motor.Fungtion();
    }
    
}
