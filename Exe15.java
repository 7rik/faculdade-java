
import java.util.Scanner;
import java.util.Random;
public class Exe15 {

	public static void main(String[] args) {
		Random in = new Random();
		int nDigit;
		int nSort = in.nextInt(25);
		System.out.println("Valor sorteado: ");
		do {
			Scanner nu = new Scanner(System.in);
			System.out.println("Digite um valor");
			nDigit = nu.nextInt();
			if(nDigit + 5 == nSort - 1) {
				System.out.println("Voce está proximo");
			}
			if(nDigit - 3 == nSort + 1) {
				System.out.println("Voce está proximo");
			}
			if(nDigit + 4 == nSort - 3) {
				System.out.println("Voce está proximo");
			}
			if(nDigit - 3 == nSort - 1) {
				System.out.println("Voce está proximo");
			}
			if(nDigit + 10 == nSort - 1) {
				System.out.println("Voce está proximo");
			}
			
		}while(nDigit != nSort);
		
		
		if(nDigit == nSort) {
			System.out.println("Voce acertou");
		}else {
			System.out.println("Voce errou");
		}
	}

}
