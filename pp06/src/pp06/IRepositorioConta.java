package pp06;

public interface IRepositorioConta {
	public void inserir(ContaAbstrata contas);

	public void remover(String numero);

	public ContaAbstrata procurar(String numero);

	public ContaAbstrata[] listar();
	
	public double total();

	public int tamanho();
}