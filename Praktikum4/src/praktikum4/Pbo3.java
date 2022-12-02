/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

import java.util.Scanner;

/**
 *
 * @author egyve
 */
public class Pbo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int array, i, sum = 0;
        array = input.nextInt();
        int arr[] = new int[array];
      
        for(i=0; i<array; i++){
            arr[i] = input.nextInt();
        }
        
        for(i=0; i<array; i++){
            sum += arr[i];
        }
        
        System.out.print(sum);
    }
}
