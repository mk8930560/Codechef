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
		    int total_player = sc.nextInt();
		    int cost = sc.nextInt();
		    int Player_cost[] = new int[total_player];
		    int Player_type[] = new int[total_player];
		    for(int i=0;i<total_player;i++)
		    {
		        Player_cost[i] = sc.nextInt();
		    }
		    ArrayList<Integer> price_defender = new ArrayList<Integer>();
		    ArrayList<Integer> price_forward = new ArrayList<Integer>();
		    for(int i=0;i<total_player;i++)
		    {
		        Player_type[i] = sc.nextInt();
		        if(Player_type[i]==0)
		        {
		            price_defender.add(Player_cost[i]);
		        }
		        else if(Player_type[i]==1)
		        {
		            price_forward.add(Player_cost[i]);
		        }
		    }
		    int flag=0;
		    for(int i=0;i<price_defender.size();i++)
		    {
		        for(int j=0;j<price_forward.size();j++)
		        {
		            if(cost+price_defender.get(i)+price_forward.get(j)<=100)
		            {
		                flag=1;
		                break;
		            }
		        }
		    }
		    if(flag==1)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("no");
		    }
		}
	}
}
