package lista_05;
public class Exercicio03 {

	
	
	public static void main(String args[]) {
		
		int entradaDias = 396;
		
		System.out.println(idadeEmAnos(entradaDias));
		
		
		
		
	}
	
	
	
	public static String idadeEmAnos(int valor) {
		
		
		int idadeAnos = valor / 365;
		int restoAnos =  valor % 365;
		int idadeMeses = restoAnos / 30; 
		int idadeDias = restoAnos % 30;
		
		return ("Sua idade é "+idadeAnos+(idadeAnos > 1 ? " anos ":" ano ")
				+idadeMeses+(idadeMeses > 1 ? " meses ":" mes ")
				+"e "+idadeDias+(idadeDias > 1 ? " dias. ": " dia. "));
		
	}

	
	
	
	
}


//(03) Escreva uma função para receber a idade de uma pessoa expressa em dias
//e retorne ela expressa em anos, meses e dias (considerar o ano com 365 dias e o mês com 30 dias).
