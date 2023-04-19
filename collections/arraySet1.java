package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class arraySet1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		int n,valor;
		System.out.println("\nDigite o número que deseja sem repeti-lo:");
		for(n=0;n<10;n++) {
			System.out.println("\n Digite o " +(n+1)+"ºvalor:");
			valor=leia.nextInt();
			numeros.add(valor);
		}
		Iterator<Integer>nNumeros = numeros.iterator();
		
		while(nNumeros.hasNext()); {
			
			System.out.println(nNumeros.next());
		}
		
		

	}

}
