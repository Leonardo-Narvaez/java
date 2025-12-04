package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validador = new Validacion();
		validador.validarMonto(9);
		validador.validarMonto(0);
		validador.validarMonto(-6);
		validador.validarMonto(2);
	}

}
