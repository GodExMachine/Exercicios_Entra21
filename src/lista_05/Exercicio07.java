package lista_05;
public class Exercicio07 {


	public static void main(String args[]) {
		
		

		System.out.printf("%.10f",testeValorE(10));

		//System.out.println(verificaFatorial(5));
		
		
		
	}
	

	public static float testeValorE(int valor) {

		float resultado = 1.0f;
		
		for(int i = 1 ; i < valor; i ++) {
			
			resultado += 1.0f / verificaFatorial(i);
			
		}
			

	
	
		return resultado;
	}
	
	
	
	

	public static int verificaFatorial(int valor ) {
		
		int fatorial = 1;
		
		for(int i = 0; i < valor; i++) {
			
			 fatorial += fatorial * i;
		}
		
		return fatorial;
		
	}
	
	
	
}	




//(07) Escreva uma função para receber um um valor N inteiro e positivo 
//e retornar o valor de E:  

//	E = 1 + (1 / 1!) +( 1 / 2!) + 1 / 3! + ... + 1 / N!

// 1/

