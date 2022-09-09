
import java.util.Scanner;


//Uma revendedora de carros usados paga a seus funcion�rios vendedores um 
//sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e 
//mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia 
//o n�mero de carros por ele vendidos, o valor total de suas vendas, o sal�rio fixo 
//e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do 
//vendedor

public class Exe11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int carros_vendidos, total_vendas;
		double sala_fixo=0,sala_final=0,valor_venda=0,comissao=200;
		
		System.out.println("Qual o salario fixo");
		sala_fixo = entrada.nextDouble();
		
		System.out.println("Quantos carros voc� vendeu no m�s?: ");
		carros_vendidos= entrada.nextInt();
		
		System.out.println("O valor total de suas vendas do m�s:");
		total_vendas= entrada.nextInt();
		
		sala_final = sala_fixo + (carros_vendidos * comissao) + valor_venda * 0.5;
		
		System.out.println("O salario final �: "+ sala_final);
		
		
		
		
	
		
		
		
		
		}
		
		
		
		
		
		
	}


