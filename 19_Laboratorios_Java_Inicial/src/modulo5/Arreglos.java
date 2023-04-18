package modulo5;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {

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
		System.out.println(nPalabras+" palabra(s) detactada(s).");
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
		for(int i=0; i<nPalabras;i++)
			for(int j=i+1; j<nPalabras;j++)
				if(palabras[i].equals(palabras[j])) 
					System.out.println("\""+palabras[i]+"\" : palabra repetida");
				
		Arrays.sort(palabras);
		System.out.println(Arrays.toString(palabras));	
		
		oracion = oracion.replace(" ","");
		char letras[] = new char[oracion.length()];
		for(int i=0; i<oracion.length();i++) 
			letras[i] = oracion.charAt(i);
		
		Arrays.sort(letras);
		System.out.println(Arrays.toString(letras));

		int cantidad = 0;
		do {
			System.out.println("Ejercicio 2\ningrese cantidad de números aleatorios : ");
			cantidad = in.nextInt();
		}
		while(cantidad < 1);
		
		int maximo = 0;
		do {
			System.out.println("ingrese valor maximo para los números aleatorios : ");
			maximo = in.nextInt();
		}
		while(maximo < 1);
		
		int max = maximo;
		int min = 1;
		
		int[] numeros = new int[cantidad]; 
		for(int i=0; i<cantidad; i++)
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		
		System.out.println(Arrays.toString(numeros));
		
		boolean esPrimo;
		for(int i=0; i<cantidad; i++) {
			esPrimo = true;
			for(int j=2; j<=Math.sqrt(numeros[i]); j++)
				if(numeros[i]%j == 0) {
					esPrimo = false;
					break;
				}
			System.out.println("El numero " + numeros[i] + " " + (esPrimo ? "es primo." : "no es primo."));
		}
		in.close();
	}

}
