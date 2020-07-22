/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
    	  int t=sc.nextInt();
    	  while(t-->0)
    	  {
    		  int n=sc.nextInt();
    		  int arr[]=new int[n];
    		  for(int i=0;i<arr.length;i++)
    		  {
    		      arr[i]=sc.nextInt();
    		  }
    		  int k=sc.nextInt();
    		  int ar[]=new int[k];
    		  for(int j=0;j<ar.length;j++)
    		  {
    		      ar[j]=sc.nextInt();
    		  }
    		  int count=0;
    		  for(int i=0;i<arr.length;i++)
    		  {
    		      if(arr[i]==ar[count])
    		      {
    		          count++;
    		          if(count==k)
    		          break;
    		      }
    		  }
    		  if(count==k)
    		  {
    		      System.out.println("Yes");
    		  }
    		  else
    		  {
    		      System.out.println("No");
    		  }
    	  }
	}
}
