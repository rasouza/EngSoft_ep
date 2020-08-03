package polimorfismo;
import java.time.LocalDate;
import java.util.*;

public class Empresa {
	List<Funcionario> funcionarios;
	
	public void calculaValorFolhaPgto()
	{
		LocalDate data = LocalDate.now();
		System.out.println("Folha de Pagamento para " + data.getMonthValue() + "/" + data.getYear());
		System.out.println("==================================");
		
		for(Funcionario f: funcionarios) {
			float salario = f.calculaSalario(data.getMonthValue(), data.getYear());
			System.out.println(f.nome + ": R$" + salario);
		}
		
		
	}
	
	public Empresa()
	{
		funcionarios = new ArrayList<Funcionario>();
	}
}
