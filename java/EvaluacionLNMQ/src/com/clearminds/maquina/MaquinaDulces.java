package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("Celda 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1;
		} else if (codigo == celda2.getCodigo()) {
			return celda2;
		} else if (codigo == celda3.getCodigo()) {
			return celda3;
		} else if (codigo == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		System.out.println("***********CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Nombre:" + celda1.getProducto().getNombre());
			System.out.println("Precio: " + celda1.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("***********CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() != null) {
			System.out.println("Nombre Producto:" + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("***********CELDA " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() != null) {
			System.out.println("Nombre Producto:" + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("***********CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() != null) {
			System.out.println("Nombre Producto:" + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda4.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigo == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigo == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigo == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigo == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigo == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigo == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		}
		return (Double) null;
	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto() != null) {
			if (codigo == celda1.getProducto().getCodigo())
				return celda1;
		} else if (celda2.getProducto() != null) {
			if (codigo == celda2.getProducto().getCodigo()) {
				return celda2;
			}
		} else if (celda3.getProducto() != null) {
			if (codigo == celda3.getProducto().getCodigo()) {
				return celda3;
			}
		} else if (celda4.getProducto() != null) {
			if (codigo == celda4.getProducto().getCodigo()) {
				return celda4;
			}
		}
		return null;

	}

	public void incrementarProductos(String codigo, int incrementoProd) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int nuevoStock = celdaEncontrada.getStock() + incrementoProd;
		celdaEncontrada.setStock(nuevoStock);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int nuevoStock = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(nuevoStock);
		this.saldo += celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
	}

	public double venderConCambio(String codigo, int valorCliente) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int nuevoStock = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(nuevoStock);
		this.saldo += celdaEncontrada.getProducto().getPrecio();
		double cambioCliente = valorCliente - celdaEncontrada.getProducto().getPrecio();
		return cambioCliente;
	}
}
