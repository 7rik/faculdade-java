

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, p, num1;
		
		num1 = 1;
		
		System.out.println("Digite um numero:");
		num = in.nextInt();
		
		do{
			p = num1 * (num1 + 1) * (num1 + 2);
		
		num1++;
		
		p = num1 * (num1 + 1) * (num1 + 2);
		
		}while(p < num);
		
			
		if(p == num) {
			
			System.out.println(" � um numero triangular");
			
		 }else {
			 System.out.println(" N�o � um numero triangular");
		 }
		
	}

}
