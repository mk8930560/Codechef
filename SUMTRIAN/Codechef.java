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
		    int a=sc.nextInt();
		    int arr[][]=new int[a][a];
		    for(int i=0;i<a;i++)
		    {
		        for(int j=0;j<=i;j++)
		        {
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    for(int i=a-1;i>=1;i--)
		    {
		        for(int j=0;j<a-1;j++)
		        {
		            if(arr[i][j]>arr[i][j+1])
		            {
		                arr[i-1][j]=arr[i-1][j]+arr[i][j];
		            }
		            else if(arr[i][j]<arr[i][j+1])
		            {
		                arr[i-1][j]=arr[i-1][j]+arr[i][j+1];
		            }
		            else
		            {
		                arr[i-1][j]=arr[i-1][j]+arr[i][j];
		            }
		        }
		    }
		    System.out.println(arr[0][0]);
		}
	}
}
