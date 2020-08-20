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
	        int cat=sc.nextInt();
	        int FoodCan=sc.nextInt();
	        ArrayList<Integer> arr=new ArrayList<Integer>();
	        for(int i=0;i<FoodCan;i++)
	        {
	            arr.add(sc.nextInt());
	        }
	        int flag=0;
	        while(arr.size()>0)
	        {
	            int block[];
	            if(arr.size()>cat)
	            {
	                block=new int[cat];
	            }
	            else
	            {
	                block=new int[FoodCan];    
	            }
	            for(int i=0;i<block.length;i++)
	                block[i]=arr.get(i);
	            Arrays.sort(block);

	            for(int i=0;i<block.length;i++)
	            {
	                arr.remove(arr.get(0));
	                FoodCan--;
	            }
	            for(int i=0;i<block.length-1;i++)
	            {
	                if(block[i]==block[i+1])
	                    flag=1;
	            }
	            if(flag==1)
	                break;
	        }
	        if(flag==1)
	        {
	            System.out.println("NO");
	        }else
	        {
	            System.out.println("YES");
	        }
	    }
	}
}
