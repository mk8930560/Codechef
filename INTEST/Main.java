import java.util.Scanner;
// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=a;i++)
	    {
	        int value=sc.nextInt();
	        if(value%b==0)
	        {
	            count++;
	        }
	    }
	    System.out.println(count);
		
	}
}
