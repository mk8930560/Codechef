/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int Find(ArrayList<Integer> s,int a)
    {
        int Index=-1;
        for(int i=s.size()-2;i>=0;i--)
        {
            if(s.get(i)==a)
            {
                Index=i;
                break;
            }
        }
        return Index;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        ArrayList<Integer> s=new ArrayList<Integer>();
	        s.add(0);
	        s.add(0);
	        s.add(1);
	        while(s.size()<=127)
	        {
	            int val=Find(s,s.get(s.size()-1));
	            if(val==-1)
	            {
	                s.add(0);
	            }
	            else
	            {
	                s.add((s.size()-(val+1)));
	            }
	        }
	        int count=0;
	        int NumbertoFind=s.get(n-1);
	        for(int i=0;i<n;i++)
	        {
	            if(s.get(i)==NumbertoFind)
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}
