package lista_03;
import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 19 --\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		int resultado = 0;
		int numeroHabitante = 0;
		int maiorIdade = 0;
		
		while(true) {
			
			numeroHabitante++;
			System.out.println("\n"+"\033[1;33mDados do "+numeroHabitante+"º Habitante.\033[0m");

			
			System.out.print("Informe a idade:  ");
			int idade = leitor.nextInt();
			
			if(idade <0) {
				break;
			}
			
			maiorIdade = idade > maiorIdade ? idade : maiorIdade;
			
			System.out.print("Informe o genero (m/f): ");
			String genero = leitor.next();
			
			boolean ehFeminino = false;
			
			if(genero.equalsIgnoreCase("f")) {
				ehFeminino = true;
			}
				
			System.out.print("Informe a cor dos olhos: ");
			String corOlho = leitor.next();
			
			System.out.print("Informe a cor dos cabelos: ");
			String corCabelo = leitor.next();
	
		
			if(ehFeminino && corOlho.equalsIgnoreCase("verdes") && corCabelo.equalsIgnoreCase("loiros") && idade >= 18 && idade <= 35) {
				resultado++;
			}
		
		}
		
		leitor.close();
		
		System.out.println("\n"+"\033[1;32m-- RESULTADO --\033[0m");		
		System.out.println("Mulheres com idade entre 18 e 35 de olhos verdes e cabelos loiros: "+resultado); 
		System.out.println("A maior idade registrada: "+maiorIdade);
		System.out.println("\n"+"\033[41m-- SISTEMA ENCERRADO --\033[0m");
		
		
	}
	
}

/*
  (19) Foi realizada uma pesquisa de algumas características físicas da população de uma certa região, a qual coletou os seguintes dados referentes a cada habitante para serem analisados:  

		- sexo (masculino e feminino)

		- cor dos olhos (azuis, verdes ou castanhos)

		- cor dos cabelos (loiros, castanhos ou pretos)

		- idade  

	Escreva um algoritmo para ler as informações supracitadas. Calcular e escrever:   

		- a maior idade dos habitantes

		- a quantidade de indivíduos do sexo feminino 
		cuja idade está entre 18 e 35
		 anos e que tenham olhos verdes 
		 e cabelos loiros.

	Encerre a entrada de dados quando for digitada uma idade negativa.



 */
