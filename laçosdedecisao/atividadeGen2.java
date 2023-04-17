package laçosdedecisao;

import java.util.Scanner;

public class atividadeGen2 {

	public static void main(String[] args) {
		int n;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		n = ler.nextInt();
		
		if (n<0 && n %2 == -1) {
			System.out.println("\n O número "+n+ " é ímpar e negativo");
		}
		else if (n<0 && n %2 == 0) {
			System.out.println("\nO número " +n+" é par e negativo");
		}
		else if (n>0 && n %2 == 0) {
			System.out.println("\nO número "+n+" é par e positivo");
		}
		else if (n>0 && n %2 == 1) {
			System.out.println("\nO número "+n+" é ímpar e positivo");
		}

	}

}
