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
		    int Maxprotein=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int remaning=0;
		    int flag=1;
		    for(int i=0;i<n;i++)
		    {
		        if(remaning+arr[i]>=Maxprotein)
		        {
		            remaning=(remaning+arr[i])-Maxprotein;
		        }
		        else
		        {
		            remaning=i;
		            flag=0;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println("NO"+" "+(remaning+1));
		    }
		    else
		    {
		        System.out.println("YES");
		    }
		    
		}
	}
}
