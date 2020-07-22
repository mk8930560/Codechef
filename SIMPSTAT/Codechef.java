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
		    int n=sc.nextInt();
		    ArrayList<Integer> arr=new ArrayList<Integer>(n);
		    int k=sc.nextInt();
		    int total=k*2;
		    for(int i=0;i<n;i++)
		    {
		        arr.add(sc.nextInt());
		    }
		    Collections.sort(arr);
		    if(total>=0 && total<n)
		    {
		        for(int i=1;i<=k;i++)
		        {
		            arr.remove(0);
		            arr.remove(arr.size()-1);
		        }
		        double sum=0;
		        for(int i=0;i<arr.size();i++)
		        {
		            sum+=arr.get(i);
		        }
		        System.out.printf("%.06f\n",sum/arr.size());
		    }
		}
	}
}
