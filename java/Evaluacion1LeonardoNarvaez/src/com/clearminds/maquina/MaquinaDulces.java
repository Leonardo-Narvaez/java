package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> Celdas = new ArrayList<Celda>();
	private double saldo;

	public void agregarCelda(Celda celda1) {
		Celdas.add(celda1);
	}

	public void mostrarConfiguracion() {
		Celda celdaRecuperada;
		for (int i = 0; i < Celdas.size(); i++) {
			celdaRecuperada = Celdas.get(i);
			if (celdaRecuperada != null) {
				System.out.println("Celda" + i + ": " + celdaRecuperada.getCodigo());
			}
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda celdaRecuperada;
		for (int i = 0; i < Celdas.size(); i++) {
			celdaRecuperada = Celdas.get(i);
			if (celdaRecuperada.getCodigo() == codigo) {
				return celdaRecuperada;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda celdaRecuperada;
		for (int i = 0; i < Celdas.size(); i++) {
			celdaRecuperada = Celdas.get(i);
			if (celdaRecuperada.getProducto() != null) {
				System.out.println("Celda:" + celdaRecuperada.getCodigo() + " Stock:" + celdaRecuperada.getStock()
						+ " Producto:" + celdaRecuperada.getProducto().getCodigo() + " Precio:"
						+ celdaRecuperada.getProducto().getPrecio());
			} else {
				System.out.println("Celda:" + celdaRecuperada.getCodigo() + " Stock:" + celdaRecuperada.getStock()
						+ " Sin producto asignado");
			}
		}
		System.out.println("Saldo:" + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		Producto productoRecuperado = buscarProductoEnCelda(codigo);
		if (productoRecuperado != null) {
			return productoRecuperado.getPrecio();
		}
		return 0;
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda celdaRecuperada;
		for (int i = 0; i < Celdas.size(); i++) {
			celdaRecuperada = Celdas.get(i);
			if (celdaRecuperada.getProducto() != null) {
				if (codigo == celdaRecuperada.getProducto().getCodigo()) {
					return celdaRecuperada;
				}
			}
		}
		return null;

	}

	public void incrementarProductos(String codigo, int incrementoStock) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockAumentado = celdaEncontrada.getStock() + incrementoStock;
		celdaEncontrada.setStock(stockAumentado);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int stockDisminuido = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(stockDisminuido);

		saldo += celdaEncontrada.getProducto().getPrecio();

	}

	public double venderConCambio(String codigo, double valorCliente) {
		vender(codigo);
		Producto producto = buscarProductoEnCelda(codigo);
		double valorCambio = valorCliente - producto.getPrecio();
		return valorCambio;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> Menores = new ArrayList<Producto>();
		Celda celdaRecuperada;
		for (int i = 0; i < Celdas.size(); i++) {
			celdaRecuperada = Celdas.get(i);
			if (celdaRecuperada.getProducto().getPrecio() < limite) {
				Menores.add(celdaRecuperada.getProducto());
			}
		}
		return Menores;
	}
}
