package lista_02;
import java.util.Scanner;


public class Exercicio13
{
	public static void main(String[] args) {
	    
	    
		Scanner leitor = new Scanner(System.in);
		    
		System.out.println("\033[1;36m-- Exercicio 13 lista 02--\033[0m");
		
		System.out.print("Informe o valor: ");
		int valorDeposito = leitor.nextInt();
//			TESTAR 1355, 1345 e 1348
		
	    leitor.close();
	    
	    int valorInicial = valorDeposito;
	    int notasDe100 = 0;
	    int notasDe50 = 0;
	    int notasDe20 = 0;
	    int notasDe10 = 0;
	    int notasDe5 = 0;
	    int notasDe2 = 0;
	    int notasDe1 = 0;
	    
	    
	    
//	  	Aqui é pego o valor do deposito e divido por 100 para saber quantas notas de 100 tem.  
//      depois multiplica o numero de notas de 100 pelo valor 100 para retirar esse valor do deposito e saber o saldo.
	    
	    notasDe100 = (valorDeposito / 100);	    
//		recebe --->  (   1050       / 100)  = 10 <-------------  O dividido "/" retorna apenas numeros inteiros.
//		ou seja notasDe100  == 10 	
	    
	    
        valorDeposito = valorDeposito - (100 * notasDe100);
//      recebe ----->       1050      - (100 *     10    )  =  50
//      ou seja valoDeposito == 50        
        
        
        
	    notasDe50 = (valorDeposito / 50);
        valorDeposito = valorDeposito - (50 * notasDe50);
       
        notasDe20 = (valorDeposito / 20);
        valorDeposito = valorDeposito - (20 * notasDe20);  
	           
        notasDe10 = (valorDeposito / 10);
        valorDeposito = valorDeposito - (10 * notasDe10);  
	        
        notasDe5 = (valorDeposito / 5);
        valorDeposito = valorDeposito - (5 * notasDe5);      
        
        notasDe2 = (valorDeposito / 2);
        valorDeposito = valorDeposito - (2 * notasDe2);  
	            
        notasDe1 = (valorDeposito / 1);
        valorDeposito = valorDeposito - (1 * notasDe1);  
	    
	    
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		      
	    System.out.println("R$"+valorInicial+" equivale á:");
	    
	    if(notasDe100 > 0)System.out.println(notasDe100+(notasDe100 > 1 ? " notas de 100" : " nota de 100"));        
        
	    if(notasDe50 > 0)System.out.println(notasDe50+(notasDe50 > 1 ? " notas de 50" : " nota de 50"));
	    
	    if(notasDe20 > 0)System.out.println(notasDe20+(notasDe20 > 1 ? " notas de 20" : " nota de 20"));
	    
	    if(notasDe10 > 0)System.out.println(notasDe10+(notasDe10 > 1 ? " notas de 10" : " nota de 10"));
	    
	    if(notasDe5 > 0)System.out.println(notasDe5+(notasDe5 > 1 ? " notas de 5" : " nota de 5"));
		   
	    if(notasDe2 > 0)System.out.println(notasDe2+(notasDe2 > 1 ? " notas de 2" : " nota de 2"));
	   
	    if(notasDe1 > 0)System.out.println(notasDe1+(notasDe1 > 1 ? " notas de 1" : " nota de 1"));
	    
	    
	    
	    
//	    if(notasDe100 > 0){
//	    	System.out.println(notasDe100+(notasDe100 > 1 ? " notas de 1000" : " nota de 100"));        
//	    }
//	    
//	    if(notasDe50 > 0){
//	    	System.out.println(notasDe50+(notasDe50 > 1 ? " notas de 50" : " nota de 50"));
//	    }
//	    
//	    if(notasDe20 > 0){
//	    	System.out.println(notasDe20+(notasDe20 > 1 ? " notas de 20" : " nota de 20"));
//	    }
//	    
//	    if(notasDe10 > 0){
//	    	System.out.println(notasDe10+(notasDe10 > 1 ? " notas de 10" : " nota de 10"));
//	    }
//	    
//	    if(notasDe5 > 0){
//		    System.out.println(notasDe5+(notasDe5 > 1 ? " notas de 5" : " nota de 5"));
//		}
//	    
//	    if(notasDe2 > 0){
//	    	System.out.println(notasDe2+(notasDe2 > 1 ? " notas de 2" : " nota de 2"));
//	    }
//	    
//	    if(notasDe1 > 0) {
//	    	System.out.println(notasDe1+(notasDe1 > 1 ? " notas de 1" : " nota de 1"));
//	    }
	    
	    

	  
	}
}

/*
(13) Escreva um algoritmo para ler um valor em reais 
e calcular qual o menor número possível de notas de 100, 50, 10, 5, 2 e 1 em que o valor lido pode ser decomposto. 
Escrever o valor lido e a relação de notas necessárias.
*/
