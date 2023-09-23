package es.ifp.programacion.psint.calculoSalario;

import java.util.Scanner;
/**
 * Clase que hace un cálculo de salario a partir de datos introducidos por el usuario
 * Salario = num_horas * precio_hora
 */
public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
        int num_horas = 0;
        float precio_hora = 0.0f;
        float salario = 0.0f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de horas: ");
        num_horas = Integer.parseInt(sc.nextLine());

        System.out.println("Introduzca el precio por hora:");
        precio_hora = Float.parseFloat(sc.nextLine());

        salario = num_horas * precio_hora;

        System.out.println("El salario es: "+salario);

    }
}
