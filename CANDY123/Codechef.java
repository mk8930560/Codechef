/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int maxLimak=sc.nextInt();
		    int maxBob=sc.nextInt();
		    int currentLimak=0;
		    int currentBob=0;
		    for(int i=1;i<1000;i++)
		    {
		        if(i%2!=0)
		        {
		           currentLimak+=i;
		           if(currentLimak>maxLimak)
		           {
		               System.out.println("Bob");
		               break;
		           }
		        }
		        else if(i%2==0)
		        {
		            currentBob+=i;
		            if(currentBob>maxBob)
		            {
		                System.out.println("Limak");
		                break;
		            }
		        }
		    }
		}
	}
}
