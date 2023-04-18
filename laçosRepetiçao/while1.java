package laçosRepetiçao;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idd=0,idd50= 0,idd21= 0;
		
			while(idd>=0) {
				idd=0;
				System.out.println("Digite uma idade:");
		  		idd = leia.nextInt();
  		    if (idd>=0 && idd<=21) {
				idd21++;
			}else if (idd>=50) {
					idd50++;		
			}
			
		}
            System.out.println("total de pessoas menores de 21 anos:"+idd21);
           
            
			
			System.out.println("total de pessoas maiores de 50 anos:"+idd50);
	}

}
