import java.util.Scanner;
public class Teste_retangulo {

	public static void main(String[] args) {
	
		double A,B,C;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		B = sc.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		C = sc.nextDouble();
		
	
		if (A * A + B * B == C * C || B * B + C * C == A * A || A * A + C * C == B * B) 
			System.out.println("Os valores digitados formam um triangulo");
		else
			System.out.println("Os valores digitados não formam um triangulo");
			
		sc.close();
		
	
	}

}