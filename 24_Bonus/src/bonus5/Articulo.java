package bonus5;

public class Articulo {

	public String Marca;
	public int Id_Articulo;
	public String Nombre;
	public Proveedor Proveedor;
	public int Stock;
	public int Precio;
	
	public void verDatos() {
		System.out.println("Datos del artículo: ");
		System.out.println("ID: " + Id_Articulo);
		System.out.println("Nombre: " + Nombre);
		System.out.println("Marca: " + Marca);
		System.out.println("Proveedor: " + Proveedor.Nombre);
		System.out.println("Existencias: " + Stock);
		System.out.println("Precio: " + Precio);
	}

}
