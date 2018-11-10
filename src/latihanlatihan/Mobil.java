/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlatihan;

/**
 *
 * @author irfanasidiq
 */
public class Mobil extends Kendaraan implements Fungsionalitas{

    String nama;
    
    public Mobil(){
        
    }
    
    public Mobil(String jenis, int roda, String nama){
        this.jenis = jenis;
        this.jumlahRoda = roda;
        this.nama = nama;
                
    }
    
    @Override
    public int getRoda() {
       return jumlahRoda;
    }
    
    public String getRoda(int roda){
        if(roda == 4){
            return "mobil siap dikendarai";
        }else{
            return "Mobil belum siap dikendarai";
        }
    }

    @Override
    public void setRoda(int roda) {
        this.jumlahRoda = roda;
    }

    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void Melaju() {
        System.out.println("Mobil sedang melaju");
    }

    @Override
    public void Berhenti() {
        System.out.println("Mobil berhenti");
    }

    @Override
    public void Nyalakan() {
        System.out.println("Mobil berhasil dinyalakan");
    }

    @Override
    public void Matikan() {
        System.out.println("Mobil berhasil dimatikan");
    }

}
