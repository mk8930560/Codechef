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
	        int N=sc.nextInt();
	        int arr[]=new int[N];
	        for(int i=0;i<N;i++)
	            arr[i]=sc.nextInt();
	        
	        int flag=0;
	        for(int i=1;i<=N;i++)
	        {
	            flag=0;
	            for(int j=0;j<N;j++)
	            {
	                if(i==arr[j])
	                    flag=1;
	            }
	            if(flag==1)
	                continue;
	            else if(flag==0)
	                break;
	        }
	        if(flag==0)
	            System.out.println("no");
	        else{
	            int flag1=0;
	            for(int i=N-1;i>=1;i--)
	            {
	                if(arr[i]!=arr[i-1]+1)
	                {
	                    flag1=1;
	                    break;
	                }
	            }
	            if(flag1==0)
	                System.out.println("no");
	            else
	                System.out.println("yes");
	        }
	    }
	}
}
