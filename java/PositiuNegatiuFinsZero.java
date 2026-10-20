// Activitat 16 — Positiu o negatiu, fins al 0

import java.util.Scanner;

public class PositiuNegatiuFinsZero {
    public static void main(String[] args) {
        // TODO: llegeix una seqüència de números per teclat (amb un bucle) fins
        //   que l'usuari entri un 0. Per cada número (que no sigui 0), mostra
        //   "És positiu" o "És negatiu". Quan s'entri el 0, mostra "Adeu!" i acaba.
    Scanner teclat = new Scanner(System.in);
        
        int numero;
        
        // Utilitzem un bucle do-while per assegurar que llegeix almenys un número
        do {
            System.out.print("Introdueix un número (0 per sortir): ");
            numero = teclat.nextInt();
            
            if (numero != 0) {
                if (numero > 0) {
                    System.out.println("És positiu");
                } else {
                    System.out.println("És negatiu");
                }
            }
            
        } while (numero != 0); 
        
        System.out.println("Adeu!");
    }
}
