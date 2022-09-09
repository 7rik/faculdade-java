
import java.util.Scanner;

//Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima 
//em estoque e quantidade m�nima em estoque de um produto. Calcular e 
//escrever a quantidade m�dia ((quantidade m�dia = quantidade m�xima + 
//quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual a 
//quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a 
//mensagem 'Efetuar compra'. 

public class Exe13 {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int qtatual, qtmax, qtmin, qtmedia;
		
		System.out.println("Quantidade atual: ");
		qtatual = in.nextInt();
		
		qtmax = 20;
		qtmin = 2;
		qtmedia = (qtmax + qtmin) / 2;
		
		if(qtatual >= qtmedia) {
			
			System.out.println("N�o efetuar a compra");
		}else
			
			System.out.println("Efetuar a compra");

	}

}
