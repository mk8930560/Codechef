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
			int TKnigts=Integer.parseInt(ob.readLine());
			ArrayList<String> KnighPos=new ArrayList<String>();
			for(int i=0;i<TKnigts;i++)
				KnighPos.add(ob.readLine());
			
			String KingPos[]=ob.readLine().split(" ");
			int KingRow=Integer.parseInt(KingPos[0]);
			int KingColumn=Integer.parseInt(KingPos[1]);
			
			ArrayList<String> ChekMatePos=new ArrayList<String>();
			//only Possible Position which can Checkmate King 
			ChekMatePos.add(String.valueOf(KingRow+2)+" "+String.valueOf(KingColumn-1));
			ChekMatePos.add(String.valueOf(KingRow-2)+" "+String.valueOf(KingColumn-1));
			ChekMatePos.add(String.valueOf(KingRow+2)+" "+String.valueOf(KingColumn+1));
			ChekMatePos.add(String.valueOf(KingRow-2)+" "+String.valueOf(KingColumn+1));
			
			ChekMatePos.add(String.valueOf(KingRow+1)+" "+String.valueOf(KingColumn-2));
			ChekMatePos.add(String.valueOf(KingRow-1)+" "+String.valueOf(KingColumn-2));
			ChekMatePos.add(String.valueOf(KingRow+1)+" "+String.valueOf(KingColumn+2));
			ChekMatePos.add(String.valueOf(KingRow-1)+" "+String.valueOf(KingColumn+2));
			
			int flag=0;
			for(int i=0;i<8;i++)
			{
				if(KnighPos.contains(ChekMatePos.get(i)))
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}
