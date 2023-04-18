package bonus4;

public abstract class Persona {

	public String Nombre;
	public String Apellido;
	public String Mail;
	public String Telefono;
	
	protected void verDatos() {
		
		System.out.println("Nombre: " + Nombre);
		System.out.println("Apellido: " + Apellido);
		System.out.println("Mail: " + Mail);
		System.out.println("Telefono: " + Telefono);
		
	}
	
	public void solicitarPrestamo(){
		//
	}
	public void devolverPrestamo(){
		//
	}
	public void pagarMulta(){
		//
	}
	
}
