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
		    String s[] = ob.readLine().split(" ");
		    int Row = Integer.parseInt(s[0]);
		    int Columns = Integer.parseInt(s[1]);
		    if(Row%2==0 && Columns%2==0 || Row%2==0 && Columns%2!=0 || Row%2!=0 && Columns%2==0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
