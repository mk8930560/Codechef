/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void Find(int sum,int real)
    {
        int count=0;
        int num=0;
        for(int i=2;i<sum;i++)
        {
            if(sum%i==0)
            {
                count+=1;
            }
        }
        if(count>=1)
        {
            count=0;
            Find(sum+1,real);
        }
        else if(count==0)
        {
            num=sum;
            System.out.println(num-real);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int sum=a+b;
	        Find(sum+1,sum);
		}
	}
}
