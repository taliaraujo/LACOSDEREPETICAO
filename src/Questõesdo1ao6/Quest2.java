package Quest�esdo1ao6;

import java.util.Scanner;

public class Quest2 {


public static void main(String args[]) {

	Scanner ler = new Scanner(System.in) ;
	
	int n, divisao, resto;
	
	for(n = 0; n <= 10; n++) {
		System.out.println("Digite 10 n�meos: \n ");
	    n = ler.nextInt();
	
	divisao = n / 2;
	resto = n % 2;
	
	
	if( resto == 0) {
		System.out.println("O n�mero � par.  ");
	}
	else {
		System.out.println("O n�mero � �mpar. ");

	}
		
	}

}

}
