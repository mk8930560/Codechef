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
	        int arr[]=new int[30];
	        int sum=0;
	        int flag=0;
	        for(int i=0;i<30;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        for(int i=0;i<30;i++)
	        {
	            if(arr[i]==1)
	            {
	                sum++;
	                if(sum>5)
	                {
	                    flag=1;
	                    break;
	                }
	            }else{
	                sum=0;
	            }
	        }
	        if(flag==1)
	        {
	            System.out.println("#coderlifematters");
	        }
	        else if(flag==0) 
	        {
	            System.out.println("#allcodersarefun");
	        }
	    }
	}
}
