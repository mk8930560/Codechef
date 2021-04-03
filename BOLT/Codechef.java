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
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        double k1=sc.nextDouble();
	        double k2=sc.nextDouble();
	        double k3=sc.nextDouble();
	        double v=sc.nextDouble();
            double answer=100/(k1*k2*k3*v);
            double time = Math.round(answer * 100.0) / 100.0;
            if(time<9.58)
                System.out.println("YES");
            else
                System.out.println("NO");
	    }
	}
}
