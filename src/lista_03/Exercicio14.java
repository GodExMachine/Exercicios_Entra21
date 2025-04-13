package lista_03;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 14--\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		int numeroHabitante = 0;
		int mulheresMenosQueCem = 0;
		int menorIdade = 0;
		int maiorIdade = 0;
		float mediaSalarios = 0.00f;
		
		while(true){
			
			numeroHabitante++;
			System.out.println("\nDados do "+numeroHabitante+"º habitante");
			
			System.out.print("Informe a idade : ");
			int idade = leitor.nextInt();
			
			if(idade < 0) {
				numeroHabitante--;
				break;
			}
			
			maiorIdade = idade > maiorIdade || numeroHabitante == 1 ? idade : maiorIdade;
			menorIdade = idade < menorIdade || numeroHabitante == 1 ? idade : menorIdade;
			
			System.out.print("Informe o genero (m/f) : ");
			String genero = leitor.next();
		
			System.out.print("Informe o salario : ");
			float salario = leitor.nextFloat();
			
			mediaSalarios+= salario;
			
			if(genero.equalsIgnoreCase("f") && salario < 100){
				mulheresMenosQueCem++;
			}
	
						
		}	
		
		leitor.close();
		
		mediaSalarios /= numeroHabitante;
		
		
		System.out.println("\n"+"\033[1;32m-- RESULTADO--\033[0m");
		System.out.println("\033[1;36mA maior idade é: "+maiorIdade);
		System.out.println("\033[1;31mA menor idade é: "+menorIdade);
		System.out.println("\033[0;33mA média salarial da populção: "+mediaSalarios+"\033[0m");
		System.out.println("\033[1;38;5;162mMulheres com salarios menor que R$ 100,00 : "+mulheresMenosQueCem+"\033[0m");
		System.out.print("");
		 
		
		
		
		
	}
	
}

/*
(14) ]
Foi feita uma pesquisa entre os habitantes de uma região. 
Escreva um algoritmo para ler 
idade, 
sexo (m/f) 
e salário dos habitantes.
 
Calcular e escrever:

	a) a média de salário da população;

	b) maior e menor idade da população;

	c) quantidade de mulheres com salário até R$ 100,00.

Encerre a entrada de dados quando for digitada uma idade negativa.

*/