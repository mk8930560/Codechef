/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean Find(char c1,char c2,char c3)
    {
        boolean found=false;
        StringBuilder word=new StringBuilder();
        word.append(String.valueOf(c1));
        word.append(String.valueOf(c2));
        word.append(String.valueOf(c3));
        if(word.toString().equals("bob")||word.toString().equals("bbo")||
            word.toString().equals("obb"))
            {
                found=true;
            }
	    return found;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        int flag=0;
	        String s1=ob.readLine();
	        String s2=ob.readLine();
	        if(Find(s1.charAt(0),s1.charAt(1),s1.charAt(2)))
	            flag=1;
	        else if(Find(s2.charAt(0),s2.charAt(1),s2.charAt(2)))
	            flag=1;
	        else if(Find(s1.charAt(0),s2.charAt(1),s2.charAt(2)))
	            flag=1;
	        else if(Find(s2.charAt(0),s1.charAt(1),s1.charAt(2)))
	            flag=1;
	        else if(Find(s2.charAt(0),s1.charAt(1),s2.charAt(2)))
	            flag=1;
	        else if(Find(s1.charAt(0),s2.charAt(1),s1.charAt(2)))
	            flag=1; 
	        else if(Find(s2.charAt(0),s2.charAt(1),s1.charAt(2)))
	            flag=1;
	        else if(Find(s1.charAt(0),s1.charAt(1),s2.charAt(2)))
	            flag=1;
	        if(flag==1)
	            System.out.println("yes");
	        else
	            System.out.println("no");
	    }
	}
}
