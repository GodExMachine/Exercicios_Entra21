package lista_05;
public class Exercicio04 {

	
	
	public static void main(String args[]) {
		
		float custoDeFab = 100.00f;
		
		
		System.out.printf("%.2f",custoFinal(custoDeFab));
		
		
	}
	
	
	
	public static float custoFinal(float valor) {
		
		
			
		return valor += (valor * 0.28f) + (valor * 0.45f);
		
	}
	

	
	
	
	
}

//(04) O custo ao consumidor de um carro novo é
//a soma do custo de fábrica com o percentual do distribuidor e dos impostos (aplicados ao custo de fábrica). 
//O percentual do distribuidor é de 28% e os impostos de 45%. 

//Escreva uma função para receber o custo de fábrica de um carro e retornar o custo ao consumidor.
