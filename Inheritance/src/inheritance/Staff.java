/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author egyve
 */
public class Staff extends MyClub {
    protected String task;

    public Staff(String nama, String gaji, String task) {
        super(nama, gaji);
        this.task = task;
    }
    
    @Override
    public String tugas(){
        return this.task;
    }
    
    @Override
    public void print(){
        System.out.println("--DATA STAFF--");
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Gaji\t: " + this.gaji);
        System.out.println("Tugas\t: " + this.task);
    }
}
