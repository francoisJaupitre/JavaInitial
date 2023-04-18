package modulo5;

import java.util.Arrays;

public class Desafío {

	public static void main(String[] args) {

		System.out.println("Ejercicio 1");
		int vector[] = {10,20,5,15,30,20};
		int total = 0, mayor = 0, n20 = 0;
		
		for (int i=0 ; i<6; i++) {
			System.out.println("Indice : "+(i+1)+" Valor : "+vector[i]);
			total += vector[i];
			if(vector[i]> mayor)
				mayor = vector[i];
			if(vector[i] == 20)
				n20++;
		}
		System.out.println("Total "+total);
		
		int vectorImpar[] = new int[3];
		for (int i=0 ; i<6; i+=2) {
			vectorImpar[i/2] += vector[i];
		}
		System.out.println("Posiciones impares : "+Arrays.toString(vectorImpar));
		System.out.println("Mayor número : "+mayor);
		System.out.println("Cuantas veces aparece el número 20 : "+n20);
		
		
		System.out.println("\nEjercicio 2");
		float vectorInflacion[] = {0.8f, 0.1f, 0.3f, 0.4f, 0.3f, 0.6f, 0.5f, 0.3f, 0.7f, 0.3f, 0.2f, 0.9f};
		float inflacionAnual = 1, maslAlta = vectorInflacion[0], masBaja = vectorInflacion[0], promedio = 0;
		int mesMasAlto=0, mesMasBajo=0;
		for(int i=0 ; i<12 ; i++)
		{
			inflacionAnual *= (1+vectorInflacion[i]/100);
			if(vectorInflacion[i] > maslAlta) {
				maslAlta = vectorInflacion[i];
				mesMasAlto = i;
			}
			if(vectorInflacion[i] < masBaja) {
				masBaja = vectorInflacion[i];
				mesMasBajo = i;
			}
			promedio += vectorInflacion[i];
		}
		inflacionAnual-=1;
		promedio /= 12;
		System.out.println(String.format("Inflación anual : %.2f%%", (inflacionAnual*100) ) ) ;
		System.out.println("Inflación más baja : Mes "+(mesMasBajo+1)+" : "+masBaja+"%");
		System.out.println("Inflación más alta : Mes "+(mesMasAlto+1)+" : "+maslAlta+"%");
		System.out.println(String.format("Promedio : %.2f%%", promedio));
		
		System.out.println("\nEjercicio 3");
		String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
		System.out.println("Inflación más baja : Mes "+meses[mesMasBajo]+" : "+masBaja+"%");
		System.out.println("Inflación más alta : Mes "+meses[mesMasAlto]+" : "+maslAlta+"%");
		
	}

}
