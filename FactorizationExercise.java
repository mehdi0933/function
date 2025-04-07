package javacore.chapter04.function.exercise;

public class FactorizationExercise {

    public static void main(String[] args) {

        // Afficher les nombres de 1 à 5
        loop(1,5);

        // Afficher la table de multiplication de 2
        displayMultiplication(2);
        loopMulpication(1,10, 2);

        // Afficher la table de multiplication de 3
        displayMultiplication(3);
        loopMulpication(1,10, 3);


        // Afficher la table de multiplication de 6
        displayMultiplication(6);
        loopMulpication(1,10, 6);

        // Afficher les carrés des nombres de 1 à 5
        displayCarre(1,5);
        loopCarre(1,5);

        // Afficher les carrés des nombres de 6 à 10
        displayCarre(6,10);
        loopCarre(6,10);
    }

    public static  void loop(int count, int valueMax) {
        for (int i = count; i <= valueMax; i++) {

            System.out.println("Nombre: " + i);
        }
    }

    public static  void loopMulpication(int count, int valueMax, int multiplicateur){
        for (int i = count ; i <= valueMax; i++) {

            System.out.println(multiplicateur +" x " + i + " = " + (multiplicateur * i));
        }
    }

    public static void displayMultiplication(int multiplication){
        System.out.println("Table de multiplication de " + multiplication +":"  );
    }

    public static  void loopCarre(int count, int valueMax) {
        for (int i = count; i <= valueMax; i++) {

            System.out.println(i + " x " + i + " = " + (i * i));
        }
    }

    public static void displayCarre(int startNumber, int finishNumber){
        System.out.println("Carrés des nombres de " + startNumber + " a " + finishNumber );
    }
}
