/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum5_egy;

import java.util.Scanner;

/**
 *
 * @author egyve
 */
public class Praktikum5_Egy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int n = masuk.nextInt(); 
        String[] a = new String[n]; 

        for (int i=0; i<n; i++)
        {
            a[i] = masuk.next(); 
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(a[i] + " "); 
        }
    }
}
