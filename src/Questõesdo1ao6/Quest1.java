package Quest�esdo1ao6;

public class Quest1 {
	
public static void main(String args[]) {

	int n, div, resto;
	
	for(n = 1000; n <= 1999; n++) {
		div = n / 11;
		resto = n % 11;
		
		if(resto == 5) {
			System.out.println("O n�mero dividido por 11 que o resto � 5 �: " + n);
		}
		
	}
}
}