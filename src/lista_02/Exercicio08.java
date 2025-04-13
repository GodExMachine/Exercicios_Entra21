package lista_02;
import java.util.Scanner;

public class Exercicio08
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Exercicio 08 lista 02--\033[0m");
	    
	    System.out.print("Informe o codigo do aluno. ");
	    int codigoAluno = leitor.nextInt();
	    
//	    char codigoAluno = 'a';
	    		
	    System.out.print("Informe a primeira nota. ");
	    int nota01 = leitor.nextInt();
	    
	    System.out.print("Informe a segunda nota. ");
	    int nota02 = leitor.nextInt();
	    
	    System.out.print("Informe a terceira nota. ");
	    int nota03 = leitor.nextInt();
	    
	    leitor.close();
	    
	    
	    int notaFinal = 0;
	    
	    //notas iguais
		if(nota01 == nota02 && nota02 == nota03) {
    		notaFinal = ((nota01+ nota02 + nota03 ) / 3);
    				
    	}else {
		    
		    //nota 1 é = ou maior que 2 e maior que 3
		    if(nota01 >= nota02 && nota01 > nota03) {   
		    	//nota 1 e 2 sao iguais
		    	if(nota01 == nota02) {
		    		notaFinal = ((nota01 * 4) + (nota02 * 4) + (nota03 * 3) ) / 11;
		    	}else{notaFinal = ((nota01 * 4) + (nota02 * 3) + (nota03 * 3) ) / 10;
		    	 }
		    }
		    
		    //nota 2 é = ou maior que 3 e maior que 1
		    if(nota02 >= nota03 && nota02 > nota01) {
		    	//nota 2 e 3 sao iguais
		    	if(nota02 == nota03){
		    		notaFinal = ((nota01 * 3) + (nota02 * 4) + (nota03 * 4) ) / 11;
		    	}else {notaFinal = ((nota01 * 3) + (nota02 * 4) + (nota03 * 3) ) / 10;
		    	 }
		    }
		    
		    //nota 3 é = ou maior que 1 e maior que 2
		    if(nota03 >= nota01 && nota03 > nota02) {
		    	//nota 3 e 1 sao iguais
		    	if(nota03 == nota01){
		    		notaFinal = ((nota01 * 4) + (nota02 * 3) + (nota03 * 4) ) / 11;
		    	}else {notaFinal = ((nota01 * 3) + (nota02 * 3) + (nota03 * 4) ) / 10;
		    	 }
		    }
		    
		   
    	}
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
	    
	    if(notaFinal >= 7) {
	    	System.out.println("O codigo do aluno é "+codigoAluno+" e sua media é "+notaFinal+" \033[1;36mAPROVADO!");
	    }else {

	    	System.out.println("O codigo do aluno é "+codigoAluno+" e sua media é "+notaFinal+" \033[1;31mREPROVADO!");
	    }
	    
	    
	    
	    

	}
}
/*
(08) Escreva um algoritmo para ler o código de um aluno e suas três notas. Calcule a média ponderada do aluno,
 considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três notas,
 a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 7 e "REPROVADO" se a média for menor que 7.*/