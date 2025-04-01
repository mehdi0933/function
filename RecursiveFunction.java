package javacore.chapter04.function.exercise;

public class RecursiveFunction {
    public static void main(String[] args) {
        goTo10000(1, 10000);
    }
    public static void goTo10000(int number, int numberMax){

        if(number <= numberMax){

        System.out.println(number);
        number++;
        goTo10000(number, numberMax);

        }
    }
}

/**
 *
 * la console affiche une suite de nombre de 1 a 10000.
 *
 */
