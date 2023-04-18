package modulo1;

public class AspectosAvanzados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ejercicio 1");
		/*
		 * (variableA && variableB) || (variableA && variableC) = true
		 *  !(variableA || variableB) && variableC = false
		 */
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		System.out.println("variableA: "+a);
		System.out.println("variableB: "+b);
		System.out.println("variableC: "+c);
		System.out.println("(variableA && variableB) || (variableA && variableC): "+((a && b) || (a && c)));
		System.out.println("!(variableA || variableB) && variableC: "+(!(a || b) && c));
		
		
		
		System.out.println("\n\nEjercicio 2");
		
		/*
		 * |   | palabra_1 |  palabra_2 | frase        |
		 * | A | Hola      | Mundo      |      	       |
		 * | B | Hola      | Mundo      | HolaMundo    |
		 * | C | Hola      | Mundo      | Hola 	 Mundo |
		 * | D | Hola      | Mundo      | Hola         |
		 * |   |           |            |  Mundo       |
		 * | E | Hola      | Mundo      | Hola         |
		 * |   |           |            |  	Mundo      |
		 * */
		
		System.out.println("A");
		String palabra_1 ="Hola";
		String palabra_2 ="Mundo";
		String frase ="";
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		System.out.println("B");
		frase =palabra_1+palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		System.out.println("C");
		frase =palabra_1+" \t "+palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		System.out.println("D");
		frase =palabra_1+" \n "+palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		System.out.println("E");
		frase =palabra_1+" \n \t "+palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);

		
		
		System.out.println("\n\nEjercicio 3");
		
		/*
		 * |   |  n1  |  n2   |  n3   |  n4   |
		 * | A | true | false | false | true  |
		 * | B | true | false | false | true  |
		 * | C | true | false | true  | false |
		 * | D | true | false | false | false |
		 * | E | true | false | true  | false |
		 * */
		
		System.out.println("A");
		boolean n1=true;
		boolean n2=false;
		boolean n3=!n1;
		boolean n4=!n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println("B");
		n3=n1 & n2;
		n4=n1 | n2;
		System.out.println(n3);
		System.out.println(n4);
		System.out.println("C");
		n3=!(n1 & n2);
		n4=!(n1 | n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println("D");
		n3=!n1 & n2;
		n4=!n1 | n2;
		System.out.println(n3);
		System.out.println(n4);
		System.out.println("E");
		n3=n1^ n2;
		n4=n1^ !n2;
		System.out.println(n3);
		System.out.println(n4);
		
		
		
		System.out.println("\n\nEjercicio 4");
		n1 = true;
		n2 = false;
		n3 = true;
		System.out.println("a) n1^n2: "+(n1^n2));
		System.out.println("b) (n1&!n2)|n3: "+((n1&!n2)|n3));
		System.out.println("c) (n1|n2) & !n3: "+((n1|n2) & !n3));

		
		
		System.out.println("\n\nEjercicio 5");
		var x1 = 5; // var funciona por int
		var x2 = 10;
		System.out.println("a) n1 == 5: "+(x1 == 5));
		System.out.println("b) n2 == 10: "+(x2 == 10));
		System.out.println("c) n1 + n2 == 15: "+(x1 + x2 == 15));

		
		
		System.out.println("\n\nEjercicio 6");
		final float IVA = 21;
		System.out.println("a) remera 59,90: "+(59.90*(1+IVA/100)));
		System.out.println("b) pantalon 99,90: "+(99.90*(1+IVA/100)));
		System.out.println("c) campera 149,90: "+(149.90*(1+IVA/100)));

	
		
	}

}
