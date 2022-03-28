import java.util.InputMismatchException;
import java.util.Scanner;

public class P2AB_ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan nilai (integer) : ");
            int value = input.nextInt();
            System.out.println("Hasil nilai masukan x 2 = " + (value * 2));
        }catch (InputMismatchException ex){
            System.out.println("Periksa kembali inputan anda.");
        }finally {
            System.out.println("Terima kasih!");
        }
    }
}
