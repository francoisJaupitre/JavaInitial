package bonus5;

public class Proveedor {

	public int Id_Proveedor;
	public String Nombre;
	public String Mail;
	public String Domicilio;
	public String Cuit;
	public String Telefono;
	

	public void verDatos()
	{
		System.out.println("Datos del Proveedor: ");
		System.out.println("ID: " + Id_Proveedor);
		System.out.println("Nombre: " + Nombre);
		System.out.println("C.U.I.T.: " + Cuit);
		System.out.println("Direccón: " + Domicilio);
		System.out.println("Mail: " + Mail);
		System.out.println("Telefono: " + Telefono);
	}
            
            public void verDatos(String paramDatoFiscal)
	{
		if("FISCALES".equals(paramDatoFiscal.toUpperCase())){
		System.out.println("Datos fiscales del Proveedor: ");
		System.out.println("Nombre: " + Nombre);
		System.out.println("C.U.I.T.: " + Cuit);
		System.out.println("Domicilio fiscal: " + Domicilio);}
	}

	public void verDatos(int paramDatoContacto)
	{
		System.out.println("Datos de contacto del Proveedor: ");
		System.out.println("Nombre: " + Nombre);
		System.out.println("Domicilio: " + Domicilio);
		System.out.println("Mail: " + Mail);
		System.out.println("Telefono: " + Telefono);
	}

	public void ingresar()
	{
		//
	}
	public void modificar()
	{
		//
	}
	public void consultar()
	{
		//
	}
	public void eliminar()
	{
		//
	}

}
