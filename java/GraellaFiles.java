// Activitat 32 — Graella de files (bucles encaixats)
public class GraellaFiles {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats (un extern per a les 8 files i un
        //   d'intern per a les 9 columnes), mostra la figura:
        //   cada fila ha de mostrar "1 2 3 4 5 6 7 8 9" (números separats per un espai)

    for (int fila = 1; fila <= 8; fila++) {
            
            for (int columna = 1; columna <= 9; columna++) {
                System.out.print(columna + " ");
            }
            
            System.out.println();
        }
    }
}
