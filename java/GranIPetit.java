// Activitat 17 — Gran i petit, apropant-se

import java.util.Scanner;

public class GranIPetit {
    public static void main(String[] args) {
        // TODO: llegeix dos números per teclat: gran i petit
        //   amb un bucle while, mentre gran sigui més gran que petit:
        //     mostra "Gran = <gran>   Petit = <petit>"
        //     divideix gran entre 2 i multiplica petit per 2

     Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el número GRAN: ");
        int gran = teclat.nextInt();
        
        System.out.print("Introdueix el número PETIT: ");
        int petit = teclat.nextInt();
        
        while (gran > petit) {
            System.out.println("Gran = " + gran + "   Petit = " + petit);
            
            gran = gran / 2;
            petit = petit * 2;
        }
    }
}
