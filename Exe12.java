

import java.util.Scanner;

//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere 
//que as idades dos homens ser�o sempre diferentes entre si, bem como as das 
//mulheres). Calcule e escreva a soma das idades do homem mais velho com a 
//mulher mais nova, e o produto das idades do homem mais novo com a mulher 
//mais velha.

public class Exe12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int homemmaior=0, homemmenor=0, mulhermaior=0,mulhermenor=0;
		
		System.out.println("Digite a idade do primeiro homem: ");
		 int homem1 = sc.nextInt();
		 
		System.out.println("Digite a idade do segundo homem: ");
		 int homem2 = sc.nextInt();
		 
		 System.out.println("Digite a idade da  primeira mulher: ");
		 int mulher1 = sc.nextInt();
		 
		System.out.println("Digite a idade da segunda mulher: ");
		 int mulher2 = sc.nextInt(); 
		 
		 if(homem1 > homem2 && mulher1 > mulher2) {
			 homemmaior = homem1;
			 homemmenor = homem2;
			 mulhermaior = mulher1;
			 mulhermenor = mulher2;
		 }else {
			 homemmaior = homem2;
			 homemmenor = homem1;
			 mulhermaior = mulher2;
			 mulhermenor = mulher1;
		 }
		 
		 System.out.println("A soma do homem mais velho e da mulher mais nova �: "+(homemmaior+mulhermenor));
		 System.out.println("O produto do homem mais novo e da mulher mais velha �: "+(homemmenor*mulhermaior));
		 
		 
		 
				 
				 
			 
			
		
			 
			 
		 
		
		
		
		
		
		
		
				
				
		

		
	}

	}

