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
		    String arr[][]=new String[n][2];
		    for(int i=0;i<n;i++)
		    {
		        arr[i][0]=sc.next();
		        arr[i][1]=sc.next();
		    }
		    for(int i=0;i<n;i++)
		    {
		        int flag=0;
		        for(int j=0;j<n;j++)
		        {
		            if(i==j)
		            continue;
		            if(arr[i][0].equals(arr[j][0]))
		            {
		                flag=1;
		            }
		        }
		        if(flag==0)
		        {
		            System.out.println(arr[i][0]);
		        }
		        else if(flag==1)
		        {
		            System.out.println(arr[i][0]+" "+arr[i][1]);
		        }
		    }
		}
	}
}

