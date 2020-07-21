/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.util.Arrays;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            char b=sc.next().charAt(0);
            if(b=='B' ||b=='b')
            {
                System.out.println("BattleShip");
            }
            else if(b=='C'||b=='c')
            {
                System.out.println("Cruiser");
            }
            else if(b=='D'||b=='d')
            {
                System.out.println("Destroyer");
            }
            else if(b=='F'||b=='f')
            {
                System.out.println("Frigate");
            }
            else
            {
                System.out.println("Error");
            }
        }
        
    }
}
