package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Nissan", 1998, 45000);
		Auto auto2 = new Auto("Ford", 1967, 60000);

		System.out.println("Marca auto1: " + auto1.getMarca());
		System.out.println("Año auto1: " + auto1.getAnio());
		System.out.println("Precio auto1: " + auto1.getPrecio());
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Marca auto2: " + auto2.getMarca());
		System.out.println("Año auto2: " + auto2.getAnio());
		System.out.println("Precio auto2: " + auto2.getPrecio());

	}

}
