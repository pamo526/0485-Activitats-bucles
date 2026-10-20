// Activitat 19 — Taula de multiplicar amb comptador d'errors, amb for

import java.util.Scanner;

public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 13, però implementat fent servir un bucle for.
        //   Llegeix un número per teclat i, amb un for (de l'1 al 10), pregunta la
        //   seva taula de multiplicar: mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta i digues "correcte!" o "incorrecte!"
        //   (comptant els errors). Al final: "Has comès X errors!"

    Scanner teclat = new Scanner(System.in);
        
        System.out.print("De quin número vols practicar la taula?: ");
        int numero = teclat.nextInt();
        
        int errors = 0;   
        
        System.out.println("\nComencem el joc de la taula del " + numero + ":");
        
        // Bucle for per anar del 1 al 10 de manera automàtica
        for (int i = 1; i <= 10; i++) {
            int respostaCorrecta = numero * i;
            
            System.out.print(numero + " × " + i + " = ");
            int respostaUsuari = teclat.nextInt();
            
     
            if (respostaUsuari == respostaCorrecta) {
                System.out.println("correcte!");
            } else {
                System.out.println("incorrecte!");
                errors++; // Incrementem el comptador d'errors
            }
        }
        
        System.out.println("Has comès " + errors + " errors!");
        
    }
}
