package laboratorio;

public class Alimento
{
    private String nombre;
    private String origen;
    private int calorias;
    private String gusto;
    private float precio;
    private int temperatura;
    public void setnombre(String paramNombre){
        this.nombre = paramNombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setorigen(String paramOrigen){
        this.origen = paramOrigen;
    }
    public String getorigen(){
        return this.origen;
    }
    public void setgusto(String paramGusto){
        this.gusto = paramGusto;
    }
    public String getgusto(){
        return this.gusto;
    }
    public void setcalorias(int paramCalorias){
        this.calorias = paramCalorias;
    }
    public int getcalorias(){
        return this.calorias;
    }
    public void settemperatura(int paramTemperatura){
        this.temperatura = paramTemperatura;
    }
    public int gettemperatura(){
        return this.temperatura;
    }
    public void setprecio(float paramPrecio){
        this.precio = paramPrecio;
    }
    public float getprecio(){
        return this.precio;
    }
    public void calentar(){
        temperatura = temperatura + 70; 
    }
    public void calentar(int paramCuantosGrados){
        temperatura = paramCuantosGrados;
    }
    void enfriar(){}
    void preparar(){}
}