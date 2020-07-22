/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int sum(int b)
    {
        int value=0;
        while(b>0)
        {
            value+=b;
            b--;
        }
        return value;
    }
    public static void find(int a,int b)
    {
        if(a==1)
        {
            System.out.println(sum(b));
        }
        else if(a>1)
        {
            int c=sum(b);
            --a;
            find(a,c);
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
		    find(a,b);
		}
	}
}
