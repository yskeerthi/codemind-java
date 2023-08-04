import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        int n,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        b=(n*(n-1))/2;
        System.out.printf("%d",b);
    }
}