package polimorfismo;
import java.util.*;

public class Financeiro {
	List<Venda> vendas;
	
	public List<Venda> getVendasDeFuncionario(Funcionario f)
	{
		List<Venda> vendasFunc = new ArrayList<Venda>();
		for(Venda venda: vendas) {
			if (venda.vendedor.equals(f))
				vendasFunc.add(venda);
		}
		
		return vendasFunc;
	}
	
	public Financeiro()
	{
		this.vendas = new ArrayList<Venda>();
	}
}
