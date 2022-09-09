

import java.util.Scanner;
// Fa�a um programa que pe�a o tamanho de um arquivo para download em MB
//e a velocidade de um link em Mbps, informe o tempo aproximado de
// Download do arquivo usado este link em minutos.

public class Exe6 {

	public static void main(String[] args) { 
		Scanner teclado = new Scanner (System.in);
		
		double   tamanhoDoarquivo, velocidade;
		int minutos;
		
		 System.out.println("Digite tamanho do arquivo para Download em MB:");
		 
		 tamanhoDoarquivo= teclado.nextDouble();
		 
		 System.out.println("Digite a velocidade do link em Mbps:");
		 
		 velocidade= teclado.nextDouble();
		 
		 minutos= (int) ((tamanhoDoarquivo/velocidade)%60);
		 
		 System.out.println("O tempo aproximado para Download em minutos �:" + minutos);
		 
		 
		
		
		
		
		
	}

}
