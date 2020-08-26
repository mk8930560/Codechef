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
	        int n=sc.nextInt();
	        ArrayList<Integer> Postiive=new ArrayList<Integer>();
	        ArrayList<Integer> Negative=new ArrayList<Integer>();
	        for(int i=1;i<=n;i++)
	        {
	            int x=sc.nextInt();
	            if(x<0)
	                Negative.add(x);
	            else
	                Postiive.add(x);
	        }
	        
	        if(Postiive.size()==0 || Negative.size()==0)
	        {
	            if(Postiive.size()==0)
	                System.out.println(Negative.size()+" "+Negative.size());
	            else if(Negative.size()==0)
	                System.out.println(Postiive.size()+" "+Postiive.size());
	            
	        }else
	        {
	            if(Postiive.size()>Negative.size())
	                System.out.println(Postiive.size()+" "+Negative.size());
	            else if(Negative.size()<Negative.size())
	                System.out.println(Negative.size()+" "+Postiive.size());
	            else
	                System.out.println(Postiive.size()+" "+Negative.size());
	        }
	        
	    }
	}
}
