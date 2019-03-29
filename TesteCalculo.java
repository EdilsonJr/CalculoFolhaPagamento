public class TesteCalculo {
	public static void main(String[] args) {
		CalculoFolhaPagamento calculosalario = new CalculoFolhaPagamento (40, 150.0, 3);
		System.out.println("Salario Bruto: " +
				calculosalario.calculoSalarioBruto());
		System.out.println("Desconto INSS: " +
				calculosalario.calculoDescontoInss());
		System.out.println("Imposto de Renda: " +
				calculosalario.calculoImpostoRenda());
		System.out.println("Salario Líquido: " +
				calculosalario.calculoSalarioLiquido());
	}
}
