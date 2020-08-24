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
	        int n=sc.nextInt();
	        int Attack[]=new int[n];
	        int Defence[]=new int[n];
	        
	        for(int i=0;i<n;i++)
	            Attack[i]=sc.nextInt();
	        for(int i=0;i<n;i++)
	            Defence[i]=sc.nextInt();
	       
	        int value=0;
	        for(int i=0;i<n;i++)
	        {
	            if(i==0)
	            {
	                if(Defence[0]>Attack[1]+Attack[n-1])
	                {
	                    if(value<Defence[0])
	                        value=Defence[0];
	                }
	            }else if(i==n-1)
	            {
	                if(Defence[n-1]>Attack[n-2]+Attack[0])
	                {
	                    if(value<Defence[n-1])
	                        value=Defence[n-1];
	                }
	            }else
	            {
	                if(Defence[i]>Attack[i-1]+Attack[i+1])
	                {
	                    if(value<Defence[i])
	                        value=Defence[i];
	                }
	            }
	        }
	        if(value==0)
	            System.out.println("-1");
	        else
	            System.out.println(value);
	    }
	}
}
