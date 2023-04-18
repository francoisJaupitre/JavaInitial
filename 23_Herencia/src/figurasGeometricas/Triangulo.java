package figurasGeometricas;

public class Triangulo extends FiguraBidimensional{
	
	private float base;
	private float altura;
	
	public Triangulo() {
	}
	
	public Triangulo(String color, String unidades, float base, float altura) {
		super(color,unidades);
		this.base = base;
		this.altura = altura;
	}
	
	public float calcularArea() {
		return (float) (this.base*this.altura);
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
}
