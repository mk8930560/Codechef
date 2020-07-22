/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    String s=ob.readLine();
	    String arr1[]=s.split("\\s+");
	    int n=Integer.parseInt(arr1[0]);
	    int t=Integer.parseInt(arr1[1]);
	    int arr[]=new int[n];
	    while(t-->0)
	    {
	        String click=ob.readLine();
	        click=click.replaceAll("\\s","");
	        if(click.substring(5,click.length()).equals("ALL"))
	        {
	            for(int i=0;i<arr.length;i++)
	            {
	                arr[i]=0;
	            }
	        }
	        else
	        {
	            int index=Integer.parseInt(click.substring(5,click.length()));
	            if(arr[index-1]==0)
	            {
	                arr[index-1]=1;    
	            }
	            else if(arr[index-1]==1)
	            {
	                arr[index-1]=0;
	            }
	        }
	        int count=0;
    	    for(int i=0;i<arr.length;i++)
    	    {
    	        if(arr[i]==1)
    	        count++;
    	    }
    	    System.out.println(count);
	    }
	}
}
