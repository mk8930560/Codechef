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
		    String s=sc.next();
		    int count=0;
		    for(int i=0;i<s.length()-1;i++)
		    {
		        char c1=s.charAt(i);
		        char c2=s.charAt(i+1);
		        if(c1=='1'&& c2=='0'|| c2=='1' && c1=='0')
		        {
		            count++;
		        }
		    }
		    if(count<=2){
		        System.out.println("uniform");
		    }
		    else
		    {
		        System.out.println("non-uniform");
		    }
		}
	}
}
