// Activitat 25 — Més gran i més petit

import java.util.Scanner;

public class MesGranIMesPetit {
    public static void main(String[] args) {
        // TODO: llegeix 20 números per teclat (amb un bucle)
        //   vés comparant cada número llegit amb el "més gran" i el "més petit"
        //   que tinguis fins ara (les primeres variables s'inicialitzen amb el
        //   primer número llegit) i actualitza'ls quan calgui
        //   Mostra: "El número més gran és: <mesGran> i el més petit: <mesPetit>"
    Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el número 1: ");
        int primerNumero = teclat.nextInt();
        
        int mesGran = primerNumero;
        int mesPetit = primerNumero;
        
        for (int i = 2; i <= 20; i++) {
            System.out.print("Introdueix el número " + i + ": ");
            int numeroActual = teclat.nextInt();
            
            if (numeroActual > mesGran) {
                mesGran = numeroActual;
            }
            
            if (numeroActual < mesPetit) {
                mesPetit = numeroActual;
            }
        }
        
        System.out.println("El número més gran és: " + mesGran + " i el més petit: " + mesPetit);    
    }
}
