package lista_01;

	
import java.util.Scanner;

public class Exercicio09
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe o preço de fabrica do carro ");
	    int precoDeFabrica = leitor.nextInt();
	    
	    leitor.close();
	    
	    float precoDoConsumidor = precoDeFabrica + ((precoDeFabrica * 28 ) / 100) + ((precoDeFabrica * 45) / 100);
	    
	    
	    
	    System.out.print("O preço final do carro para o consumidor é de R$");
	    System.out.printf("%.2f",precoDoConsumidor);
	    
	}
}