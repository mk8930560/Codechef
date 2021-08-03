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
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        String A[] = ob.readLine().split(" ");
	        String B[] = ob.readLine().split(" ");
	        
	        String output[]=new String[3];
	        
	        for(int i=0;i<3;i++)
	        {
	            int value1 = Integer.parseInt(A[i]);
	            int value2 = Integer.parseInt(B[i]);
	            if(value1>value2)
	                output[i]="A";
	            else
	                output[i]="B";
	        }
	        
	        int countA=0;
	        int countB=0;
	        
	        for(int i=0;i<3;i++)
	        {
	            if(output[i].equals("A"))
	                countA++;
	            else    
	                countB++;
	        }
	        
	        if(countA>countB)
	            System.out.println("A");
	        else
	            System.out.println("B");
	        
	    }
	}
}
