/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import db.DBHelper;
import java.util.ArrayList;

/**
 *
 * @author egyve
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DBHelper.getConnection();
        MahasiswaModel mhs = new MahasiswaModel();
        
        Mahasiswa mhs1 = new Mahasiswa("2117051055", "Ronaldinho", "2117051078");
        mhs.updateMahasiswa(mhs1);

//        Mahasiswa mhs1 = new Mahasiswa("2117051001", "Zinedine Zidane");
//        mhs.addMahasiswa(mhs1);
        
        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
        
        for(int i = 0;i < listMahasiswa.size(); i++){
            System.out.println("Nama : " + listMahasiswa.get(i).getNama());
            System.out.println("NPM  : " + listMahasiswa.get(i).getNpm());
            System.out.println("");

        }
    }
    
}
