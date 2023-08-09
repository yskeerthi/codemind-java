import java.util.Scanner;
public class add {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number1,number2;
        //creating an object of Scannerclass
        number1=sc.nextInt();
        number2=sc.nextInt();
        double average=(number1+number2)/2.0;
        System.out.printf("%.4f",average);
    }
}
