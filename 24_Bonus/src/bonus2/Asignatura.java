package bonus2;

import java.util.List;

public class Asignatura {
	public String Nombre;
	public String Tipo;
	private int Horas;
	public List<Carrera> Carreras;
	public int Cuatrimestre;

	public int getHoras()
    {
		return Horas;
    }

	public void setHoras(int paramHoras) {
		Horas = paramHoras;
	}
}
