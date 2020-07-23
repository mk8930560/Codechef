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
		    int n=sc.nextInt();
		    int cCount=0;
		    int oCount=0;
		    int dCount=0;
		    int eCount=0;
		    int hCount=0;
		    int fCount=0;
		    for(int i=1;i<=n;i++)
		    {
		        String s=sc.next();
		        for(int j=0;j<s.length();j++)
		        {
		            char c=s.charAt(j);
		            if(c=='c'){
		                cCount++;
		            }else if(c=='o'){
		                oCount++;
		            }else if(c=='d'){
		                dCount++;
		            }else if(c=='e'){
		                eCount++;
		            }else if(c=='h'){
		                hCount++;
		            }else if(c=='f'){
		                fCount++;
		            }
		        }
		    }
		    int val1=Math.min(cCount/2,eCount/2);
		    int val2=Math.min(oCount,dCount);
		    int val3=Math.min(hCount,fCount);
		    System.out.println(Math.min(Math.min(val1,val2),val3));
		}
	}
}
