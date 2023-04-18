package bonus5;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {

		Proveedor p = new Proveedor();
		p.Id_Proveedor = 1;
		p.Nombre = "ACME S.R.L.";
		p.Mail = "acme@mail.com";
		p.Domicilio = "Rivadavia 101";
		p.Cuit = "37-4576871045-5";
		p.Telefono = "0800-4-1234153";
		p.verDatos();

		System.out.println("");
		
        p.verDatos("fiscales");
        
        System.out.println("");
        
        p.verDatos(1);
        
        System.out.println("");
                    
		Articulo a = new Articulo();
		a.Marca = "Acme";
		a.Id_Articulo = 5;
		a.Nombre = "Procesador El Coyote 3.90 GHZ";
		a.Proveedor = p;
		a.Stock = 75;
		a.Precio = 15000;
		a.verDatos();

		System.out.println("");
		

		Cliente c = new Cliente();
		c.Id_Cliente = 100;
		c.Nombre = "Ministerio de Educación";
		c.Mail = "educacion@mail.gob.ar";
		c.Domicilio = "Pizzurno 935";
		c.Cuit = "30-12346577-2";
		c.Telefono = "41291800";
		c.verDatos();

		System.out.println("");
		

		Venta v = new Venta();
		v.Id_Venta = 1510;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		v.Fecha = sdf.parse("15-08-2020");
		v.Articulo = a;
		v.Cliente = c;
		v.Cantidad = 10;
		v.Monto = 150000;
		v.verDatos();

		System.out.println("");
		
	}

}
