import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random random = new Random();
        tablica[0] = random.nextInt(40)-20;
        for (int i = 1; i < tablica.length; i++) {

            int k = random.nextInt(40)-20;
            if (k > tablica[i - 1]) {
                tablica[i] = k;
            } else {
                tablica[i] = tablica[i - 1];
            }
        }
        for (int element : tablica) {
            System.out.print(" " + element);
        }

    }
}
