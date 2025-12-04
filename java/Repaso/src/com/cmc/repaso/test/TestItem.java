package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item("Pera", 20);
		item1.imprimir();
		item1.vender(14);
		System.out.println("Valores metodo vender");
		item1.imprimir();
		item1.devolver(9);
		System.out.println("Valores metodo devolver");
		item1.imprimir();
		System.out.println("XXXXXXX---Objeto de prueba 2---XXXXXXX");
		Item item2 = new Item("Manzana", 37);
		item2.imprimir();
		item2.vender(21);
		System.out.println("Valores metodo vender");
		item2.imprimir();
		item2.devolver(5);
		System.out.println("Valores metodo devolver");
		item2.imprimir();
	}

}
