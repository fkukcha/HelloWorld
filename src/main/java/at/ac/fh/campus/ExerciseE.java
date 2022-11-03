package at.ac.fh.campus;

import java.util.Scanner;

public class ExerciseE {


    public static int[] printMultiplicationTable(int num1, int num2) {

        int[] myArray = new int[num2];

        if (num1 < 1 || num2 < 1 || num1 % 2 != 0) {
            System.out.println("Invalid input");
            return null;
        } else {
            for (int i=0; i<num2; i++)
                myArray[i] = num1 * i;
        }

        return myArray;
    }


    public static char[] createFairyLights(int lenFairyLights) {

        char[] myArray = new char[lenFairyLights];

        for (int i=0; i<lenFairyLights; i++) {
            System.out.println("Choose a light color (r,g,b):");
            Scanner scanner = new Scanner(System.in);
            char myChar = scanner.next().charAt(0);
            if (myChar != 'r' && myChar != 'g' && myChar != 'b') {
                do {
                    System.out.println("Invalid input");
                    System.out.println("Choose a light color (r,g,b):");
                    myChar = scanner.next().charAt(0);
                } while(myChar != 'r' && myChar != 'g' && myChar != 'b');
            }
            myArray[i] = myChar;
        }

        return myArray;
    }


    public static void main(String[] args) {

        ExerciseE inst = new ExerciseE();

        /*int[] arr = inst.printMultiplicationTable(0, 5);
        if (arr != null) {
            for (int i = 0; i < 5; i++)
                System.out.println(arr[i]);
        }*/
        char[] arr = inst.createFairyLights(3);

        for (int i=0; i<3; i++)
            System.out.println(arr[i]);

    }
}
