package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in); 
		Stack<String>pilha=new Stack<String>();
		int op=4;
		String nome;
		
		System.out.println("Menu: \n 1 - Adicionar livro na pilha\n 2 - Listar todos os livros\n 3 - Retirar livro da pilha\n 0 - Sair");
		
		while (op!=0) {
			System.out.println("Entre com a opção desejada :");
			op=leia.nextInt();
		switch(op) {
		case 1:
			System.out.println("Insira um nome:");
			nome=leia.next();
			System.out.println(pilha.push(nome)+" \nLivro adicionado!\n");
			break;
		case 2:
			System.out.println("Lista de livros: "+pilha.size());
			break;
		case 3:
			pilha.pop();
			System.out.println("Um livro foi retirado");
			break;
		case 0:
			pilha.clear();
			System.out.println("Programa finalizado!");
		

	}
		}}
}
