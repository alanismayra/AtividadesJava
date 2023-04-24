package revisao;

import java.util.Scanner;

public class for_revisao {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int num,contPar=0,contImp=0;
		
		
		
		for(int i = 1; i <=10; i++){
            System.out.println("Digite o " + i + "º número");
            num = leia.nextInt();
            
		 if(num % 2 == 0){
                contPar++;
		

	}
            System.out.println("Foram digitados " + contPar + " números pares \n");
		}}
}
