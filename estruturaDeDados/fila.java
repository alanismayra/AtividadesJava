package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila=new LinkedList<String>();
		int op = 4;
		String nome;
		
		System.out.println("Menu:\n 1- Adicionar Cliente na Fila \n 2- Listar todos os clientes \n 3- Retirar cliente da fila\n 0- Sair");
		
		
		while (op!=0) {
			System.out.println("Entre com a opção desejada :");
			op=leia.nextInt();
		switch(op) {
		case 1:
			System.out.println("Insira um nome:");
			nome=leia.next();
			System.out.println(fila.add(nome)+" \nCliente adicionado!\n");
			break;
		case 2:
			System.out.println("Lista de clientes na fila: "+fila);
			break;
		case 3:
			fila.remove();
			System.out.println("O cliente foi chamado!");
			break;
		case 0:
			fila.clear();
			System.out.println("Programa finalizado!");
		}
			
		}	
			
		
		

	}

}
