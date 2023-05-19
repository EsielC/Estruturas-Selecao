import java.util.Scanner;
public class maior_valor_v2 {

	public static void main(String[] args) {
	
		double n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1= sc.nextDouble();
		
		System.out.println("Digite o segundo valor");
		n2= sc.nextDouble();
		
		if(n1 > n2)
			System.out.printf("O maior valor é: %.2f", n1);
		else if ( n1 == n2)
			System.out.printf("Os valores são iguais");
		else 
			System.out.printf("O maior valor é: %.2f", n2);
		sc.close();
		
		
	}

}