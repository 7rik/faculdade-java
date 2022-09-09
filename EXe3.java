

		//Fa�a um programa que calcule a area de um quadrado,
		//em seguida mostre o dobro desta area para o usuario.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EXe3 {

	public static void main(String[] args) {
		
		float quadrado=0, base=0,altura=0;
		String valor="";
		
		BufferedReader q= new BufferedReader (new InputStreamReader(System.in));
		
		try { System.out.println(" Digite o valor da Base: ");
		valor=q.readLine();
		base= Float.parseFloat(valor);
		
		System.out.println(" Digite o valor da altura:");
		valor=q.readLine();
		altura= Float.parseFloat(valor);
		
		quadrado=(base*altura)/2*2;
		
		System.out.println(" A area do quadrado em dobro �:"+ quadrado);
		}
			catch (Exception erro)
		{
				System.out.println("Aten��o!! use somente n�meros:");
		
		
		} 	
	}
}
