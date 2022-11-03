package at.ac.fh.campus;

import java.util.Scanner;

public class ExcerciseNew {


    public static int checkZipCode(int postLeitZahl) {

        for (int i= 1010; i<=1230; i++) {
            if (postLeitZahl == i) {
                System.out.println(i / 10 - 100 + ". Bezirk");
                return i / 10 - 100;
            }
        }
        System.out.println("Ungültige Postleitzahl");
        return -1;
    }

    public static void cheatSheet() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Anzahl Spalten: ");
        int spalten = scanner.nextInt();
        System.out.print("Anzahl Zeilen: ");
        int zeilen = scanner.nextInt();

        if ( 2 <= spalten && spalten <= 10 && 2<= zeilen && zeilen <= 10) {
            for (int i=0; i<zeilen; i++) {
                for (int j=2; j<spalten+2; j++) {
                    int sum = (int) (i + j);
                    System.out.printf("%2d ", sum);
                }
                System.out.println("");
            }
        } else
            System.out.println("Eingabe ungültig");

    }



    public static void main(String[] args) {

        ExcerciseNew inst = new ExcerciseNew();

        //int res = ExcerciseNew.checkZipCode(12340);
        //System.out.println(res);

        inst.cheatSheet();

    }

}
