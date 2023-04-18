package figurasGeometricas;

public class Main {

	public static void main(String[] args) {
		Circulo circulo =new Circulo();
		circulo.setColor("Rojo");
		circulo.setRadio(45.3f);
		circulo.setUnidades("m2");
		Circulo circulo2=new Circulo("Azul","cm2",23.4f);
		Triangulo triangulo=new Triangulo("Verde","dm2",23.4f,67.8f);
		System.out.println(circulo.calcularArea()+circulo.getUnidades());
		System.out.println(circulo2.toString());
		System.out.println(circulo2.calcularArea()+circulo2.getUnidades());
		System.out.println(triangulo.toString());
		System.out.println(triangulo.calcularArea()+triangulo.getUnidades());
	}

}
