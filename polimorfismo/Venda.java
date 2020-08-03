package polimorfismo;

public class Venda {
	Vendedor vendedor;
	Produto produto;
	int mes;
	int ano;

	public Venda(Vendedor v, Produto p, int m, int a) {
		this.vendedor = v;
		this.produto = p;
		this.mes = m;
		this.ano = a;
	}
}
