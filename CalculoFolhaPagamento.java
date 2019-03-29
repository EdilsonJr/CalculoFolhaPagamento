public class CalculoFolhaPagamento {

	 private int horasTrabalhadas;
	 private double salarioHora;
	 private int dependentes;
	 private double salarioBruto;
	 private double inss;
	 private double impostoRenda;
	 private double salarioLiquido;
	 
	public CalculoFolhaPagamento(int horasTrabalhadas, double salarioHora, int dependentes) {
			this.horasTrabalhadas = horasTrabalhadas;
			this.salarioHora = salarioHora;
			this.dependentes = dependentes;
		}
	
		
	public double calculoSalarioBruto() {
		return salarioBruto = horasTrabalhadas * salarioHora + (50 * dependentes);
	}
	public double calculoDescontoInss() {
		if(salarioBruto > 1000 ) {
			return inss = salarioBruto * 9/100;
		}
		else {
			return inss = salarioBruto * 8.5/100;
		}
	}
	public double calculoImpostoRenda() {
		if(salarioBruto <= 500 ) { 
			return impostoRenda = 0;
		}
		else if(salarioBruto > 1000) {
			return impostoRenda = salarioBruto * 7/100;
		}
		
		else {
			return impostoRenda = salarioBruto * 5/100;
		}
	}
	public double calculoSalarioLiquido() {
		return salarioLiquido = salarioBruto - inss - impostoRenda;
	}
}

