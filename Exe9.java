

// Um motorista deseja colocar no seu tanque X reais de gasolina
// Escreva um algoritimo para ler o pre�o do litro da gasolina e
// o valor do pagamento, e exibir quantos litros ele conseguiu por no tanque.

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double preco=0, litros=0, valorpago=0;
				
		System.out.println("Digite o pre�o da gasolina:");
		
		preco= teclado.nextDouble();
		
		System.out.println("Quantos reais deseja colocar?:");

		valorpago= teclado.nextDouble();
		
		litros=(valorpago/preco);
		
		System.out.println("A quantidade em litros foi:" + litros);
		System.out.println("O valor pago em reais foi:" + valorpago);
		

	}

}
