public class P2AA_BreakContinueLabel {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Contoh break Label");
        Mulai :
        for (a = 0; a < 2; a++){
            for (b = 0; b < 3; b++){
                if (b == 1){
                    break Mulai;
                }
                System.out.println("a = " + a + " ; b =" + b);
            }
        }
        System.out.println("\nContoh continue Label");
        Lanjut :
        for (a = 0; a < 2; a++){
            for (b = 0; b < 3; b++){
                if (b == 1){
                    continue Lanjut;
                }
                System.out.println("a = " + a + " ; b =" + b);
            }
        }
    }
}
