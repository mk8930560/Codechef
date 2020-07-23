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
		    int arr[]=new int[26];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    char arr1[]=new char[26];
		    int val1=97;
		    for(int i=0;i<arr1.length;i++)
		    {
		        arr1[i]=(char)val1;
		        val1++;
		    }
		    int sum=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++)
		    {
		        char c=s.charAt(i);
		        for(int j=0;j<arr1.length;j++)
		        {
		            if(arr1[j]==c)
		            {
		                arr[j]=0;
		            }
		        }
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		        sum+=arr[i];
		    }
		    System.out.println(sum);
		    
		}
	}
}
