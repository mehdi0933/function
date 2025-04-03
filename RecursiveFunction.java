package javacore.chapter04.function.exercise;

public class RecursiveFunction {
    
    public static void main(String[] args) {
        recusiveGoTo10000(1, 10000);
    }

    public static int recusiveGoTo10000(int number, int numberMax){

        if(number <= numberMax){
            System.out.println(number);
            number++;
            recusiveGoTo10000(number, numberMax);
            return number;
        }
        return 0 ;
    }
}

/**
 *
 * la console affiche une suite de nombre de 1 a 10000.
 *
 */
