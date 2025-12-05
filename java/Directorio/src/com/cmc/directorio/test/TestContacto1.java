package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "0964190218", 23);
		Contacto c = new Contacto("Cardenas", telef, 98);

		c.imprimir();

	}

}
