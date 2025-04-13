package lista_03;
import java.util.Scanner;

public class Exercicio04 {

	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 04-\033[0m");
	    
	    Scanner leitor = new Scanner(System.in);
	    
	    int valorEntrada = 0;
    	int resultado = 0; 
    	
    	int maiorValor = 0;
    	int menorValor = 0;
    	   
    	    
    	 for(int i = 0; i < 10;i++ ){
    	    
    	     System.out.print("Informe o "+(i+1)+"º valor: ");
    	     valorEntrada = leitor.nextInt();
    	     
             resultado += valorEntrada;
 

    	     if(i == 0){
    	         menorValor = valorEntrada;
    	     }
    	     
 	     
    	     if(valorEntrada < maiorValor && valorEntrada < menorValor){
    	         menorValor = valorEntrada;
    	         
    	     }
    	      
    	     if(valorEntrada > maiorValor){
    	         maiorValor = valorEntrada;
    	         
    	     }
    	      
    	      
    	        
    	  }
    	     
    
    	leitor.close();
    	    
    	    
    	 
    	resultado = resultado / 10;
    	 
    	 
			
        System.out.println("\033[1;32m-- RESULTADO--\033[0m");
        System.out.println("O maior valor é: "+maiorValor);
        System.out.println("O menor valor é: "+menorValor);
        System.out.println("A media dos valores é: "+resultado);

	}
}


//(04) Escreva um algoritmo para ler 10 valores inteiros e:  

//	a) encontrar o maior valor;

//	b) encontrar o menor valor;

//	c) calcular a média dos números lidos.
