// Activitat 31 — 3 números iguals seguits

import java.util.Scanner;

public class TresIgualsSeguits {
    public static void main(String[] args) {
        // TODO: llegeix un número i guarda'l com "anterior", amb un comptador de
        //   repeticions consecutives a 1
        //   amb un bucle while (mentre les repeticions consecutives siguin < 3):
        //     llegeix un altre número
        //     si és igual a l'anterior, incrementa el comptador de repeticions
        //     si és diferent, actualitza "anterior" i posa el comptador a 1
        //   Quan surtis del bucle, mostra:
        //   "Has entrat 3 cops seguits el número <anterior>. Adeu!"
            Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix un número: ");
        int anterior = teclat.nextInt();
        
        int repeticions = 1;
        
        while (repeticions < 3) {
            System.out.print("Introdueix un altre número: ");
            int actual = teclat.nextInt();
            
            if (actual == anterior) {
                repeticions++;
            } else {
                anterior = actual;
                repeticions = 1;
            }
        }
        
        System.out.println("Has entrat 3 cops seguits el número " + anterior + ". Adeu!");
        
    }
}
