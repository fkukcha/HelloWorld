package at.ac.campuswien.fh;

import java.util.Scanner;

public class ExerciseD {


    public static String[] veggieScale(int maxItems) {

        System.out.println("Verwaltbare Positionen: " + maxItems);
        String[] myArray = new String[maxItems];

        int pos;

        do {
            System.out.print("P: ");
            Scanner scanner = new Scanner(System.in);
            pos = scanner.nextInt();

             if (pos >= maxItems) {
                while (pos >= maxItems) {
                    System.out.println("N: Ungueltige Position eingeben");
                    System.out.print("P: ");
                    pos = scanner.nextInt();
                    if (pos == 0)
                        break;
                }
             }

             if (pos == 0)
                break;

             if (myArray[pos] == null) {
                System.out.print("N: ");
                scanner.nextLine();
                String veggieFruit = scanner.nextLine();
                myArray[pos] = veggieFruit;
             } else
                System.out.println("Speicherstelle bereits belegt");

        } while (pos != 0);

        return myArray;

    }


    public static int ordered() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number1:");
        int num1 = scanner.nextInt();
        System.out.println("Number2:");
        int num2 = scanner.nextInt();
        System.out.println("Number3:");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num2 > num3)
            return -1;
        else if (num1 < num2 && num2 < num3)
            return 1;

        return 0;
    }

    public static void main(String[] args) {

        ExerciseD inst = new ExerciseD();

        /*String[] arr = inst.veggieScale(6);
        for (int i=0; i<6; i++)
            System.out.println(arr[i]);*/

        int result = inst.ordered();
        System.out.println(result);

    }
}
