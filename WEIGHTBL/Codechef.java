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
	        int WeightIncrease=Integer.parseInt(s[1])-Integer.parseInt(s[0]);
	        int MinWeight=Integer.parseInt(s[2])*Integer.parseInt(s[4]);
	        int MaxWeight=Integer.parseInt(s[3])*Integer.parseInt(s[4]);
	        if(WeightIncrease>MaxWeight){
	            System.out.println("0");
	        }else{
	            if(WeightIncrease<MinWeight)
	                System.out.println("0");
	            else
	                System.out.println("1");
	        }
	    }
	}
}

