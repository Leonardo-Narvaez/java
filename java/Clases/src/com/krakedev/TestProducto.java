package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.setNombre("Aspirina");
		productoA.setDescripcion("Medicamento antiinflamatorio no esteroideo");
		productoA.setPrecio(0.60);
		productoA.setStockActual(3);

		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("Fármaco antiinflamatorio, analgésico y antipirético");
		productoB.setPrecio(0.70);
		productoB.setStockActual(7);

		productoC.setNombre("Amoxicilina");
		productoC.setDescripcion("Antibiotico derivado de la penicilina");
		productoC.setPrecio(1.0);
		productoC.setStockActual(4);

		System.out.println("Nombre ProductoA: " + productoA.getNombre());
		System.out.println("Descripcion ProductoA: " + productoA.getDescripcion());
		System.out.println("Precio ProductoA: " + productoA.getPrecio());
		System.out.println("Precio ProdcutoA: " + productoA.getStockActual());
		System.out.println("_XX_X_X_X__XX_X_X_X_X_X_X_X_");
		System.out.println("Nombre ProductoB: " + productoB.getNombre());
		System.out.println("Descripcion ProductoB: " + productoB.getDescripcion());
		System.out.println("Precio ProductoB: " + productoB.getPrecio());
		System.out.println("Precio ProdcutoB: " + productoB.getStockActual());
		System.out.println("_XX_X_X_X__XX_X_X_X_X_X_X_X_");
		System.out.println("Nombre ProductoC: " + productoC.getNombre());
		System.out.println("Descripcion ProductoC: " + productoC.getDescripcion());
		System.out.println("Precio ProductoC: " + productoC.getPrecio());
		System.out.println("Precio ProdcutoC: " + productoC.getStockActual());

	}

}
