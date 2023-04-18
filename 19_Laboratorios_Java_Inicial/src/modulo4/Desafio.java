package modulo4;

public class Desafio {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++)
			System.out.println(i);
		System.out.println("_____");
				
		int dinero = 1000;
		for (int i = 1; i <= 12; i++)
			dinero *= 1.02;
		System.out.println(dinero);
		System.out.println("_____");
		
		int suma = 0;
		for (int i = 0; i < 25; i+=2)
			suma += i;
		System.out.println(suma);
		System.out.println("_____");
		
		for(int x=1,s=1;x<=5 || s<=10;x++,s++){

            System.out.println(x+ " " +s);

        }
	}
}
