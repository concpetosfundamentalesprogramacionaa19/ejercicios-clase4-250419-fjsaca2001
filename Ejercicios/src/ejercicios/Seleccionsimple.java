/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.*;
/**
 *
 * @author Frank Saca
 */
public class Seleccionsimple {
   
    public static void main(String[] args){
       // Importar la libreria scanner
        Scanner entrada = new Scanner(System.in);
        // documentacios
    // llamada de el mensaje de otra clase
     String miMensaje = Operacion.mensaje;
        int calificacion, calificacion_2;
    // Pedido de datos
     System.out.println("Ingrese las Primera calificacion : ");
        calificacion = entrada.nextInt();
        
     System.out.println("Ingrese las Segunda calificacion : ");
        calificacion_2 = entrada.nextInt();
        // Condicional No repetivo
        if (calificacion >= 58){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
    
        if (calificacion_2 >= 85){
        System.out.printf("%s %d\n", miMensaje, calificacion);
    }
    }
}

