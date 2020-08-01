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
		    int n = sc.nextInt();
		    int xenyTime[] = new int[n];
		    int yanaTime[] = new int[n];
		    for(int i=0;i<n;i++)
		        xenyTime[i] =sc.nextInt();
		    for(int i=0;i<n;i++)
		        yanaTime[i] = sc.nextInt();
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        if(i==0 || i%2==0)
		            sum+=xenyTime[i];
		        else if(i==1 || i%2!=0)
		            sum+=yanaTime[i];
		    }
		    int sum2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(i==0 || i%2==0)
		            sum2+=yanaTime[i];
		        else if(i==1 || i%2!=0)
		            sum2+=xenyTime[i];
		    }
		    if(sum<sum2)
		        System.out.println(sum);
		    else if(sum2<sum)
		        System.out.println(sum2);
		    else
		        System.out.println(sum2);
 		}
	}
}
