package laçosdedecisao;

import java.util.Scanner;

public class atividadeGen3 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Nome do Doador:");
		nome =leia.next();
		System.out.println("Digite a Idade do Doador:");
		idade = leia.nextInt();
		System.out.println("Primeira doacao de sangue");
		doacao = leia.nextBoolean();
		
		if (idade>=60 && doacao==true) {
			System.out.println(nome+" não está apto para doação");
		}
		else if (idade>=60 && idade<=69 && doacao==false) {
			System.out.println(nome+" está apto(a) para doar");
		}
		else if (idade<=60 && doacao==false) {
			System.out.println(nome+" está apto(a) para doar");
		}
		
		
		
	}

}
