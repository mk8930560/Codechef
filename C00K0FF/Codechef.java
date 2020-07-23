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
		    int arr[]=new int[5];
		    for(int i=0;i<n;i++)
		    {
		        String s=sc.next();
		        if(s.equals("cakewalk"))
		        {
		            arr[0]=1;
		        }
		        else if(s.equals("simple"))
		        {
		            arr[1]=1;
		        }
		        else if(s.equals("easy"))
		        {
		            arr[2]=1;
		        }
		        else if(s.equals("easy-medium") || s.equals("medium"))
		        {
		            arr[3]=1;
		        }
		        else if(s.equals("medium-hard") || s.equals("hard"))
		        {
		            arr[4]=1;
		        }
		    }
		    int sum=0;
		    for(int i=0;i<5;i++)
		    {
		        sum+=arr[i];
		    }
		    if(sum==5)
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
