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
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  if(n%2!=0 && arr[0]==1)
		  {
		      boolean val1 = true;
		      boolean val2 = true;
		      for(int i=0;i<n/2;i++)
		      {
		          if(arr[i+1]-arr[i]!=1)
		          {
		              val1 = false;
		              break;
		              
		          }
		      }
		      for(int i=n/2;i<n-1;i++)
		      {
		          if(arr[i]-arr[i+1]!=1)
		          {
		              val2 = false;
		              break;
		              
		          }
		      }
		      if(val1==true && val2 ==true){
		          System.out.println("yes");
		      }
		      else{
		          System.out.println("no");
		      }
		  }
		  else{
		      System.out.println("no");
		  }
		}
	}
}
