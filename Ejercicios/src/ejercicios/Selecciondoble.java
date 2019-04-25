/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Frank Saca
 */
public class Selecciondoble {
    public static void main(String[] args){
       // Importar la libreria scanner
        Scanner entrada = new Scanner(System.in);
        // documentacios
    // llamada de el mensaje de otra clase
    
        int calificacion = 85;
       // Condicional
        if (calificacion >= 85){
            System.out.printf("Usted esta aprobado con: %d\n", calificacion);
        } else {
          System.out.printf("Usted esta reprobado con: %d\n",calificacion);
        }
        
        int calificacion_2 = 45;
       // Condicional
        if (calificacion >= 85){
            System.out.printf("Usted esta aprobado con: %d\n", calificacion_2);
        } else {
          System.out.printf("Usted esta reprobado con: %d\n",calificacion_2);
        }
    }
}

