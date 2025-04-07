package javacore.chapter04.function.exercise;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 9;
        int factorialResult = calculateFactorial(number, 1, 1); // Appel de la méthode pour calculer la factorielle
        System.out.println("La factorielle de " + number + " est : " + factorialResult);
    }

    public static int calculateFactorial(int number, int currentCount, int currentResult) {
        // Condition barrière : si currentCount dépasse number, on retourne le résultat final
        if (currentCount > number) {
            return currentResult; // Retourne le résultat final de la factorielle
        }

        currentResult *= currentCount; // Calcul de la factorielle
        currentCount++;
        return calculateFactorial(number, currentCount, currentResult); // Appel récursif
    }
}

/**
 * La console affiche la factorielle de 9.
 */
