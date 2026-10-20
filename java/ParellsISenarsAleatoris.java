// Activitat 12 — Comptar parells i senars, aleatoris

import java.util.Random;
import java.util.Scanner;

public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        // TODO: demana quants números vol generar l'usuari (N)
        //   genera N números aleatoris (per exemple, entre 1 i 100, amb Random)
        //   compta'n quants són parells (numero % 2 == 0) amb un comptador
        //   i calcula els senars com N - parells
        //   Mostra: "Han sortit X números parells i Y senars"
    Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();
        
        System.out.print("Quants números aleatoris vols generar (N)?: ");
        int n = teclat.nextInt();
        
        int i = 1;         
        int parells = 0;   
        
        while (i <= n) {
            // Genera un número aleatori entre 1 i 100
            int numero = aleatori.nextInt(100) + 1; 
            
            // Comprovem si el número és parell
            if (numero % 2 == 0) {
                parells++; 
            }
            
            i++; 
        }
        
        int senars = n - parells;
        
        System.out.println("Han sortit " + parells + " números parells i " + senars + " senars");
    }
}
