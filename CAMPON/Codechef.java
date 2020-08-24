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
	        int arr[]=new int[31];
	        while(n-->0)
	        {
	            int index=sc.nextInt();
	            int value=sc.nextInt();
	            arr[index-1]=value;
	        }
	        int sedule=sc.nextInt();
	        while(sedule-->0)
	        {
	            int index=sc.nextInt();
	            int total_problem=sc.nextInt();
	            int sum=0;
	            for(int i=0;i<=index-1;i++)
	                sum+=arr[i];
	            if(sum>=total_problem)
	                System.out.println("Go Camp");
	            else
	                System.out.println("Go Sleep");
	        }
	    }
	}
}
