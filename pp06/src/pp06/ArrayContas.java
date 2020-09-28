package pp06;

public class ArrayContas implements IRepositorioConta {
	private ContaAbstrata[] contas;
	private int indice = 0;

	public ArrayContas() {
		contas = new ContaAbstrata[100];
	}

	public void inserir(ContaAbstrata conta) {
		contas[indice] = conta;
		indice++;
	}

	public void remover(String numero) {
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				contas[i] = null;
			}
		}
	}

	public ContaAbstrata procurar(String numero) {
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				return contas[i];
			}
		}
		return null;
	}

	public ContaAbstrata[] listar() {
		return contas;
	}

	public double total() {
		double st = 0;
		for (int i = 0; i < indice; i++) {
			st += (contas[i].getSaldo());
		}
		return st;
	}

	public int tamanho() {
		return indice;
	}
}