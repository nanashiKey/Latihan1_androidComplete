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
public class Motor extends Kendaraan implements Fungsionalitas{

    String mode;
    
    @Override
    public int getRoda() {
        return super.getRoda(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRoda(int roda) {
        super.setRoda(roda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJenis() {
        return super.getJenis(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJenis(String jenis) {
        super.setJenis(jenis); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Melaju() {
        System.out.println("Motor sedang melaju");
    }

    @Override
    public void Berhenti() {
        System.out.println("Motor berhenti");
    }

    @Override
    public void Nyalakan() {
        System.out.println("Motor berhasil dinyalakan");
    }

    @Override
    public void Matikan() {
        System.out.println("Motor berhasil dimatikan");
    }
    
    public void Fungtion(){
        System.out.println("====> keterangan pilihan fungsi motor <====\n"
                + "1. motor dinyalakan\n"
                + "2. motor melaju\n"
                + "3. motor berhenti\n"
                + "4. motor dimatikan\n"
                + "5. programm berhenti.\n"
                + "=====================\n"+
                "silahkan masukkan pilihan : ");
        Scanner input = new Scanner(System.in);
        int dataInput= input.nextInt();
        
         if(
             //masukkan logika yang tepat agar pilihan-pilihan diatas dapat berjalan
              ){
            switch (dataInput){
                case 1 :{
                        this.Nyalakan();
                        System.out.println("><><><><><><><><");
                        this.Fungtion();
                    }
                break;
                case 2 :{
                        this.Melaju();
                        System.out.println("><><><><><><><><");
                        this.Fungtion();

                    }
                break;
                case 3 :{
                        this.Berhenti();
                        System.out.println("><><><><><><><><");
                        this.Fungtion();
                    }
                break;
                case 4 :{
                    this.Matikan();
                }
                break;
                default:{
                    //do nothing
                }
            }
         }
         else if(dataInput == 5){
            System.out.println("program berhenti");
         }
         else{
            System.out.println("masukkan data yg valid !!!");
            this.Fungtion();
         }
         
        }
    
}
