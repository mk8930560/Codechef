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
		    String s=sc.next();
		    s+=sc.nextLine();
		    String arr[]=s.split(" ");
		    int arr2[]=new int[arr.length];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr2[i]=Integer.parseInt(arr[i]);
		    }
		    int length=arr.length-1;
		    for(int i=0;i<arr2.length;i++)
		    {
		        if(length==arr2[i])
		        {
		            arr2[i]=-arr2[i];
		            break;
		        }
		    }
		    Arrays.sort(arr2);
		    System.out.println(arr2[arr.length-1]);
		}
	}
}
