// Activitat 04 — Temperatures en bucle (quantitat per teclat)

import java.util.Scanner;

public class TemperaturaBucleN {
    public static void main(String[] args) {
        // TODO: demana quantes temperatures (N) vol convertir l'usuari
        //   i després, amb un bucle, llegeix N temperatures en Fahrenheit
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9

    Scanner teclat = new Scanner(System.in);
        
        System.out.print("Quantes temperatures vols convertir? ");
        int n = teclat.nextInt();
        
        int i = 1;
        
        // El bucle es repetirà mentre el comptador no superi el número N
        while (i <= n) {
            System.out.print("Introdueix la temperatura " + i + " de " + n + " en Fahrenheit: ");
            double temperaturaF = teclat.nextDouble();
            
            double temperaturaC = ((temperaturaF - 32) * 5) / 9;
            
            System.out.println("L'equivalent en Celsius és: " + temperaturaC + " ºC\n");
            
            i++;
        }
    }
}
