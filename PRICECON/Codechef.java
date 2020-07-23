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
		    int total=sc.nextInt();
		    int maxval=sc.nextInt();
		    int arr[]=new int[total];
		    int sum1=0;
		    int sum2=0;
		    for(int i=0;i<total;i++)
		    {
		        arr[i]=sc.nextInt();
		        sum1+=arr[i];
		        if(arr[i]>maxval)
		        {
		            sum2+=maxval;
		        }
		        else if(arr[i]<=maxval)
		        {
		            sum2+=arr[i];
		        }
		    }
		    System.out.println(sum1-sum2);
		}
	}
}
