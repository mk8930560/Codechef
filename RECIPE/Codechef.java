/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int gcd(int a,int b)
    {
        if(a==0)
        return b;
        else
        return gcd(b%a,a);
    }
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
		    int result=arr[0];
		    for(int i=1;i<n;i++)
		    {
		        result=gcd(arr[i],result);
		        if(result==1)
		        {
		            break;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr[i]/result+" ");
		    }
		    System.out.println("");
		    
		}
	}
}
