package bonus2;

public abstract class Persona {

	private String Dni;
	public String Nombre;
	public String Direccion;

	public String getDni() {
		return Dni;
	}

	public void setDni(String paramDni) {
		Dni = paramDni;
	}

	public void mostrarDatos() {
	System.out.println("Datos de la Persona:");
	System.out.println("Numero de documento: " + getDni());
	System.out.println("Nombre: " + Nombre);
	System.out.println("Dirección: " + Direccion);
	}
	
}
