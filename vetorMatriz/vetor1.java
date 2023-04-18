package vetorMatriz;

import java.util.Scanner;

public class vetor1 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		int [] numero =  {2,5,1,3,4,9,7,8,10,6};
		int posicao,enc;
		boolean encontrado=false;
		
		System.out.println("Digite o número que voce deseja encontrar:");
		enc =leia.nextInt();
		
		for(posicao=0;posicao<10;posicao++) {
			if (numero[posicao]==enc) {
				System.out.println("O número "+enc+" está localizado na posicao:"+posicao);
				encontrado=true;
				break;
			}	
		}
		if(encontrado==false) {
			System.out.println(" o número "+enc+" não foi encontrado");
		}
		

	}

}
