package lista_05;

public class Exercicio06_v2 {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		System.out.println(fatoriaCorespondente(4,120));
		
		
	}



	public static boolean fatoriaCorespondente(int valor, int teste) {
		
		
		return calcularFatorial(valor) == teste;
		
		
	}
	
	
	
	
	
	
	

	public static long calcularFatorial(int numero) {

		if (numero == 0 || numero == 1) {
			return 1;
		}

		return numero * calcularFatorial(numero - 1);

	}

}