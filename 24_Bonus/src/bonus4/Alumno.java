package bonus4;

public class Alumno extends Persona {

	public String Id_Alumno;
	
	public void verDatos()
	{
		System.out.println("Datos del Alumno");
		System.out.println("Id de Alumno: " + Id_Alumno);
		super.verDatos();
	}

}
