/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm8_egy;

import java.text.DecimalFormat;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat koma = new DecimalFormat("0.00000");
        
        float a = input.nextInt();
        if(a >= 0 && a <= 360){
            System.out.print((koma.format(Math.sin(Math.toRadians(a))))+" ");
            System.out.print((koma.format(Math.cos(Math.toRadians(a))))+" ");
            System.out.print(koma.format(Math.tan(Math.toRadians(a))));
        }
    }
}
