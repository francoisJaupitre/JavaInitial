package modulo4;

import java.util.Scanner;

public class _While {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Suma de numeros enteros : ");
		System.out.print("Para Salir escriba 0 de lo contrario escriba cualquier numero : ");
		int num = in.nextInt();
		int suma = num;
		while(num != 0) {

			System.out.print("Para culminar escriba 0 de lo contrario escriba cualquier numero : ");
			num = in.nextInt();
			suma += num;
		}
		System.out.println("La suma total es :"+suma);
		in.close();
	
		num = 1;
		while (num <= 10) {
			if(num != 2 && num != 5 && num !=9)
				System.out.println(num);
			num++;
		}
		
		num = 1;
		while (num <= 30) {
			if(num <= 10 || num >=20)
				System.out.println(num);
			num++;
		}
		
		num = 1;
		suma = 0;
		while (num <= 10) {
			suma+=num;
			num++;
		}
		System.out.println(suma);
		
	}
}
