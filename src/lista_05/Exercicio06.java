package lista_05;
public class Exercicio06 {


	public static void main(String args[]) {
		
		
		int numero = 5;
		int chute = 120;
		
	
		if(testeFatorial(numero, chute)) {
		System.out.println(chute+" é o fatorial de "+numero);
		}else {
			System.out.println(chute+" não é o fatorial de "+numero);
			
		}
		
		
		
	}
	
	
	
	public static boolean testeFatorial(int valor, int teste ) {
		
		int fatorial = 1;
		
		for(int i = 0; i < valor; i++) {
			
			 fatorial += fatorial * i;
		}
		
		if(fatorial == teste){
			return true;	
		}else {
		
		return false;
		}
		
	}
	

}	



//(06) Escreva uma função para receber dois números inteiros e positivos
//e retornar se o segundo corresponde ao fatorial do primeiro.
