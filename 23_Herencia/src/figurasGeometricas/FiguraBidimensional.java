package figurasGeometricas;

public abstract class FiguraBidimensional extends Figura {
	private String unidades;

	public FiguraBidimensional() {
		
	}
			
	public FiguraBidimensional(String color, String unidades) {
		super(color);
		this.unidades = unidades;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}
	
	
}
