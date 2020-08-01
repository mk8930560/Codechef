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
	        int KnownElemnt = sc.nextInt();
	        int DeletedElemnt = sc.nextInt();
	        int Average = sc.nextInt();
	        int arr[] = new int[KnownElemnt];
	        
	        int sum=0;
	        for(int i=0;i<KnownElemnt;i++)
	        {
	            arr[i]=sc.nextInt();
	            sum+=arr[i];
	        }
	        int Value=(Average*(KnownElemnt+DeletedElemnt)-sum)/DeletedElemnt;
	        if(Value<=0 || (Average*(KnownElemnt+DeletedElemnt)-sum)%DeletedElemnt!=0)
	            System.out.println("-1");
	        else
	            System.out.println(Value);
	        
	    }
	}
}
