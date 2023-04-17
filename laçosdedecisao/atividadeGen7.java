package laçosdedecisao;

import java.util.Scanner;

public class atividadeGen7 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		float n1,n2;
		int codigo;
		
		System.out.println("digite o primeiro número:");
		n1=leia.nextFloat();
		System.out.println("digite o segundo número:");
		n2=leia.nextFloat();
		
		System.out.println("Código - operação");
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		
		System.out.println("digite o código:");
		codigo=leia.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println(+(n1+n2));
		case 2:
			System.out.println(+(n1-n2));
		case 3:
			System.out.println(+(n1*n2));
		case 4:
			System.out.println(+(n1/n2));
				}
		
		
	}

}
