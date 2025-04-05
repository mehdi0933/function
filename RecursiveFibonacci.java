package javacore.chapter04.function.exercise;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        RecursiveFibonacci(0,1,0, 50);
        System.out.println();
    }
    public static int RecursiveFibonacci(int value1, int value2, int resulta, int valueMax ) {
        if(value1 <= valueMax) {
            System.out.println(resulta);
            resulta = value2 + value1;
            value1 = value2;
            value2 = resulta;
            RecursiveFibonacci(value1, value2, resulta);
            return value1;
        }
        return 1;
    }
}
