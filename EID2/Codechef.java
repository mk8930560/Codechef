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
	        int Ages[]=new int[3];
	        int Money[]=new int[3];
	        for(int i=0;i<3;i++)
	            Ages[i]=sc.nextInt();
	        for(int i=0;i<3;i++)
	            Money[i]=sc.nextInt();
	        int flag=0;
	        for(int i=0;i<2;i++)
	        {
	            for(int j=i+1;j<3;j++)
	            {
	                if(Ages[i]==Ages[j])
	                {
	                    if(Money[i]!=Money[j])
	                    {
	                        flag=1;
	                        break;
	                    }
	                }else if(Ages[i]>Ages[j])
	                {
	                    if(Money[i]>Money[j])
	                    {
	                        continue;
	                    }else{
	                        flag=1;
	                        break;
	                    }
	                }else if(Ages[i]<Ages[j])
	                {
	                    if(Money[i]<Money[j])
	                    {
	                        continue;
	                    }else
	                    {
	                        flag=1;
	                        break;
	                    }
	                }
	            }
	        }
	        if(flag==0)
	        {
	            System.out.println("FAIR");
	        }else
	        {
	            System.out.println("NOT FAIR");
	        }
	    }
	}
}
