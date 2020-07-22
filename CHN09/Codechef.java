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
		    String s=sc.next();
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<s.length();i++)
		    {
		        char c=s.charAt(i);
		        if(c=='a') count1++;
		        else if(c=='b') count2++;
		    }
		    if(count1==count2)
		    {
		        System.out.println(count1);
		    }
		    else if(count1>count2)
		    {
		        System.out.println(count2);
		    }
		    else if(count1<count2)
		    {
		        System.out.println(count1);
		    }
		}
	}
}
