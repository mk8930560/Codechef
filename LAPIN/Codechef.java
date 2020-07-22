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
		    int n=s.length();
    		if(n%2==0)
    		{
    		    String s1=s.substring(0,n/2);
    		    String s2=s.substring(n/2,n);
    		        
    		    char ch1[]=s1.toCharArray();
    		    char ch2[]=s2.toCharArray();
    		        
    		    Arrays.sort(ch1);
    		    Arrays.sort(ch2);
    		    if(Arrays.equals(ch1,ch2))
    		    {
    		        System.out.println("YES");
    		    }
    		    else{
    		        System.out.println("NO");
    		    }
    		 }
    		 else
    		 {
    		    String s1=s.substring(0,n/2);
    	        String s2=s.substring(n/2+1,n);
    		        
    		    char ch1[]=s1.toCharArray();
    		    char ch2[]=s2.toCharArray();
    		        
    		    Arrays.sort(ch1);
    		    Arrays.sort(ch2);
    		        
    		    if(Arrays.equals(ch1,ch2))
    		    {
    		        System.out.println("YES");
    		    }
    		    else
    		    {
    	             System.out.println("NO");
    		    }
    		 }
		 }
	}
}
