package org.example;

import java.util.Scanner;

public class Main {

    // Aufgabe C
    public static int[] getMaxAndMin(int[] myArray) {

        int lenMyArray = myArray.length;
        if (lenMyArray == 0)
            return null;

        int[] minAndMaxEq = new int[1];
        int[] minAndMax = new int[2];
        int temp = 0;
        for (int i=0; i<lenMyArray-1; i++) {
            if (myArray[i+1] > myArray[i]) {
                temp = myArray[i+1];
                myArray[i+1] = myArray[i];
                myArray[i] = temp;
            }
        }
        minAndMax[0] = myArray[lenMyArray-1];

        for (int i=0; i<lenMyArray-1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i + 1];
                myArray[i + 1] = myArray[i];
                myArray[i] = temp;
            }
        }
        minAndMax[1] = myArray[lenMyArray-1];

        if (minAndMax[0] == minAndMax[1]) {
            minAndMaxEq[0] = minAndMax[0];
            return minAndMaxEq;
        }


        return minAndMax;
    }

    public static int[] createArray(int len) {
        int[] myArray = new int[len];
        int num;
        int count;
        for (int i=0; i<len; i++) {
            do {
                count = (int) (len - i);
                System.out.print("Enter a number (" + count + " left): ");
                Scanner scanner = new Scanner(System.in);
                num = scanner.nextInt();
                myArray[i] = num;
                i += 1;
            } while (num != 0 && count != 1);

            if (num == 0) {
                for (int j=len-count; j<len; j++)
                    myArray[j] = -1;
            }
            break;

        }

        return myArray;

    }

    public static void main(String[] args) {

        Main inst = new Main();

        int[] arr = {};
        int[] max = inst.getMaxAndMin(arr);
        if (max == null)
            System.out.println(max);

        else {
            for (int i=0; i<max.length; i++)
                System.out.println(max[i]);
        }

        int[] newArr = inst.createArray(6);
        for (int i=0; i<6; i++)
            System.out.println(newArr[i]);
    }
}