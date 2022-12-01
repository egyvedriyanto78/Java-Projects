/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author egyve
 */
public class Inheritance {
    public static void main(String[] args) {
        MyClub players = new Players("Halaand","50 Milyard","Striker");
        MyClub players2 = new Players("Neuer","300 Milyard","Goal Keeper");
        MyClub staff = new Staff("Darwin","30 juta","Menjaga Keamanan");
        MyClub staff2 = new Staff("Alex","50 juta","Membantu pelatih");
        MyClub boards = new Boards("CEO", "Perez","1 Trilyun");
        MyClub boards2 = new Boards("Coach Manager", "Stephen","10 Milyard");
    
        MyClub[] mc = new MyClub[6];
        mc[0] = players;
        mc[1] = players2;
        mc[2] = staff;
        mc[3] = staff2;
        mc[4] = boards;
        mc[5] = boards2;
        
        for(int i=0; i<6; i++){
            mc[i].print();
            System.out.println();
        }
    }
}
