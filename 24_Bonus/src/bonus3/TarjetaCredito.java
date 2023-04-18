package bonus3;

import java.util.Date;

public class TarjetaCredito {

	public Date FechaVencimiento;
	public String Numero;
	public String Tipo;
	public String Titular;

	public void verDatos() {
		System.out.println("Datos de la terjeta de crédito: ");
		System.out.println("Vencimiento: " + FechaVencimiento);
		System.out.println("Numero: " + Numero);
		System.out.println("Tipo: " + Tipo);
		System.out.println("Titular: " + Titular);
	}
	
}
