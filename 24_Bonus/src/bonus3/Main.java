package bonus3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
	
		Banco b = new Banco();
		b.Codigo = 1;
		b.Nombre = "BNA";

		System.out.println("Datos del Banco: ");
		System.out.println("Codigo: " + b.Codigo);
		System.out.println("Nombre: " + b.Nombre);

		System.out.println("");
		

		Cliente c = new Cliente();
		c.Nombre = "Juan Perez";
		c.Telefono = "1536795291";
		c.Direccion = "Av. de Mayo 654";
		c.Dni = "22666555";

		System.out.println("Datos del Cliente: ");
		System.out.println("Nombre: " + c.Nombre);
		System.out.println("Direccion: " + c.Direccion);
		System.out.println("DNI: " + c.Dni);
		System.out.println("Telefono: " + c.Telefono);

		System.out.println("");
		

		Sucursal s = new Sucursal();
		s.Id_Sucursal = "070";
		s.Nombre = "Carlos Pellegrini";
		s.verDatos();

		System.out.println("");
		

		Cuenta cu = new Cuenta();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                    cu.FechaApertura = sdf.parse("13-07-2020");
		cu.Meses = 24;
		cu.Numero = "7140701124/6";
		cu.Interes = 35;
		cu.Saldo = 100000;
		cu.verDatos();

		System.out.println("");
		

		Valor v = new Valor();
		v.Tipo = "Acciones";
		v.Nombre = "YPF";
		v.Cotizacion = 5535;
		v.verDatos();

		Valor v1 = new Valor();
		v1.Tipo = "Bono Deuda";
		v1.Nombre = "Bonar 2023";
		v1.Cotizacion = 1230;

		System.out.println("");
		

		FondoDeInversion f = new FondoDeInversion();
		f.FechaApertura = sdf.parse("01-01-2021");
		f.FechaVencimiento = sdf.parse("31-10-2023");
		f.Importe = 100000;
		f.Nombre = "FCI SOHO";
		f.Rentabilidad = 25;
		f.verDatos();

		System.out.println("");
		

		TarjetaCredito tc = new TarjetaCredito();
		tc.FechaVencimiento = sdf.parse("12-12-2025");
		tc.Numero = "1587330085410010";
		tc.Tipo = "Amex";
		tc.Titular = "Bouquet Silvia Lili";
		tc.verDatos();

		System.out.println("");
		

		List<Valor> listaDeValores = new ArrayList<Valor>();
		listaDeValores.add(v);
		listaDeValores.add(v1);

		System.out.println("Lista de valores:");

        CarteraDeValores cv = new CarteraDeValores();
		cv.Valores = listaDeValores;
		cv.verDetalleCartera();

		System.out.println("");
		
	}
	
}
