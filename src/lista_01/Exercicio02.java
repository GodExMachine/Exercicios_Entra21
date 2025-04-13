package lista_01;

	
import java.util.Scanner;

public class Exercicio02
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe a primeira nota ");
	    float nota01 = leitor.nextFloat();
	    
	    System.out.print("informe a segunda nota ");
	    float nota02 = leitor.nextFloat();
	    
	    System.out.print("informe a terceira nota ");
	    float nota03 = leitor.nextFloat();
	    
	    leitor.close();
	    
	    float mediaFinal= (nota01 + nota02 + nota03) / 3;
	    
	    
	    System.out.println("A Média final é de: "+mediaFinal);
	    
	}
}