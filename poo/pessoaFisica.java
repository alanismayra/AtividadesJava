package poo;

import java.util.Scanner;

public class pessoaFisica extends cliente2 {
	private String cpf;
	private float salario;
	private String statusCivil;
	
	public pessoaFisica(String nome, String endereco, int idade, String cpf, float salario, String statusCivil) {
		super(nome, endereco, idade);
		this.cpf = cpf;
		this.salario = salario;
		this.statusCivil = statusCivil;
	}


	public pessoaFisica() {
		super();
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getStatusCivil() {
		return statusCivil;
	}

	public void setStatusCivil(String statusCivil) {
		this.statusCivil = statusCivil;
	}
    public void validarCpf() {
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		}else {
			System.out.println("\n--CPF Válido!!!");
			}
		}

	public void imprimirInfo() {
		Scanner leia=new Scanner(System.in);
		System.out.println("\nEntre com seu nome:");
		setNome(leia.nextLine());
		System.out.println("\nEntre com seu endereço: ");
		setEndereco(leia.nextLine());
		System.out.println("\nEntre com seu Status Civil:");
		statusCivil=leia.nextLine();
		System.out.println("\nEntre com seu cpf:");
		cpf=leia.nextLine();
		System.out.println("\nEntre com sua idade:");
		setIdade(leia.nextInt());	
		System.out.println("\nEntre com o valor do seu salário:");
		salario=leia.nextFloat();
		
		System.out.println("\nNome do cliente: "+getNome()+"\nEndereço: "+getEndereco()+"\nIdade: "+getIdade()+
				"\nCPF: "+cpf+"\nSalário: "+salario+"\nStatus Civil: "+statusCivil);
		
		
		
		
	}
	
	

}
