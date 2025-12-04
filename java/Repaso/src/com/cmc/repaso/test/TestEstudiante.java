package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Juan");
		Estudiante estudiante2 = new Estudiante("Mateo");
		Estudiante estudiante3 = new Estudiante("Millan");

		estudiante1.calificar(-2);
		estudiante2.calificar(5);
		estudiante3.calificar(9);
		
		System.out.println("Nombre estudiante1: "+estudiante1.getNombre());
		System.out.println("Nota estudiante1: "+estudiante1.getNota());
		System.out.println("Resultado estudiante1: "+estudiante1.getResultado());
		System.out.println("<><><><><><><><><><><><>");
		System.out.println("Nombre estudiante2: "+estudiante2.getNombre());
		System.out.println("Nota estudiante2: "+estudiante2.getNota());
		System.out.println("Resultado estudiante2: "+estudiante2.getResultado());
		System.out.println("<><><><><><><><><><><><>");
		System.out.println("Nombre estudiante3: "+estudiante3.getNombre());
		System.out.println("Nota estudiante3: "+estudiante3.getNota());
		System.out.println("Resultado estudiante3: "+estudiante3.getResultado());
	}

}
