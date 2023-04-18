package modulo2;

import java.util.Scanner;

public class _Math {

	public static void main(String[] args) {

		int R, G, B;
		int min = 0;
		int max = 258;
		
		R = (int) (Math.floor(Math.random()*(max-min+1)+min));
		G = (int) (Math.floor(Math.random()*(max-min+1)+min));
		B = (int) (Math.floor(Math.random()*(max-min+1)+min));
		System.out.println(String.format("Color RGB(%1d, %2d, %3d)",R,G,B));

		
		
		Scanner ingresos = new Scanner(System.in);
		System.out.print("Ingrese una palabra : ");
		String palabra = ingresos.next();
		
		min = 97;
		max = 122;
		
		int numero = (int) (Math.floor(Math.random()*(max-min+1)+min));;
		
		char letra = (char) numero;
		
		
			System.out.println(String.format("%1c está en la palabra %2s ? "+palabra.contains(letra+""), letra, palabra));	
		
		ingresos.close();
		
	}

}
