

/*Foi feita uma pesquisa entre os habitantes de uma regi�o e coletados os dados de altura e
sexo (0=masc, 1=fem) das pessoas. Fa�a um programa que leia 50 dados diferentes e informe:
� a maior e a menor altura encontradas;
� a m�dia de altura das mulheres;
� a m�dia de altura da popula��o;
� o percentual de homens na popula��o.
 * 
 */

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
	int i,fem,masc;
	float maiorALT,menorALT,alturamasc=0,alturafem=0,altura,sexo,mediafem,perct=0;
	Scanner ent = new Scanner(System.in);
	for(int j=1;j<3;j++) {
		System.out.println("Qual seu sexo?"+"\n"+"0-Masculino"+"\n"+"1-Feminino");
		sexo=ent.nextFloat();
		System.out.println("Qual sua altura");
		altura=ent.nextFloat();
		
		if(sexo==0) {
			alturamasc=altura;
			perct+=1;
			
			
	}else {alturafem=altura;}
		if(alturafem<=altura)
		
	
	System.out.println(alturafem);
	System.out.println(alturamasc);

	}

}
}