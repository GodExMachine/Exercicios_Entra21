package lista_03;

public class Exercicio05 {

	
	public static void main(String args[]) {
	    
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 05-\033[0m");
		
	    float chico = 1.5f;
    	float zeh = 1.1f;
    	int tempo = 0;   
    	    
    	    
    	    
    	 while(zeh <= chico){
    	    
    	    chico += 0.02f;
    	    zeh += 0.03f; 
    	    tempo++;
    	    
    	 }
    	     
		
        System.out.println("\033[1;32m-- RESULTADO--\033[0m");
        System.out.println("Zé levara "+tempo+" anos para ser maior que Chico");
      
	}
}


//(05) Chico tem 1,50 metro e cresce 2 centímetros por ano, 
//enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano.
//Escreva um algoritmo para calcular e imprimir quantos anos serão necessários para que Zé seja maior que Chico.
