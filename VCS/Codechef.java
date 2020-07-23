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
		    int total=sc.nextInt();
		    int first=sc.nextInt();
		    int second=sc.nextInt();
		    ArrayList<Integer> ignored = new ArrayList<Integer>(first);
		    ArrayList<Integer> tracked = new ArrayList<Integer>(second);
		    
		    for(int i=0;i<first;i++)
		    {
		        ignored.add(sc.nextInt());
		    }
		    for(int i=0;i<second;i++)
		    {
		        tracked.add(sc.nextInt());
		    }
		    
		    Set<Integer> a = new HashSet<Integer>(ignored);
		    
		    Set<Integer> b= new HashSet<Integer>(tracked);;
		    
		    Set<Integer> common = new HashSet<Integer>(a);
		    common.retainAll(b);
		    
		    Set<Integer> Union = new HashSet<Integer>(a);
		    Union.addAll(b);
		    
		    int untracked=0;
		    for(int i=1;i<=total;i++)
		    {
		        if(!Union.contains(i))
		        {
		            untracked++;
		        }
		    }
		    System.out.println(common.size()+" "+untracked);
		}
	}
}
