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
	        int arr[]=new int[length];
	        for(int i=0;i<length;i++)
	            arr[i]=sc.nextInt();
	        
	        int count=0;
	        int ans=0;
	        for(int i=0;i<length;i++)
	        {
	            if(arr[i]%2==0)
	                count++;
	            else
	                ans+=count;
	                
	        }
	        System.out.println(ans);
	    }
	}
}
