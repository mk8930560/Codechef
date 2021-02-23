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
	        int laddu=sc.nextInt();
	        int child=sc.nextInt();
	        int arr[]=new int[laddu];
	        for(int i=0;i<laddu;i++)
	            arr[i]=sc.nextInt();
	        Arrays.sort(arr);
	        if(child==1)
	            System.out.println("0");
	        else
	        {
	            int min=1000000000;
	            for(int i=0;i<=(laddu-child);i++)
	            {
	                if(arr[i+child-1]-arr[i]<min)
	                    min=arr[i+child-1]-arr[i];
	            }
	            System.out.println(min);
	        }
	    }
	}
}
