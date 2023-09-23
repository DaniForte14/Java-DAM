package EsIfpProgramacionConceptosgenerales;
import java.util.Scanner;


public class ProgramaPrincipal {

    //Punto de entrada de nuestra aplicación
    public static void main(String[] args) {

        //System.out.println("Hola este es mi primer programa en JAVA");
        //simplemente para imprimir algo por pantalla

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        //bloque de declaraciones

        int numero = 0;
        final double PI = 3.141592; //cuando lleva final es constante y no cambia durante el programa
        long edad = 80L;
        char letra = 'a';
        String nombreLiteral = "Dani"; //literal: definir de manera inequivoca una variable

        //Tipos de datos primitivos mas utilizados
        //String, int, long, double, boolean, byte, char, float, short

        boolean tipoBooleano;   //Ocupa 1 bit. Puede tomar un valor true o false

        char tipoChar;          //Ocupa 16 bits. Puede tomar un valor de un caracter Unicode

        byte tipoByte;          //Ocupa 8 bits. Entero con signo. (-128 a 128)

        short tipoShort;        //Ocupa 16 bits. Entero con signo. (-32768 a 32768)

        int tipoEntero;         //Ocupa 32 bits. Entero con signo. (-2147483648 a 2147483647)

        long tipoLong;          //Ocupa 64 bits. Entero con signo. (-9223372036824775808 a 9223372036824775807)

        float tipoFloat;        //Ocupa 32 bits. Coma flotante (reales) (+-3.040282347E+38 a +-1.40239846E-45)

        double tipoDouble, tipoDouble2, tipoDouble3, tipoDouble4;         //Ocupa 64 bits. Coma flotante precisión doble (reales) (1+.79769313486231570E+308 a +-4.94065645841246544E-324)

        //ejemplos valores primitivos
        tipoBooleano = true;
        tipoChar = 'a';

        tipoByte = 123;
        tipoShort = 32763;
        tipoEntero = 435353434;

        tipoLong = 567L;

        tipoFloat = 15.7f;//necesita la f para entender que es un float
        tipoFloat = 15.7F;

        tipoDouble = 15.2;
        tipoDouble2 = 15.20;
        tipoDouble3 = 1.52e1;
        tipoDouble4 = 0.152E2;
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        String nombre;
        String apellidos;
        String nombreCompleto;
        Scanner sc = new Scanner(System.in);

        /**
         * bloque de instrucciones
         */

        //entrada
       // System.out.println("Introduzca el nombre y pulse intro:");
        //nombre = sc.nextLine();//esto lo que hace es añadirle lo k se entra por teclado a nombre

        //System.out.println("Introduzca los apellidos y pulse intro:");
        //apellidos = sc.nextLine();

        //transformacion
        //nombreCompleto = nombre+" "+apellidos;

        //salida
        //System.out.println("El nombre y los apellidos introducidos son: "+nombreCompleto);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        int tipoEnteroA;
        int tipoEnteroB;
        int resultado;

        tipoEnteroA = 7;
        tipoEnteroB = 2;

        //tipoEnteroA++;//+1
        //tipoEnteroB--;//-1

        //resultado = tipoEnteroA + tipoEnteroB;
        resultado = tipoEnteroA % tipoEnteroB;//calcula los restos de una division
        resultado = -resultado;//cambia de signo 

        System.out.println("Resultado: "+resultado);

        //Operadores de comparacion
        /**
         * == igualdad (4==4) cierto true
         * != desigualdad (5!=4) true
         * < menor que (4<3) falso
         * > mayor que (5>3) true
         * <= menor o igual (4<=4) true
         * >= mayor o igual (5>=7) false
         */


         //Operadores lógicos
         // && AND (true && true) -> true
         // || OR  (true OR false) -> true
         // ! NOT  !false -> true

         //Operadores de asignacion comuestos

         // x+=y -> x = x + y
         // x-=y -> x = x - y
         // x*=y -> x = x * y
         // x/=y -> x = x / y
         // x%=y -> x j= x % y
    }
}
