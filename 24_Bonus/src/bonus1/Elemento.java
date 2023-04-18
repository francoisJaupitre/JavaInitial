package bonus1;

public class Elemento {

	private String TipoElemento;
	public double Ancho;
	public double Alto;
	public double Peso;

	public String getTipoElemento() {
		return TipoElemento;
	}

	public void setTipoElemento(String paramTipo) {
		TipoElemento = paramTipo;
	}
            public Elemento() { }
	public Elemento(String paramTipo, double paramAncho, double paramAlto, double paramPeso) {
		TipoElemento = paramTipo;
		Ancho = paramAncho;
		Alto = paramAlto;
		Peso = paramPeso;
	}

	public void mostrarDatos() {
		System.out.println("Datos del elemento:");
		System.out.println("Peso: " +  Peso);
		System.out.println("Alto: " +  Alto);
		System.out.println("Ancho: " + Ancho);
		System.out.println("Tipo: " + getTipoElemento());
	}
	
}
