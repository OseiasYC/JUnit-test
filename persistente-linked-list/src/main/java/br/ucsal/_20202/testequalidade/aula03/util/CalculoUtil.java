package br.ucsal._20202.testequalidade.aula03.util;

public class CalculoUtil {

	public static long calcularFatorial(int n) {
		long fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

}
