package desafio;

import java.util.Scanner;

public class Deposito {
	
	private int cantidadLatas = 0;
	private int cantidadBotellas = 0;
	private int cantidadEnvases = 0;
	private Scanner in = new Scanner(System.in);
	
	public void reconocer(){

		int comando;
		do {
			System.out.println("Elemento ingresado en scanner :\n1 - lata\n2 - botella\n3- envase\n4 - no identificable\n0 - Apretar boton recibo\n?");
			comando = in.nextInt();
			switch(comando) {
				case 0:
					imprimirRecibo();
					break;
				case 1:
					this.cantidadLatas++;
					break;
				case 2:
					this.cantidadBotellas++;
					break;
				case 3:
					this.cantidadEnvases++;
					break;
				default:
					rechazar();
				
			}
		}
		while(comando != 0);
	}
	
	private void imprimirRecibo() {
		if(cantidadLatas > 0 || cantidadBotellas > 0 || cantidadEnvases > 0) {
			
			System.out.println("----Recibo----");
			if(this.cantidadLatas > 0) {System.out.println("Latas : "+this.cantidadLatas);}
			if(this.cantidadBotellas > 0) {System.out.println("Botellas : "+this.cantidadBotellas);}
			if(this.cantidadEnvases > 0) {System.out.println("Envases : "+this.cantidadEnvases);}
			System.out.println("--------------");
			return;
		}
		else {System.out.println("Debe ingresar algún elemento en el scanner primero.");}
		
	}

	private void rechazar() {
		do {System.out.println("Elemento no reconocido. Retire el elemento ingresado?\n1- OK\n?");}
		while(in.nextInt() != 1);	
	}
}

