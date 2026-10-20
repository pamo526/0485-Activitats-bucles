// Activitat 15 — Seqüència de 3 en 3, amb final per teclat

import java.util.Scanner;

public class SequenciaDe3en3 {
    public static void main(String[] args) {
        // TODO: demana per teclat el final de la seqüència (un enter)
        //   i mostra, en una sola línia i separats per ", ",
        //   els valors 2, 5, 8, 11, 14... (de 3 en 3) mentre no superin aquest final

    Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el número final de la seqüència: ");
        int numeroFinal = teclat.nextInt();
        
        int valor = 2;
        boolean primerElement = true;
        
        // Bucle per mostrar els valors de 3 en 3 mentre no superin el límit
        while (valor <= numeroFinal) {
            if (!primerElement) {
                System.out.print(", ");
            }
            
            System.out.print(valor);
            
            primerElement = false;
            
            valor = valor + 3; 
        }
        
    }
}
