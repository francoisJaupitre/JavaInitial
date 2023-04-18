package modulo3;

public class Desafio {

	public static void main(String[] args) {

		int nro1 = 100, nro2 = 500, nro3 = 250;
		if(nro1 > nro2 && nro1 > nro3) 
			System.out.println("nro1 es el mayor");
		else if(nro2 > nro1 && nro2 > nro3) 
			System.out.println("nro2 es el mayor");
		else if(nro3 > nro1 && nro3 > nro2) 
			System.out.println("nro3 es el mayor");
		
		
		int a = 10, b=-2, c=5;
		if(a>0 && b>0) 
			System.out.println("a x b = "+(a*b));
		else if(a>0 && c>0) 
			System.out.println("a x c = "+(a*c));
		else if(b>0 && c>0) 
			System.out.println("b x c = "+(b*c));
		
		
		String usuario = "Pepito", clave= "1234";
		if(usuario.equals("Pepito") && clave.equals("1234")) 
			System.out.println("¡Bienvenido Pepito!");
		else if(usuario.equals("Pepito")) 
			System.out.println("Contraseña incorrecta");
		else if(clave.equals("1234")) 
			System.out.println("Usuario incorrecto");
		
		
		a=0;
	    System.out.println(a++); //imprime 0 y después se incrementa
	    a=0;
	    System.out.println(++a); //se incrementa primero
	}

}
