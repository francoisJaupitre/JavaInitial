package modulo5;

import java.util.Scanner;


public class Funciones {

	static String esPalidromoOapicua(String palabra) {
		boolean esPalidromo = true, esCapicua = true;
		for(int j=0; j<palabra.length()/2;j++) {
			if(palabra.charAt(j) != palabra.charAt(palabra.length()-1-j)) {
				esPalidromo = false;
				esCapicua = false;		
				break;
			}
			if(Character.isDigit(palabra.charAt(j))) 
				esPalidromo = false;
			else
				esCapicua = false;		
			if(!esPalidromo && !esCapicua)
				break;
		}
		return (palabra+" "+(esCapicua ? "es capicua" : (esPalidromo ? "es palidromo" : "no es palidromo")));
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String oracion = "";
		do {
			System.out.println("Ejercicio 1\ningrese una oración : ");
			oracion = in.nextLine();
			oracion.trim();
		}
		while(oracion.equals(""));
		int nPalabras = 1;
		for(int i=1; i<oracion.length()-1; i++)
			if(oracion.charAt(i)==' ')
				nPalabras++;
		
		String palabras[] = new String[nPalabras];
		int idPalabras = 0;
		int startPalabra = 0;
		for(int i=1; i<oracion.length(); i++)
			if(oracion.charAt(i)==' ') {
				palabras[idPalabras] = oracion.substring(startPalabra, i);
				startPalabra = i+1;
				idPalabras++;
			}
		palabras[idPalabras] = oracion.substring(startPalabra, oracion.length());
		//System.out.println(Arrays.toString(palabras));
		for(int i=0; i<nPalabras;i++) {
			System.out.println(esPalidromoOapicua(palabras[i]));
		}
		
		
		int num1;
		double num2;
		
		System.out.println("Ejercicio 2\ningrese número 1 (int) : ");
		num1 = in.nextInt();
		
		System.out.println("ingrese número 2 (double) : ");
		num2 = in.nextDouble();
		
		System.out.println(sumar(num1, num2));
		
		
		String palabra;
		System.out.println("Ejercicios 3 & 4\ningrese palabra : ");
		palabra = in.next();
		for(int i=0;i<5;i++)
			mensaje(palabra);
		hola(palabra);

		in.close();

		
		
	}
	
	static void mensaje(String palabra) {
		System.out.println(palabra);
	}
	static void hola(String palabra) {
		System.out.println("Hola "+palabra);
	}
	static double sumar(int num1, double num2) {
		return (num1 + num2);
	}

	
}
