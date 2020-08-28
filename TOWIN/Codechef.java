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
	            arr[i]=sc.nextInt();
	        Arrays.sort(arr);
	        ArrayList<Integer> arr1=new ArrayList<Integer>();
	        for(int i=n-1;i>=0;i--)
	            arr1.add(arr[i]);
	        long Score1st=0;
	        long Score2nd=0;
	        for(int i=0;i<n;i++)
	        {
	            if(i>=0 && i<=2)
	            {
	                if(i==0)
	                {
	                    Score1st+=arr1.get(i);
	                }else if(i>=1 && i<=2)
	                {
	                    Score2nd+=arr1.get(i);
	                }
	            }else{
	                if(i%2!=0)
	                {
	                   Score1st+=arr1.get(i); 
	                }else if(i%2==0)
	                {
	                    Score2nd+=arr1.get(i);
	                }
	            }
	        }
	        if(Score1st==Score2nd)
	            System.out.println("draw");
	        else if(Score1st>Score2nd)
	            System.out.println("first");
	        else if(Score1st<Score2nd)
	            System.out.println("second");
	    }
	}
}
