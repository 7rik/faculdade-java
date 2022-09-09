

/*Escreva um algoritmo que encontre o quinto n�mero maior que 1000, cuja divis�o por 11 
tenha resto 5*/
public class Exe2 {

	   public static void main(String[] args) {

	       int i = 1001;

	       int n = 0;

	       while (true) {

	           if (i % 11 == 5) {

	               n++;

	               if(n == 5){

	                   break;

	               }

	           }

	           i++;

	       }

	       System.out.println(i);

	   }

	}
