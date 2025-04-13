package lista_01;

	
import java.util.Scanner;

public class Exercicio04
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("informe uma idade em dias ");
	    int idadeEmDias = leitor.nextInt();
	    
	    leitor.close();
	    
	    int idadeEmAnos = idadeEmDias  / 365;

	    
	    	
	    int restoDosAnos = idadeEmDias % 365;
	    
	    
	    int idadeMeses = restoDosAnos / 30;
	    
	    
	    int restoDosMeses = restoDosAnos % 30;

	    
	    System.out.print(idadeEmDias +" Dias são: "+idadeEmAnos+" ano(s) "+idadeMeses+" Mes(es) e "+restoDosMeses+" Dia(s)");
	    

	    
	    
	    
	}
}