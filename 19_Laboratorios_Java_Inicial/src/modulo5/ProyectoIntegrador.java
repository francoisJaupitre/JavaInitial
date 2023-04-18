package modulo5;

import java.util.Scanner;

public class ProyectoIntegrador {

	public static void main(String[] args) {

		int tokenGenerado;
		int[] tokenesGenerados = new int[3];
		int intentos = 0;
		boolean tokenValido = true;
		char repuesta;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bienvenido a Online Banking, por favor ingrese las credenciales solicitadas :");
		do {
			do { 
				tokenGenerado = generarToken(); //una nueva clave token en cada intento
				for(int i=0 ; i<intentos; i++) //verifica que el token no se repite
					if(tokenGenerado == tokenesGenerados[i])
						tokenValido = false;
			}
			while(!tokenValido);
			tokenesGenerados[intentos] = tokenGenerado;
			intentos++;
			
			System.out.println("Clave token generada : "+tokenGenerado);
			cicloPregunta("usuario");
			String usuario = in.next();
			cicloPregunta("contraseña");
			String pass = in.next();
			cicloPregunta("token");
			int token = in.nextInt();			
			
			if(login(usuario,pass,token,tokenGenerado)) {
				System.out.println("Credenciales correctas. Bienvenido a su Online Banking.");
				break;
			}
			else if(intentos == 3) {
				System.out.println("Error de Credenciales... Usuario bloqueado, por favor dirijase a la sucursal mas cercana.");
				break;
			}
			System.out.println("Error de Credenciales... Desea intentarlo nuevamente? (S/N) :");	
			repuesta = in.next().toUpperCase().charAt(0);	
			if(repuesta == 'N')
				System.out.println("Gracias por utilizar Online Banking.");
		}
		while(repuesta == 'S');
		in.close();
	}

	static void cicloPregunta(String pregunta) { //ciclos de preguntas
		switch(pregunta) {
		case "usuario":
			System.out.print("Usuario : ");
			break;
			
		case "contraseña":
			System.out.print("Contraseña : ");

			break;
			
		case "token":
			System.out.print("Clave Token : ");
			
		}
	}

	static int generarToken() { //retorna token
		int min = 100000;
		int max = 999999;
		return (int) (Math.floor(Math.random()*(max-min+1)+min));
	}
	
	static boolean login(String usuario, String pass, int token, int tokenGenerado) { //valida los datos
		String usuarioValid = "Pedro01";
		String passValid = "12345678";
		return (usuario.equalsIgnoreCase(usuarioValid) && pass.equals(passValid) && token == tokenGenerado);
	}

}
