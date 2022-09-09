

import java.util.Scanner;

//Fa�a um programa para uma loja de tintas. o programa dever� pedir o tamanho  em 
// metros quadrados da �rea a ser pintada. considere que a cobertura  da tinta 
// � de 1 litro para cada 3 metros quadrados e que tinta � vendida em latas de 18
// litros, que custam R$ 80,00. informe ao usuario a quantidade  de latas de tintas 
// a serem compradas e o pre�o total.

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double tamanho ;
		int cobertura_tinta = 3, capacidade_lata = 18, preco_lata= 80, valor_total, latas_inteiras, litros;
		
		
		
		System.out.println("Digite a �rea em metros quadrado a ser pintada:");
		
		tamanho = scan.nextDouble();
		
		litros = (int) (tamanho/cobertura_tinta);
		latas_inteiras= (litros/capacidade_lata);
		
		if( litros%capacidade_lata !=0) {
			latas_inteiras +=1;
		}
		valor_total= latas_inteiras*preco_lata;
		
		System.out.println("Quantidade em litros de tintas necess�ria �:" + litros);
		System.out.println("Quantidade em latas de tintas necess�ria �:" + latas_inteiras);
		System.out.println(" O valor a ser pago na compra em reais �:" + valor_total);
		
		
		
		
		
		

	}

}
