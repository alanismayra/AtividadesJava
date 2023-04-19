package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<String>listaCores = new ArrayList<String>();
		String op;
		int x;
		
		for(x=0;x<5;x++) {
				System.out.println("Digite as cores desejadas:");
				op = leia.next();
				listaCores.add(op);
				
			}System.out.println("\nlistar todas as cores:");
		for (String cor:listaCores) {
			System.out.println(cor);
			
		}
		Collections.sort(listaCores); 
		System.out.println("\nordenar as cores:");
		System.out.println(listaCores);
			
			
			
		
		

	}

}
