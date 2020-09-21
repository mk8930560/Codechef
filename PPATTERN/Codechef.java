

import java.util.*;

import java.lang.*;

import java.io.*;

import java.util.Arrays; 

import java.util.Collections; 

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

	        int arr[][]=new int[n][n];

	        int count=1;

	        for(int i=0;i<=2*(n-1);i++)

	        {

	            for(int j=0;j<n;j++)

	            {

	                for(int k=0;k<n;k++)

	                {

	                    if(i==j+k)

	                    {

	                        arr[j][k]=count;

	                        count++;

	                    }

	                }

	            }

	        }

	        for(int i=0;i<n;i++)

	        {

	            for(int j=0;j<n;j++)

	                System.out.print(arr[i][j]+" ");

	            System.out.println();

	        }

	    }

	}

}

