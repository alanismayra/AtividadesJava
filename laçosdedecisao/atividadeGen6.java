package laçosdedecisao;

import java.util.Scanner;

public class atividadeGen6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int codigo;
		float salario, novoSalario;
		
		System.out.println("Digite o nome do colaborador:");
		nome=leia.next();
		System.out.println("Codigo do cargo- cargo- percentual de reajuste ");
		System.out.println("1 gerente 10%");
		System.out.println("2 vendedor 7%");
		System.out.println("3 supervisor 9%");
		System.out.println("4 motorista 6%");
		System.out.println("5 estoquista 5% ");
		System.out.println("6 tecnico de TI 8%");
		
		System.out.println("Digite o código do cargo");
		codigo = leia.nextInt();
		
		System.out.println("Digite seu salário atual:");
		salario= leia.nextFloat();
		
		switch (codigo) {
		case 1:
			novoSalario=salario+((10*salario)/100);
			System.out.println(nome+ " -gerente- " + novoSalario);
			break;
		case 2:
			novoSalario= salario+((7*salario)/100);
			System.out.println(nome + " -vendedor- " + novoSalario);
			break;
		case 3:
			novoSalario = salario+((salario*9)/100);
			System.out.println(nome + " -supervisor- " + novoSalario);
			break;
		case 4:
			novoSalario = salario+((salario*6)/100);
			System.out.println(nome + " -motorista- " + novoSalario);
			break;
		case 5:
			novoSalario = salario+((salario*5)/100);
			System.out.println(nome + " -estoquista- " + novoSalario);
			break;
		case 6:
			novoSalario = salario+((salario*8)/100);
			System.out.println(nome + " -tecnico de TI- " + novoSalario);
			break;
			
		
		}
		

	}

}
