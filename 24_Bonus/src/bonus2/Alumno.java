package bonus2;

import java.util.List;

public class Alumno extends Persona {

	
	public String Id_Alumno;
	public List<Asignatura> Materias;
	private Carrera Carrera;
            
	public void mostrarDatos(){
        super.mostrarDatos();
		System.out.println("Código de alumno: " + Id_Alumno);
		System.out.println("Carrera: " + getCarrera());
	}
            
    public void mostrarDatos(int paramDatosMaterias) {
		for (Asignatura asig : Materias) {
			System.out.println("Materia: " + asig.Nombre);
			System.out.println("Cuatrimestre: " + asig.Cuatrimestre);
		}
	}
            
            public Carrera getCarrera() {
		return Carrera;
	}

	public void setCarrera(Carrera paramCarrera) {
		Carrera = paramCarrera;
	}

	public void inscribirMateria()
	{
		//
	}
	public void iniciarTramite()
	{
		//
	}
	public void inscribirCarrera()
	{
		//
	}
}
