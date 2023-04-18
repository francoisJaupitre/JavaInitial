package bonus2;

import java.util.Date;

public class Tramite {
	public int Numero;
	private Date Fecha;
	public String Estado;
	public Alumno Alumno;

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date paramFec) {
		Fecha = paramFec;
	}

}
