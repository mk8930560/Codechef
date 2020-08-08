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
		    int n=Integer.parseInt(ob.readLine());
		    String s=ob.readLine();
		    ArrayList<String> arr=new ArrayList<String>();
		    for(int i=0;i<n;i++)
		    {
		        arr.add(String.valueOf(s.charAt(i)));
		    }
		    Collections.sort(arr);
		    for(int i=0;i<arr.size()-1;)
		    {
		        if(arr.get(i).equals(arr.get(i+1)))
		        {
		            arr.remove(arr.get(i+1));
		            arr.remove(arr.get(i));
		        }
		        else{
		            i++;
		        }
		    }
		    if(arr.size()>0)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
		}
	}
}
