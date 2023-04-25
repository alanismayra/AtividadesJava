package poo;

import java.util.Scanner;

public class cliente {

	
	private String nome;
	private String genero;
	private String status;
	private String nomeSocial;
	private int idade;
	
	public cliente(String nome, String genero, String status, String nomeSocial, int idade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.status = status;
		this.nomeSocial = nomeSocial;
		this.idade = idade;
	}
	
	public cliente() {
		super();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void imprimirInfo() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o nome:");
		nome=leia.nextLine();
		System.out.println("Qual o seu gênero:");
		genero=leia.nextLine();
		System.out.println("Qual o seu status civil:");
		status=leia.nextLine();
		System.out.println("Entre com o nome social:");
		nomeSocial=leia.nextLine();
		System.out.println("Entre com a sua idade:");
		idade=leia.nextInt();
		System.out.println("Nome: "+nome+"\n genero: "+genero+"\n Status civil: "+status+"\n Nome social: "+nomeSocial+"\n Idade: "+idade);
		
	}
	
	
}
