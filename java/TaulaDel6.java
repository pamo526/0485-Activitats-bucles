// Activitat 07 — Taula de multiplicar del 6

public class TaulaDel6 {
    public static void main(String[] args) {
        // TODO: amb un bucle, mostra la taula de multiplicar del 6 (de l'1 al 10)
        //   amb el format: "6 × 1 = 6", "6 × 2 = 12", ... "6 × 10 = 60"
    int i = 1;
    while (i <= 10) {
    int resultat = 6 * i; 
    
    System.out.println("6 × " + i + " = " + resultat);
    
    i++;
    }
}
}
