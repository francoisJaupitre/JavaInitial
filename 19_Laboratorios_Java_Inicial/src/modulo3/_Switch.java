package modulo3;

import java.util.Scanner;

public class _Switch {

	public static void main(String[] args) {

		System.out.print(
			"Gracias por contactarte con nosotros!\r\n\\r\\n"
			+"¿En qué podemos ayudarte?\r\n\r\n"
			+"A) Documentación\r\n"
			+"B) Cotización\r\n"
			+"C) Asistencia\r\n"
			+"D) Siniestros\r\n"
			+"E) Información de Pagos\r\n"
			+"F) Otras Consultas\r\n"
			+"G) Anulación\r\n"
			+"\r\nEscribe la letra de la opción seleccionada : "
		);
		
		Scanner in = new Scanner(System.in);
		char seleccion = in.next().toUpperCase().charAt(0);
		switch(seleccion) {
			case 'A' :
				System.out.println("Documentación");
				break;
			case 'B' :
				System.out.println("Cotización");
				break;
			case 'C' :
				System.out.println("Asistencia");
				break;
			case 'D' :
				System.out.println("Siniestros");
				break;
			case 'E' :
				System.out.println("Información de Pagos");
				break;
			case 'F' :
				System.out.println("Otras Consultas");
				break;
			case 'G' :
				System.out.println("Anulación");
				break;
		}
		
		System.out.print("Ingrese n1 : ");
		double n1 = in.nextDouble();
		System.out.print("Ingrese n2 : ");
		double n2 = in.nextDouble();
		System.out.print("Ingrese opcion (1-suma 2-resta 3-producto 4-división) : ");
		int opcion = in.nextInt();
		switch(opcion) {
		case 1 :
			System.out.println(n1+" + "+n2+" = "+(n1+n2));
			break;
		case 2 :
			System.out.println(n1+" - "+n2+" = "+(n1-n2));
			break;
		case 3 :
			System.out.println(n1+" x "+n2+" = "+(n1*n2));
			break;
		case 4 :
			System.out.println(n1+" / "+n2+" = "+(n1/n2));
			break;
		}
	
		
		
		in.close();
	}

}
