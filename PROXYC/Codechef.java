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
	        int length=Integer.parseInt(ob.readLine());
	        String s=ob.readLine();
	        String arr[]=new String[length];
	        int countP=0;
	        for(int i=0;i<length;i++)
	        {
	            arr[i]=String.valueOf(s.charAt(i));
	            if(arr[i].equals("P"))
	                countP++;
	        }
	        float atten=Float.valueOf(countP)/Float.valueOf(length);
	        if(atten>=0.75)
	            System.out.println("0");
	        else
	        {
	            int proxy=0;
	            for(int i=2;i<length-2;i++)
	            {
	                if(arr[i].equals("A") && ((arr[i-1].equals("P") || arr[i-2].equals("P")) && (arr[i+1].equals("P")||arr[i+2].equals("P"))))
	                {
	                    countP++;
	                    proxy++;
	                    atten=Float.valueOf(countP)/Float.valueOf(length);
	                    if(atten>=0.75)
	                        break;
	                }
	            }
	            if(atten>=0.75)
	                System.out.println(proxy);
	            else
	                System.out.println("-1");
	        }
	    }
	}
}
