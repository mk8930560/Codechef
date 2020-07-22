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
		    int count=0;
		    String s1=sc.next();
		    s1+=sc.nextLine();
		    String words[] = s1.split("\\s+");
		    String s2=sc.next();
		    s2+=sc.nextLine();
		    String words1[] = s2.split("\\s+");
		    for(int i=0;i<words.length;i++)
		    {
		        for(int j=0;j<words1.length;j++)
		        {
		            if(words[i].equals(words1[j]))
		            {
		                count++;
		            }
		        }
		    }
		    if(count>=2)
		    {
		        System.out.println("similar");
		    }
		    else
		    {
		        System.out.println("dissimilar");
		    }
		}
	}
}
