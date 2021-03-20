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
	        int n = sc.nextInt();
	        int MaxInaDays=sc.nextInt();
	        int arr[] =new int[n];
	        
	        int InRisk=0;
	        int NotInRisk=0;
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            if(arr[i]>=80 || arr[i]<=9)
	                InRisk++;
	            else
	                NotInRisk++;
	        }
	        int maxday=0;
	        if(MaxInaDays==1)
	            System.out.println(n);
	        else
	        {
	            if(InRisk%MaxInaDays==0)
	                maxday+=InRisk/MaxInaDays;
	            else
	                maxday+=(InRisk/MaxInaDays)+1;
	                
	            if(NotInRisk%MaxInaDays==0)
	                maxday+=NotInRisk/MaxInaDays;
	            else
	                maxday+=(NotInRisk/MaxInaDays)+1;
	            System.out.println(maxday);
	        }
	    }
	}
}
