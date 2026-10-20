// Activitat 38 — Generador de taula HTML (bucles encaixats)

import java.util.Scanner;

public class GeneradorTaulaHTML {
    public static void main(String[] args) {
        // TODO: llegeix el número de files i de columnes per teclat
        //   amb dos bucles for encaixats, genera i mostra per consola el codi HTML
        //   d'una taula on cada cel·la mostri "fila,columna":
        //   <table border='1'>
        //       <tr>
        //           <td>1,1</td>
        //           ...
        //       </tr>
        //       ...
        //   </table>

            Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el número de files: ");
        int totalFiles = teclat.nextInt();
        
        System.out.print("Introdueix el número de columnes: ");
        int totalColumnes = teclat.nextInt();
        
        System.out.println("--- Codi HTML Generat ---");
        
        System.out.println("<table border='1'>");
        
        for (int fila = 1; fila <= totalFiles; fila++) {
            System.out.println("    <tr>"); // Obrim fila amb tabulació per ordre
            
            // Bucle intern per a les columnes (<td>)
            for (int columna = 1; columna <= totalColumnes; columna++) {
                System.out.println("        <td>" + fila + "," + columna + "</td>");
            }
            
            System.out.println("    </tr>"); 
        }
        
        // Final de la taula HTML
        System.out.println("</table>");
    }
}
