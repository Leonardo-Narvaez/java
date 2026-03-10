package com.krakedev.entidades;

public class nota {
	private String materia;
	private double calificacion;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public void mostrar() {
		System.out.println("Materia: " + materia + " Calificacion: " + calificacion);
	}
}
