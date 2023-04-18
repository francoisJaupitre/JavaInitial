package modulo3;

import java.util.Scanner;

public class ProyectoIntegrador {

	public static void main(String[] args) {

		
		int min = 100000;
		int max = 999999;
		int tokenGenerado = (int) (Math.floor(Math.random()*(max-min+1)+min));

		Scanner in = new Scanner(System.in);

		System.out.println("Bienvenido a Online Banking, por favor ingrese las credenciales solicitadas :");
		
		System.out.println("Clave token generada : "+tokenGenerado);
		
		System.out.print("Usuario : ");
		String usuario = in.next();
		System.out.print("Contraseña : ");
		String pass = in.next();
		System.out.print("Clave Token : ");
		int token = in.nextInt();
		
		if(usuario.equalsIgnoreCase("fjbarilo") && pass.equals("motdepasse") && token == tokenGenerado)
			System.out.println("Credenciales correctas. Bienvenido a su Online Banking.");
		else {
			System.out.println("Error de Credenciales... Desea intentarlo nuevamente? (S/N) :");
			char repuesta = in.next().toUpperCase().charAt(0);	
			if(repuesta == 'S') {
				System.out.print("Usuario : ");
				usuario = in.next();
				System.out.print("Contraseña : ");
				pass = in.next();
				System.out.print("Clave Token : ");
				token = in.nextInt();		
				if(usuario.equalsIgnoreCase("fjbarilo") && pass.equals("motdepasse") && token == tokenGenerado)
					System.out.println("Credenciales correctas. Bienvenido a su Online Banking.");
				else {
					System.out.println("Error de Credenciales... Desea intentarlo nuevamente? (S/N) :");
					repuesta = in.next().toUpperCase().charAt(0);
					if(repuesta == 'S') {
						System.out.print("Usuario : ");
						usuario = in.next();
						System.out.print("Contraseña : ");
						pass = in.next();
						System.out.print("Clave Token : ");
						token = in.nextInt();		
						if(usuario.equalsIgnoreCase("fjbarilo") && pass.equals("motdepasse") && token == tokenGenerado)
							System.out.println("Credenciales correctas. Bienvenido a su Online Banking.");
						else 
							System.out.println("Error de Credenciales... Usuario bloqueado, por favor dirijase a la sucursal mas cercana.");
					}
					else {System.out.println("Gracias por utilizar Online Banking.");}
				}
			}
			else {System.out.println("Gracias por utilizar Online Banking.");}	
		}
		in.close();
	}
}
