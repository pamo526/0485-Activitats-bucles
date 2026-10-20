// Activitat 14 — Genera fins al 12

import java.util.Random;
import java.util.Scanner;

public class GeneraFinsAl12 {
    public static void main(String[] args) {
        // TODO: amb un bucle do-while, genera números aleatoris entre 0 i 15
        //   fins que surti el 12 (compta les iteracions amb un comptador)
        //   Per cada número que NO sigui el 12, mostra:
        //   "El número generat és: <numero>, falten <distància> per assolir l'objectiu."
        //   (la distància és el valor absolut de numero - 12)
        //   Quan surti el 12, no el mostris: acaba mostrant
        //   "Objectiu assolit en: <iteracions> iteracions"
         Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();
        
        int numero;
        int iteracions = 0;
        
        do {
            numero = aleatori.nextInt(16); 
            iteracions++; 
            
            if (numero != 12) {
                int distancia;
                
                if (numero < 12) {
                    distancia = 12 - numero;
                } else { 
                    distancia = numero - 12;
                }
                
                System.out.println("El número generat és: " + numero + ", falten " + distancia + " per assolir l'objectiu.");
            }
            
        } while (numero != 12); 
        
        System.out.println("Objectiu assolit en: " + iteracions + " iteracions");
        
        }
    }
