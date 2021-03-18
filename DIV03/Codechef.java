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
	        int arr[]=new int[10];
	        for(int i=0;i<10;i++)
	            arr[i]=sc.nextInt();
	        int K=sc.nextInt();
	        if(K==0)
	        {
	            for(int i=9;i>=0;i--)
	            {
	                if(arr[i]!=0)
	                {
	                    System.out.println(i+1);
	                    break;
	                }
	            }
	        }
	        else
	        {
	            for(int i=9;i>=0;i--)
	            {
	                if(K-arr[i]>=0)
	                    K-=arr[i];
	                else if(K-arr[i]<0)
	                {
	                    System.out.println(i+1);
	                    break;
	                }
	            }
	        }
	    }
	}
}
