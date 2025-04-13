package lista_01;

	
import java.util.Scanner;

public class Exercicio07
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe o salário atual do funcionario ");
	    float salarioInicial = leitor.nextFloat();
	    
	    System.out.print("informe o percentual do rejuste ");
	    float reajuste = leitor.nextFloat();

	    leitor.close();
	    	
	    float novoSalario = ((salarioInicial * reajuste) / 100 )+salarioInicial;
	    
	    
	    System.out.printf("O salario atuializado é de %.2f",novoSalario);
	    
	    
	    
	}
}