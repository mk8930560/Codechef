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
	    int N=sc.nextInt();
	    int M=sc.nextInt();
	    int K=sc.nextInt();
	    int Tcerti=0;
	    while(N-->0)
	    {
	        int arr[]=new int[K+1];
	        int length=arr.length;
	        int total=0;
	        for(int i=0;i<length;i++)
	        {
	            arr[i]=sc.nextInt();
	            if(i<length-1)
	                total+=arr[i];
	        }
	        if(total>=M && arr[length-1]<=10)
	            Tcerti++;
	    }
	    System.out.println(Tcerti);
	}
}

