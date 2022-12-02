/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm8_egy;

/**
 *
 * @author egyve
 */
public class NasabahBank {
    String nama;
    String noRekening;
    double saldo;
    
    public void cetak(){
        System.out.println("Nama: " + nama);
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Saldo: " + saldo);
    }
    
    public NasabahBank(){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }
    
    public NasabahBank(String nama, String noRekening, double saldo){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }
    
    public NasabahBank(String nama, String noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 0;
    }
    
    public void setoran(double nilai){
        this.saldo = this.saldo+nilai;
    }
    
    public void tarik(double nilai){
        if(nilai<saldo){
            this.saldo = this.saldo-nilai;
        }else{
            System.out.println("Saldo tidak cukup");
        }
    }
}
