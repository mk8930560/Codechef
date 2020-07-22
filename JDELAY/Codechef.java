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
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int count=0;
		    int b=sc.nextInt();
		    for(int j=0;j<b;j++)
		    {
		        int c=sc.nextInt();
		        int d=sc.nextInt();
		        if(d-c>5)
		        {
		            count+=1;
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}
