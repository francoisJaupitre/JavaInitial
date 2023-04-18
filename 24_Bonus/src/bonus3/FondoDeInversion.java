package bonus3;

import java.util.Date;

public class FondoDeInversion {

	public Date FechaApertura;
	public Date FechaVencimiento;
	public String Nombre;
	public double Importe;
	public double Rentabilidad;

	public void verDatos()
	{
		System.out.println("Datos del Fondo de Inversión: ");
		System.out.println("Apertura: " + FechaApertura);
		System.out.println("Cierre: " + FechaVencimiento);
		System.out.println("Nombre: " + Nombre);
		System.out.println("Importe: " + Importe);
		System.out.println("Rentabilidad: " + Rentabilidad);
	}
	
}
