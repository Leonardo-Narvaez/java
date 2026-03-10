package com.krakedev.entidades;

import java.util.ArrayList;

public class estudiante {
	private String nombre;
	private String apellido;
	private int cedula;
	private ArrayList<nota> notas = new ArrayList<nota>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public ArrayList<nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<nota> notas) {
		this.notas = notas;
	}

}
