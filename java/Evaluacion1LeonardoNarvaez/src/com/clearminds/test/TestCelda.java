package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre()); // aqui se produce el NPE, se da en la clase testCelda, la
																// ocasiona la variable producto, ya que en ese momento
																// se encuentra con valor null y al intentar recuperar
																// el atributo nombre de un null nos salta el error

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
	}
}
