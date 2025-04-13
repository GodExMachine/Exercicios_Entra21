package lista_01;

	
import java.util.Scanner;

public class Exercicio10
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("Informe o numero de carros vendidos ");
	   	int numDeCarros = leitor.nextInt();
	    
	    System.out.print("Informe o valor recebido por carro vendido ");
	    float valorPorCarro = leitor.nextFloat();
	    
	    System.out.print("Informe o salario fixo ");
	    float salarioFixo = leitor.nextFloat();
	    
	    System.out.print("Informe o total de vendas ");
	    float totalDeVendas = leitor.nextFloat();

	    leitor.close();
	    
	    
	    
	    
	    float comissaoTotal = (numDeCarros * valorPorCarro) + ((totalDeVendas * 100) / 5 );
	    
	
	    	
	    double salarioFinal = salarioFixo + comissaoTotal;
	    
	    
	    System.out.print("O salario final é de R$");
	    System.out.printf("%.2f",salarioFinal);
	    
	}
}


//ler o número de carros vendidos por um vendedor,
//o valor total de suas vendas, x <-- seria o valor por carro x o total de carros
//o salário fixo e x
//o valor que ele recebe por carro vendido. (valor do carro * 5% 
//Calcule e escreva o salário final do vendedor.