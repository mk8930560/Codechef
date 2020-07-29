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
		int t = Integer.parseInt(ob.readLine());
		while(t-->0)
		{
		    String values[] = ob.readLine().split(" ");
		    
		    int n = Integer.parseInt(values[0]);
		    int totalOper = Integer.parseInt(values[1]);
		    
		    String arr[] = ob.readLine().split(" ");
		    ArrayList<String> arr1 = new ArrayList<String>();
		    for(int i=0;i<arr.length;i++)
		    {
		        arr1.add(arr[i]);
		    }
		    while(totalOper-->0)
		    {
		        if(arr1.get(arr1.size()-1).equals("T"))
		        {
		            arr1.remove(arr1.size()-1);
		        }
		        else if(arr1.get(arr1.size()-1).equals("H"))
		        {
		            arr1.remove(arr1.size()-1);
		            for(int i=0;i<arr1.size();i++)
		            {
		                if(arr1.get(i).equals("H"))
		                {
		                    arr1.set(i,new String("T"));
		                }else if(arr1.get(i).equals("T"))
		                {
		                    arr1.set(i,new String("H"));
		                }
		            }
		        }
		    }
		    int countH=0;
		    for(int i=0;i<arr1.size();i++)
		    {
		        if(arr1.get(i).equals("H"))
		            countH++;
		    }
		    System.out.println(countH);
		}
	}
}
