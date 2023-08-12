import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.next().charAt(0);
        sc.close();
        int asciValue=(int)a;
        System.out.printf("%d",asciValue);
    }
}