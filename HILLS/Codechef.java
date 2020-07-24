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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int total=sc.nextInt();
		    int U=sc.nextInt();
		    int D=sc.nextInt();
		    int arr[] = new int[total];
		    for(int i=0;i<total;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int index=1;
		    int parsuteused=0;
		    for(int i=0;i<total-1;i++)
		    {
		        if(arr[i]<arr[i+1])
		        {
		            if(arr[i+1]-arr[i]<=U)
		                index+=1;
		            else
		                break;
		        }
		        else if(arr[i]>arr[i+1])
		        {
		            if(arr[i]-arr[i+1]<=D)
		                index+=1;
		            else if(parsuteused==0)
		            {
		                index+=1;
		                parsuteused=1;
		            }
		            else
		                break;
		        }
		        else if(arr[i]==arr[i+1])
		            index+=1;
		    }
		    System.out.println(index);
		}
	}
}
