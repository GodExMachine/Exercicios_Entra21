package lista_01;

	
import java.util.Scanner;

public class Exercicio01
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe a altura do retagulo ");
	    float altura = leitor.nextFloat();
	    
	    System.out.print("informe a largura do retangulo ");
	    float base= leitor.nextFloat();
	    
	    leitor.close();

	    float areaRetangulo = altura * base;
	    
	    System.out.println("A area do retangulo é de: "+areaRetangulo);
	    
	}
}