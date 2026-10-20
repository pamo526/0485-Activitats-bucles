// Activitat 11 — Cara o creu, 100 llançaments

import java.util.Random;

public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"

    Random aleatori = new Random();
        
        int llancaments = 1; // Comptador per controlar el bucle (arribar a 100)
        int creus = 0;       // Comptador per guardar quantes vegades surt creu
        
        while (llancaments <= 100) {
            // Genera un número aleatori: 0 o 1
            int resultat = aleatori.nextInt(2); 
            
            // Si el resultat és 1, significa que ha sortit creu
            if (resultat == 1) {
                creus++; // Incrementem el comptador de creus d'un en un
            }
            
            llancaments++; // Avancem al següent llançament
        }
        
        int cares = 100 - creus;
        
        System.out.println("Cares: " + cares);
        System.out.println("Creus: " + creus);
    }
}
