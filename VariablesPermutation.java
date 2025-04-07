package javacore.chapter04.function.exercise;

public class VariablesPermutation {
    public static void main(String[] args) {
        System.out.println(sum( 2 , 4));
        System.out.println(sum( 2 , 4 , 4));
    }
    public static int sum(int number1, int number2){
        int resultat = number1 + number2;
        return resultat   ;
    }
    public static int sum(int number1, int number2, int number3 ){
        int resultat = number1 + number2 + number3;
        return resultat   ;
    }
}
