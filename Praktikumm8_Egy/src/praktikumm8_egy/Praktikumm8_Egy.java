/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumm8_egy;

import java.util.Scanner;
public class Praktikumm8_Egy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int jumlah_deret = 10;
        
        for(int i=0; i<jumlah_deret; i++){
            System.out.println(a + (b*i));
        }
    }    
}
