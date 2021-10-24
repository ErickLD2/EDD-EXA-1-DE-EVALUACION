/*

6. VERIFICAR SUMA EN MATRIZ
• DESCRIPCIÓN: Dada una matriz, verificar si la suma de los valores en la fila i-ésima es igual 
    a la suma de los valores en la columna iésima

• IMPLEMENTACIÓN: Generar una matriz de tamaño 4 x 4, llenarlo con valores capturados desde el 
    teclado, entre 0 y 9.

    o Imprimir la matriz:
        • 1 2 3 6
        • 9 5 3 1
        • 0 3 5 6 
        • 0 2 5 6
    Verificar para cada fila y columna sí coinciden los promedios:
        o Por ejemplo, para los datos de la matriz anterior, la segunda fila: 1 2 3 6, el promedio es 3, para la segunda
            columna 2 5 3 2, el promedio también es 3, por lo que coinciden

 */
package eva1_examen_practico_1_intermedio;

import java.util.Arrays;
import java.util.Scanner;

public class EVA1_EXAMEN_PRACTICO_1_INTERMEDIO {
    
    public static void main(String[] args) {
        // Objeto que se usara para leer la consola
        Scanner input = new Scanner(System.in);
        
        int iaArreglo[] = new int[15]; // Creamos el arreglo principal
        int iTemp = 0; // Creamos una variable para pasar valores temporales
        int iaArregloCopia[] = new int[iaArreglo.length]; // Arreglo para copiar el arreglo original
        
        
        for (int i = 0; i < iaArreglo.length; i++) {
            System.out.println("Ingresar valor: ");
            /*// desde aqui <1/>*/
            iaArreglo[i] = input.nextInt();
            // Copiado de un arreglo a otro
            // resulta mas sencillo y monito que el que usa for
            System.arraycopy(iaArreglo, 0, iaArregloCopia, 0, iaArreglo.length);
            // ordenamiento del arreglo
            Arrays.sort(iaArregloCopia);
            
            for (int j = 0; j < iaArregloCopia.length; j++) {
                System.out.print("[" + iaArregloCopia[j] + "]");
            }
            /* // </1> hasta aqui termina el de ordenamiento*/
            
            System.out.println("");
            
            /* desde aqui <2/>
            // Aqui no supimos que era lo que queria, si los valores ingresados tenian que 
            // colocarse en la ultima posicion del arreglo, y los anteriores fueran moviendose al principio
            // o si, como lo que esta funcionando, cada que se agregaba un valor, se ordenara 
            // automaticamente
            
            iaArreglo[iaArreglo.length - 1] = input.nextInt();
            if (i > 0) {
                iaArreglo[iaArreglo.length - i - 1] = iTemp;
            }
            iTemp = iaArreglo[iaArreglo.length - 1];
            
            for (int k = 0; k < iaArreglo.length; k++) {
                System.out.print("[" + iaArreglo[k] + "]");
            } // </2> hasta aqui la parte que es del que va ingresando los valores en el utlimo puesto
            */
            
        }
        System.out.println("\nEl arreglo: ");
        for (int i = 0; i < iaArregloCopia.length; i++) {
            System.out.print("[" + iaArregloCopia[i] + "]");
        }
    }
    
}
