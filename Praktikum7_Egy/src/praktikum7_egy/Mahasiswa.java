/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7_egy;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double NA;
    
    public Mahasiswa(
            String nama, String npm, double nilaiTugas,
            double nilaiUts, double nilaiUas
    ){
        this.nama = nama;
        this.npm = npm;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
//        this.NA = (nilaiTugas*0.3)+(nilaiUts*0.35)+(nilaiUas*0.35);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public void setNA(double NA) {
        this.NA = NA;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public double getNA() {
        return NA;
    }
    
    public double hitungNA(){
        return this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas*0.35);
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.NA = (nilaiTugas*0.3) + (nilaiUts*0.35) + (nilaiUas*0.35);
    }
    
    public void hitungNA(String pesan){
        System.out.println("Nilai tidak valid");
    }
    
    void hitungTugas(ArrayList<Double>nilai){
        double sum=0;
        for(double i: nilai){
            sum += i;
        }
        this.nilaiTugas = sum / nilai.size();
    }
    
    public void printData(String jurusan){
        System.out.println("NPM\t\t:"+this.npm);
        System.out.println("Nama\t\t:"+this.nama);
        System.out.println("Jurusan\t\t:"+jurusan);
        System.out.println("Nilai Tugas\t:"+this.nilaiTugas);
        System.out.println("NIlai Akhir\t:"+this.NA);
    }
    
    public void printData(){
        System.out.println("NPM :"+this.npm);
        System.out.println("Nama :"+this.nama);
        System.out.println("Nilai tugas :"+this.nilaiTugas);
        System.out.println("Nilai UTS :"+this.nilaiUts);
        System.out.println("Nilai UAS :"+this.nilaiUas);
        System.out.println("NIlai Akhir :"+this.NA);
    }
}

