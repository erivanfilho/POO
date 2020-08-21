package pp02;

import java.util.Scanner;

class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha a opção desejada:\n 1) Testa Calculadora\n 2) Testa Conta \n 3) Testa Banco");
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			testaCalculadora();
			break;

		case 2:
			testaConta();
			break;

		case 3:
			testaBanco();
			break;

		default:
			System.out.println("Opção inexistente!");
			break;
		}
	}

	public static void testaCalculadora() {
		Calculadora calculadora;
		calculadora = new Calculadora();
		System.out.printf("add: %.1f\n", calculadora.adicionar(10, 5));
		System.out.printf("sub: %.1f\n", calculadora.subtrair(10, 5));
		System.out.printf("mult: %.1f\n", calculadora.multiplicar(10, 5));
		System.out.printf("div: %.1f\n", calculadora.dividir(10, 5));
		System.out.printf("pot: %.1f\n", calculadora.potencia(2, 5));
		System.out.printf("raiz: %.1f\n", calculadora.raiz(9));
		System.out.printf("sen: %.2f\n", calculadora.seno(10));
		System.out.printf("cos: %.2f\n", calculadora.cosseno(10));
		System.out.printf("tan: %.2f\n", calculadora.tangente(10));
	}

	public static void testaConta() {
		Conta conta;
		conta = new Conta("21.342-7");
		conta.creditar(500.87);
		conta.debitar(45.00);
		System.out.println("número: " + conta.getNumero());
		System.out.printf("saldo: %.2f\n", conta.getSaldo());
	}

	public static void testaBanco() {
		Banco banco;
		banco = new Banco();
		Conta conta;
		conta = new Conta("111-2");
		Conta conta2;
		conta2 = new Conta("21.342-7");

		banco.cadastrar(conta);
		banco.cadastrar(conta2);
		banco.procurar("111-2");
		banco.procurar("21.342-7");
		System.out.printf("saldo conta 1: %.2f\n", banco.saldo("111-2"));
		System.out.printf("saldo conta 2: %.2f\n", banco.saldo("21.342-7"));
		banco.creditar("21.342-7", 1000.00);
		banco.creditar("111-2", 1000.00);
		banco.debitar("21.342-7", 5.75);
		banco.debitar("111-2", 200.00);
		System.out.printf("saldo conta 1: %.2f\n", banco.saldo("111-2"));
		System.out.printf("saldo conta 2: %.2f\n", banco.saldo("21.342-7"));
		banco.transferir("21.342-7", "111-2", 50.00);
		System.out.printf("saldo conta 1: %.2f\n", banco.saldo("111-2"));
		System.out.printf("saldo conta 2: %.2f\n", banco.saldo("21.342-7"));
	}

}