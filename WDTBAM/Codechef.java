/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
		    if(n>=1 && n<=1000)
		    {
		        String s1=sc.next();
		        String s2=sc.next();
		        int arr[]=new int[n+1];
		        for(int i=0;i<arr.length;i++)
		        {
		            arr[i]=sc.nextInt();
		        }
		        int count=0;
		        for(int i=0;i<s1.length();i++)
		        {
		            char c1=s1.charAt(i);
		            char c2=s2.charAt(i);
		            if(c2==c1)
		            {
		               count++; 
		            }
		        }
		        int max=0;
		        if(count!=s1.length())
		        {
		            for(int i=0;i<=count;i++)
		            {
		                if(max<arr[i])
		                {
		                    max=arr[i];
		                }
		            }
		        }
		        else{
		            max=arr[count];
		        }
		        System.out.println(max);
		    }
		}
	}
}
