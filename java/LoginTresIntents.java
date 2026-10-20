// Activitat 27 — Login amb 3 intents (condició d'acabament complexa)

import java.util.Scanner;

public class LoginTresIntents {
    public static void main(String[] args) {
        // TODO: guarda l'usuari i la contrasenya correctes en dues variables
        //   (per exemple "cponts" / "qw34T1234")
        //   amb un bucle while, la condició del qual combini "intents < 3" I
        //   "encara no s'ha encertat" (condició d'acabament complexa):
        //     demana usuari i contrasenya, comprova si són correctes
        //     mostra "Usuari i contrasenya correctes!" o un missatge d'error
        //     incrementa el comptador d'intents
        //   ⛔ NO facis servir break (ni similar), ni alteris el comptador
        //      d'intents per forçar la sortida del bucle
        //   Si s'acaben els 3 intents sense encertar, mostra "Usuari bloquejat!"
     Scanner teclat = new Scanner(System.in);
        
        // variables constants (final) per guardar les credencials correctes
        final String USUARI_CORRECTE = "cponts";
        final String CONTRASENYA_CORRECTA = "qw34T1234";
        
        int intents = 0;
        boolean encertat = false;

        // El bucle funcionarà mentre no hàgim gastat els 3 intents 
// I mentre l'usuari encara no hagi encertat les dades.
        while (intents < 3 && !encertat) {
            System.out.print("Introdueix l'usuari: ");
            String usuariIntroduit = teclat.next();
            
            System.out.print("Introdueix la contrasenya: ");
            String contrasenyaIntroduida = teclat.next();
            
            if (usuariIntroduit.equals(USUARI_CORRECTE) && contrasenyaIntroduida.equals(CONTRASENYA_CORRECTA)) {
                System.out.println("Usuari i contrasenya correctes!");
                encertat = true; 
            } else {
                System.out.println("Usuari o contrasenya incorrectes. Torna-ho a provar.");
            }
            
            intents++;
        }
        
        // Si s'acaben els 3 intents sense encertar, mostra "Usuari bloquejat!"
        if (!encertat) {
            System.out.println("Usuari bloquejat!");
        }
        
    }
}
