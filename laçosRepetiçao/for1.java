package laçosRepetiçao;

import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2;
		
		
		for(;;) {
			System.out.println("Digite o primeiro número do intervalo:");
			n1= leia.nextInt();
			System.out.println("Digite o último número do intervalo:");
			n2= leia.nextInt();
			
			if (n1<n2) {
				break;
			} else {
				System.out.println("Intervalo inválido");
			}
			
		}
		
		System.out.println("Números multiplos de 3 e 5 no intervalo de "+n1+" a"+n2+":");
		
		for(int i= n1; i<=n2;i++) {
			if(i% 3 ==0 && i%5 ==0) {
				System.out.println(i);
			}
			
		}
				
		

	}

}
