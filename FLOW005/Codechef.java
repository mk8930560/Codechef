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
		int arr[]={100,50,10,5,2,1};
		while(t-->0)
		{
		    int value=sc.nextInt();
		    int count=0;
		    for(int i=0;i<arr.length;)
		    {
		        if(arr[i]>value)
		        {
		            i++;
		        }
		        else if(arr[i]<=value)
		        {
		            value=value-arr[i];
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
