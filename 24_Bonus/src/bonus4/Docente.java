package bonus4;

public class Docente extends Persona {

	public String Id_Docente;
	
	public void verDatos() {
		
		System.out.println("Datos del Docente");
        System.out.println("Id de Docente: " + Id_Docente);
        super.verDatos();
		
	}

}
