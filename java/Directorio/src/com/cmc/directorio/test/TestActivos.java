package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef = new Telefono("claro", "0964190218", 23);
		Contacto c = new Contacto("Cardenas", telef, 98);
		AdminContactos ac = new AdminContactos();
		
		System.out.println("Tiene Whatsapp: " + c.getTelefono().isTieneWhatsapp());
		System.out.println("XCXCXCXCXCXCXCXCXC");
		ac.activarUsuario(c);
		System.out.println("Se encuentra activo: "+c.isActivo());
		

	}

}
