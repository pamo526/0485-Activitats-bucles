// Activitat 10 — Números de N fins a 1

import java.util.Scanner;

public class NumerosDeNa1 {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números des de N fins a 1 (un per línia)

     Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix un número enter N: ");
        int n = teclat.nextInt();
        
        System.out.println("Compte enrere des de " + n + " fins a 1:");
        
        // El bucle funcionarà mentre la N sigui més gran o igual a 1
        while (n >= 1) {
            System.out.println(n);
            
            // Restem 1 a la n en cada repetició (compte enrere)
            n--; 
        }
    }
}
