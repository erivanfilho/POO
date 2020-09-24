package pp05;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha a op��o desejada:\n 1) Testa BancoVector\n 2) Testa BancoArray");
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			testaBancoVector();
			break;

		case 2:
			testaBancoArray();
			break;

		default:
			System.out.println("Op��o inexistente!");
			break;
		}
	}

	public static void testaBancoVector() {
		BancoVector banco = new BancoVector();

		ContaAbstrata conta1 = new Conta("0001");
		ContaAbstrata conta2 = new ContaPoupanca("0002");
		ContaAbstrata conta3 = new ContaEspecial("0003");
		ContaAbstrata conta4 = new ContaImposto("0004");

		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.cadastrar(conta3);
		banco.cadastrar(conta4);

		/* testando o m�todo procurar */
		banco.procurar("0001");
		banco.procurar("0004");

		/* testando o m�todo creditar */
		System.out.printf("\nCREDITAR\n");
		banco.creditar("0001", 100.00);
		banco.creditar("0004", 100.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004"));

		/* testando o m�todo debitar sem e com imposto */
		System.out.printf("\nDEBITAR\n");
		banco.debitar("0001", 10.00);
		banco.debitar("0004", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004"));

		/* testando o m�todo transferir */
		System.out.printf("\nTRANSFERIR\n");
		banco.transferir("0001", "0004", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004"));

		/* testando o m�todo render juros */
		System.out.printf("\nRENDER JUROS\n");
		banco.creditar("0002", 875.32);
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002")); /* valor inicial */
		banco.setTaxa(0.01); /* atribuindo um valor de taxa de juros */
		System.out.printf("taxa atual: %.2f\n", banco.getTaxa()); /* recuperando o valor da taxa de juros */
		banco.renderJuros("0002");
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002")); /* valor ap�s renda do juros */

		/* testando o m�todo render b�nus */
		System.out.printf("\nRENDER B�NUS\n");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor inicial */
		banco.creditar("0003", 1000.00);
		System.out.printf("cr�dito adicionado: %.2f\n", banco.saldo("0003")); /* cr�dito adicionado */
		banco.renderBonus("0003");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor ap�s renda do b�nus */

	}

	public static void testaBancoArray() {
		BancoArray banco = new BancoArray();

		ContaAbstrata conta1 = new Conta("0001");
		ContaAbstrata conta2 = new ContaPoupanca("0002");
		ContaAbstrata conta3 = new ContaEspecial("0003");
		ContaAbstrata conta4 = new ContaImposto("0004");

		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		banco.cadastrar(conta3);
		banco.cadastrar(conta4);

		/* testando o m�todo procurar */
		banco.procurar("0001");
		banco.procurar("0004");

		/* testando o m�todo creditar */
		System.out.printf("\nCREDITAR\n");
		banco.creditar("0001", 100.00);
		banco.creditar("0004", 100.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004"));

		/* testando o m�todo debitar sem e com imposto */
		System.out.printf("\nDEBITAR\n");
		banco.debitar("0001", 10.00);
		banco.debitar("0004", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004"));

		/* testando o m�todo transferir */
		System.out.printf("\nTRANSFERIR\n");
		banco.transferir("0001", "0004", 10.00);
		System.out.printf("conta 1 | saldo: %.2f\n", banco.saldo("0001"));
		System.out.printf("conta 4 | saldo: %.2f\n", banco.saldo("0004"));

		/* testando o m�todo render juros */
		System.out.printf("\nRENDER JUROS\n");
		banco.creditar("0002", 875.32);
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002")); /* valor inicial */
		banco.setTaxa(0.01); /* atribuindo um valor de taxa de juros */
		System.out.printf("taxa atual: %.2f\n", banco.getTaxa()); /* recuperando o valor da taxa de juros */
		banco.renderJuros("0002");
		System.out.printf("conta 2 | saldo: %.2f\n", banco.saldo("0002")); /* valor ap�s renda do juros */

		/* testando o m�todo render b�nus */
		System.out.printf("\nRENDER B�NUS\n");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor inicial */
		banco.creditar("0003", 1000.00);
		System.out.printf("cr�dito adicionado: %.2f\n", banco.saldo("0003")); /* cr�dito adicionado */
		banco.renderBonus("0003");
		System.out.printf("conta 3 | saldo: %.2f\n", banco.saldo("0003")); /* valor ap�s renda do b�nus */
	}
}