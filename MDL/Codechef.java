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
		    ArrayList<Integer> arr=new ArrayList<Integer>(n);
		    for(int i=0;i<n;i++)
		    {
		        int x=sc.nextInt();
		        arr.add(x);
		    }
		    while(arr.size()>2)
		    {
		        int a=arr.get(0);
		        int b=arr.get(1);
		        int c=arr.get(2);
		        if(a<b && b<c || c<b && b<a)
		        {
		            arr.remove(1);
		        }
		        else if(b<a && a<c || c<a && a<b)
		        {
		            arr.remove(0);
		        }
		        else{
		            arr.remove(2);
		        }
		    }
		    System.out.println(arr.get(0)+" "+arr.get(1));
		}
	}
}
