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
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int z=sc.nextInt();
	        int flag=0;
	        if(x==y+z)
	            flag=1;
	        else if(y==x+z)
	            flag=1;
	        else if(z==x+y)
	            flag=1;
	        if(flag==0)
	            System.out.println("NO");
	        else
	            System.out.println("YES");
	    }
	}
}
