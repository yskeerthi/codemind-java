import java.util.Scanner;
public class main{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=n*n;
    String t=Integer.toString(n);
    String r=Integer.toString(s);
    System.out.println(r.endsWith(t)? "Automorphic Number" : "Not an Automorphic Number");
}
}
