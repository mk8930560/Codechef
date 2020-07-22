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
		    String answer="";
		    for(int i=0;i<s.length();i=i+2)
		    {
		        char c1=s.charAt(i);
		        char c2=s.charAt(i+1);
		        if(c1=='A'&&c2=='B'||c1=='B'&&c2=='A')
		        {
		            answer="yes";
		        }
		        else
		        {
		            answer="no";
		            break;
		        }
		    }
		    System.out.println(answer);
		}
	}
}
