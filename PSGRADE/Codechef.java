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
	        int Amin = Integer.parseInt(s[0]);
	        int Bmin = Integer.parseInt(s[1]);
	        int Cmin = Integer.parseInt(s[2]);
	        int Tmin = Integer.parseInt(s[3]);
	        int A = Integer.parseInt(s[4]);
	        int B = Integer.parseInt(s[5]);
	        int C = Integer.parseInt(s[6]);
	        int T=(A+B+C);
	        if(A>=Amin && B>=Bmin && C>=Cmin)
	        {
	            if(T>=Tmin)
	                System.out.println("YES");
	            else
	                System.out.println("NO");
	        }
	        else
	            System.out.println("NO");
	    }
	}
}
