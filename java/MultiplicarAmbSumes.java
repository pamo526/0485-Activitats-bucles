// Activitat 24 — Multiplicar amb sumes successives

import java.util.Scanner;

public class MultiplicarAmbSumes {
    public static void main(String[] args) {
        // TODO: llegeix dos operands enters positius per teclat
        //   multiplica'ls fent servir sumes successives (suma "operand1", "operand2" vegades)
        //   i mostra, en una sola línia, "operand1 + operand1 + ... = resultat"
        //   Per exemple, amb 5 i 4: "5 + 5 + 5 + 5 = 20"
     Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el primer operand (positiu): ");
        int operand1 = teclat.nextInt();
        
        System.out.print("Introdueix el segon operand (positiu): ");
        int operand2 = teclat.nextInt();
        
        int resultat = 0;
        String expressio = "";
        
        for (int i = 1; i <= operand2; i++) {
            resultat += operand1;
            
            if (i == 1) {
                expressio += operand1; 
            } else {
                expressio += " + " + operand1; 
            }
        }
        
        System.out.println(expressio + " = " + resultat);    
    }
}
