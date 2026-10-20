// Activitat 23 — Suma fins a més de 21

import java.util.Scanner;

public class SumaMesDe21 {
    public static void main(String[] args) {
                Scanner teclat = new Scanner(System.in);

        // TODO: mentre la suma acumulada sigui <= 21:
        //   demana un número enter per teclat
        //   si NO està entre 1 i 5, mostra "El número no és correcte!" (i no el sumis)
        //   si sí que hi està, suma'l a la variable suma
        //   Quan la suma superi 21, mostra:
        //   "Més de 21! La suma dels números entrats és <suma>"
     
       int suma = 0;
        
        while (suma <= 21) {
            System.out.print("Introdueix un número enter (de 1 a 5): ");
            int numero = teclat.nextInt();
            
            // si NO està entre 1 i 5, mostra que el número no és correcte 
            if (numero < 1 || numero > 5) {
                System.out.println("El número no és correcte!");
            } else {
                // si sí que hi està, suma'l a la variable suma
                suma += numero;
            }
        }
        
        System.out.println("Més de 21! La suma dels números entrats és " + suma);
            
    }
}
