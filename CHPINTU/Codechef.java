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
		    int Bukets=sc.nextInt();
		    int FruitTypes=sc.nextInt();
		    int FruitInBuket[]=new int[Bukets];
		    int BuketPrice[]=new int[Bukets];
		    for(int i=0;i<Bukets;i++)
		    {
		        FruitInBuket[i]=sc.nextInt();
		    }
		    for(int i=0;i<Bukets;i++)
		    {
		        BuketPrice[i]=sc.nextInt();
		    }
		    ArrayList<Integer> arr=new ArrayList<Integer>();
		    for(int i=0;i<Bukets;i++)
		    {
		        arr.add(FruitInBuket[i]);
		    }
		    Collections.sort(arr);
		    for(int i=0;i<arr.size()-1;)
		    {
		        if(arr.get(i)==arr.get(i+1))
		            arr.remove(arr.get(i+1));
		        else
		            i++;
		    }
		    int TotalPrice[]=new int[arr.size()];
		    for(int i=0;i<arr.size();i++)
		    {
		        int price=0;
		        for(int j=0;j<FruitInBuket.length;j++)
		        {
		            if(arr.get(i)==FruitInBuket[j])
		                price+=BuketPrice[j];
		        }
		        TotalPrice[i]=price;
		    }
		    Arrays.sort(TotalPrice);
		    System.out.println(TotalPrice[0]);
		}
	}
}
