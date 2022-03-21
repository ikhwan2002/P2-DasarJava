public class P2M_PercabanganIF {
    public static void main(String[] args) {
        //if
        if (15 > 5){
            System.out.println("True");
        }
        System.out.println("The program continues here...");
        //if - else
        int a = 5;
        int b = 2;
        int max;
        if (a > b) {
            max = a;
        }else {
            max = b;
        }
        System.out.println("Maximum of a or b is " + max);
        //if - else if
        int myVar = 0;
        if (myVar == 0){
            myVar = 1;
        } else if (myVar == 1){
            myVar = 0;
        }else {
            myVar = -1;
        }
    }
}
