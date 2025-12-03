package com.krakedev.demo.test;

import com.krakedev.demo.*;

public class TestProducto {

	public static void main(String[] args) {	
		Producto producto1 = new Producto(12345,"Router");
		
		producto1.setDescripcion("Dispositivo electronico de banda ancha");
		producto1.setPeso(2);
		
		System.out.println("Codigo producto1: "+producto1.getCodigo());
		System.out.println("Nombre producto1: "+producto1.getNombre());
		System.out.println("Descripcion producto1: "+producto1.getDescripcion());
		System.out.println("Peso producto1: "+producto1.getPeso()+"Kg");
	}

}
