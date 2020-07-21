import java.util.Scanner;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i%4==0)
        {
            i++;
            System.out.println(i);
        }
        else
        {
            i--;
            System.out.println(i);
        }
    }
}
