// Activitat 37 — Taula de divisors i dividends (bucles encaixats)

import java.util.Scanner;

public class TaulaDivisors {
    public static void main(String[] args) {
        // TODO: llegeix l'inici i el final dels dividends per teclat
        //   mostra una capçalera amb els dividends (de l'inici al final)
        //   amb dos bucles for encaixats (divisors de l'1 al 10, i dividends de
        //   l'inici al final), mostra una taula: "*" si el dividend és divisible
        //   pel divisor, "-" si no ho és
        //   (pots fer servir System.out.printf amb "%4d" / "%4s" per alinear les
        //   columnes)

     Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el dividend inicial: ");
        int inici = teclat.nextInt();
        
        System.out.print("Introdueix el dividend final: ");
        int fi = teclat.nextInt();
        
        // Deixem un espai de 4 caràcters buit al principi per a la columna dels divisors
        System.out.printf("%4s", ""); 
        for (int dividend = inici; dividend <= fi; dividend++) {
            System.out.printf("%4d", dividend);
        }
        System.out.println(); // Salt de línia de la capçalera
        
        for (int divisor = 1; divisor <= 10; divisor++) {
            System.out.printf("%4d", divisor);
            
            for (int dividend = inici; dividend <= fi; dividend++) {
                // Comprovem si el dividend és divisible pel divisor (residu == 0)
                if (dividend % divisor == 0) {
                    System.out.printf("%4s", "*");
                } else {
                    System.out.printf("%4s", "-");
                }
            }
        }
    }
}
