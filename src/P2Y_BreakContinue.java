public class P2Y_BreakContinue {
    public static void main(String[] args) throws NumberFormatException {
        int x;
        System.out.println("Example of Break and Continue in For-Loop");
        for (x = 1; x <= 10; x++){
            if (x == 7){
                break;
            }
            if (x == 3){
                continue;
            }
            System.out.printf("%d ", x);
        }
        System.out.println('\n');
    }
}
