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
	        int Mass = sc.nextInt();
	        int Height = sc.nextInt();
	        int BMI = Mass/(int)Math.pow(Height, 2);
	        if(BMI<=18)
	            System.out.println("1");
	        else if(BMI>=19 && BMI <=24)
	            System.out.println("2");
	        else if(BMI>=25 && BMI<=29)
	            System.out.println("3");
	        else if(BMI>=30)
	            System.out.println("4");
	    }
	}
}
