/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

import java.util.Scanner;

/**
 *
 * @author egyve
 */
public class Pbo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      
        int array, i, search;
        array = input.nextInt();
        int arr[] = new int[array];
      
        for(i=0; i<array; i++){
            arr[i] = input.nextInt();
        }
      
        search = input.nextInt();
      
        for(i=0; i<array; i++){
            if(arr[i] == search){
                System.out.println("Nilai ditemukan");
                break;
            }
        }
        
        if (i == array){
            System.out.println("Nilai tidak ditemukan");
        }
    }
    
}
