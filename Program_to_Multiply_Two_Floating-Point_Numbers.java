import java.util.Scanner;
public class add {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float number1,number2,number3;
        //creating an object of Scannerclass
        number1=sc.nextFloat();
        number2=sc.nextFloat();
        number3=number1*number2;
        System.out.printf("%.2f",number3);
    }
}
