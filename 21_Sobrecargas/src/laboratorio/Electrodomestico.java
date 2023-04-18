package laboratorio;

public class Electrodomestico
{
    private String nombre;
    private int voltaje;
    private float precio;
    private String origen;

    public void setnombre(String paramnombre) {
        this.nombre = paramnombre;
    }
    public String getnombre() {
        return this.nombre;
    }
    public void setvoltaje(int paravoltaje)
    {
        this.voltaje = paravoltaje;
    }
    public int getvoltaje()
    {
        return this.voltaje;
    }
    public void setprecio(float paramprecio)
    {
        this.precio = paramprecio;
    }
    public float getprecio()
    {
        return this.precio;
    }
    public void setorigen(String paramorigen)
    {
        this.origen = paramorigen;
    }
    public String getorigen()
    {
        return this.origen;
    }
    void encender(){}
    void usar(){}
    void apagar(){}
    public void aumentarprecio(float paramValor){
        setprecio(precio + paramValor);
    }
    public void aumentarprecio(){
        precio = precio + 100;
    }
    public void aumentarprecio(int paramPorcentaje)
    {
        precio = precio + (precio * paramPorcentaje / 100);
    }

    void bajarprecio(){}
}
