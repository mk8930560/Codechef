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
		int count=0;
		for(int i=0;i<a;i++)
		{
		    String name=sc.next();
		    if(name.contains("ch")||name.contains("he")||name.contains("ef")||name.contains("che")||name.contains("hef")||name.contains("chef"))
		    {
		        count+=1;
		    }
		}
		System.out.println(count);
	}
}
