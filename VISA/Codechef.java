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
	        String s[]= ob.readLine().split(" ");
	        
	        int x1 = Integer.parseInt(s[0]);
	        int x2 = Integer.parseInt(s[1]);
	        int y1 = Integer.parseInt(s[2]);
	        int y2 = Integer.parseInt(s[3]);
	        int z1 = Integer.parseInt(s[4]);
	        int z2 = Integer.parseInt(s[5]);
	        
	        if(x2>=x1 && y2>=y1 && z2<=z1)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
