package lista_05;
public class Exercicio08 {

	public static void main(String args[]) {

//		System.out.println(verificaPerfeito(6));
//		System.out.println(verificaPerfeito(28));
//		System.out.println(verificaPerfeito(496));
//		System.out.println(verificaPerfeito(497));
		
		
		System.out.println(proximoPerfeito(6));
		
		
		
	}

	public static int proximoPerfeito(int valor) {

		
		
		do{
		
			valor++;
		
		
		}while(!verificaPerfeito(valor));
		
		return valor;
	}

	
	public static boolean verificaPerfeito(int valor) {

		int soma = 0;

		for (int i = 1; i < valor; i++) {

			if (valor % i == 0) {

				soma += i;

			}

		}

		if (soma == valor) {
			return true;

		}

		return false;
	}
	
	

}

//(08) Escreva uma função para receber um número inteiro 
//e positivo e retornar qual o próximo número perfeito a partir dele.
