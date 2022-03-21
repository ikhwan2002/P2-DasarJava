import java.util.Scanner;

public class P2N_Percabangan2IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int intNumber = input.nextInt();
        if (intNumber > 5){
            System.out.println("The number you entered is greater than 5!");
        }
        System.out.println("Thanks for the input!");

        System.out.println("\nEnter a number between 10-20:");
        int a = input.nextInt();
        if (a >= 10 && a <= 20){
            System.out.println("The condition has been met.");
        }else {
            System.out.println("you did it wrong.");
        }

        System.out.println("\nEnter a number between 10-20 or 30-40:");
        int b = input.nextInt();
        if (((b >= 10) && (b <= 20)) || ((b >= 30) && (b <= 40))){
            System.out.println("The condition has been met.");
        }else {
            System.out.println("You did it wrong");
        }
    }
}
