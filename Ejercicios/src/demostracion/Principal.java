/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author Frank Saca
 */
public class Principal {
    public static void main (String[] Args){
        Scanner entrada = new Scanner (System.in);
        // declaracion de variables
        int mensajes;
        double costo = 3;
        
        // Pedido de datos
        System.out.printf("Ingrese el total de mensajes enviados por mes: ");
        mensajes = entrada.nextInt();
        
        // Calculo de impuestos
        if (mensajes == 40){
            // Calculo de mensajes mayores de 40
            costo += (costo*0.12);
        } else {
            if (mensajes >= 40){
                float adi = (float)(mensajes - 40);
                adi *= 0.05;
                costo += adi;
                // Calculo por mensajes mayores a 200 
                if (mensajes >= 200){
                   float adici = (float)(mensajes - 200);
                   adici *= 0.10;
                   costo += adici;
                }
            }
        }
        costo += (costo*0.12);
        System.out.printf("El valor a pagar por : %d mensajes es: %.2f",
                mensajes,costo);
    }
}