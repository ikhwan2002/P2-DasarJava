public class P2Z_ReturnFromLoop {
    public static void main(String[] args) {
        returnLoop();
    }
    static void returnLoop(){
        int x;
        System.out.println("Example of return in For-Loop");
        for (x = 1; x <= 10; x++){
            if (x < 5){
                System.out.printf("%d", (x - 1));
            }else {
                System.out.print("\n");
                return;
            }
            System.out.printf("%d ", x);
        }
        System.out.print("Tidak akan pernah dieksekusi");
    }
}
