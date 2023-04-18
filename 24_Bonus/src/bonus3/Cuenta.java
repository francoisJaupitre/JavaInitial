package bonus3;

import java.util.Date;

public class Cuenta {

	public Date FechaApertura;
	public String Numero;
	public double Saldo;
	public double Interes;
	public int Meses;

	public void verDatos() {
		System.out.println("Datos de la cuenta: ");
		System.out.println("Numero: " + Numero);
		System.out.println("Fecha de apertura: " + FechaApertura);
		System.out.println("Meses: " + Meses);
		System.out.println("Interes: " + Interes);
		System.out.println("Saldo: " + Saldo);
	}
	
}
