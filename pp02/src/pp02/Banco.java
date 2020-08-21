package pp02;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() {
		contas = new Conta[100];
	}

	public void cadastrar(Conta conta) {
		contas[indice] = conta;
		indice++;
	}

	public Conta procurar(String numero) {
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < indice)) {
			if (contas[i].getNumero().equals(numero)) {
				achou = true;
			} else {
				i++;
			}
		}
		if (achou == true) {
			return contas[i];
		} else {
			return null;
		}
	}

	public void creditar(String numero, double valor) {
		Conta conta;
		conta = procurar(numero);
		if (conta != null) {
			conta.creditar(valor);
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	public void debitar(String numero, double valor) {
		Conta conta;
		conta = procurar(numero);
		if (conta != null) {
			conta.debitar(valor);
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	public double saldo(String numero) {
		Conta conta;
		conta = procurar(numero);
		return conta.getSaldo();
	}

	public void transferir(String origem, String destino, double valor) {
		Conta conta1, conta2;
		conta1 = procurar(origem);
		conta2 = procurar(destino);
		conta2.debitar(valor);
		conta1.creditar(valor);
	}
}