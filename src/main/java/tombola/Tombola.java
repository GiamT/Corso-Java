package tombola;

import java.util.HashSet;
import java.util.Random;

public class Tombola {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> numeriEstratti = new HashSet<>();

        while (numeriEstratti.size() < 20) {
            int numeroRandom = random.nextInt(90) + 1;
            numeriEstratti.add(numeroRandom);
        }

        System.out.println("Numeri estratti:");
        for (int number : numeriEstratti) {
            System.out.print(number + " ");
        }
    }
}