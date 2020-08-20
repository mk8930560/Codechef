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
	        String s[]=ob.readLine().split(" ");
	        int N=Integer.parseInt(s[0]);
	        int M=Integer.parseInt(s[1]);
	        ArrayList<String> arr=new ArrayList<String>();
	        for(int i=0;i<N;i++)
	        {
	            arr.add(ob.readLine());
	        }
	        int collisons=0;
	        for(int i=0;i<arr.size()-1;i++)
	        {
	            for(int j=i+1;j<arr.size();j++)
	            {
	                String s1=arr.get(i);
	                String s2=arr.get(j);
	                for(int k=0;k<M;k++)
	                {
	                    if(s1.charAt(k)=='1' && s2.charAt(k)=='1')
	                        collisons++;
	                }
	            }
	        }
	        System.out.println(collisons);
	    }
	}
}
