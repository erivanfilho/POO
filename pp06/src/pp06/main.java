package pp06;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Escolha a opção desejada:\n 1) Testa BancoIndependente\n 2) Testa AuditorBancoGenerico\n 3) Testa Auditoria");
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			testaBancoIndependente();
			break;

		case 2:
			testaAuditorBancoGenerico();
			break;

		case 3:
			testaAuditoria();
			break;

		default:
			System.out.println("Opção inexistente!");
			break;
		}
	}

	public static void testaBancoIndependente() {
		/* BANCO COM CONTAS ARRAY */
		ArrayContas arrayContas = new ArrayContas();
	    BancoIndependente banco = new BancoIndependente(arrayContas);

	    ContaAbstrata conta1 = new Conta("0001");
	    ContaAbstrata conta2 = new ContaEspecial("0002");
	    ContaAbstrata conta3 = new ContaImposto("0003");
	    ContaAbstrata conta4 = new ContaPoupanca("0004");
	    
	    /* testando o método inserir */
	    banco.cadastrar(conta1);
	    banco.cadastrar(conta2);
	    banco.cadastrar(conta3);
	    banco.cadastrar(conta4);
	    
	    /* testando o método procurar */
	    banco.procurar("0001");
	    banco.procurar("0002");
	    banco.procurar("0003");
	    banco.procurar("0004");

	    /* testando o método creditar */
	    banco.creditar("0001", 500.00);
	    banco.creditar("0002", 600.00);
	    banco.creditar("0003", 700.00);
	    banco.creditar("0004", 800.00);
	    
	    /* testando o método listar */
	    System.out.printf("\nCONTAS ARRAY\n");
	    ContaAbstrata[] obj1 = arrayContas.listar();
	    for (ContaAbstrata i : obj1) {
	      if (i != null) {
	        System.out.println(i.getNumero());
	      }
	    } 
	    
	    /* testando o método remover */
	    banco.deletar("0001");
	    
	    System.out.printf("\nCONTAS ARRAY (APÓS TESTAR REMOVER)\n");
	    ContaAbstrata[] obj2 = arrayContas.listar();
	    for (ContaAbstrata i : obj2) {
	      if (i != null) {
	        System.out.println(i.getNumero());
	      }
	    }
		
		/* BANCO COM CONTAS VECTOR */
		VectorContas vectorContas = new VectorContas();
		BancoIndependente banco2 = new BancoIndependente(vectorContas);

		ContaAbstrata conta5 = new Conta("0005");
		ContaAbstrata conta6 = new ContaEspecial("0006");
		ContaAbstrata conta7 = new ContaImposto("0007");
		ContaAbstrata conta8 = new ContaPoupanca("0008");
		
		/* testando o método inserir */
		banco2.cadastrar(conta5);
		banco2.cadastrar(conta6);
		banco2.cadastrar(conta7);
		banco2.cadastrar(conta8);
		
		/* testando o método procurar */
		banco2.procurar("0005");
		banco2.procurar("0006");
		banco2.procurar("0007");
		banco2.procurar("0008");

		/* testando o método creditar */
		banco2.creditar("0005", 500.00);
		banco2.creditar("0006", 600.00);
		banco2.creditar("0007", 700.00);
		banco2.creditar("0008", 800.00);
		
		/* testando o método listar */
		System.out.printf("\nCONTAS VECTOR\n");
		ContaAbstrata[] obj3 = vectorContas.listar();
		for (ContaAbstrata i : obj3) {
			if (i != null) {
				System.out.println(i.getNumero());
			}
		} 
		/* testando o método remover */
		banco2.deletar("0005");
		
		
		System.out.printf("\nCONTAS VECTOR (APÓS TESTAR REMOVER)\n");
		ContaAbstrata[] obj4 = vectorContas.listar();
		for (ContaAbstrata i : obj4) {
			if (i != null) {
				System.out.println(i.getNumero());
			}
		}
	}

	public static void testaAuditorBancoGenerico() {
		ArrayContas arrayContas = new ArrayContas();
		BancoIndependente banco = new BancoIndependente(arrayContas);

		ContaAbstrata contaA = new Conta("000A");
		ContaAbstrata contaB = new Conta("000B");
		ContaAbstrata contaC = new Conta("000C");
		ContaAbstrata contaD = new Conta("000D");

		banco.cadastrar(contaA);
		banco.cadastrar(contaB);
		banco.cadastrar(contaC);
		banco.cadastrar(contaD);

		banco.creditar("000A", 500.00);
		banco.creditar("000B", 600.00);
		banco.creditar("000C", 700.00);
		banco.creditar("000D", 800.00);

		System.out.printf("Número de contas no banco: %d\n", banco.numeroContas());
		System.out.printf("Valor total no banco: %.2f\n", banco.saldoTotal());
		AuditorBancoGenerico auditorBancoGenerico = new AuditorBancoGenerico();
		auditorBancoGenerico.auditar(banco);
	}

	public static void testaAuditoria() {
		BancoArray bancoArray = new BancoArray();
		BancoVector bancoVector = new BancoVector();
		AuditorBancoGenerico auditor = new AuditorBancoGenerico();
		auditor.auditar(bancoArray);
		auditor.auditar(bancoVector);
	}

}