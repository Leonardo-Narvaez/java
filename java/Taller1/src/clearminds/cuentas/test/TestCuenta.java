package clearminds.cuentas.test;

import clearminds.cuentas.*;

public class TestCuenta {

	public static void main(String[] args) {
//---------------------Inicio Cuentas 1,2 y 3---------------------------
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);

		Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		System.out.println("-------Valores Iniciales-------");
		cuenta1.Imprimir();
		System.out.println("<><><><><><><><><><><><><>");
		cuenta2.Imprimir();
		System.out.println("<><><><><><><><><><><><><>");
		cuenta3.Imprimir();

		System.out.println("-------Valores Modificados-------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");

		cuenta1.Imprimir();
		System.out.println("<><><><><><><><><><><><><>");
		cuenta2.Imprimir();
		System.out.println("<><><><><><><><><><><><><>");
		cuenta3.Imprimir();
//--------------------Fin cuentas 1, 2 y 3-----------------------------------
		
//--------------Inicio cuentas 4,5 y 6-----------------------------------
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		Cuenta cuenta6 = new Cuenta("0666");
		
		System.out.println("<><><><><><><><><><><><><>");
		cuenta4.ImprimirConMiEstilo();
		System.out.println("<><><><><><><><><><><><><>");
		cuenta5.ImprimirConMiEstilo();
		System.out.println("<><><><><><><><><><><><><>");
		cuenta6.ImprimirConMiEstilo();
	}

}
