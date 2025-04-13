package lista_03;
import java.util.Scanner;

public class Exercicio18{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valorEntrada = 0;
		
		while(true){
		    
		    System.out.print("Informe um numero inteiro e positivo: ");
		    valorEntrada = leitor.nextInt();
		    
		    int divisores = 0;    
		    
		    //Se m for par, verificar quantos divisores possui e escrever esta informação.
		    if(valorEntrada % 2 == 0){
		        
    		    for(int i = 1; i <= valorEntrada;i++){
    		        
    		        if(valorEntrada % i == 0){
    		            
    		            divisores++;
    		        }
    		        
    		        
    		    }
    		System.out.println("o numero "+valorEntrada+" possui "+divisores+" divisores");
    		    
		    } 
		    
		   
		    
		    //Se m for ímpar e menor do que 10 calcular e escrever o fatorial de m. 
		        
		    if(valorEntrada % 2 != 0 && valorEntrada < 10){
		    
		        int fatorial = 1;
		        
		        //suponha valorEntrada 5 entao defino j como 5 para iniciar a multiplicaçao com 5 e entao diminou 1 de "j"  e depois multiplico o resultado "" de 4*1
		        for(int j = valorEntrada; j > 0; j--){
    		        
    		           //fatorial = fatorial + (fatorial * j);
    		            fatorial *= j;
   	    
		        }
		    System.out.println("O fatorial de "+valorEntrada+" é "+fatorial);
		
        	}
        	
		   
        	
        	if(valorEntrada % 2 != 0 && valorEntrada >= 10) {
        		
        		int somaInteiros = 0;
        		
        		for(int k = 0; k < valorEntrada; k++){
    		        
 		           somaInteiros += k;
 		            
		        }
        		
        		System.out.println("A soma dos numeros inteiros até "+valorEntrada+" é "+somaInteiros);
        		
        	}
        	
		}
		
	
		
		
	}        	
}

//(18) Escreva um algoritmo para ler um número não determinado de valores para m,todos inteiros e positivos. 
//Se m for par, verificar quantos divisores possui e escrever esta informação.
//Se m for ímpar e menor do que 10 calcular e escrever o fatorial de m. 
//Se m for ímpar e maior ou igual a 10 calcular e escrever a soma dos inteiros de 1 até m.