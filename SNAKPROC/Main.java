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
	        int length=Integer.parseInt(ob.readLine());
	        String s = ob.readLine();
	        StringBuilder s1=new StringBuilder();
	        int count=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)!='.'){
	                s1.append(s.charAt(i));
	                count++;
	            }
	        }
	        if(count==0){
	            System.out.println("Valid");
	        }else{
	            if(count%2==0){
	                int flag=0;
	                for(int i=0;i<s1.length();i=i+2)
	                {
	                    if(s1.charAt(i)=='H' && s1.charAt(i+1)=='T'){
	                        continue;
	                    }else{
	                        flag=1;
	                        break;
	                    }
	                }
	                if(flag==0)
	                {
	                    System.out.println("Valid");
	                }else{
	                    System.out.println("Invalid");
	                }
	            }else{
	                System.out.println("Invalid");
	            }
	        }
	    }
	}
}
