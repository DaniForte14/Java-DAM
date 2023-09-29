package es.ifp.programacion.reto.comprobarfechas;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el mes:");
        int numeroMes = sc.nextInt();
        System.out.println("Introduce el día:");
        int numeroDia = sc.nextInt();

        if (numeroDia < 1 || numeroDia > obtenerDiasEnMes(numeroMes)) {
            System.out.println("La fecha introducida es incorrecta.");
            return;
        }

        String[] nombresMeses = {
            "enero", "febrero", "marzo", "abril",
            "mayo", "junio", "julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"
        };

        String nombreMes = nombresMeses[numeroMes - 1];

        System.out.println("Se ha introducido el día " + numeroDia + " de " + nombreMes);
    }

    public static int obtenerDiasEnMes(int numeroMes) {
        switch (numeroMes) {
            case 2: // Febrero
                return 28; // Por defecto, no es bisiesto
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;
            default:
                return 31;
        }
    }
}
