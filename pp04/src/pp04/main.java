package pp04;

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
		/* criando uma conta especial */
		Conta conta4 = new ContaEspecial("0004");

		/* cadastrando a conta no array */
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.cadastrar(conta3);
		banco.cadastrar(conta4);

		/* testando o método procurar */
		banco.procurar("0001");
		banco.procurar("0002");
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método creditar */
		System.out.printf("\nCREDITAR\n");
		banco.creditar("0001", 1000.00);
		banco.creditar("0002", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método debitar */
		System.out.printf("\nDEBITAR\n");
		banco.debitar("0001", 1.00);
		banco.debitar("0002", 5.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método transferir */
		System.out.printf("\nTRANSFERIR\n");
		banco.transferir("0001", "0002", 49.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método render juros */
		System.out.printf("\nRENDER JUROS\n");
		banco.creditar("0003", 875.32);
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor inicial */
		banco.setTaxa(0.01); /* atribuindo um valor de taxa de juros */
		System.out.printf("taxa atual: %.2f\n", banco.getTaxa()); /* recuperando o valor da taxa de juros */
		banco.renderJuros("0003");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor após renda do juros */

		/* testando o método render bônus */
		System.out.printf("\nRENDER BÔNUS\n");
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004")); /* valor inicial */
		banco.creditar("0004", 1000.00);
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004")); /* crédito adicionado */
		banco.renderBonus("0004");
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004")); /* valor após renda do bônus */
	}

	public static void testaBancoArray() {
		/* criando o banco array */
		BancoArray banco = new BancoArray();

		/* criando uma conta comum */
		Conta conta1 = new Conta("0001");
		Conta conta2 = new Conta("0002");
		/* criando uma conta poupança */
		Conta conta3 = new ContaPoupanca("0003");
		/* criando uma conta especial */
		Conta conta4 = new ContaEspecial("0004");

		/* cadastrando a conta no array */
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.cadastrar(conta3);
		banco.cadastrar(conta4);

		/* testando o método procurar */
		banco.procurar("0001");
		banco.procurar("0002");
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método creditar */
		System.out.printf("\nCREDITAR\n");
		banco.creditar("0001", 1000.00);
		banco.creditar("0002", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método debitar */
		System.out.printf("\nDEBITAR\n");
		banco.debitar("0001", 1.00);
		banco.debitar("0002", 5.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método transferir */
		System.out.printf("\nTRANSFERIR\n");
		banco.transferir("0001", "0002", 49.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002"));

		/* testando o método render juros */
		System.out.printf("\nRENDER JUROS\n");
		banco.creditar("0003", 875.32);
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor inicial */
		banco.setTaxa(0.01); /* atribuindo um valor de taxa de juros */
		System.out.printf("taxa atual: %.2f\n", banco.getTaxa()); /* recuperando o valor da taxa de juros */
		banco.renderJuros("0003");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor após renda do juros */

		/* testando o método render bônus */
		System.out.printf("\nRENDER BÔNUS\n");
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004")); /* valor inicial */
		banco.creditar("0004", 1000.00);
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004")); /* crédito adicionado */
		banco.renderBonus("0004");
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004")); /* valor após renda do bônus */
	}
}