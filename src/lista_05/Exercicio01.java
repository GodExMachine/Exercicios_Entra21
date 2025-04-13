package lista_05;
import java.util.Scanner;

public class Exercicio01 {

	
	
	public static void main(String arg[]){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a largura do retangulo: ");
		int valor1 = leitor.nextInt();
		
		System.out.print("Informe a altura do retangulo: ");
		int valor2 = leitor.nextInt();
		
		System.out.println("A Area do reantulo é: "+areaRet(valor1, valor2));
		
		
		leitor.close();
		
	}
	
	
	public static int areaRet(int valor1, int valor2){
		
		
		return valor1 * valor2;
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
}


//(01) Escreva uma função para receber as dimensões de um retângulo (base e altura) 
//e retornar a sua área.
