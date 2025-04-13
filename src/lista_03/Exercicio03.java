package lista_03;
import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 03-\033[0m");
	    
	    Scanner leitor = new Scanner(System.in);
	    
	    int valorEntrada = 0;
	    
	    int resultado = 1;
	    
	    
	    do{
    	    System.out.print("Informe um numero ou digite 0 para finalizar: ");
    	    valorEntrada = leitor.nextInt();
    	    
    	    
    	    if(valorEntrada % 2 == 0 && valorEntrada > 0){
    	        resultado *= valorEntrada;
	        }
	    
	    
	    }while(valorEntrada != 0);
	    
	    leitor.close();
	    
			
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
        System.out.println("O produtorio dos valor indicados é: "+resultado);


	}
}

//(03) Escreva um algoritmo para ler vários números inteiros e positivos
//e calcular o produtório dos números pares. O fim da leitura será indicado pelo número 0.
