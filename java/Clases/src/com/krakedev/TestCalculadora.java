package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora funcionS = new Calculadora();
		double resultadoMul = funcionS.multiplicar(10, 5);
		double resultadoDiv = funcionS.dividir(10, 2);
		double resultadoProm = funcionS.promediar(10, 8, 9);
		System.out.println("Multiplicación: "+resultadoMul);
		System.out.println("X_X_X_X__XX__XX__X_X_X_XX_");
		System.out.println("División: "+resultadoDiv);
		System.out.println("X_X_X_X__XX__XX__X_X_X_XX_");
		System.out.println("Promedio: "+resultadoProm);
		System.out.println("X_X_X_X__XX__XX__X_X_X_XX_");
		funcionS.mostrarResultado();
	}

}
