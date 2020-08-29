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
	        int N=sc.nextInt();
	        Long M=sc.nextLong();
	        ArrayList<Long> arr=new ArrayList<Long>();
	        for(int i=0;i<N;i++)
	            arr.add(sc.nextLong());
	        Collections.sort(arr,Collections.reverseOrder());
	        Long sum=0L;
	        int count=0;
	        for(int i=0;i<N;i++)
	        {
	            sum+=arr.get(i);
	            count++;
	            if(sum>=M)
	            {
	                break;
	            }
	        }
	        if(sum<M)
	            System.out.println("-1");
	        else
	            System.out.println(count);
	    }
	}
}
