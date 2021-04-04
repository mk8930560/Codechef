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
	        int length=sc.nextInt();
	        int K=sc.nextInt();
	        String s=sc.next();
	        
	        int count=0;
	        int current_count=1;
	        for(int i=0;i<length;i++)
	        {
	            if(i<length-1 && s.charAt(i)=='*' && s.charAt(i+1)=='*'){
	                current_count++;
	            }
	            else
	            {
	                if(s.charAt(i)=='*')
	                {
	                    if(current_count>count)
	                    {
    	                    count=current_count;
    	                }
    	                current_count=1;
	                }
	            }
	        }
	        if(count>=K)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
