/* package codechef; // don't place package name! */

import java.util.*;
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
		    int totalstudent=sc.nextInt();
		    int arr[]=new int[totalstudent];
		    int minimumIngrediant=sc.nextInt();
		    String likeOrNot="NO";
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]>=minimumIngrediant)
		        {
		            likeOrNot="YES";
		            break;
		        }
		    }
		    System.out.println(likeOrNot);
		    
		}
	}
}
