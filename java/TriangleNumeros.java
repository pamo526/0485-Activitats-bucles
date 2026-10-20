// Activitat 33 — Triangle de números (bucles encaixats)
public class TriangleNumeros {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats (un extern per a les 9 files i un
        //   d'intern que arribi fins al número de la fila), mostra el triangle:
        //   "1", "1 2", "1 2 3", ... fins "1 2 3 4 5 6 7 8 9"
        
        for (int fila = 1; fila <= 9; fila++) {
            
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna + " ");
            }
            
            System.out.println();
        }
    }
}
