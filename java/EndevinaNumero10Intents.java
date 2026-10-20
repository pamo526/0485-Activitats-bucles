// Activitat 28 — Endevina el número, 10 intents

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //     petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)
     Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();
        
        int numeroSecret = aleatori.nextInt(100) + 1;
        
        int intents = 0;
        boolean encertat = false;
        
        while (intents < 10 && !encertat) {
            System.out.print("Introdueix un número (intent " + (intents + 1) + " de 10): ");
            int numeroUsuari = teclat.nextInt();
            
            if (numeroUsuari == numeroSecret) {
                System.out.println("Felicitats! Has encertat el número!");
                encertat = true;
            } else if (numeroSecret > numeroUsuari) {
                System.out.println("El número secret és MÉS GRAN que el que has posat.");
            } else {
                System.out.println("El número secret és MÉS PETIT que el que has posat.");
            }
            
            intents++;
        }
        
        // Si s'esgoten els 10 intents sense encertar, informa a l'usuari
        if (!encertat) {
            System.out.println("Has esgotat els 10 intents! El número secret era el: " + numeroSecret);
        }
    }
}
