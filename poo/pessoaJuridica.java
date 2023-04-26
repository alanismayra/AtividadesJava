package poo;

import java.util.Scanner;

public class pessoaJuridica extends cliente2 {
	private String cnpj;

	public pessoaJuridica(String nome, String endereco, int idade, String cnpj) {
		super(nome, endereco, idade);
		this.cnpj = cnpj;
	}
	public pessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void validarCnpj() {
		if(getCnpj().length() != 14) {
			System.out.println("\n--CNPJ Inválido!!!");
		}else {
			System.out.println("\n--CNPJ Válido!!!");}
		}
		public void imprimir() {
			Scanner leia=new Scanner(System.in);
			System.out.println("\nEntre com seu nome:");
			setNome(leia.nextLine());
			System.out.println("\nEntre com o CNPJ:");
			cnpj=leia.nextLine();
			System.out.println("\nEntre com seu endereço: ");
			setEndereco(leia.nextLine());
			System.out.println("\nEntre com sua idade:");
			setIdade(leia.nextInt());			
			
			
			System.out.println("\nNome do cliente: "+getNome()+"\nEndereço: "+getEndereco()+"\nIdade: "+getIdade()+
					"\nCNPJ: "+cnpj);
		}{
		
    
    }


}
