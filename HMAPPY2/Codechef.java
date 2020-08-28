/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Long Gcd(Long A,Long B)
    {
        if(B==0)
            return A;
        return Gcd(B,A%B);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        Long N=sc.nextLong();
	        Long A=sc.nextLong();
	        Long B=sc.nextLong();
	        Long K=sc.nextLong();
	        Long lcm=(A*B)/Gcd(A,B);
	        Long Answer=((N/A)+(N/B))-2*(N/lcm);
	        if(Answer>=K)
	            System.out.println("Win");
	        else
	            System.out.println("Lose");
	    }
	}
}
