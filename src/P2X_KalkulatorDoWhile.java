import java.util.Scanner;

public class P2X_KalkulatorDoWhile {
    public static void main(String[] args) throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        String goOn;
        do {
            System.out.print("Masukkan angka pertama : ");
            double a = Double.parseDouble(input.nextLine());
            System.out.print("Masukkan angka kedua : ");
            double b = Double.parseDouble(input.nextLine());
            System.out.println("Pilih salah satu operasi : ");
            System.out.println("1. penambahan");
            System.out.println("2. pengurangan");
            System.out.println("3. perkalian");
            System.out.println("4. pembagian");
            int choiche = Integer.parseInt(input.nextLine());
            double result = 0.0;
            switch (choiche) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                default:
                    break;
            }
            if ((choiche > 0) && (choiche < 5)) {
                System.out.println("hasil : " + result);
            } else {
                System.out.println("Invalid choiche");
            }
            System.out.print("Would you like to make another calculation? [yes/no] : ");
            goOn = input.nextLine();
        } while (goOn.equals("yes"));
        System.out.println("Thank you for using our calculator.");
    }
}
