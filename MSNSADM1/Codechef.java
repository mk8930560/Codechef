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
		    int arr2[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int totalsum=0;
		    for(int i=0;i<n;i++)
		    {
		        arr2[i]=sc.nextInt();
		        if(((arr[i]*20)-(arr2[i]*10))>totalsum)
		        {
		            totalsum=((arr[i]*20)-(arr2[i]*10));
		        }
		        else if(totalsum<0)
		        {
		            totalsum=0;
		        }
		    }
		    System.out.println(totalsum);
		}
	}
}
