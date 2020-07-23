/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long Find(long n,long breaktime,long speed,long time)
    {
        if(n==1)
        {
            time=time+(1*speed);
            return time;
        }
        else if(n%2==0)
        {
            time=time+((n/2)*speed+breaktime);
            n=n-(n/2); 
            speed*=2;
        }
        else
        {
            time=time+((n+1)/2*speed+breaktime);
            n=n-(n+1)/2;
            speed*=2;
        }
        return Find(n,breaktime,speed,time);
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long n=sc.nextInt();
		    long breaktime=sc.nextInt();
		    long speed=sc.nextInt();
		    System.out.println(Find(n,breaktime,speed,0));
		}
	}
}
