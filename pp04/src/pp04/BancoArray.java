package pp04;

public class BancoArray {
	private Conta[] contas;
	private int indice = 0;
	private double taxa = 1.0;

	public BancoArray() {
		contas = new Conta[100];
	}

	public void cadastrar(Conta conta) {
		contas[indice] = conta;
		indice++;
	}

	public Conta procurar(String numero) {
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				return contas[i];
			}
		}
		return null;
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
		if (conta != null) {
			return conta.getSaldo();
		} else {
			System.out.println("Conta Inexistente!");
		}
		return 0;
	}

	public void transferir(String origem, String destino, double valor) {
		Conta contaOrigem;
		contaOrigem = procurar(origem);
		if (contaOrigem != null) {
			Conta contaDestino;
			contaDestino = procurar(destino);
			if (contaDestino != null) {
				if (contaOrigem.getSaldo() > valor) {
					contaOrigem.debitar(valor);
					contaDestino.creditar(valor);
				} else {
					System.out.println("Saldo Insuficiente!");
				}
			} else {
				System.out.println("Conta Destino n� " + destino + " Inexistente!");
			}
		} else {
			System.out.println("Conta Origem n� " + origem + " Inexistente!");
		}
	}

	void renderJuros(String numero) {
		Conta conta;
		conta = procurar(numero);
		if (conta != null) {
			if (conta instanceof ContaPoupanca) {
				((ContaPoupanca) conta).renderJuros(this.taxa);
			} else {
				System.out.println("Esta n�o � uma Conta Poupan�a!");
			}
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	void renderBonus(String numero) {
		Conta conta;
		conta = procurar(numero);
		if (conta != null) {
			if (conta instanceof ContaEspecial) {
				((ContaEspecial) conta).renderBonus();
			} else {
				System.out.println("Esta n�o � uma Conta Especial!");
			}
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	public void setTaxa(double valor) {
		this.taxa = valor;
	}

	public double getTaxa() {
		return this.taxa;
	}
}