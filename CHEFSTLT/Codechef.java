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
		    String s1=sc.next();
		    String s2=sc.next();
		    int min=0;
		    int max=0;
		    for(int i=0;i<s1.length();i++)
		    {
		        char c1=s1.charAt(i);
		        char c2=s2.charAt(i);
		        if(c1>='a' && c1<='z' && c2>='a' && c2<='z' && c1!=c2)
		        {
		            min+=1;
		        }
		        if(c1>='a' && c1<='z' && c2=='?' || c2>='a' && c2<='z' && c1=='?' ||c1=='?' && c2=='?' || c1>='a' && c1<='z' && c2>='a' && c2<='z' && c1!=c2 )
		        {
		            max+=1;
		        }
		    }
		    System.out.println(min+" "+max);
		}
	}
}
