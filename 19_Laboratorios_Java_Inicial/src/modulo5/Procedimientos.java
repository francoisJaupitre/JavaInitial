package modulo5;

import java.util.Scanner;

public class Procedimientos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		float num1, num2;
		char operacion;
		char operaciones[] = {'+','-','*','/','%'};
		boolean operacionValida = false;
		
		System.out.println("Ejercicio 1\ningrese número 1 : ");
		num1 = in.nextFloat();
		
		System.out.println("ingrese número 2 : ");
		num2 = in.nextFloat();
		
		do {
			System.out.println("ingrese operacion (+,-,*,/,%) : ");
			operacion = in.next().charAt(0);
			for(int i=0 ; i < 5 ; i++)
				if(operaciones[i] == operacion) {
					operacionValida = true;
					break;
				}
		}
		while(!operacionValida);
		
		calcular(num1,num2,operacion);
		in.close();
		
	}

	static void calcular(float num1, float num2, char operacion) {
		
		switch(operacion) {
		case '+' :
			System.out.println(num1+""+operacion+""+num2+"="+suma(num1,num2));
			break;
		case '-' :
			System.out.println(num1+""+operacion+""+num2+"="+resta(num1,num2));
			break;
		case '*' :
			System.out.println(num1+""+operacion+""+num2+"="+multiplicacion(num1,num2));
			break;
		case '/' :
			if(num2!=0)
				System.out.println(num1+""+operacion+""+num2+"="+division(num1,num2));
			else 
				System.out.println("error division por 0");
			break;
		case '%' :
			System.out.println(num1+""+operacion+""+num2+"="+resto(num1,num2));
		}
		
		
	}

	static float resto(float num1, float num2) {
		return (num1%num2);
	}
	
	static float division(float num1, float num2) {
		return (num1/num2);
	}

	static float multiplicacion(float num1, float num2) {
		return (num1*num2);
	}

	static float resta(float num1, float num2) {
		return (num1-num2);
	}

	static float suma(float num1, float num2) {
		return (num1+num2);
	}

}
