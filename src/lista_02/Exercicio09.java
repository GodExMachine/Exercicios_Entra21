package lista_02;
import java.util.Scanner;

public class Exercicio09 {

		public static void main(String[] args) {
			

		    Scanner leitor = new Scanner(System.in);
		    
			System.out.println("\033[1;36m-- Exercicio 09 lista 02--\033[0m");
	 
			System.out.print("Informe o codigo do item. ");
			int codigoItem  = leitor.nextInt();
			    
			System.out.print("Informe a quantidade. ");
			int quantidade = leitor.nextInt();
			
			leitor.close();
			
			
			float preco = 0;
	 
			switch(codigoItem){
	 
			//Cachorro-quente	100 	1,20
		    case 100 :
		        preco = (float) 1.2;
		        break;
		    //Bauru simples 	101 	1,30
		    case 101 :
		        preco = (float) 1.3;
		        break;
	    	//Bauru com ovo 	102 	1,50
	    	case 102 :
		        preco = (float) 1.5;
		        break;
	    	//Hambúrguer 	103 	1,20
	    	case 103 :
		        preco = (float) 1.2;
		        break;
	    	//Misto quente 	104 	1,30
	    	case 104 :
		        preco = (float) 1.3;
		        break;
	    	//Refrigerante 	105 	1,00
			case 105 :
		        preco = (float) 1;
		        break;
		     default:
		    	 System.out.println("Codigo invalido");
			}
	 
			float valorPedido = quantidade * (float) preco ;
			
			
			System.out.println("\033[1;32m-- RESULTADO--\033[0m");	
			
			System.out.println("Valor do pedido "+valorPedido);
	 
	 
	 
	 
		}
	}

/*

(09) O cardápio de uma lanchonete é o seguinte:
	
	Produto		Código  Preço
	
	Cachorro-quente	100 	1,20
	
	Bauru simples 	101 	1,30
	
	Bauru com ovo 	102 	1,50
	
	Hambúrguer 	103 	1,20
	
	Misto quente 	104 	1,30
	
	Refrigerante 	105 	1,00

Escreva um algoritmo para ler o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche.

 */