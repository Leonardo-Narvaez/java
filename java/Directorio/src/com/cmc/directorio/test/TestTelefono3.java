package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0964190218", 23);
		Telefono telf2 = new Telefono("movi", "0999999999", 19);
		Telefono telf3 = new Telefono("claro", "0888888888", 90);
		AdminTelefono at = new AdminTelefono();
		int contador = at.contarMovi(telf1, telf2, telf3);

		System.out.println("Hay " + contador + " telefonos con operadora movi");
	}

}
