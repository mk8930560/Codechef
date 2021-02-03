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
	        int K=sc.nextInt();
	        int arr[]=new int[N];
	        boolean Slow=false;
	        int Solve=0;
	        int Unsolved=0;
	        int SolveInSec=0;
	        for(int i=0;i<N;i++)
	        {
	            arr[i]=sc.nextInt();
	            if(arr[i]>K)
	                Slow=true;
	            if(arr[i]==-1)
	                Unsolved++;
	            else{
	                Solve++;
	                if(arr[i]<=1)
	                    SolveInSec++;
	            }
	        }
	        if(Double.valueOf(Solve)<Math.ceil(Double.valueOf(N)/2.0))
	            System.out.println("Rejected");
	        else{
	            if(Slow==true)
	                System.out.println("Too Slow");
	            else{
	                if(SolveInSec==N)
	                    System.out.println("Bot");
	                else{
	                    System.out.println("Accepted");
	                }
	            }
	        }
	    }
	}
}
