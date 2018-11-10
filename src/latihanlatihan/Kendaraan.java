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
public class Kendaraan {
    String jenis;
    int jumlahRoda;
    
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setRoda(int roda){
        jumlahRoda = roda;
    }
    
    public int getRoda(){
        return jumlahRoda;
    }
}
