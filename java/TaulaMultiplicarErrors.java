// Activitat 13 — Taula de multiplicar, amb comptador d'errors

import java.util.Scanner;

public class TaulaMultiplicarErrors {
    public static void main(String[] args) {
        // TODO: llegeix un número per teclat i, amb un bucle, pregunta la seva taula
        //   de multiplicar (de l'1 al 10): mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta de l'usuari i digues si és "correcte!"
        //   o "incorrecte!" (comptant els errors amb un comptador que s'incrementi
        //   ell mateix d'un en un)
        //   Al final, mostra: "Has comès X errors!"
        
        Scanner teclat = new Scanner(System.in);

    System.out.print("De quin número vols practicar la taula?: ");
        int numero = teclat.nextInt();
        
        int i = 1;        // Comptador per anar de l'1 al 10
        int errors = 0;   // Comptador per guardar els errors de l'usuari
        
        System.out.println("Comencem el joc de la taula del " + numero + ":");
        
        while (i <= 10) {
            int respostaCorrecta = numero * i;
            
            System.out.print(numero + " × " + i + " = ");
            int respostaUsuari = teclat.nextInt();
            
            if (respostaUsuari == respostaCorrecta) {
                System.out.println("correcte!");
            } else {
                System.out.println("incorrecte!");
                errors++; 
            }
            
            i++; 
        }
        
        System.out.println("Has comès " + errors + " errors!");
    }
}
