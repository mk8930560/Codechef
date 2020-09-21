/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int Find(String s)
    {
        int maxbalance=0;
        int balance=0;
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)=='(')
                balance++;
            if(s.charAt(i)==')')
                balance--;
            if(maxbalance<balance)
                maxbalance=balance;
        }
        return maxbalance;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        String s=ob.readLine();
	        int len=Find(s);
	        for(int i=0;i<len;i++)
	            System.out.print("(");
	        for(int i=0;i<len;i++)
	            System.out.print(")");
	        System.out.println();
	    }
	}
}
