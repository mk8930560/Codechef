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
	        String values[]=ob.readLine().split(" ");
	        int ALiceStepSize=Integer.parseInt(values[0]);
	        int BobStepSize=Integer.parseInt(values[1]);
	        int AliceRobotPostion=0;
	        int BobRobotPostion=s.length()-1;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='A')
	                AliceRobotPostion=i;
	            else if(s.charAt(i)=='B')
	                BobRobotPostion=i;
	                
	        }
	        int flag=0;
	        do{
	            AliceRobotPostion+=ALiceStepSize;
	            BobRobotPostion-=BobStepSize;
	            if(AliceRobotPostion==BobRobotPostion)
	            {
	                flag=1;
	                break;
	            }
	        }while(AliceRobotPostion<=s.length()-1 || BobRobotPostion>=0);
	        
	        if(flag==0)
	            System.out.println("safe");
	        else
	            System.out.println("unsafe");
	    }
	}
}
