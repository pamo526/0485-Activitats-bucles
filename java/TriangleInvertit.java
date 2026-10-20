// Activitat 36 — Triangle invertit d'asteriscs (bucles encaixats)
public class TriangleInvertit {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats, mostra el triangle invertit
        //   d'asteriscs: la primera fila amb 9 asteriscs, i cada fila següent
        //   amb un asterisc menys, fins arribar a 1

     for (int fila = 9; fila >= 1; fila--) {
            
            // Bucle intern: imprimeix tants asteriscs com indiqui el número de la fila actual
            for (int ast = 1; ast <= fila; ast++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
