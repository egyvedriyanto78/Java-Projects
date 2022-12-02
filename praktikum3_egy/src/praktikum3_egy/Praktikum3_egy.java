/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3_egy;

import java.util.Scanner;

/**
 *
 * @author egyve
 */
public class Praktikum3_egy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int nilai;
        String huruf_mutu;
        char rerun;
        
        do{
            System.out.print("Masukan nilai : ");
            nilai = input.nextInt();
            
            if(nilai > 100){
                huruf_mutu = "S";
            }else if(nilai >= 76){
                huruf_mutu = "A";
            }else if(nilai >= 71){
                huruf_mutu = "B+";
            }else if(nilai >= 66) {
                huruf_mutu = "B";
            }else if(nilai >= 61){
                huruf_mutu = "C+";
            }else if(nilai >= 56){
                huruf_mutu = "C";
            }else if(nilai >= 51){
                huruf_mutu = "D";
            }else{
                huruf_mutu = "E";
            }
            
            switch(huruf_mutu){
                case "A":
                    System.out.println("Istimewa");
                    break;
                case "B+":
                    System.out.println("Sangat Baik");
                    break;
                case "B":
                    System.out.println("Baik");
                    break;
                case "C+":
                    System.out.println("Cukup Baik");
                    break;
                case "C":
                    System.out.println("Cukup");
                    break;
                case "D":
                    System.out.println("Kurang");
                    break;
                case "E":
                    System.out.println("Tidak Lulus");
                    break;
                case "S":
                    System.out.println("Input tidak sesuai!");
                    break;
                default :
                    System.out.println("Error !");        
            }
            
            System.out.println("Apakah ingin memasukkan nilai lagi? (Y/N)");
            rerun = input.next().charAt(0);
            
        }while(rerun == 'Y' || rerun == 'y');
        
        while(rerun == 'N' || rerun == 'n'){
            System.out.println("TERIMA KASIH !!!");
            break;
        }
    }
    
}
