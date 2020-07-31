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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    ArrayList<String> arr = new ArrayList<String>();
		    for(int i =0;i<s.length();)
		    {
		        int startIndex=i;
		        int lastIndex=i;
		        for(int j=lastIndex;j<s.length();j++)
		        {
		            if(s.charAt(i)==s.charAt(j))
		                lastIndex++;
		            else if(s.charAt(i)!=(s.charAt(j)))
		                break;
		        }
		        arr.add(s.substring(startIndex,lastIndex));
		        i=lastIndex;
		    }
		    int CountU=0;
		    int CountD=0;
		    for(int i=0;i<arr.size();i++)
		    {
		    	if(arr.get(i).contains("U"))
		    		CountU++;
		    	else if(arr.get(i).contains("D"))
		    		CountD++;
		    }
		    if(CountD>CountU)
		    	System.out.println(CountU);
		    else if(CountU>CountD)
		    	System.out.println(CountD);
		    else if(CountD==CountU)
		    	System.out.println(CountD);
		}
	}
}
