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
public class Pbo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int array, i, temp = 0;
        array = input.nextInt();
        int arr[] = new int[array];
      
        for(i=0; i<array; i++){
            arr[i] = input.nextInt();
        }
        
        for(i=0; i<array; i++){
            for(int j=i+1; j<array; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(i=0; i<array; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
