package polimorfismo;

import java.util.List;

public class Vendedor extends Funcionario {
	float percentualComissao = 0.1f; // Valor arbitrário
	List<Venda> vendas; // Atributo novo
	
	public float calculaSalario(int mes, int ano) {
		float acumulado = 0.0f;
		
		for(Venda venda: vendas) {
			if (venda.mes == mes && venda.ano == ano)
				acumulado += venda.produto.valor * this.percentualComissao;
		}
		
		return acumulado + this.salarioBase;
	}
	
}
