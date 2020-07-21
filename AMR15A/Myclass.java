/* package codechef; // don't place package name! */

import java.util.Scanner;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); 
        int counta=0;
        int countb=0;
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                counta++;
            }
            else
            {
                countb++;
            }
        }
        if(counta==countb)
        {
            System.out.println("NOT READY");
        }
        else if(counta>countb)
        {
            System.out.println("READY FOR BATTLE");
        }
        else
        {
            System.out.println("NOT READY");
        }
    }
}
