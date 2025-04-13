package lista_01;

	
import java.util.Scanner;

public class Exercicio06
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe a temperatura em Fahrenheit ");
	    float temperaturaFahrenheit = leitor.nextFloat();
	    
	    leitor.close();
	    
	    double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8  ;
	    
	
		
	    System.out.printf("%.2f º Celsius", temperaturaCelsius);

	   
	    
	    
	    
	}
}