package bonus3;

import java.util.List;

public class CarteraDeValores {
	public List<Valor> Valores;
    
    public void verDetalleCartera() {
		for (Valor v : Valores) {
			System.out.println("Tipo de valor: " + v.Tipo);
			System.out.println("Nombre: " + v.Nombre);
			System.out.println("Cotización: " + v.Cotizacion);
			System.out.println("");
		}
	}
}
