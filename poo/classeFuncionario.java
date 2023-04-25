package poo;

import java.util.Scanner;

public class classeFuncionario {
	private String setor;
	private String cargo;
	private String nome;
	private int idade;
	private int dataEntrada;
	
	public classeFuncionario(String setor, String cargo, String nome, int idade, int dataEntrada) {
		super();
		this.setor = setor;
		this.cargo = cargo;
		this.nome = nome;
		this.idade = idade;
		this.dataEntrada = dataEntrada;
	}
	public classeFuncionario() {
		super();
	}


	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(int dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public void imprimir() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual o seu setor:");
		setor=leia.nextLine();
		System.out.println("Qual o seu cargo:");
		cargo=leia.nextLine();
		System.out.println("Qual o seu nome:");
		nome=leia.nextLine();
		System.out.println("Qual a sua idade:");
		idade=leia.nextInt();
		System.out.println("Quando entrou na empresa: (somente números)");
		dataEntrada=leia.nextInt();
		
		System.out.println("Setor: \n"+setor+"Cargo: \n"+cargo+"nome: \n"+nome+"Idade: \n"+idade+"Data de entrada: \n"+dataEntrada);
		
		
	}
	
	
		
	

}
