/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author egyve
 */
public class Players extends MyClub{
    protected String posisimain;

    public Players(String nama, String gaji, String posisimain) {
        super(nama, gaji);
        this.posisimain = posisimain;
    }

    @Override
    public String posisi(){
        return this.posisimain;
    }
    
    @Override
    public void print(){
        System.out.println("--DATA PLAYER--");
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Gaji\t: " + this.gaji);
        System.out.println("Posisi\t: " + this.posisimain);
    }
}
