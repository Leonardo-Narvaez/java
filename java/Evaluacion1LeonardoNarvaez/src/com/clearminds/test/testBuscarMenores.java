package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class testBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));

		Producto producto1 = new Producto("QWER", "Doritos", 3.75);
		maquina.cargarProducto(producto1, "A", 6);
		Producto producto2 = new Producto("TYUI", "Agua", 1.50);
		maquina.cargarProducto(producto2, "B", 7);
		Producto producto3 = new Producto("OPAS", "Chocolate", 8.50);
		maquina.cargarProducto(producto3, "C", 3);
		Producto producto4 = new Producto("DFGH", "Atun", 9.35);
		maquina.cargarProducto(producto4, "D", 2);
		Producto producto5 = new Producto("KE34", "Tequila", 15.60);
		maquina.cargarProducto(producto5, "E", 4);
		Producto producto6 = new Producto("PRTO", "Gatorade", 2.54);
		maquina.cargarProducto(producto6, "F", 5);

		ArrayList<Producto> Menores = maquina.buscarMenores(9);

		System.out.println("Productos Menores: " + Menores.size());
		for (int i = 0; i < Menores.size(); i++) {
			Producto productoEncontrado = Menores.get(i);
			System.out
					.println("Nombre:" + productoEncontrado.getNombre() + " Precio:" + productoEncontrado.getPrecio());
		}
	}

}
