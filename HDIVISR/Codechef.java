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
	    int n=sc.nextInt();
	    for(int i=10;i>=1;i--)
	    {
	        if(n%i==0)
	        {
	            System.out.println(i);
	            break;
	        }
	    }
	}
}
