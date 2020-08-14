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
		int j=1;
		while(t-->0)
		{
		    int currentX=0;
		    int currentY=0;
		    
		    String Dangor[]=ob.readLine().split(" ");
		    int M=Integer.parseInt(Dangor[0]);
		    int N=Integer.parseInt(Dangor[1]);
		    
		    String RealtiveCord[]=ob.readLine().split(" ");
		    int XCordRelative=Integer.parseInt(RealtiveCord[0]);
		    int YCordRelative=Integer.parseInt(RealtiveCord[1]);
		    
		    int length=Integer.parseInt(ob.readLine());
		    String s=ob.readLine();
		    for(int i=0;i<length;i++)
		    {
		        if(s.charAt(i)=='L')
		            currentX-=1;
		        else if(s.charAt(i)=='R')
		            currentX+=1;
		        else if(s.charAt(i)=='U')
		            currentY+=1;
		        else if(s.charAt(i)=='D')
		            currentY-=1;
		    }
		    if(currentX==XCordRelative && currentY==YCordRelative)
		        System.out.println("Case "+j+":"+" REACHED");
		    else if(currentX<0 || currentX>=M || currentY<0 || currentY>=N)
		        System.out.println("Case "+j+":"+" DANGER");
		    else
		        System.out.println("Case "+j+":"+" SOMEWHERE");
		    ++j;
		}
	}
}
