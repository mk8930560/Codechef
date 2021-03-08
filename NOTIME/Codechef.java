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
	    int N=sc.nextInt();
	    int H=sc.nextInt();
	    int x=sc.nextInt();
	    int arr[]=new int[N];
	    int flag=0;
	    for(int i=0;i<N;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]+x>=H)
	            flag=1;
	    }
	    if(flag==0)
	        System.out.println("NO");
	    else
	        System.out.println("YES");
	}
}
