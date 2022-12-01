/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egy_strukturkontrol;

import java.util.Scanner;

/**
 *
 * @author egyve
 */
public class Egy_StrukturKontrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char back;
        do{
            System.out.println("");
            System.out.println("Apakah antum lapar?");
            System.out.println("Tekan 1 jika lapar, tekan 2 jika kenyang.");
            int read = input.nextInt();
            char read2;
            if(read==1){
                System.out.println("mau makan buah?");
                read2 = input.next().charAt(0);
                if(read2=='y'){
                    System.out.println("ni buah :v");
                }else{
                    System.out.println("Yauda kalo gak mau ;v");
                }
            }else if(read==2){
                System.out.println("Yo wes sek ngono");
            }else{
                System.out.println("error gan");
            }
            
            System.out.println("");
            System.out.println("");
            
            System.out.println("Pilih menu dulu gan");
            System.out.println("1. if");
            System.out.println("2. for loop");
            System.out.println("3. continue");
            
            int menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.println("apakah 10 > 9?");
                    if(10>9){
                        System.out.println("benar sekalih");
                    }
                    break;
                case 2:
                    System.out.println("");
                    for(int i=0; i<=9; i++){
                        System.out.println(i+1);
                    }
                    break;
                case 3:
                    System.out.println("");
                    for(int i=0; i<=9; i++){
                        if(i%3==0)
                            continue;
                        System.out.println(i);
                    }
                    break;
                default :
                    System.out.println("error");
                    break;
            }
            
            System.out.println("");
            System.out.println("Mau ngisi ulang ngab?");
            back = input.next().charAt(0);
            
        }while(back == 'Y' || back == 'y');
        
        while(back != 'Y' || back != 'y'){
            System.out.println("Thank u ngabb!");
            break;
        }
    }
}
