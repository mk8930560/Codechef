/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
	        int question[]={1,2,3,4,5,6,7,8,9,10,11};
	        int answerpoint[]=new int[11];
	        while(n-->0)
	        {
	            String s=ob.readLine();
	            String arr[]=s.split("\\s+");
	            int Questionumber=Integer.parseInt(arr[0]);
	            int QuestionValue=Integer.parseInt(arr[1]);
	            if(answerpoint[Questionumber-1]<QuestionValue)
	            {
	                answerpoint[Questionumber-1]=QuestionValue;
	            }
	        }
	        int total=0;
	        for(int i=0;i<=7;i++)
	        {
	            total+=answerpoint[i];
	        }
	        System.out.println(total);
	    }
	}
}
