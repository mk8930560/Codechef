import java.util.Scanner;
class MYclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int num=sc.nextInt();
            int reversed=0;
            while(num!=0)
            {
                int dig=num%10;
                reversed=reversed*10+dig;
                num=num/10;
            }
            System.out.println(reversed);
        }
    }
}
