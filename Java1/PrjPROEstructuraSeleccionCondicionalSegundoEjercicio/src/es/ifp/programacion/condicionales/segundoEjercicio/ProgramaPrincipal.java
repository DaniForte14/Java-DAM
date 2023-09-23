package es.ifp.programacion.condicionales.segundoEjercicio;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
        
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduzca el segundo número: ");
        num2 = Integer.parseInt(sc.nextLine());

        if (num1<num2)
            System.out.println("El primer número es menor que el segundo");
            
        else if(num1 == num2)
            System.out.println("Los dos números son iguales"); 

        else 
            System.out.println("El primer número es mayor que el segundo");

    }
}
