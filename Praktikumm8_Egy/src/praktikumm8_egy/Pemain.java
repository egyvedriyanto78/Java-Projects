/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm8_egy;

/**
 *
 * @author egyve
 */
public class Pemain {

    String warna;
    double ukuran;
    int posX = 100, posY = 100, v = 1;

    public Pemain() {
        this.warna = "Hitam";
        this.ukuran = 10;
        this.posX = 100;
        this.posY = 100;
        this.v = 1;
    }

    public Pemain(String warna, double ukuran, int posX, int posY, int v) {
        this.warna = warna;
        this.ukuran = ukuran;
        this.posX = posX;
        this.posY = posY;
        this.v = v;
    }

    public Pemain(String warna, double ukuran) {
        this.warna = warna;
        this.ukuran = ukuran;
        this.posX = 100;
        this.posY = 100;
        this.v = 1;
    }

    public void atas() {
        if (this.posY < 0) {
            this.posY = 0;
        } else {
            this.posY -= v;
        }
    }

    public void bawah() {
        if (this.posY > 200) {
            this.posY = 200;
        } else {
            this.posY += v;
        }
    }

    public void kiri() {
        if (this.posX < 0) {
            this.posX = 0;
        } else {
            this.posX -= v;
        }
    }

    public void kanan() {
        if (this.posX > 200) {
            this.posX = 200;
        } else {
            this.posX += v;
        }
    }
}
