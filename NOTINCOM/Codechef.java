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
		    int m=sc.nextInt();
		    Set<Integer> A=new HashSet<Integer>();
		    Set<Integer> B=new HashSet<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        int x=sc.nextInt();
		        A.add(x);
		    }
		    for(int i=0;i<m;i++)
		    {
		        int x=sc.nextInt();
		        B.add(x);
		    }
		    A.removeAll(B);
		    System.out.println(n-A.size());
		}
	}
}
