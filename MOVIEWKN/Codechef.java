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
		    int L[]=new int[n];
		    int R[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        L[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        R[i]=sc.nextInt();
		    }
		    int maxLR=0;
		    int temp=0;
		    for(int i=0;i<n;i++)
		    {
		        if(maxLR<L[i]*R[i])
		        {
		            maxLR=L[i]*R[i];
		            temp=i;
		        }
		        else if(maxLR==L[i]*R[i])
		        {
		            if(R[i]>R[temp])
		            {
		                maxLR=L[i]*R[i];;
		                temp=i;
		            }
		        }
		    }
		    System.out.println(temp+1);
		}
	}
}
