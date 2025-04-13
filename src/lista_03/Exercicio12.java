package lista_03;
import java.util.Scanner;

public class Exercicio12 {
			
	public static void main (String Args[]) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 12--\033[0m");
		
		
		int filhos = 0;
		int totalFilhos = 0;
		int totalHabitantes = 0;
		int salarioBaixo =0;
		float salario = 0.00f;
		float totalSalarios = 0.00f;
		float maiorSalario = 0.00f;
		
		
		
		while(true){
				
			System.out.print("Informe o salario do cidadão: ");
			salario = leitor.nextInt();
			
			if(salario < 0) {
				break;
			}
			
			if(maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if(salario <= 100.00f) {
				salarioBaixo++;
			}
			
			totalSalarios += salario;
					
			System.out.print("Informe a quantidade de filhos: ");
			filhos = leitor.nextInt();
			totalFilhos += filhos;
			
		
			
			totalHabitantes++;			
		}
		
		leitor.close();
		
		float mediaFilhos = totalFilhos / totalHabitantes;
		float mediaSalarios = totalSalarios / totalHabitantes;
		float percentualBaixos = (salarioBaixo * 100.0f) / totalHabitantes;
		
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
		System.out.printf("O maior salário é: R$%.2f",maiorSalario);
		
		System.out.printf("\nA média dos salarios é: R$%.2f",mediaSalarios);
		
		System.out.printf("\nA média de filhos por habitante é: %.1f",mediaFilhos);
		
		System.out.printf("\nO percentual de pessoa com salario de até R$100,00 é de: %.2f",percentualBaixos);
		System.out.print("%");
		
		
		
	}
	
}

//(12) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes.
// Escreva um algoritmo para ler o salário e número de filhos dos habitantes e escrever:  
//
//	a) média do salário da população;
//
//	b) média do número de filhos;
//
//	c) maior salário;
//
//	d) percentual de pessoas com salário até R$ 100,00.
//
//O final da leitura de dados dar-se-á com a entrada de um salário negativo