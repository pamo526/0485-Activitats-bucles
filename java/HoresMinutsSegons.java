// Activitat 05 — Hores, minuts i segons, en bucle

import java.util.Scanner;

public class HoresMinutsSegons {
    public static void main(String[] args) {
        // TODO: repeteix 4 vegades (amb un bucle):
        //   demana els segons per teclat i mostra les hores, minuts i segons que representen
        //   Hores  = segons / 3600
        //   Minuts = (segons % 3600) / 60
        //   Segons = segons % 60
    Scanner teclat = new Scanner(System.in);
        
        int i = 1;
        
        while (i <= 4) {
            System.out.print("Introdueix una quantitat de segons: ");
            int segonsTotals = teclat.nextInt();
            
            int hores = segonsTotals / 3600;
            int minuts = (segonsTotals % 3600) / 60;
            int segonsRestants = segonsTotals % 60;
            
            System.out.println("Això equival a: " + hores + "h " + minuts + "m " + segonsRestants + "s");
            System.out.println(); // Línia en blanc per separar les repeticions
            
            i++;
        }
    }
}
