package polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f = new Secretaria();
		
		f.matricula = 1;
		f.anoContratacao = 2012;
		f.mesContratacao = 1;
		f.salarioBase = 2500.00f;
		f.nome = "Secretária Madden";
		
		// ===============
		
		Vendedor f1 = new Vendedor();
		f1.matricula = 2;
		f1.anoContratacao = 2013;
		f1.mesContratacao = 1;
		f1.salarioBase = 2000.00f;
		f1.nome = "Vendedor Stevão";
		
		Vendedor f2 = new Vendedor();
		f2.matricula = 3;
		f2.anoContratacao = 2013;
		f2.mesContratacao = 1;
		f2.salarioBase = 1000.00f;
		f2.nome = "Vendedor Kefas";
		
		Produto p1 = new Produto(1, 20.0f);
		
		Venda v1 = new Venda(f1, p1, 8, 2014);
		Venda v2 = new Venda(f1, p1, 8, 2014);
		Venda v3 = new Venda(f2, p1, 8, 2014);
		
		Financeiro financeiro = new Financeiro();
		financeiro.vendas.add(v1);
		financeiro.vendas.add(v2);
		financeiro.vendas.add(v3);
		
		f1.vendas = financeiro.getVendasDeFuncionario(f1);
		f2.vendas = financeiro.getVendasDeFuncionario(f2);
		
		Empresa empresa = new Empresa();
		empresa.funcionarios.add(f);
		empresa.funcionarios.add(f1);
		empresa.funcionarios.add(f2);
		
		System.out.println("Salario de " + f1.nome + ": " + f1.calculaSalario(8, 2014));
		System.out.println("Salario de " + f2.nome + ": " + f2.calculaSalario(8, 2014));
		
		empresa.calculaValorFolhaPgto();
	}

}

