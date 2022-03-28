public class P2W_PerulanganWhile {
    public static void main(String[] args) {
        //While Loop
        int x = 0;
        System.out.println("Example of While Loop--");
        while (x <= 10){
            System.out.printf("%d ", x);
            x++;
        }
        System.out.print("\n");
        //Do-While Loop
        int y = 0;
        do{
            y = y + 10;
            System.out.println("I am inside Do block---" + y);
        }while (y <= 50);
    }
}
