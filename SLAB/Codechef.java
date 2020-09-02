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
	        long n=sc.nextLong();
	        long tax=0;
	        if(n>250000)
	        {
	            if(n>500000)
	            {
	                if(n>750000)
	                {
	                    if(n>1000000)
	                    {
	                        if(n>1250000)
	                        {
	                            if(n>1500000)
	                            {
	                                tax+=0.30*(n-1500000);
	                                tax+=0.25*(1500000-1250000);
	                            }else
	                            {
	                                tax+=0.25*(n-1250000);
	                            }
	                            tax+=0.20*(1250000-1000000);
	                        }else
	                        {
	                            tax+=0.20*(n-1000000);
	                        }
	                        tax+=0.15*(1000000-750000);
	                    }else
	                    {
	                        tax+=0.15*(n-750000);
	                    }
	                    tax+=0.10*(750000-500000);
	                }else
	                {
	                   tax+=0.10*(n-500000); 
	                }
	                tax+=0.05*(500000-250000);
	            }else
	            {
	                tax+=0.05*(n-250000);
	            }
	        }
	        System.out.println(n-tax);
	    }
	}
}
