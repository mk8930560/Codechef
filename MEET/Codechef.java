/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int Time(String s)
    {
        String NewTime="";
        String EveOrMor = s.substring(6,8);
        String Hour = s.substring(0,2);
        String Mins = s.substring(3,5);
        if(EveOrMor.equals("AM"))
        {
            if(Hour.equals("12"))
            {
                NewTime+="00";
                NewTime+=Mins;
            }
            else
            {
                NewTime+=Hour;
                NewTime+=Mins;
            }
        }
        else if(EveOrMor.equals("PM"))
        {
            if(Hour.equals("12"))
            {
                NewTime+=Hour;
                NewTime+=Mins;
            }
            else
            {
                NewTime+=String.valueOf(Integer.parseInt(Hour)+12);
                NewTime+=Mins;
            }
        }
        return Integer.parseInt(NewTime);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        int MeetingTime = Time(ob.readLine());
	        int P = Integer.parseInt(ob.readLine());
	        String value="";
	        while(P-->0)
	        {
	            String s= ob.readLine();
	            int L = Time(s.substring(0,8));
	            int R = Time(s.substring(9,17));
	            if(MeetingTime>=L && MeetingTime<=R)
	                value+="1";
	            else
	                value+="0";
	        }
	        System.out.println(value);
	    }
	}
}
