package pp06;

import java.util.Vector;

public class VectorContas implements IRepositorioConta {
	private Vector<ContaAbstrata> contas;

	public VectorContas() {
		contas = new Vector<ContaAbstrata>();
	}

	public void inserir(ContaAbstrata conta) {
		contas.add(conta);
	}

	public void remover(String numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero().equals(numero)) {
				contas.remove(i);
			}
		}
	}

	public ContaAbstrata procurar(String numero) {
		for (ContaAbstrata conta : contas) {
			if (conta.getNumero().equals(numero)) {
				return conta;
			}
		}
		return null;

	}

	public ContaAbstrata[] listar() {
		ContaAbstrata[] array = contas.toArray(new ContaAbstrata[contas.size()]);
		return array;
	}

	public double total() {
		double st = 0;
		for (ContaAbstrata conta : contas) {
			st += (conta.getSaldo());
		}
		return st;
	}

	public int tamanho() {
		return contas.size();
	}
}
