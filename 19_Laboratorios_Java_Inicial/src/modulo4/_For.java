package modulo4;

import java.util.Scanner;

public class _For {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String frase;
		do {
			System.out.println("Indique la oración a evaluar (No puede estar vacía):");
			frase = in.nextLine();
		}
		while(frase.equals(""));
		int repeat;
		int repeatMax = 1;
		
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		frase = frase.replace("á", "a");
		frase = frase.replace("é", "e");
		frase = frase.replace("í", "i");
		frase = frase.replace("ó", "u");
		frase = frase.replace("ú", "u");
		
		char caracterMax = frase.charAt(0);
		for (int i=0 ; i< frase.length() ; i++) {
			
			repeat = 1;
			for(int j=i+1 ; j<frase.length(); j++) {
				
				if(frase.charAt(i) == frase.charAt(j) ) {
					repeat++;
				}
				
			}
			if(repeat > repeatMax) {
				repeatMax = repeat;
				caracterMax = frase.charAt(i);	
			}		
		}
		System.out.println("El caracter ["+caracterMax+"] se repite "+repeatMax+" veces");
		in.close();
		
		
		for (int i=1 ; i<=10 ; i+=2) {
			System.out.println(i);
		}
		
		for (int i=10 ; i>0 ; i--) {
			System.out.println(i);
		}
		
		int suma = 0;
		for (int i=1 ; i<=10 ; i+=2) {
			suma += i;
		}
		System.out.println(suma);
		
		
		int num=5;
		suma = 0;
		int multi = 1;
		for (int i=1 ; i<=num ; i++) {
			suma += i;
			multi *= i;	
		}
		
		System.out.println(multi-suma);
		System.out.println("______");
		for (int i=0 ; i<4 ; i++) {
			System.out.println("@");
		}
		System.out.println("______");

		for (int i=0 ; i<4 ; i++) {
			if(i==1 || i==3) System.out.print("@");
			System.out.println("@");
		}
		System.out.println("______");

		for (int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<i; j++) System.out.print("@");
			System.out.println("@");
		}
		System.out.println("______");

		for (int i=4 ; i>=0 ; i--) {
			for(int j=0 ; j<i; j++) System.out.print("@");
			System.out.println("@");
		}
		System.out.println("______");
		
		for (int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<i; j++) System.out.print("@");
			System.out.println("@");
		}
		for (int i=2 ; i>=0 ; i--) {
			for(int j=0 ; j<i; j++) System.out.print("@");
			System.out.println("@");
		}
		System.out.println("______");
		
		for (int i=4 ; i>0 ; i-=2) {
			for(int j=0 ; j<i; j++) System.out.print("@");
			System.out.println("@");
		}
		for (int i=0 ; i<5 ; i+=2) {
			for(int j=0 ; j<i; j++) System.out.print("@");
			System.out.println("@");
		}
		System.out.println("______");
	}

}
