// Activitat 06 — Números d'1 fins a N

import java.util.Scanner;

public class NumerosDe1aN {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números d'1 fins a N (un per línia)
    Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix un número enter N: ");
        int N = teclat.nextInt();

        int i = 1; 
        while (i <= N) {
            System.out.println(i);
            i++; 
        }
    }
}
