/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void Find(int H,int P)
    {
        if(P==1 && H==1)
        {
            System.out.println("1");
        }
        else if(P==0 && H>0 || P>0 &&H<=0){
            if(P==0 && H>0)
                System.out.println("0");
            else if(P>0 &&H<=0)
                System.out.println("1");
        }else
            Find(H-P,P/2);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int H=sc.nextInt();
		    int P=sc.nextInt();
		    Find(H,P);
		}
	}
}
