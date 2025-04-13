package lista_01;

	
import java.util.Scanner;

public class Exercicio05
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe quantidade de anos ");
	    int idadeAnos = leitor.nextInt();
	    
	    System.out.print("informe quantidade em meses ");
	    int idadeMeses = leitor.nextInt();
	    
	    System.out.print("informe quantidade em dias ");
	    int idadeDias = leitor.nextInt();
	    
	    leitor.close();
	    
	    int anosParaDias = (idadeAnos * 365) + (idadeMeses) + idadeDias;
	    
	    System.out.print("Sua idade em dias é: "+anosParaDias);
	    
	    
	}
}