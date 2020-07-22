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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int arr[]=new int[a+1];
		    String s=sc.next();
		    arr[0]=b;
		    int j=1;
		    for(int i=0;i<a;i++)
		    {
		        if(s.charAt(i)=='R')
		        {
		            b++;
		        }else
		        {
		            b--;
		        }
		        arr[j]=b;
		        j++;
		    }
		    int count=1;
		    Arrays.sort(arr);
		    for(int i=1;i<arr.length;i++)
		    {
		        if(arr[i]!=arr[i-1])
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
