package polimorfismo;

import java.time.LocalDate;
import java.time.Period;

public class Secretaria extends Funcionario {
	
	float bonus = 0.05f;
	
	// Parametros Mes e Ano são passados em relação a data atual
	public float calculaSalario(int mes, int ano) {
		
		LocalDate atual = LocalDate.of(ano, mes, 1);
		LocalDate contratado = LocalDate.of(this.anoContratacao, this.mesContratacao, 1);
		Period p = Period.between(contratado, atual);
		
		return (this.bonus*((int)(Math.min(p.getYears(), 10))/2)+1.00f)*this.salarioBase;
	}
}
