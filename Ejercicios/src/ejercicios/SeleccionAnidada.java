/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion2;
/**
 *
 * @author Frank Saca
 */
public class SeleccionAnidada {
        public static void main (String[] Args){
            // Dcumentacion
            Scanner entrada = new Scanner(System.in);
            int calificacion;
            String mensaje1 = paquetedos.Operacion2.mensajea;
            String mensaje2 = paquetedos.Operacion2.mensajer;
            
            // ingreso de datos
            System.out.println("Ingrese su calificacion: ");
            calificacion = entrada.nextInt();
            
            // Estructura Condicional NO repetitiva
            if (calificacion >= 90) {
            System.out.printf("%s (excelente) con %d\n", mensaje1, 
                    calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s (muy buena) con %d\n", mensaje1, 
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s (regular) con %d\n", mensaje1, 
                            calificacion);

                } else {
                    System.out.printf("%s con %d\n", mensaje2, 
                            calificacion);
                }
            }
        }
    }
}
