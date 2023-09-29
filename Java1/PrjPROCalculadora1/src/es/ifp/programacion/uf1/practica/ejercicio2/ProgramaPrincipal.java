package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main (String[] args) throws Exception{

        System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");

        String opcion;
        Scanner sc = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        do{
            System.out.println("Introduzca una opción del menú: ");
            System.out.println("1. Sumar (+)");
            System.out.println("2. Restar (-)");
            System.out.println("3. Multiplicar (*)");
            System.out.println("4. Dividir (/)");
            System.out.println("5. Resto (%)");
            System.out.println("6. Factorial(!)");
            System.out.println("0. Salir (S o s)");
            opcion = sc.nextLine();

            if (opcion.equals("0") || opcion.equalsIgnoreCase("s")) {
                break; // Salir del bucle
            }

            switch(opcion){
                case "1":
                case "+":
                        System.out.println("Introduzca el primer número: ");
                        num1 = sc.nextFloat();
                        System.out.println("inserte segundo número: ");
                        num2 = sc.nextFloat();
                        resultado = suma(num1, num2);
                        System.out.println("===================================");
                        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
                        System.out.println("===================================");
                    break;

                case "2":
                case "-":
                        System.out.println("Introduzca el primer número: ");
                        num1 = sc.nextFloat();
                        System.out.println("inserte segundo número: ");
                        num2 = sc.nextFloat();
                        resultado = resta(num1, num2);
                        System.out.println("===================================");
                        System.out.println("La resta de " + num1 + " y " + num2 + " es " + resultado);
                        System.out.println("===================================");
                    break;

                case "3":    
                case "*":
                        System.out.println("Introduzca el primer número: ");
                        num1 = sc.nextFloat();
                        System.out.println("inserte segundo número: ");
                        num2 = sc.nextFloat();
                        resultado = multiplicación(num1, num2);
                        System.out.println("===================================");
                        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + resultado);
                        System.out.println("===================================");
                    break;

                case "4":
                case "/":
                        System.out.println("Introduzca el primer número: ");
                        num1 = sc.nextFloat();
                        System.out.println("inserte segundo número: ");
                        num2 = sc.nextFloat();
                        resultado = division(num1, num2);
                        System.out.println("===================================");
                        System.out.println("La división de " + num1 + " y " + num2 + " es " + resultado);
                        System.out.println("===================================");
                    break;

                case "5": 
                case "%":
                        System.out.println("Introduzca el primer número: ");
                        num1 = sc.nextFloat();
                        System.out.println("inserte segundo número: ");
                        num2 = sc.nextFloat();
                        resultado = resto(num1, num2);
                        System.out.println("===================================");
                        System.out.println("El resto entre " + num1 + " y " + num2 + " es " + resultado);
                        System.out.println("===================================");
                    break;
                
                case "6":
                case "!": 
                        do{
                            System.out.println("Introduzca un número: ");
                            num1 = sc.nextFloat();
                            if (num1 <= 0)
                                System.out.println("Error, valor no válido. Introduzca un valor superior a 0");
                        }while(num1 <=0);
                        resultado = factorial(num1);
                        System.out.println("===================================");
                        System.out.println("El factorial de " + num1 + " es " + resultado);
                        System.out.println("===================================");
                        break;
                default:
                    System.out.println("Opción incorrecta");
            }
            sc.nextLine();
        } while(true);

        System.out.println("El programa ha finalizado");

    }       



    public static float suma(float num1, float num2){
        return num1 + num2;
    }
    public static float resta(float num1, float num2){
        return num1 - num2;
    }
    public static float multiplicación(float num1, float num2){
        return num1 * num2;
    }
    public static float division(float num1, float num2){
        return num1 / num2;
    }
    public static float resto(float num1, float num2){
        return num1 % num2;
    }
    public static float factorial(float num1){

        int factorial = 1;
        for (int i = 1; i <= num1; i++) {
            factorial *= i;
        }

        return factorial;
    }
}


