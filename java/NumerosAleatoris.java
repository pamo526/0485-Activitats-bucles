// Activitat 02 — Números aleatoris

import java.util.Random;

public class NumerosAleatoris {
    public static void main(String[] args) {
        // TODO: genera 50 números aleatoris entre 1 i 15 (tots dos inclosos, amb Random)
        //   i mostra'ls per pantalla, un per línia (amb un bucle)
        Random rand = new Random();
        
        int i = 1; 
        
        while (i <= 50) {
            int numeroAleatori = rand.nextInt(15) + 1;
            System.out.println(numeroAleatori);
            
            // Incrementem el comptador, si no, el bucle seria infinit)
            i++; 
        }
    }
}
