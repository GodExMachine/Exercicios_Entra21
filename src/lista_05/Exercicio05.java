package lista_05;
public class Exercicio05 {

	
	
	public static void main(String args[]) {
		
		
		int qtdVendas = 5;
		float valorVendas = 100f;
		float salarioFixo = 1000f;
		float comissaoPorVenda = 100f;
		
	
		System.out.printf("%.2f",calculaSalario(qtdVendas,valorVendas,salarioFixo,comissaoPorVenda));
		
		
	}
	
	
	
	public static float calculaSalario(int qtdVendas, float valorVendas ,float salarioFixo , float comissaoPorVenda ) {
		
		float salario = valorVendas * 0.05f;
		
		salario += comissaoPorVenda * qtdVendas;
		
		salario += salarioFixo;

		return salario;
	}
	

}	
	



//(05) Uma revendedora de carros usados paga a seus funcionários 
//um salário fixo por mês,
//mais uma comissão em reais para cada carro vendido 
//e mais 5% do valor das vendas por ele efetuadas.

//Escreva uma função para receber 
//o número de carros vendidos por um vendedor, 
//o valor total de suas vendas,
//o salário fixo 
//e o valor que ele recebe por carro vendido. 

//Calcule e retorne o salário final do vendedor.
