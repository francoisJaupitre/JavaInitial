package desafio;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		do {System.out.println("Boton inicio\n1 - Presione\n?");}
		while(in.nextInt() != 1);
		Deposito deposito = new Deposito();
		deposito.reconocer();
		in.close();
		
	}
	
}
