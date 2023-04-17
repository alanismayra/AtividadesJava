package laçosdedecisao;

import java.util.Scanner;

public class atividadegen1 {

	public static void main(String[] args) {
		int a,b,c,soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o número A :");
		a = leia.nextInt();
		System.out.println("Entre com o número B:");
		b = leia.nextInt();
		System.out.println("Entre com número C:");
		c = leia.nextInt();
		
		soma = a+b;
		if (soma>c) {
			System.out.println("\nA soma de A+B é Maior do que C");
			
		}
		else if (soma<c) {
			System.out.println("\nA soma de A + B é Menor do que C");
		}
		else if (soma==c) {
			System.out.println("\nA soma de A + B é igual a C");
			
		}
		
		
		

	}

}
