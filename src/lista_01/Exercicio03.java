package lista_01;

	
import java.util.Scanner;

public class Exercicio03
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe a nota com peso 2 ");
	    float nota01 = leitor.nextFloat();
	    
	    System.out.print("informe a nota com peso 3 ");
	    float nota02 = leitor.nextFloat();
	    
	    System.out.print("informe a nota com peso 5 ");
	    float nota03 = leitor.nextFloat();
	    
	    leitor.close();
	    
	    float mediaFinal = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5))  / (2+3+5) ;
	    
	    
	    System.out.println("A Média final é de: "+mediaFinal);
	    
	}
}