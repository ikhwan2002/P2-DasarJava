import java.util.Scanner;

public class P2V_KalkulatorEksponensial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple multiplication table using loops : ");
        System.out.println("Exponent calculator");
        System.out.println("===========");
        System.out.println("Enter the base : ");
        int a = input.nextInt();
        System.out.print("Enter the exponent : ");
        int n = input.nextInt();
        int result = a;
        for (int i = 1; i <= n - 1; i++){
            result = result * a;
        }
        System.out.printf("Result : %d\n", result);
        System.out.println("Thank you for using our exponent calculator");
    }
}
