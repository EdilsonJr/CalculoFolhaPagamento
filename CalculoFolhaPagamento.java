public class CalculoFolhaPagamento {

	 private int horas_trabalhadas;
	 private double salario_hora;
	 private int dependentes;
	 private double salario_bruto;
	 private double inss;
	 private double ir;
	 private double salario_liquido;
	 
	public CalculoFolhaPagamento(int horas_trabalhadas, double salario_hora, int dependentes) {
			this.horas_trabalhadas = horas_trabalhadas;
			this.salario_hora = salario_hora;
			this.dependentes = dependentes;
		}
	
		
	public double calculoSalarioBruto() {
		return salario_bruto = horas_trabalhadas * salario_hora + (50 * dependentes);
	}
	public double calculoDescontoInss() {
		if(salario_bruto > 1000 ) {
			return inss = salario_bruto * 9/100;
		}
		else {
			return inss = salario_bruto * 8.5/100;
		}
	}
	public double calculoImpostoRenda() {
		if(salario_bruto <= 500 ) { 
			return ir = 0;
		}
		else if(salario_bruto > 1000) {
			return ir = salario_bruto * 7/100;
		}
		
		else {
			return ir = salario_bruto * 5/100;
		}
	}
	public double calculoSalarioLiquido() {
		return salario_liquido = salario_bruto - inss - ir;
	}
}

