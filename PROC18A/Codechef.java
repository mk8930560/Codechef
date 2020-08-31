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
	        int N=sc.nextInt();
	        int k=sc.nextInt();
	        int arr[]=new int[N];
	        for(int i=0;i<N;i++)
	            arr[i]=sc.nextInt();
	            
	        int Finalmin=0;
	        for(int i=0;i<=N-k;i++)
	        {
	            int min=0;
	            for(int j=i;j<=i+(k-1);j++)
	            {
	                min+=arr[j];
	            }
	            if(min>Finalmin)
	                Finalmin=min;
	        }
	        System.out.println(Finalmin);
	    }
	}
}
