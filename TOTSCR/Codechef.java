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
	        String s[]=ob.readLine().split(" ");
	        int N = Integer.parseInt(s[0]);
	        int K = Integer.parseInt(s[1]);
	        
	        String score[] = ob.readLine().split(" ");
	  
	        while(N-->0)
	        {
	            long sum=0;
	            String s1=ob.readLine();
	            for(int i=0;i<K;i++)
	            {
	                if(s1.charAt(i)=='1')
	                    sum+=Long.parseLong(score[i]);
	            }
	            System.out.println(sum);
	        }
	    }
	}
}
