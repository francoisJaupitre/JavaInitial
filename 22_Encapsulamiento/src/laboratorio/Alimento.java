package laboratorio;

public class Alimento {
	private String nombre;
	private String origen;
	private int calorias;
	private String gusto;
	private float precio;
	private int temperatura;
	public void calentar(){
	}
	public void enfriar(){
	}
	public void preparar(){
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	public String getGusto() {
		return gusto;
	}
	public void setGusto(String gusto) {
		this.gusto = gusto;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
