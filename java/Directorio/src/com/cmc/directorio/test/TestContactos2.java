package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0964190218", 23);
		Telefono telf2 = new Telefono("movi", "0999999999", 19);
		Contacto c1 = new Contacto("Cardenas", telf1, 65);
		Contacto c2 = new Contacto("Pupiales", telf2, 95);
		AdminContactos ac1 = new AdminContactos();
		AdminContactos ac2 = new AdminContactos();

		Contacto pesado = ac1.buscarMasPesado(c1, c2);
		pesado.imprimir();
		System.out.println("XCXCXCXCXCXCXCXCXCXCXC");
		boolean co = ac2.compararOperadoras(c1, c2);
		System.out.println("Tienen la misma operadora: "+co);
		


	}

}
