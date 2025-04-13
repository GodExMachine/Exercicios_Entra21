package lista_05;
import java.util.Scanner;

public class Exercicio02 {

	
	
	public static void main(String arg[]){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		int nota1 = leitor.nextInt();
		
		System.out.print("Informe a segunda nota: ");
		int nota2 = leitor.nextInt();
		
		System.out.print("Informe a terceira nota: ");
		int nota3 = leitor.nextInt();
		
		leitor.close();
		
		System.out.println("A Area do retantulo é: "+mediaPonderada(nota1, nota2,nota3));
		
		
	
	}
	
	
	public static int mediaPonderada(int valor1, int valor2, int valor3){
		
		
		return ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
	
		
		
		
	}
	
}


