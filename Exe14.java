
import java.util.Scanner;

//Uma loja fornece 10% de desconto para funcion�rios e 5% de desconto para 
//clientes vips. Fa�a um programa que calcule o valor total a ser pago por uma 
//pessoa. O programa dever� ler o valor total da compra efetuada e um c�digo que 
//identifique se o comprador � um cliente comum (1), funcion�rio (2) ou vip (3)

public class Exe14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int  identi;
		double valor;
		
		System.out.println("Qual o codigo de identifica��o:");
		identi = in.nextInt();
		System.out.println("Qual o valor da compra:");
		valor = in.nextDouble();
		
		switch (identi) {
		case 1:
			valor = valor;
			break;
		case 2:
			valor = valor - valor*0.10;
			break;
		case 3:
			valor = valor - valor*0.05;
			break;
		default:
			
		}
		System.out.println("O valor final da compra �: "+valor);
	}

}
