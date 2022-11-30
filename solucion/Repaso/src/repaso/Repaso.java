/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int cedula;
        String ciudad;
        double horas_dia;
        double horas_noche;
        double sueldo = 0;
        double valor_dia = 10;
        double valor_noche = 15;
        double seguro;
        int contador = 0;
        double subtotal = 0;
        boolean auxiliar = true;
        String mensaje = null;
        String confirmacion;
        while (auxiliar) {
            System.out.println("ingrese el nombre del empleado");
            nombre = entrada.next();
            System.out.println("ingrese cedula del empleado");
            cedula = entrada.nextInt();
            System.out.println("ingrese las horas matutinas trabajadas del empleado");
            horas_dia = entrada.nextDouble();
            System.out.println("ingrese las horas nocturnas trabajadas del empleado");
            horas_noche = entrada.nextDouble();
            System.out.println("ingrese la ciudad de la empresa");
            ciudad = entrada.next();
            if (horas_noche <= 10) {
                valor_noche = valor_noche * 1.1;
            }
            subtotal = subtotal + (horas_dia * valor_dia) + (horas_noche * valor_noche);
            seguro = subtotal * 0.82;
            sueldo = subtotal - seguro;
            contador++;
            mensaje = mensaje + "Nomina de trabajadores\n\nRol del trabajador de nombre " + nombre + "y cedula" + cedula + "\n\tHoras matutinas trabajadas: "
                    + horas_dia + "\n\tHoras nocturnas trabajadas: " + horas_noche + "\n\tSubtotal a cancelar $" + subtotal + "\n\tSegurosocial $"
                    + seguro + "\n\tTotal a cancelar $" + sueldo + "\nNumero de empleados " + contador;
            System.out.println("Para terminar el programa presione s ");
            confirmacion = entrada.next();
            confirmacion = confirmacion.toLowerCase();
            if (confirmacion.equals("s")) {
                auxiliar = false;
                System.out.println(mensaje);
            }

        }

    }

}
