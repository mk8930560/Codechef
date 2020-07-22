/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
 		int t= Integer.parseInt(ob.readLine());
 		while(t-->0)
 		{
 		    String s1=ob.readLine();
 		    String s2=s1.toLowerCase();
 		    String arr[]=s2.split("\\s+");
 		    if(arr.length==1)
 		    {
 		        String s=arr[0];
 		        System.out.print(s.substring(0,1).toUpperCase()+s.substring(1));
 		    }
 		    else if(arr.length>=2)
 		    {
 		        for(int i=0;i<arr.length;i++)
 		        {
 		            if(i==arr.length-1)
 		            {
 		                String s=arr[i];
 		                System.out.print(s.substring(0,1).toUpperCase()+s.substring(1));
 		            }
 		            else
 		            {
 		               String s=arr[i];
 		               System.out.print(s.substring(0,1).toUpperCase()+". ");
 		            }
 		        }
 		    }
 		    System.out.println("");
 		}
	}
}
