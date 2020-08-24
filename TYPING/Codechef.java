/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int CalTime(String s)
    {
        int val=0;
        char prev=' ';
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                val+=2;
                prev=s.charAt(i);
            }else
            {
                if(s.charAt(i)=='f' || s.charAt(i)=='d')
                {
                    if(prev=='j' || prev=='k')
                        val+=2;
                    else
                        val+=4;
                }else if(s.charAt(i)=='j' || s.charAt(i)=='k')
                {
                    if(prev=='f' || prev=='d')
                        val+=2;
                    else
                        val+=4;
                }
                prev=s.charAt(i);
            }
        }
        return val;
    }
    
    public static boolean check(ArrayList<String> arr,String s,int a)
    {
        boolean val=false;
        for(int i=0;i<=a-1;i++)
        {
            if(arr.get(i).equals(s))
            {
                val=true;
                break;
            }
        }
        return val;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        int n=Integer.parseInt(ob.readLine());
	        ArrayList<String> arr=new ArrayList<String>();
	        for(int i=0;i<n;i++)
	            arr.add(ob.readLine());
	        int sum=0;
	        for(int i=0;i<arr.size();i++)
	        {
	            if(i==0)
	            {
	                sum+=CalTime(arr.get(0));
	            }
	            else
	            {
	                boolean find=check(arr,arr.get(i),i);
	                if(find==true)
	                    sum+=CalTime(arr.get(i))/2;
	                else
	                    sum+=CalTime(arr.get(i));
	            }
	        }
	        System.out.println(sum);
	    }
	}
}
