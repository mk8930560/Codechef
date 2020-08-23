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
	        int length=sc.nextInt();
	        int K=sc.nextInt();
	        int c=0;
	        int arr[]=new int[length];
	        for(int i=0;i<length;i++)
	        {
	            arr[i]=sc.nextInt();
	            if(arr[i]>1)
	                c++;
	        }
	        if(c<=K)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
