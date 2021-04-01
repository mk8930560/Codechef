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
	        int impactPeople[]=new int[n];
	        
	        for(int i=0;i<n;i++)
	            arr[i]=sc.nextInt();
	            
	        for(int i=0;i<n;i++)
	        {
	            int count=1;
	            if(i==0)
	            {
	                for(int j=i;j<n-1;)
	                {
	                    if(arr[j+1]-arr[j]<=2)
	                    {
	                        count++;
	                        j++;
	                    }
	                    else
	                        break;
	                }
	                impactPeople[i]=count;
	            }
	            else if(i==n-1)
	            {
	                for(int j=i;j>=1;)
	                {
	                    if(arr[j]-arr[j-1]<=2)
	                    {
	                        count++;
	                        j--;
	                    }
	                    else
	                        break;
	                }
	                impactPeople[i]=count;
	            }
	            else
	            {
	                for(int j=i;j<n-1;)
	                {
	                    if(arr[j+1]-arr[j]<=2)
	                    {
	                        count++;
	                        j++;
	                    }
	                    else
	                        break;
	                }
	                
	                for(int j=i;j>=1;)
	                {
	                    if(arr[j]-arr[j-1]<=2)
	                    {
	                        count++;
	                        j--;
	                    }
	                    else
	                        break;
	                }
	                impactPeople[i]=count;
	            }
	            count=1;
	        }
	        Arrays.sort(impactPeople);
	        System.out.println(impactPeople[0]+" "+impactPeople[n-1]);
	    }
	}
}
