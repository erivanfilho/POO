package pp03;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha a opção desejada:\n 1) Testa BancoVector\n 2) Testa BancoArray");
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			testaBancoVector();
			break;

		case 2:
			testaBancoArray();
			break;

		default:
			System.out.println("Opção inexistente!");
			break;
		}
	}

	public static void testaBancoVector() {
		/* criando o banco vector */
		BancoVector banco = new BancoVector();

		/* criando uma conta comum */
		Conta conta1 = new Conta("0001");
		Conta conta2 = new Conta("0002");
		/* criando uma conta poupança */
		Conta conta3 = new ContaPoupanca("0003");

		/* cadastrando a conta no array */
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.cadastrar(conta3);

		/* testando o método procurar */
		banco.procurar("0001");
		banco.procurar("0002");
		banco.procurar("0003");
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método creditar */
		System.out.printf("CREDITAR\n");
		banco.creditar("0001", 1000.00);
		banco.creditar("0002", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método debitar */
		System.out.printf("DEBITAR\n");
		banco.debitar("0001", 1.00);
		banco.debitar("0002", 5.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método transferir */
		System.out.printf("TRANSFERIR\n");
		banco.transferir("0001", "0002", 49.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método render juros */
		System.out.printf("RENDER JUROS\n");
		banco.creditar("0003", 875.32);
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor inicial */
		banco.setTaxa(0.01); /* atribuindo um valor de taxa de juros */
		System.out.printf("taxa atual: %.2f\n", banco.getTaxa()); /* recuperando o valor da taxa de juros */
		banco.renderJuros("0003");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor após o método */
	}

	public static void testaBancoArray() {
		/* criando o banco array */
		BancoArray banco = new BancoArray();

		/* criando uma conta comum */
		Conta conta1 = new Conta("0001");
		Conta conta2 = new Conta("0002");
		/* criando uma conta poupança */
		Conta conta3 = new ContaPoupanca("0003");

		/* cadastrando a conta no array */
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.cadastrar(conta3);

		/* testando o método procurar */
		banco.procurar("0001");
		banco.procurar("0002");
		banco.procurar("0003");
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método creditar */
		System.out.printf("CREDITAR\n");
		banco.creditar("0001", 1000.00);
		banco.creditar("0002", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método debitar */
		System.out.printf("DEBITAR\n");
		banco.debitar("0001", 1.00);
		banco.debitar("0002", 5.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método transferir */
		System.out.printf("TRANSFERIR\n");
		banco.transferir("0001", "0002", 49.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método render juros */
		System.out.printf("RENDER JUROS\n");
		banco.creditar("0003", 875.32);
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor inicial */
		banco.setTaxa(0.01); /* atribuindo um valor de taxa de juros */
		System.out.printf("taxa atual: %.2f\n", banco.getTaxa()); /* recuperando o valor da taxa de juros */
		banco.renderJuros("0003");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor após o método */
	}
}