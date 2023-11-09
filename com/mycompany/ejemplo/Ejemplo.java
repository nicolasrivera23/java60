package com.mycompany.ejemplo;

/**
 *
 * @author Nicolas
 */

import com.mycompany.entity.Orador;

public class Ejemplo {

    //Main es nuestro punto de entrada a una aplicación Java
    public static void main(String[] args) {
        
        System.out.println("Hello World!" + 2);
        
        //Tipo String cadena de texto
        String cadena = "Hola Mundo";
        
        System.out.println("Length de la variable cadena: " + cadena.length());
        
        System.out.println(cadena);
        
        int numeroInt = -2147483647;
        System.out.println(numeroInt);
        
        long numeroEntero = -2147483648L;
        
        byte nroByte = -127;
        
        short nroShort = -32767;
        
        boolean isVerdad = false;
        
        char letra = 'c';
        
        int nro = 2;
        
        
        //Arrays
        String [] palabras = {"Hola", "Mundo", "Palabra"};
        
        System.out.println(palabras[2]);
        
                
        int [] numeros = new int[10];
        
        

        for (int i = 0; i < 10; i++) {
            numeros[i] = i;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
              
        
        Orador oradorUno = new Orador(1L, "Bill", "Gates", "Nuevo Orden Mundial");
        
        System.out.println("Instancia oradorUno: " + oradorUno);
        
        
    }
}
