package util;

public class Fibonacci{

    public static void main(String[] args) {
        int n = 10; // Numero di elementi della serie di Fibonacci da stampare
        System.out.println("Serie di Fibonacci fino a " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
