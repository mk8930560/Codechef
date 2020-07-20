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
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    ArrayList<Integer> OccpiLocation = new ArrayList<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==1)
		            OccpiLocation.add(i+1);
		    }
		    if(OccpiLocation.size()==1)
		        System.out.println("YES");
		    else{
		        int flag=0;
		        for(int i=0;i<OccpiLocation.size()-1;i++)
		        {
		            if(Math.abs(OccpiLocation.get(i)-OccpiLocation.get(i+1))<6)
		            {
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0)
		            System.out.println("YES");
		        else
		            System.out.println("NO");
		    }
		}
	}
}
