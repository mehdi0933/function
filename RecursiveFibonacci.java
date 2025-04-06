package javacore.chapter04.function.exercise;

public class RecursiveFibonacci {
    public static void main(String[] args) {
         RecursiveFibonacci(0 , 1);
    }

    public static int RecursiveFibonacci(int value1 , int value2) {
        if (value1 <= 50) {
            System.out.println(value1);
            RecursiveFibonacci(value2, value1 + value2);
            return value1;
        }
        return 1;

    }
}
