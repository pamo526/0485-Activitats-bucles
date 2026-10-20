// Activitat 01 — Temperatures en bucle

import java.util.Scanner;

public class TemperaturaBucle {
    public static void main(String[] args) {
        // TODO: demana per teclat 5 temperatures en graus Fahrenheit (una per una, amb un bucle)
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
     Scanner teclat = new Scanner(System.in);
        
     int i = 1; 
        
        while (i <= 5) {
            System.out.print("Introdueix la temperatura " + i + " en Fahrenheit: ");
            double temperaturaF = teclat.nextDouble();
            
            // Apliquem la fórmula de conversió
            double temperaturaC = ((temperaturaF - 32) * 5) / 9;
            
            System.out.println("L'equivalent en Celsius és: " + temperaturaC + " ºC\n");
            
            // Incrementem el comptador perquè passi a la següent temperatura
            i++; 
        }
    }
}
