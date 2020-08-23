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
	        int RamTruthTask=sc.nextInt();
	        int RamTruth[]=new int[RamTruthTask];
	        
	        for(int i=0;i<RamTruthTask;i++)
	            RamTruth[i]=sc.nextInt();
	        
	        int RamDareTask=sc.nextInt();
	        int RamDare[]=new int[RamDareTask];
	        
	        for(int i=0;i<RamDareTask;i++)
	            RamDare[i]=sc.nextInt();
	        
	        int ShyamTruthTask=sc.nextInt();
	        int ShyamTruth[]=new int[ShyamTruthTask];
	        
	        for(int i=0;i<ShyamTruthTask;i++)
	            ShyamTruth[i]=sc.nextInt();
	            
	        int ShyamDareTask=sc.nextInt();
	        int ShyamDare[]=new int[ShyamDareTask];
	       
	        for(int i=0;i<ShyamDareTask;i++)
	            ShyamDare[i]=sc.nextInt();
	        
	        int FindTruths[]=new int[ShyamTruthTask];
	        int FindDares[]=new int[ShyamDareTask];
	        
	        for(int i=0;i<ShyamTruthTask;i++)
	        {
	            int count=0;
	            for(int j=0;j<RamTruthTask;j++)
	            {
	                if(ShyamTruth[i]==RamTruth[j])
	                {
	                    count=1;
	                    break;
	                }
	            }
	            FindTruths[i]=count;
	        }
	        
	        for(int i=0;i<ShyamDareTask;i++)
	        {
	            int count=0;
	            for(int j=0;j<RamDareTask;j++)
	            {
	                if(ShyamDare[i]==RamDare[j])
	                {
	                    count=1;
	                    break;
	                }
	            }
	            FindDares[i]=count;
	        }
	        
	        int TruthFlag=0;
	        int DareFlag=0;
	        for(int i=0;i<FindTruths.length;i++)
	        {
	            if(FindTruths[i]==0)
	            {
	                TruthFlag=1;
	                break;
	            }
	        }
	        for(int i=0;i<FindDares.length;i++)
	        {
	            if(FindDares[i]==0)
	            {
	                DareFlag=1;
	            }
	        }
	        
	        if(TruthFlag==0 && DareFlag==0)
	        {
	            System.out.println("yes");
	        }else
	            System.out.println("no");

	    }
	}
}
