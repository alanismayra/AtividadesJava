package introduçaoJava;

import java.util.Scanner;

public class atividade_1 {

	public static void main(String[] args) {
		Float salario,abono,novo;
		Scanner leia =new Scanner (System.in);
		System.out.println("Digite o salário:");
		 salario = leia.nextFloat();
		 System.out.println("Digite o abono:");
		 abono = leia.nextFloat();
		 novo = (salario+abono);
		 System.out.println("Novo salário:"+novo);
		 
	}

}
