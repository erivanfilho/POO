package pp05;

import java.util.Vector;

public class BancoVector {
	private Vector<ContaAbstrata> contas;
	private double taxa = 1.0;

	public BancoVector() {
		contas = new Vector<ContaAbstrata>();
	}

	public void cadastrar(ContaAbstrata conta) {
		contas.add(conta);
	}

	public ContaAbstrata procurar(String numero) {
		for (ContaAbstrata conta : contas) {
			if (conta.getNumero().equals(numero)) {
				return conta;
			}
		}
		return null;
	}

	public void creditar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		if (conta != null) {
			conta.creditar(valor);
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	public void debitar(String numero, double valor) {
		ContaAbstrata conta = procurar(numero);
		if (conta != null) {
			conta.debitar(valor);
		} else {
			System.out.println("Conta Inexistente!");
		}
	}

	public double saldo(String numero) {
		ContaAbstrata conta = procurar(numero);
		if (conta != null) {
			return conta.getSaldo();
		} else {
			System.out.println("Conta Inexistente!");
		}
		return 0;
	}

	public void transferir(String origem, String destino, double valor) {
		ContaAbstrata contaOrigem = procurar(origem);
		if (contaOrigem != null) {
			ContaAbstrata contaDestino = procurar(destino);
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
		ContaAbstrata conta = procurar(numero);
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
		ContaAbstrata conta = procurar(numero);
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

	void setTaxa(double valor) {
		this.taxa = valor;
	}

	public double getTaxa() {
		return this.taxa;
	}
}
