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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int steplength=sc.nextInt();
		    StringBuilder ans=new StringBuilder();
		    while(n-->0)
		    {
		        int length=sc.nextInt();
		        if(length%steplength==0)
		        {
		            ans.append("1");
		        }
		        else{
		            ans.append("0");
		        }
		    }
		    System.out.println(ans);
		}
	}
}
