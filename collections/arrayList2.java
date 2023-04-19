package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList2 {

	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int num;
		boolean enc=false;

		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(9);
		minhaLista.add(7);
		minhaLista.add(8);
		minhaLista.add(10);
		minhaLista.add(6);

		System.out.println("\nDigite o número que deseja encontrar:");
		num = leia.nextInt();

		for(int x=0;x<minhaLista.size();x++) {
			if(minhaLista.get(x)==num) {
				System.out.println("\n O número "+num+" está localizado na posição:"+x);
				enc=true;
				break;
				
			}
			
		}
		if(enc==false ) {
			System.out.println("\nO numero "+num+" não foi encontrado");
		}
	}

}
