import java.util.Scanner;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            if(b<10)
            {
                System.out.println("What an obedient servant you are!");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
