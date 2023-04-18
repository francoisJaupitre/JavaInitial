package figurasGeometricas;

public class Circulo extends FiguraBidimensional {
	private float radio;

	public Circulo() {
	}
	
	public Circulo(String color, String unidades, float radio) {
		super(color,unidades);
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float calcularArea() {
		return (float) (Math.pow(this.radio, 2)*Math.PI);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	

}
