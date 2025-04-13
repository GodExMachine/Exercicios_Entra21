package lista_02;

	
import java.util.Scanner;

public class Exercicio07
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Exercicio 07 lista 02--\033[0m");
	    
	    System.out.print("Informa a idade do nadador. ");
	    int idadeNadador = leitor.nextInt();
	    
	    leitor.close();
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		    
	    if(idadeNadador >= 5 && idadeNadador <= 7) {
	    	System.out.print("O nadador informado é da categoria Infatil A. ");
	    }
	    
	    if(idadeNadador >= 8 && idadeNadador <= 10) {
	    	System.out.print("O nadador informado é da categoria Infatil B. ");
	    }
	    
	    if(idadeNadador >= 11 && idadeNadador <= 13) {
	    	System.out.print("O nadador informado é da categoria Juvenil A. ");
	    }
	    
	    if(idadeNadador >= 14 && idadeNadador <= 17) {
	    	System.out.print("O nadador informado é da categoria Juvenil B. ");
	    }
	    
	    if(idadeNadador >= 18) {
	    	System.out.print("O nadador informado é da categoria Adulto. ");
	    }
	   
	   
	}
}

/*

(07) Escreva um algoritmo para ler a idade de um nadador e classificá-lo em uma das seguintes categorias:

	Infantil A = 5-7 anos

        Infantil B = 8-10 anos

        Juvenil A = 11-13 anos

        Juvenil B = 14-17 anos

        Adulto = maiores de 18 anos


 */