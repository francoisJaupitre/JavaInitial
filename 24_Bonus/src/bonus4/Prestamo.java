package bonus4;

import java.util.Date;

public class Prestamo {

	public int id_Prestamo;
	public Persona Usuario;
	public Material Material;
	public Date Fecha;
	public Date FechaDevolucion;

	public void verDatos()
	{
		System.out.println("Datos del Préstamo: ");
		System.out.println("ID: " + id_Prestamo);
		System.out.println("Usuario: " + Usuario.Nombre + " " + Usuario.Apellido);
		System.out.println("Material: " + Material.Titulo);
		System.out.println("Fecha: " + Fecha);
		System.out.println("FechaDevolucion: " + FechaDevolucion);
	}

	public void calcularMulta(){
		//
	}
	public void listarPrestamo(){
		//
	}
	
}
