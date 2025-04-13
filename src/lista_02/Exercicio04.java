package lista_02;

	
import java.util.Scanner;

public class Exercicio04
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Exercicio 04 lista 02--\033[0m");
	    
	    System.out.print("Informe hora inicial. ");
	    int horaInicial = leitor.nextInt();
	    
	    System.out.print("Informe hora final. ");
	    int horaFinal = leitor.nextInt();
	    
	    leitor.close();
	   
	    
	    if(horaInicial >= horaFinal) {
	    	horaFinal += 24;
	    }
	    	    
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		    
	    System.out.println("O tempo de jogo é de "+(horaFinal - horaInicial)+" Horas.");
	    
	   
	    
	}
}


/*

(04) Escreva um algoritmo para ler a hora de início de um jogo e a hora do final do jogo (considerando apenas horas inteiras) 
e calcular a duração do jogo em horas,
 sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.


 */