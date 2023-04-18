package bonus2;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {

		System.out.println("");
			
		Carrera c = new Carrera();
		c.Nombre = "Programación .Net";
		c.Sede = "Lavalle";
		
		Carrera c1 = new Carrera();
		c1.Nombre = "Programación Java";
		c1.Sede = "Lavalle";
		
		Carrera c2 = new Carrera();
		c2.Nombre = "Programación FullStack PHP";
		c2.Sede = "Lavalle";
		
		List<Carrera> listaDeCarreras = new ArrayList<Carrera>();
		listaDeCarreras.add(c);
		listaDeCarreras.add(c1);
		listaDeCarreras.add(c2);
		
		System.out.println("Carreras disponibles:");
		
		for (Carrera carrera : listaDeCarreras) {
			System.out.println("Sede: " + carrera.Sede);
			System.out.println("Nombre: " + carrera.Nombre);
		}
		
		System.out.println("");
		
		Asignatura a = new Asignatura();
		a.Nombre = "Introducción al Paradigma de objetos";
		a.Tipo = "Obligatoria";
		a.Cuatrimestre = 2;
		a.setHoras(9);
		a.Carreras = listaDeCarreras;
		
		System.out.println("Datos de la Asignatura/Materia:");
		System.out.println("Nombre: " + a.Nombre);
		System.out.println("Tipo de cursada: " + a.Tipo);
		System.out.println("Cuatrimestre: " + a.Cuatrimestre);
		System.out.println("Carga horaria: " + a.getHoras());
		
		System.out.println("");
		
		Asignatura a1 = new Asignatura();
		a1.Nombre = "Introducción a C# .Net";
		
		List<Asignatura> listaDeAsignaturas = new ArrayList<Asignatura>();
		listaDeAsignaturas.add(a);
		listaDeAsignaturas.add(a1);
		
		Alumno alu = new Alumno();
		
		alu.Nombre = "Ariel Mercado F.";
		alu.Direccion = "Cramer 1653";
		alu.setDni("33444555");
		alu.Id_Alumno = "101";
		alu.Materias = listaDeAsignaturas;
		alu.setCarrera(c);
		
		System.out.println("Datos del alumno: ");
		System.out.println("Nombre: " + alu.Nombre);
		System.out.println("Codigo de alumno: " + alu.Id_Alumno);
		System.out.println("Carrera: " + alu.getCarrera().Nombre);
		System.out.println("Lista de materias: ");
		
		alu.mostrarDatos(1);
		
		System.out.println("");
		
		AsignaturaCursada ac = new AsignaturaCursada();
		ac.Asignatura = a1;
		ac.Alumno = alu;
		ac.Nota = 7.50;
		ac.setFinal(8);
		
		System.out.println("Lista de materias cursadas: ");
		System.out.println(ac.Asignatura.Nombre);
		System.out.println("Nota: " + ac.Nota);
		System.out.println("Nota final: " + ac.getFinal());
		
		System.out.println("");
		
		Profesor prof = new Profesor();
		
		prof.Nombre = "Pedro Gomez";
		prof.setDni("11222333");
		prof.Direccion= "Tucuman 633";
		prof.Departamento = "Ingeniería";
		prof.setId_Profesor("T021");
		
		System.out.println("Datos del Profesor: ");

		System.out.println("Nombre: " + prof.Nombre);
		System.out.println("Codigo de profesor: " + prof.getId_Profesor());
		System.out.println("Departamento: " + prof.Departamento);

		System.out.println("");
		
		Tramite t = new Tramite();
		t.Alumno = alu;
		t.Estado = "Pendiente";
		t.Numero = 12345;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		t.setFecha(sdf.parse("10-10-2020"));

		System.out.println("Datos del Tramite: ");
		
		System.out.println("Alumno: " + t.Alumno.Nombre);
		System.out.println("Estado: " + t.Estado);
		System.out.println("Numero: " + t.Numero);
		System.out.println("Fecha de inicio: " + t.getFecha());

	}

}
