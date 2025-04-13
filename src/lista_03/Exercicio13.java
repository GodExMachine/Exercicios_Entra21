package lista_03;
import java.util.Scanner;

public class Exercicio13 {

	public static void main (String args[]) {

		System.out.println("\033[1;36m-- Lista 03 Exerciocio 13--\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("");
		
		int candidato01 = 0;
		int candidato02 = 0;
		int candidato03 = 0;
		int candidato04 = 0;
		int votoNulo = 0;
		int votoEmBranco =0;
		boolean encerrarVotos = true;
		
		

		while(encerrarVotos) {
			
			System.out.print("Informe o seu Voto: ");
			int voto = leitor.nextInt();	
			
			switch(voto){
				
				case 0 :
					encerrarVotos = false;
					break;
					
				case 1:
					candidato01 += 1;
					break;
					
				case 2:
					candidato02 += 1;
					break;
					
				case 3:
					candidato03 += 1;
					break;
					
				case 4:
					candidato04 += 1;
					break;
					
				case 5:
					votoNulo += 1;
					break;
					
				case 6:
					votoEmBranco += 1;
					break;
				
			}
			
		}
		
		leitor.close();
		
		
		System.out.println("\n"+"\033[1;32m-- RESULTADO--\033[0m");
		System.out.println("Total de votos candidato 1: "+candidato01);
		System.out.println("Total de votos candidato 2: "+candidato02);	
		System.out.println("Total de votos candidato 3: "+candidato03);
		System.out.println("Total de votos candidato 4: "+candidato04);
		System.out.println("Total de votos nulos: "+votoNulo);
		System.out.println("Total de votos em branco: "+votoEmBranco);
		
		
	}
	
}



//
//(13) Em uma eleição presidencial existem quatro candidatos.
//Os votos são informados através de códigos. 
//Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:  
//
//	 1,2,3,4 = voto para os respectivos candidatos;
//
//	 5 = voto nulo;
//
//	 6 = voto em branco;


//
//Escreva um algoritmo para ler o código do candidato em um voto. Calcular e escrever:
//
//    - total de votos para cada candidato;
//
//    - total de votos nulos;
//
//    - total de votos em branco;
//
//Como finalizador do conjunto de votos, tem-se o valor 0.