package revisao;

import java.util.Scanner;

public class lacos_condicionais {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int num;
		
		
		System.out.println("Digite um número: ");
		num=leia.nextInt();
		
		if(num>=0 && num%2==0) {
			System.out.println("O numero "+num+" é par e positivo!");		
		}else if(num>=0 && num%2==1){
			System.out.println("\nO número "+num+" é ímpar e positivo!");
		}else if(num<0 && num%2==0) {
			System.out.println("\nO número "+num+" é par e negativo!");
		}else if(num<0 && num%2==-1) {
			System.out.println("\n O número "+num+" é ímpar e negativo!");
		}

	}

}
