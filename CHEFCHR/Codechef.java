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
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		while(t-->0)
		{
		    String s=ob.readLine();
		    int count=0;
		    for(int i=0;i<s.length()-3;i++)
		    {
		        String s1 = s.substring(i,i+4);
		        int Ccount=0;
		        int Hcount=0;
		        int Ecount=0;
		        int Fcount=0;
		        if(s1.contains("c"))
		            Ccount++;
		        if(s1.contains("h"))
		            Hcount++;
		        if(s1.contains("e"))
		            Ecount++;
		        if(s1.contains("f"))
		            Fcount++;
		        if(Ccount+Hcount+Ecount+Fcount==4)
		            count++;
		    }
		    if(count==0)
		        System.out.println("normal");
		    else
		        System.out.println("lovely "+count);
		}
	}
}
