

	//Fa�a um programa que converta metros para centimentros.

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
		double metros,centimentros;
		System.out.println("Digite o valor em metros:");
		metros = teclado.nextDouble();
		centimentros = metros*100;
		System.out.println("O valor em centimentros �:" + centimentros);
		
	}

}
