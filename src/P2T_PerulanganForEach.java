public class P2T_PerulanganForEach {
    public static void main(String[] args) {
        int arrAngka[] = {10,11,12,13,14,15};
        for (int angka : arrAngka){
            System.out.println("%d" + angka);
        }
        System.out.println("\n");

        String[] cars = {"volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars){
            System.out.println(car);
        }
    }
}
