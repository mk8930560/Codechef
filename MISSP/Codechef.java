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
		    int x=sc.nextInt();
		    int arr[]=new int[x];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		        int count=0;
		        for(int j=0;j<arr.length;j++)
		        {
		            if(arr[i]==arr[j])
		            {
		                count+=1;
		            }
		        }
		        if(count%2!=0)
		        {
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		}
	}
}
