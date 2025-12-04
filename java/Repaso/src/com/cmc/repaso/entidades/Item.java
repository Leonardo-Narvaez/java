package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public Item(String nombre, int productosActuales) {
		this.nombre = nombre;
		this.productosActuales = productosActuales;
	}

	public void imprimir() {
		System.out.println("Nombre Producto: " + nombre);
		System.out.println("Cantidad Actual: " + productosActuales);
		System.out.println("Cantidad Devuelta: " + productosDevueltos);
		System.out.println("Cantidad Vendidos: " + productosVendidos);
		System.out.println("<><><><><><><><><><><><>");
	}

	public void vender(int productosVendidos) {
		this.productosActuales = this.productosActuales - productosVendidos;
		this.productosVendidos = this.productosVendidos + productosVendidos;
	}

	public void devolver(int productosDevueltos) {
		this.productosActuales = this.productosActuales + productosDevueltos;
		this.productosVendidos = this.productosVendidos - productosDevueltos;
		this.productosDevueltos = this.productosDevueltos + productosDevueltos;
	}

}
