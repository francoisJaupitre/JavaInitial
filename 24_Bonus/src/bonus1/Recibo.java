package bonus1;

public class Recibo {

	public String TipoElemento;
	private double Valor;
	public int TotalDiario;

	public double getValor()
	{
		return Valor;
	}

	public void setValor(double paramValor)
	{
		Valor = paramValor;
	}
            public Recibo() { }
	public Recibo(String paramTipo, double paramValor, int paramTotal) {
		TipoElemento = paramTipo;
		Valor = paramValor;
		TotalDiario = paramTotal;
	}
	public void mostrarDatos() {
		System.out.println("Datos del recibo:");
		System.out.println("Tipo de elemento: " + TipoElemento);
		System.out.println("Total: " + TotalDiario);
		System.out.println("Valor: " + getValor());
	}
	
}
