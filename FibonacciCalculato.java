package javacore.chapter04.function.exercise;

public class FibonacciCalculator {
    public static void main(String[] args) {
        int maxLimit = 50;
        int lastFibonacci = printFibonacciSequence(0, 1, maxLimit); // Appel de la méthode
        System.out.println("Dernier nombre de Fibonacci généré : " + lastFibonacci);
    }

    public static int printFibonacciSequence(int current, int next, int maxLimit) {
        if (current > maxLimit) {
            return current; // Condition barrière : retourne le dernier nombre généré
        }

        System.out.println(current);
        return printFibonacciSequence(next, current + next, maxLimit); // Appel récursif
    }
}
