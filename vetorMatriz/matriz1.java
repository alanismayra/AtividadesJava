package vetorMatriz;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] numeros= new int[3][3];
		int linha,coluna,somap=0,somas=0,i=1;
		
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {
				numeros[linha][coluna]=(i++);
			}
			
		}
		System.out.println("elementos da diagonal principal:");
		for (linha=0;linha<3;linha++) {
			for (coluna = 0;coluna<3; coluna++) {
				if (coluna==linha) {
					System.out.print(numeros [linha][coluna]+" ");
					somap=numeros [linha][coluna]+somap;
					
					
				}
				
			}
		}System.out.println("\nelementos da diagonal secundaria:");
		for (linha = 0;linha<3;linha++) {
			coluna=3-1-linha;
			System.out.print(numeros [linha][coluna]+" ");
			somas=numeros [linha][coluna]+somas;
		}
		System.out.println("\nsoma dos elementos da diagonal principal:"+somap);
		System.out.println("\nsoma dos elementos da diagonal secundária:"+somas);
		
	}

}
