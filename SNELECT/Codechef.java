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
	        int length=s.length();
	        int Snakes = 0;
	        int Mongoose = 0;
	        int arr[]=new int[length];
	        for(int i=0;i<length;i++)
	        {
	            if(s.charAt(i)=='s'){
	                Snakes++;
	                arr[i]=0;
	            }
	            else if(s.charAt(i)=='m'){
	                Mongoose++;
	                arr[i]=1;
	            }
	        }
	        if(s.length()>1)
	        {
	            for(int i=0;i<length;i++)
	            {
	                if(i==0 || i==length-1)
	                {
	                    if(i==0 && arr[i]==1)
	                    {
	                        if(arr[i+1]==0)
	                        {
	                            Snakes--;
	                            arr[i+1]=2;
	                        }
	                    }
    	                else if(i==length-1 && arr[i]==1)
    	                {
    	                    if(arr[i-1]==0)
    	                    {
    	                        Snakes--;
    	                        arr[i-1]=2;
    	                    }
    	                }
	                }
    	            else
    	            {
    	                if(arr[i]==1)
    	                {
    	                    if(arr[i-1]==0)
    	                    {
    	                        Snakes--;
    	                        arr[i-1]=2;
    	                    }else if(arr[i+1]==0)
    	                    {
    	                        Snakes--;
    	                        arr[i+1]=2;
    	                    }
    	                }
    	                
    	            }
	            }
	        }
	        if(Snakes>Mongoose)
	            System.out.println("snakes");
	        else if(Snakes<Mongoose)
	            System.out.println("mongooses");
	        else
	            System.out.println("tie");
	        
	    }
	}
}
