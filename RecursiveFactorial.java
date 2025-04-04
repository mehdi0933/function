package javacore.chapter04.function.exercise;

public class RecursiveFactorial {
    public static void main(String[] args) {
        RecursiveFactorial(9,1 , 1);
    }
    public static int  RecursiveFactorial(int number , int count, int result){

        if(count <= number){

            result = result *= count;
            System.out.println(result);
            count++;
            RecursiveFactorial(number, count, result);

            return result;
        }
        return -1;
    }
}
