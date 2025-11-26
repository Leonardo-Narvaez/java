package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		r1.setBase(10);
		r1.setAltura(5);

		r2.setBase(8);
		r2.setAltura(5);
		
		int areaR1 = r1.calcularArea();
		int areaR2 = r2.calcularArea();
		double perimetroR1 = r1.calcularPerimetro();
		double perimetroR2 = r2.calcularPerimetro();
		
		System.out.println("Area r1: "+areaR1);
		System.out.println("Area r2: "+areaR2);
		System.out.println("Perimetro r1: "+perimetroR1);
		System.out.println("Perimetro r2: "+perimetroR2);

	}

}
