package bonus4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {

		Docente d = new Docente();
		d.Id_Docente = "001";
		d.Nombre = "Marina";
		d.Apellido = "Togneri";
		d.Mail = "mtogneri@mail.com";
		d.Telefono = "43875414";
		d.verDatos();

		System.out.println("");
		
        Alumno alu = new Alumno();
		alu.Id_Alumno = "007";
		alu.Nombre = "German";
		alu.Apellido = "Badajoz";
		alu.Mail = "GermanB@gmail.com";
		alu.Telefono = "1153348477";
		alu.verDatos();
                    
		System.out.println("");

		Material m = new Material();
		m.Anio = "2005";
		m.Autor = "Fernando Migliore";
		m.Codigo = "00150";
		m.Estado = "Disponible";
		m.Titulo = "La Ciencia en la modernidad";
		m.Tipo = "Libro";
		m.verDatos();

		System.out.println("");
                    
        Material m1 = new Material();
		m1.Anio = "1997";
		m1.Autor = "Esteban Echeverría";
		m1.Codigo = "02254";
		m1.Estado = "Disponible";
		m1.Titulo = "El matadero";
		m1.Tipo = "Libro de cuento";
		m1.verDatos();
		
		System.out.println("");
                    
		Prestamo pres = new Prestamo();
		pres.id_Prestamo = 154;
		pres.Material = m;
		pres.Usuario = d;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		pres.Fecha = sdf.parse("15-02-2021");
		pres.verDatos();

		System.out.println("");
                    
		Prestamo pres1 = new Prestamo();
		pres1.id_Prestamo = 325;
		pres1.Material = m1;
		pres1.Usuario = alu;
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		pres.Fecha = sdf1.parse("01-02-2021");
		pres1.verDatos();
                    
		System.out.println("");
                    
		List<Prestamo> listaDePrestamos = new ArrayList<Prestamo>();
		listaDePrestamos.add(pres);
		listaDePrestamos.add(pres1);

		System.out.println("Lista de Prestamos");
		for (Prestamo pr : listaDePrestamos) {
			pr.verDatos();
			System.out.println();
		}	
		
	}

}
