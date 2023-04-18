package modulo1;
import java.util.Scanner;


public class Operadores {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//clase.metodo.atributo( ej: System.out.println(
 //obejto.metodo o funcion ej : ingresos.nextInt()
		
		System.out.println("Ejercicio 1");
		
		System.out.println("Ingresar horas ?");
        Scanner ingresos = new Scanner(System.in);
		int horasTotal = ingresos.nextInt();
		ingresos.close();  
		
		System.out.println("Cantidad de horas totales: "+horasTotal);
		
		int diasTotal = horasTotal / 24;
		int horasResto = horasTotal % 24;
				
		int semanas = diasTotal / 7;
		int diasResto = diasTotal % 7;
		
		System.out.println("\nSemanas: "+semanas+"\nDías: "+diasResto+"\nHoras:"+horasResto);
		
		
		
		System.out.println("\n\nEjercicio 2");
		
		/*
		 * |   |    x |      y |
		 * | A |    5 |     10 |
		 * | B |   15 |     25 |
		 * | C |  -10 |     35 |
		 * | D | -350 | -12250 |
		 * | E |    0 |      1 |
		 * 
		 * */
		
		System.out.println("A");
		int x = 5;
		int y=10;
		System.out.println(x);
		System.out.println(y);
		System.out.println("B");
		x +=y;
		y +=x;
		System.out.println(x);
		System.out.println(y);
		System.out.println("C");
		x-=y ;
		y-=x ;
		System.out.println(x);
		System.out.println(y);
		System.out.println("D");
		x*=y;
		y*=x;
		System.out.println(x);
		System.out.println(y);
		System.out.println("E");
		x/=y ;
		y/=y ;
		System.out.println(x);
		System.out.println(y);
		
		
		
		System.out.println("\n\nEjercicio 3");
		
		/*
		 * |   | x |  y | suma | resta |
		 * | A | 5 | 10 |    0 |     0 |
		 * | B | 5 | 10 |   15 |    -5 |
		 * | C | 5 | 10 |   10 |     0 |
		 * | D | 5 | 10 |   20 |   -20 |
		 * | E | 5 | 10 |   20 |  - 25 |
		 * 
		 * */
		
		System.out.println("A");
		x = 5;
		y=10;
		int suma=0;
		int resta=0;
		System.out.println(x);
		System.out.println(y);
		System.out.println(suma);
		System.out.println(resta);
		System.out.println("B");
		suma=x+y;
		resta=x-y;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println("C");
		suma=x+x;
		resta=y-y;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println("D");
		suma=x+y+x;
		resta=x-x-20;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println("E");
		suma=y+x+x;
		resta=-x-y-y;
		System.out.println(suma);
		System.out.println(resta);
		
		
		
		System.out.println("\n\nEjercicio 4");
		
		/*
		 * |   | x |  y | multi | division |
		 * | A | 5 | 10 |     1 |        1 |
		 * | B | 5 | 10 |    50 |        0 |
		 * | C | 5 | 10 |    25 |        1 |
		 * | D | 5 | 10 |   250 |        2 |
		 * | E | 5 | 10 |   -50 |       -2 |
		 * 
		 * */
		
		System.out.println("A");
		x = 5;
		y=10;
		int multi=1;
		int division=1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(multi);
		System.out.println(division);
		System.out.println("B");
		multi=x*y;
		division=x/y;
		System.out.println(multi);
		System.out.println(division);
		System.out.println("C");
		multi=x*x;
		division=y/y;
		System.out.println(multi);
		System.out.println(division);
		System.out.println("D");
		multi=x*y*x;
		division=y/x;
		System.out.println(multi);
		System.out.println(division);
		System.out.println("E");
		multi=x*(-y);
		division=y/(-x);
		System.out.println(multi);
		System.out.println(division);
	
		
	
		System.out.println("\n\nEjercicio5");
		
		/*
		 * |   | n1 | n2 | n3 |
		 * | A | 20 |  2 |  0 |
		 * | B | 15 |  2 |  1 |
		 * | C |  3 | 20 |  2 |
		 * | D |  3 | 15 |  0 |
		 * 
		 * */
		
		System.out.println("A");
		int n1=20;
		int n2=2;
		int n3=n1%n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("B");
		n1=15;
		n2=2;
		n3=n1%n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("C");
		n1=3;
		n2=20;
		n3=n2%n1;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("D");
		n1=3;
		n2=15;
		n3=n2%n1;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	
		
		
		System.out.println("\n\nEjercicio6");
		n1 = 5;
		n2 = 10;
		n3 = 20;
		System.out.println("a) n1+n2: "+(n1+n2));
		System.out.println("b) n3-n1: "+(n3-n1));
		System.out.println("c) n1*n3: "+(n1*n3));
		System.out.println("d) n3/n2: "+(n3/n2));
		
		
		
		System.out.println("\n\nEjercicio7");
		n1 = 10;
		n2 = 20;
		n3 = 30;
		System.out.println("a) El total: "+(n1+n2+n3));
		System.out.println("b) El promedio: "+(n1+n2+n3)/3);
		System.out.println("c) El resto entre n2 y n1: "+(n2%n1));

	}

}
