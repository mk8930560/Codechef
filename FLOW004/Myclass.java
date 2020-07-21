import java.util.*;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int sum=0;
            int b=sc.nextInt();
            sum+=b%10;
            while(b>=10)
            {
                b/=10;
            }
            sum+=b;
            System.out.println(sum);
        }
    }
}
