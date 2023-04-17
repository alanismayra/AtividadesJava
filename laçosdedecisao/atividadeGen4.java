package laçosdedecisao;

import java.util.Scanner;

public class atividadeGen4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra1, palavra2, palavra3;
		
		System.out.println("\nEntre com a primeira palavra:");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a segunda palavra:");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a terceira palavra:");
		palavra3 = ler.nextLine();
		
		if(palavra1.equalsIgnoreCase("Vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				
				}else {
				System.out.println("Pomba");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onivoro")) {
				System.out.println("é homem");
				}else {
					System.out.println("é vaca");
				}
		}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematofago")) {
				System.out.println("sangussuga");
				} else {
					System.out.println("é minhoca");
				}
			}

	}
	}
}
