/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author egyve
 */
public abstract class MyClub implements ViewData{
    protected String nama;
    protected String gaji;

    public MyClub(String nama, String gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public MyClub() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }
    
    public String tugas(){
        return tugas();
    }
    
    public String posisi(){
        return posisi();
    }
    
    public String jabatan(){
        return jabatan();
    }
}
