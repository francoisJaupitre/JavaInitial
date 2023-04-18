package bonus1;

public class Main {

	public static void main(String[] args) {

		Elemento e = new Elemento();
		e.Alto = 350;
		e.Ancho = 100;
		e.Peso = 200;
		e.setTipoElemento("Envase de gaseosa");

		e.mostrarDatos();

        System.out.println("");
        
        Elemento e1 = new Elemento("Envase de cerveza", 90, 380, 500);

        e1.mostrarDatos();
        
        System.out.println("");

        Recibo r = new Recibo();
		r.TipoElemento = e.getTipoElemento();
		r.TotalDiario = 100;
		r.setValor(250);
		
		
		
		r.mostrarDatos();
	    
	    System.out.println("");
	    
	    Recibo r1 = new Recibo(e1.getTipoElemento(), 400, 10);
	    r1.mostrarDatos();
	    
	    System.out.println("");
	}

}


