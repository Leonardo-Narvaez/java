package com.clearminds.componentes;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;

	public Producto(String codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentaje) {
		double valorTotal = this.precio * (porcentaje / 100.0);
		this.precio = valorTotal + this.precio;
	}

	public void disminuirPrecio(double descuento) {
		this.precio = this.precio * (1 - descuento); 
	}
}
