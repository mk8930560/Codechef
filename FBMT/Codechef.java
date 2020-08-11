
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
		    int n=Integer.parseInt(ob.readLine());
		    ArrayList<String> arr = new ArrayList<String>();
		    if(n==0)
		    {
		        System.out.println("Draw");
		    }
		    else
		    {
		        for(int i=0;i<n;i++){
		            arr.add(ob.readLine());
		        }
		        StringBuilder team1 = new StringBuilder();
		        StringBuilder team2 = new StringBuilder();
		        int flag=0;
		        for(int i=0;i<n-1;i++)
		        {
		            if(!arr.get(i).equals(arr.get(i+1))){
		                team1.append(arr.get(i));
		                team2.append(arr.get(i+1));
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0){
		            System.out.println(arr.get(0));
		        }else
		        {
		            int Team1Goal=0;
		            int Team2Goal=0;
		            for(int i=0;i<n;i++)
		            {
		                if(arr.get(i).toString().equals(team1.toString()))
		                    Team1Goal++;
		                else if(arr.get(i).toString().equals(team2.toString()))
		                    Team2Goal++;
		            }
		            if(Team1Goal>Team2Goal)
		                System.out.println(team1);
		            else if(Team2Goal>Team1Goal)
		                System.out.println(team2);
		            else
		                System.out.println("Draw");
		        }
		        
		    }
		    
		}
	}
}
