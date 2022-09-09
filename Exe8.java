

import java.util.Scanner;

// O restaurante a quilo Bem-B�o cobra R$12,00 por cada quilo de refei��o 
//Escreva um algoritmo que leia o peso do prato montado pelo cliente
//em quilos e imprima o valor a paga. assuma que a balan�a j� desconte o peso do prato.

public class Exe8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double peso = 0.100,comida,valor;
		
		System.out.println("Informe Quantos quilos pesou seu prato:");
		
		comida = scan.nextDouble();
		
		valor = (comida-peso)*12;
		
		System.out.println("O valor a ser Pago em R$:" + valor );
		
		

	}

}
