package laçosdedecisao;

import java.util.Scanner;

public class atividadeGen5 {

	public static void main(String[] args) {
		int n1,valortotal;
		Scanner leia = new Scanner(System.in);
		int op;
		
		System.out.println("Código do Produto-Produto-Preço unitário");
		System.out.println("1-Cachorro Quente: R$10.00");
		System.out.println("2- Xsalada: R$15.00");
		System.out.println("3- Xbacon:R$18.00");
		System.out.println("4- Bauru: R$12.00");
		System.out.println("5- Refrigerante: R$8.00");
		System.out.println("6- Suco de laranja: R$13.00");
		System.out.println("\nDigite o código do produto que deseja:");
		op = leia.nextInt();
		System.out.println("Digite a quantidade desejada:");
		n1 = leia.nextInt();
		
		
		
		switch(op) {
		case 1:
			System.out.println(n1*10.00+" reais");
		    break;
		case 2:
			System.out.println(n1*15.00+" reais");
		    break;
		case 3:
			System.out.println(n1*18.00+" reais");
		    break;
		case 4:
			System.out.println(n1*12.00+" reais");
		    break;
		case 5:
			System.out.println(n1*8.00+" reais");
		    break;
		case 6:
			System.out.println(n1*13.00+" reais");
			break;
			default:
				System.out.println("Código indisponivel");
		
			
		}
		
		
		
	}

}
