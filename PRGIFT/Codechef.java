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
			int total=sc.nextInt();
			int arr[]=new int[n];
			int count=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]%2==0){
					count++;
				}
			}
			if(total>0 && total<=count){
			    System.out.println("YES");
			}
			else if(total==0 && count<n){
			    System.out.println("YES");
			}else{
			    System.out.println("NO");
			}
		}
	}
}
