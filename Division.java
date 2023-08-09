import java.util.Scanner;
public class add {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number1,number2,number3;
        //creating an object of Scannerclass
        number1=sc.nextInt();
        number2=sc.nextInt();
        number3=number1/number2;
        System.out.printf("%d",number3);
    }
}
