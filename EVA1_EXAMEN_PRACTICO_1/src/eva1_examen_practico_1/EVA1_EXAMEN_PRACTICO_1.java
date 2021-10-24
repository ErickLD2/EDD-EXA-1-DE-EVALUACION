
/*
FILTRAR VALORES EN EL ARREGLO
• DESCRIPCIÓN:
    Filtrar valores en el arreglo (EVITAR REPETICION).
• IMPLEMENTACIÓN:
    Generar un arreglo de tamaño 15, llenarlo con valores aleatorios PARES entre 1 y 100.
    o Los valores NO DEBEN repetirse.
    o Imprimir el arreglo: [4, 2, 10, 30, 8, 26, 60, 98, 84, 70, 44, 14, 66, 12, 66]
*/

package eva1_examen_practico_1;

public class EVA1_EXAMEN_PRACTICO_1 {
    
    public static void main(String[] args) {
        
        int aiPares[] = new int[15];
        
        for(int i = 0; i < aiPares.length; i++) {
            int iRandom = (int)(Math.random()*99) + 1;
            for (int j = 0; j < i; j++) {// Ciclo para saber cual de los numeros del
                                        // arreglo se parecen a random, hasta el numero 
                                        // de ciclo i que estemos
                if (aiPares[j] == iRandom) { // si se parecen, entramos
                    i--;
                    iRandom = (int)(Math.random()*99) + 1; // Creamos un nuevo numero
                    if (iRandom%2==0) { // si es par
                        break; // salimos del for
                    }
                    else{ // Si no es par
                        j--; // regresamos al utlimo ciclo
                    }
                    // Y si se vuelve a parecer, generara otro numero hasta que no se genere
                }
            }
            if (iRandom%2==0) { // Si es par
                aiPares[i] = iRandom; // Metemos ese numero en el arreglo
            }
            else{ // si no es par
                i--; // reiniciamos el ultimo ciclo hasta que se cree el numero random par
            } 
        }
        
        for (int i = 0; i < aiPares.length; i++) {
            System.out.print("[" + aiPares[i] + "]");
        }
        
    }
    
}
