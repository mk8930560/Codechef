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
		int a=sc.nextInt();
		int arr[][]=new int[a][5];
		for(int i=0;i<a;i++)
		{
		    int sum=0;
		    for(int j=0;j<5;j++)
		    {
		        arr[i][j]=sc.nextInt();
		        sum+=arr[i][j];
		    }
		    if(sum==0)
		    {
		        System.out.println("Beginner");
		    }
		    else if(sum==1)
		    {
		        System.out.println("Junior Developer");
		    }
		    else if(sum==2)
		    {
		        System.out.println("Middle Developer");
		    }
		    else if(sum==3)
		    {
		        System.out.println("Senior Developer");
		    }
		    else if(sum==4)
		    {
		        System.out.println("Hacker");
		    }
		    else if(sum==5)
		    {
		        System.out.println("Jeff Dean");
		    }
		}
	}
}
