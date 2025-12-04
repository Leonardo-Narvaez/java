package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Router", 14);

		System.out.println("Nombre Inicial: " + producto1.getNombre());
		System.out.println("Precio Inicial: " + producto1.getPrecio());

		producto1.setPrecio(-10);

		System.out.println("Precio metodo set: " + producto1.getPrecio());
		
		producto1.calcularPrecioPromo(50);
		
		System.out.println("Precio metodo calcular: "+producto1.getPrecio());
	}

}
