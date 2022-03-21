import java.util.Scanner;

public class P2O_HitungGradeIF {

    public static void main(String[] args) {

        //membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.println("Inputkan nilai: ");
        nilai = scan.nextInt();

        //hitung gradenya
        if (nilai >= 85){
            grade = "A";
        }else if (nilai >= 75){
            grade = "B+";
        }else if (nilai >= 65){
            grade = "B";
        }else if (nilai >= 60){
            grade = "C+";
        }else if (nilai >= 55){
            grade = "C";
        }else if (nilai >= 40){
            grade = "D";
        }else {
            grade = "E";
        }
        //cetak hasilnya
        System.out.println("Grade: " + grade);
    }
}
