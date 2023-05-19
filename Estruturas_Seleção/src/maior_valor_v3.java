import java.util.Scanner;
public class maior_valor_v3 {

	public static void main(String[] args) {
	
		double v1,v2,v3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		v3 = sc.nextDouble();
				
		if(v1 >= v2 && v1 >= v3) 
			System.out.printf("O primeiro valor é o maior %.2f", v1);
		else if (v2 >= v3)
			System.out.printf("O segundo valor é o maior %.2f", v2);
		else 
			System.out.printf("O terceiro valor é o maior %.2f", v3);
		
		sc.close();
		
		// comparar "a" "b" "c" se "a" >= ambos entao é maior
		// comparar "b" com "c" se "b" >= a c entao b é maior, se nao o C é maior 
		
	}

}