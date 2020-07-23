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
		    int total_packs=sc.nextInt();
		    int arr[]=new int[total_packs];
		    int sum=0;
		    for(int i=0;i<total_packs;i++)
		    {
		        arr[i]=sc.nextInt();
		        sum+=arr[i];
		    }
		    if(sum%2==0)
		    {
		        System.out.println("NO");
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		}
	}
}
