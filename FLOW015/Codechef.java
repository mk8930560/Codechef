import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    String inputdate="01/01/"+sc.nextInt();
		    SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		    Date dt1=null;
		    try
		    {
		        dt1=format.parse(inputdate);
		    }catch(ParseException e) {
                e.printStackTrace();
            }
            DateFormat format2=new SimpleDateFormat("EEEE");
            String finaday=format2.format(dt1);
            System.out.println(finaday.toLowerCase());
		}
	}
}
