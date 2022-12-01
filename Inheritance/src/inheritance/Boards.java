/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author egyve
 */
public class Boards extends MyClub {
    protected String grade;

    public Boards(String grade, String nama, String gaji) {
        super(nama, gaji);
        this.grade = grade;
    }
    
    @Override
    public String jabatan(){
        return this.grade;
    }
    
    @Override
    public void print(){
        System.out.println("--DATA BOARDS--");
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Gaji\t: " + this.gaji);
        System.out.println("Jabatan\t: " + this.grade);
    }
}
