package introduçaoJava;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o Salário Bruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno:");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras:");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os descontos:");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto+adicionalNoturno+(horasExtras*5)-descontos);
		
		System.out.println("Salário líquido:"+salarioLiquido);
		

		
	}

}
