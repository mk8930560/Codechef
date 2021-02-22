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
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        String s=ob.readLine();
	        int flagP=0;
	        int flagC=0;
	        int flagM=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='P')
	                flagP++;
	            else if(s.charAt(i)=='C')
	                flagC++;
	            else if(s.charAt(i)=='M')
	                flagM++;
	        }
	        if(flagP==1&&flagC==1&&flagM==1)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
