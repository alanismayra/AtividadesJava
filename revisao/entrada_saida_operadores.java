package revisao;

import java.util.Scanner;

public class entrada_saida_operadores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		float n1,n2,n3,n4, calculo;
		
		System.out.println("entre com o número 1:");
		n1=leia.nextFloat();
		System.out.println("entre com o número 2:");
		n2=leia.nextFloat();
		System.out.println("entre com o número 3:");
		n3=leia.nextFloat();
		System.out.println("entre com o número 4:");
		n4=leia.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		System.out.println("\nDiferença: "+calculo);


	}

}
