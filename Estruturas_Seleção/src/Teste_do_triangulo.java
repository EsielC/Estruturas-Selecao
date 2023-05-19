import java.util.Scanner;
public class Teste_do_triangulo {

	public static void main(String[] args) {
	
		double v1,v2,v3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		v3 = sc.nextDouble();
		
		
		if (v1 + v2 > v3 && v1 + v3 > v2 && v2 + v3 > v1) { // verificação de um triangulo, pra ver se a soma de dois lados é maior que o outro
			if (v1 == v2 && v2 == v3) 						// teste pra ver se é um triangulo equilátero
				System.out.println("Triangulo Equilátero");
			else if (v1 == v2 || v2 == v3 || v1 == v3) 					// teste pra ver se é um isosceles 
				System.out.println("Triangulo Isósceles");
			else  											// e se nao, escaleno
				System.out.print("Triangulo Escaleno");
		}
		else 
			System.out.println("Não é um triangulo");
		
		sc.close();
		
	
	}

}