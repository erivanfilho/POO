package pp02;

import java.lang.Math;

public class Calculadora {
	private double resultado;

	public Calculadora() {
		resultado = 0;
	}

	public double adicionar(double operandoA, double operandoB) {
		return resultado = operandoA + operandoB;
	}

	public double subtrair(double operandoA, double operandoB) {
		return resultado = operandoA - operandoB;
	}

	public double multiplicar(double operandoA, double operandoB) {
		return resultado = operandoA * operandoB;
	}

	public double dividir(double operandoA, double operandoB) {
		return resultado = operandoA / operandoB;
	}

	public double potencia(double base, int expoente) {
		return resultado = Math.pow(base, expoente);
	}

	public double raiz(double radicando) {
		return resultado = Math.sqrt(radicando);
	}

	public double seno(double angulo) {
		return resultado = Math.sin(angulo);
	}

	public double cosseno(double angulo) {
		return resultado = Math.cos(angulo);
	}

	public double tangente(double angulo) {
		return resultado = Math.tan(angulo);
	}
}