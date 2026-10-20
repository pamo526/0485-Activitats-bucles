// Activitat 22 — Mitjana de notes

import java.util.Scanner;

public class MitjanaNotes {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) amb un bucle, demana la nota de cada alumne i vés acumulant la suma
        //      en una variable (suma = suma + nota)
        //   3) calcula la mitjana dividint la suma entre N
        //   4) mostra: "La mitjana de les notes és: <mitjana>"

     Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix el número d'alumnes: ");
        int n = teclat.nextInt();

        // Variable per anar acumulant la suma de les notes
        double suma = 0;

        // demana la nota de cada alumne i l'acumulo
        for (int i = 1; i <= n; i++) {
            System.out.print("Introdueix la nota de l'alumne " + i + ": ");
            double nota = teclat.nextDouble();
            suma = suma + nota;
        }

        if (n > 0) {
            double mitjana = suma / n;

            System.out.printf("La mitjana de les notes és: %.2f%n", mitjana);
        } else {
            System.out.println("No es pot calcular la mitjana de 0 alumnes.");
        }
    }
}
