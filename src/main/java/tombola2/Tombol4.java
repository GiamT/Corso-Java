package tombola2;

import java.util.ArrayList;
import java.util.Collections;

public class Tombol4 {

        public static void main(String[] args) {

            // Si crea la lista per i numeri della tombola
            ArrayList<Integer> tombola = new ArrayList<>();

            // Generiamo i numeri casuali da 1 a 90
            ArrayList<Integer> numeriCasuali = new ArrayList<>();
            for (int i = 1; i <= 90; i++) {
                numeriCasuali.add(i);
            }

            // Mescoliamo i numeri per rendere l'estrazione casuale
            Collections.shuffle(numeriCasuali);

            // Estraiamo i primi 20 numeri per la tombola
            for (int i = 0; i < 20; i++) {
                tombola.add(numeriCasuali.get(i));
            }

            // Stampiamo i numeri della tombola
            System.out.println("Numeri della tombola:");
            for (int numero : tombola) {
                System.out.print(numero + " ");
            }
        }

}

