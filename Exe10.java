

import java.util.Scanner ;

// Fa�a um algoritmo para ler o sal�rio de um funcion�rio e aumenta-lo em 15%.
// ap�s aumento, desconte 8% de impostos. imprima o sal�rio inicial, o sal�rio
// com aumento e o sal�rio final.

public class Exe10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double salarioInicial, salarioAumento, salarioFinal;
		
		System.out.println("Informe seu Sal�rio atual:");
		
		salarioInicial = scan.nextDouble();
		
		salarioAumento = (0.15 *salarioInicial) + salarioInicial;
		salarioFinal = (salarioAumento - 0.8);
		
		System.out.println("Seu sal�rio Inicial era:" + salarioInicial);
		System.out.println("Seu sal�rio com aumento �:" + salarioAumento);
		System.out.println("Seu sal�rio final  ser�:" + salarioFinal);
		

		

		
		
		
		

	}

}
