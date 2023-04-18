package modulo2;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ingresos = new Scanner(System.in);
		
		System.out.println("Ejercico 1\n");
		System.out.print("Ingrese su nombre y apellido : ");
		String nombreApellido = ingresos.nextLine();
		
		String nombre = nombreApellido.substring(0, nombreApellido.indexOf(' '));
		String apellido = nombreApellido.substring(nombreApellido.indexOf(' ')+1);
		
		System.out.println("Su nombre es : "+nombre);
		System.out.println("Su apellido es : "+apellido);
		System.out.println("Sus iniciales son : "+nombre.substring(0,1)+apellido.substring(0,1));
		
		
		
		
		System.out.println("\nEjercico 2\n");
		System.out.print("Ingrese numero 1 : ");
		double num1 = ingresos.nextDouble();
		System.out.print("Ingrese numero 2 : ");
		double num2 = ingresos.nextDouble();
		System.out.print("Ingrese decimales : ");
		int decimales = ingresos.nextInt();
		
		
		double resultado = Math.pow(num1, num2);
		
		System.out.println(String.format(
				"La potencia con " + decimales + " decimales: %." + decimales + "f ", resultado));


		
		System.out.println("Ejercico 3\n");
		System.out.print("Ingrese dos letras : ");
		String letras = ingresos.next();
		char letraMay1 = letras.toUpperCase().charAt(0);
		char letraMin1 = letras.toLowerCase().charAt(0);
		char letraMay2 = letras.toUpperCase().charAt(1);
		char letraMin2 = letras.toLowerCase().charAt(1);
		System.out.println(String.format("En ASCII : %1s -> %2d, %3s -> %4d, %5s -> %6d, %7s -> %8d",letraMay1,(int) letraMay1,letraMin1,(int) letraMin1,letraMay2,(int) letraMay2,letraMin2,(int) letraMin2));
		
		ingresos.close();

	}

}
