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
	    int workers=sc.nextInt();
	    int Coins[]=new int[workers];
	    int WokerType[]=new int[workers];
	    for(int i=0;i<workers;i++)
	        Coins[i]=sc.nextInt();
	    for(int i=0;i<workers;i++)
	        WokerType[i]=sc.nextInt();
	   
	    int min=100000;
	    int type1min=100000;
	    int type2min=100000;
        for(int i=0;i<workers;i++)
	    {
	        if(WokerType[i]==1)
	        {
	            if(Coins[i]<type1min)
	                type1min=Coins[i];
	        }
	        else if(WokerType[i]==2)
	        {
	            if(Coins[i]<type2min)
	                type2min=Coins[i];
	        }
	    }
	    if(type1min!=100000 && type2min!=100000)
	    {
	        min=type1min+type2min;
	    }
	    for(int i=0;i<workers;i++)
	    {
	        if(WokerType[i]==3)
	        {
	            if(Coins[i]<min)
	                min=Coins[i];
	        }
	    }    
	    System.out.println(min);
	}
}
