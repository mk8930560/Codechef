/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int Packets=sc.nextInt();
	        int FreeUse=sc.nextInt();
	        int time=0;
	        int cost=0;
	        int Flag=0;
	        while(Packets-->0)
	        {
	            int Minutes=sc.nextInt();
	            int Charge=sc.nextInt();
	            time+=Minutes;
	            if(Flag==0)
	            {
	                if(time>FreeUse)
	                {
	                    Flag=1;
	                    cost+=(time-FreeUse)*Charge;
	                }   
	            }
	            else if(Flag==1)
	            {
	                cost+=Minutes*Charge;
	            }
	        }
	        System.out.println(cost);
	    }
	}
}
