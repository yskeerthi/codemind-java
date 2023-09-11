import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() == 10) {
            if (s.startsWith("0")) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
