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
		    int n=Integer.parseInt(ob.readLine());
		    String s1=ob.readLine();
		    String s2=ob.readLine();
		    int s1Zeros=0;
		    int s1Ones=0;
		    int s2Zeros=0;
		    int s2Ones=0;
		    for(int i=0;i<n;i++)
		    {
		        if(s1.charAt(i)=='0'){
		            s1Zeros+=1;
		        }else if(s1.charAt(i)=='1'){
		            s1Ones+=1;
		        }
		        if(s2.charAt(i)=='0'){
		            s2Zeros+=1;
		        }else if(s2.charAt(i)=='1'){
		            s2Ones+=1;
		        }
		    }
		    if(s1Ones==s2Ones && s1Zeros==s2Zeros){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
