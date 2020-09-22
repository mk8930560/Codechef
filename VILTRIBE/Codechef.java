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
	        String s=ob.readLine();
	        int length=s.length();
	        int OccuByA=0;
	        int OccuByB=0;
	        char previous=' ';
	        int prvIndex=0;
	        for(int i=0;i<length;i++)
	        {
	            if(s.charAt(i)!='.')
	            {
	                if(s.charAt(i)=='A')
	                {
	                    OccuByA++;
	                    if(s.charAt(i)=='A' && previous==' ')
	                    {
	                        previous=s.charAt(i);
	                        prvIndex=i;
	                    }
	                    else if(s.charAt(i)=='A' && previous=='A')
	                    {
	                        OccuByA+=(i-1)-prvIndex;
	                        prvIndex=i;
	                    }
	                    else if(s.charAt(i)=='A' && previous=='B')
	                    {
	                        previous=s.charAt(i);
	                        prvIndex=i;
	                    }
	                }
	                else if(s.charAt(i)=='B')
	                {
	                    OccuByB++;
	                    if(s.charAt(i)=='B' && previous==' ')
	                    {
	                        previous=s.charAt(i);
	                        prvIndex=i;
	                    }
	                    else if(s.charAt(i)=='B' && previous=='B')
	                    {
	                        OccuByB+=(i-1)-prvIndex;
	                        prvIndex=i;
	                    }
	                    else if(s.charAt(i)=='B' && previous=='A')
	                    {
	                        previous=s.charAt(i);
	                        prvIndex=i;
	                    }
	                }
	            }
	        }
	        System.out.println(OccuByA+" "+OccuByB);
	    }
	}
}
