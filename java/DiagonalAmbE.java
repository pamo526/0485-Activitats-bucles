// Activitat 35 — Diagonal amb E (bucles encaixats)
public class DiagonalAmbE {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats (files i columnes, de l'1 al 9),
        //   mostra una graella 9x9 amb "*" a totes les posicions, excepte a la
        //   diagonal (quan fila == columna), on hi ha d'anar una "E"

    for (int fila = 1; fila <= 9; fila++) {
            
            for (int columna = 1; columna <= 9; columna++) {
                
                if (fila == columna) {
                    System.out.print("E ");
                } else {
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
    }
}
