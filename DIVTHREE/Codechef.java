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
	        int K=sc.nextInt();
	        int D=sc.nextInt();
	        int total=0;
	        for(int i=1;i<=N;i++)
	            total+=sc.nextInt();
	        if(total/K>D)
	            System.out.println(D);
	        else
	            System.out.println(total/K);
	    }
	}
}
