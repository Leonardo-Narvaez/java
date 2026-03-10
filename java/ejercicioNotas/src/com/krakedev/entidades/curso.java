package com.krakedev.entidades;

import java.util.ArrayList;

public class curso {
	private ArrayList<estudiante> estudiantes = new ArrayList<estudiante>();

	public ArrayList<estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
