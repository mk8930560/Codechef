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
	        
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        for(int i=0;i<n;)
	        {
	            if(i<n-2 && arr[i+1]-arr[i]==1 && arr[i+2]-arr[i+1]==1)
	            {
	               int StartIndex=i;
	               int LastIndex=i+2;
	               
	               for(int j=i+2;j<n-1;j++)
	               {
	                   if(arr[j+1]-arr[j]==1){
	                       LastIndex=j+1;
	                   }
	                   else{
	                       LastIndex=j;
	                       break;
	                   }
	               }
	               
	               if(LastIndex==n-1){
	                   System.out.print(arr[StartIndex]+"..."+arr[LastIndex]);
	                   break;
	               }
	               else{
	                   System.out.print(arr[StartIndex]+"..."+arr[LastIndex]+",");
	                   i=LastIndex+1;
	               }
	            }
	            else{
	                if(i==n-1){
	                    System.out.print(arr[i]);
	                }
	                else{
	                    System.out.print(arr[i]+",");
	                }
	                i++;
	            }
	        }
	        System.out.println();
	    }
	}
}
