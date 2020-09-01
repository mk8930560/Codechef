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
			int Floors=sc.nextInt();
			int Query=sc.nextInt();
			long Count=0;
			int F=0;
			while(Query-->0)
			{
				int FromFloor=sc.nextInt();
				int ToFloor=sc.nextInt();
				Count+=Math.abs(FromFloor-F);
				F=FromFloor;
				Count+=Math.abs(ToFloor-F);
				F=ToFloor;
			}
			System.out.println(Count);
		}  
	}
}
