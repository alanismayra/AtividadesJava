package revisao;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		float saldo=1000, quant,dep;
		int op;
		
		System.out.println("Código da operação - Operação");
		System.out.println("\t1 \t Saldo");
		System.out.println("\t2 \t Saque");
		System.out.println("\t3 \t depósito");
		System.out.println("\nDigite o código de operação desejada: ");
		op=leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("\nOperação - Saldo\n Saldo: R$"+saldo);
			break;
		case 2:
			System.out.println("\nDigite quando quer sacar:");
			quant=leia.nextFloat();
			System.out.println("\nNovo saldo: "+(saldo-quant)+" reais");
			break;
		case 3:
			System.out.println("\nDigite o quanto deseja depositar: ");
			dep=leia.nextFloat();
			System.out.println("\nNovo saldo: "+(saldo+dep)+" reais");
			break;
			
			
			
		
		}

	}

}
