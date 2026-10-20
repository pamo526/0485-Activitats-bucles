// Activitat 29 — El set i mig

import java.util.Random;
import java.util.Scanner;

public class SetIMig {
    public static void main(String[] args) {
        // TODO: demana l'aposta per teclat
        //   amb un bucle while, la condició del qual combini "total < 7.5" I
        //   "el jugador vol seguir" (condició d'acabament complexa, sense break):
        //     genera una carta aleatòria de l'1 al 10 (8=sota, 9=cavall, 10=rei,
        //     totes valen 0.5; de l'1 al 7 valen el seu número)
        //     suma el seu valor al total i mostra la carta i el total
        //     si el total encara és menor que 7.5, pregunta si vol una altra carta
        //     (si diu que no, deixa de voler seguir)
        //   Quan acabi el bucle, mostra:
        //     "Has Perdut!!!!" si el total supera 7.5
        //     "Has Guanyat <2 x aposta> euros." si el total és exactament 7.5
        //     "El jugador es planta!!!" en cas contrari
    Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();

        System.out.print("Introdueix la teva aposta en euros: ");
        double aposta = teclat.nextDouble();
        
        double total = 0.0;
        boolean volSeguir = true;

        while (total < 7.5 && volSeguir) {
            int carta = aleatori.nextInt(10) + 1;
            
            double valorCarta = (carta >= 8) ? 0.5 : carta;
            
            total += valorCarta;
            
            String nomCarta = String.valueOf(carta);
            if (carta == 8) nomCarta = "Sota";
            if (carta == 9) nomCarta = "Cavall";
            if (carta == 10) nomCarta = "Rei";
            
            System.out.printf("T'ha sortit: %s (Valor: %.1f) | Total actual: %.1f\n", nomCarta, valorCarta, total);
            
            if (total < 7.5) {
                System.out.print("Vols una altra carta? (s/n): ");
                char resposta = teclat.next().toLowerCase().charAt(0);
                
                if (resposta != 's') {
                    volSeguir = false; // El jugador decideix plantar-se
                }
            }
        }

        System.out.println("\n--- FINAL DE LA PARTIDA ---");
        if (total > 7.5) {
            System.out.println("Has Perdut!!!!");
        } else if (total == 7.5) {
            System.out.printf("Has Guanyat %.2f euros.", 2 * aposta);
        } else {
            System.out.println("El jugador es planta!!!");
        }

    }
}
