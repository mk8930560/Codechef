import java.util.Scanner;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(b>c)
            {
                System.out.println(">");
            }
            else if(b<c)
            {
                System.out.println("<");
            }
            else
            {
                System.out.println("=");
            }
        }
    }
}

