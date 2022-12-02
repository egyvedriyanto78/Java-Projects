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
public class No2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String word;
        word = read.nextLine(); 
        int x = read.nextInt();  
        int y = read.nextInt(); 
        
        System.out.println(word.substring(x, y));
    }
}
