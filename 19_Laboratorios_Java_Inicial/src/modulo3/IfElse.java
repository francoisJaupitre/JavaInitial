package modulo3;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingresar usuario : ");
		String usuario = in.next();
		System.out.print("Ingresar contraseña : ");
		String pass = in.next();
		
		if(usuario.equals("fjbarilo") && pass.equals("motdepasse"))
			System.out.println("Bienvenido al Sistema");
		else
			System.out.println("Credenciales incorrectas");
		
		
		System.out.print("Ingresar temperatura : ");
		int temperatura = in.nextInt();
		System.out.print("Ingresar tiempo : ");
		String tiempo = in.next();
		
		if(temperatura > 25 && tiempo.equalsIgnoreCase("soleado"))
			System.out.println("Caminar y tomar sol");
		else if(temperatura > 15 && temperatura <= 25 && tiempo.equalsIgnoreCase("soleado"))
			System.out.println("Caminar");
		else if(temperatura <= 15 && tiempo.equalsIgnoreCase("soleado"))
			System.out.println("Caminar con campera");
		else if(temperatura < 10 && tiempo.equalsIgnoreCase("lluvia"))
			System.out.println("Quedarse en casa o salir con paraguas y camperas");
		else if(temperatura < 10 && tiempo.equalsIgnoreCase("nieve"))
			System.out.println("Esquiar");


		in.close();
	}

}
