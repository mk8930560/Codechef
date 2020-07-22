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
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int product=1;
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            product=arr[i]*arr[j];
		            String s=Integer.toString(product);
		            int newsum=0;
		            for(int k=0;k<s.length();k++)
		            {
		                char c=s.charAt(k);
		                newsum+=Integer.parseInt(String.valueOf(c));
		            }
		            if(newsum>sum)
		            {
		                sum=newsum;
		            }
		        }
		    }
		    System.out.println(sum);
		}
	}
}
