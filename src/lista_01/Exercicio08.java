package lista_01;

	
import java.util.Scanner;

public class Exercicio08
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe o total de eleitores ");
	    int totalEleitores = leitor.nextInt();
	    
	    System.out.print("informe o numero de votos em branco ");    
	    int votosEmBranco= leitor.nextInt();

	    System.out.print("informe o numero de votos nulos ");    
	    int votosNulos= leitor.nextInt();
	        
	    leitor.close();
	    
	    int votosValidos = totalEleitores - (votosEmBranco+votosNulos);
	    	
	   
	    float percentualValidos = (votosValidos * 100) / totalEleitores;
	    
	    float percentualNulos = (votosNulos * 100) / totalEleitores;
	    
	    float percentualEmBranco =  (votosEmBranco * 100 ) / totalEleitores;
	    
	    
	    System.out.printf("\n %.1f%% de votos validos.", percentualValidos);
	  	System.out.printf("\n %.1f%% de votos em branco.", percentualEmBranco);
	    System.out.printf("\n %.1f%% de votos nulos.", percentualNulos);
	    
	}
}