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
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    boolean fail=false;
		    int checkexcelent=0;
		    float total=0;
		    for(int i=0;i<n;i++)
		    {
		        total+=arr[i];
		        if(arr[i]<=2)
		        {
		            fail=true;
		            break;
		        }
		        else if(arr[i]==5)
		        {
		           checkexcelent=1; 
		        }
		    }
		    if(fail || checkexcelent==0)
		    {
		        System.out.println("No");
		    }
		    else if(checkexcelent==1)
		    {
		        if(total/n>=4.0)
		        {
		            System.out.println("Yes");
		        }
		        else
		        {
		            System.out.println("No");
		        }
		    }
		}
	}
}
