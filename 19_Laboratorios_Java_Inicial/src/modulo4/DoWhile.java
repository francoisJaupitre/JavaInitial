package modulo4;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Suma de numeros enteros : ");
		int num;
		int suma = 0;
		int min = 2147483647;
		int max = -2147483648;
		do {
			System.out.print("Para culminar escriba 0 de lo contrario escriba cualquier numero : ");
			num = in.nextInt();
			suma += num;
			if(num > max) max = num;
			if(num < min) min = num;
		}
		while(num != 0);
		
		System.out.println("La suma total es : "+suma);
		System.out.println("El numero mayor es : "+max);
		System.out.println("El numero menor es : "+min);
			
		in.close();
	}

}
