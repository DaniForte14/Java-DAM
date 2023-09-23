package es.ifp.programacion.uf1.pseudo;

import java.util.Scanner;

/**
 * clase que da 2 numeros y los suma
 */
public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
       
        //bloque de declaración de variables

        int num1;
        int num2;
        int result;
        Scanner sc = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Introduzca el primer numero: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduzca el segundo numero: ");
        num2 = Integer.parseInt(sc.nextLine());

        result = num1 + num2;

        System.out.println("La suma de los números es: "+result);
        

    }
}
