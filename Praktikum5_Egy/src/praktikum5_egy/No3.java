/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_egy;

import java.util.Scanner;

/**
 *
 * @author egyve
 */
public class No3 {
    public static void main(String[] argument){
        Scanner read = new Scanner(System.in);
        String statement1 = read.nextLine(); 
        String statement2 = read.nextLine();
        
        if (statement1.contains(statement2)){
            System.out.print("Ya");
        } else {
            System.out.print("Tidak");
        } 
    }
}
