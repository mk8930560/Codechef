import java.util.Scanner;
import java.text.DecimalFormat;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        if(a%5==0 && a+0.50<=b)
        {
            System.out.println(new DecimalFormat("#.00").format(b-a-0.50));
            
        }
        else
        {
            System.out.println(new DecimalFormat("#.00").format(b));
        }
    }
}
