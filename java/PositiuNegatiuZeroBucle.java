// Activitat 03 — Positiu, negatiu o zero (en bucle)

import java.util.Scanner;

public class PositiuNegatiuZeroBucle {
    public static void main(String[] args) {
        // TODO: llegeix 8 números per teclat (amb un bucle) i, per cadascun, mostra:
        //   "Entra el número <i>: " (amb print, sense salt de línia)
        //   i a la línia següent: "és positiu" / "és negatiu" / "és un zero"
    Scanner teclat = new Scanner(System.in);
        
        int i = 1;
        
        while (i <= 8) {
            System.out.print("Entra el número " + i + ": ");
            int numero = teclat.nextInt();
            
            if (numero > 0) {
                System.out.println("és positiu");
            } else if (numero < 0) {
                System.out.println("és negatiu");
            } else {
                System.out.println("és un zero");
            }
            
            i++;
        }
        
    }
}
