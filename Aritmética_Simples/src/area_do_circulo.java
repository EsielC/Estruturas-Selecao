import java.util.Scanner;
public class area_do_circulo {

	public static void main(String[] args) {
	
		double area, raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = 3.14 * (raio * raio);
		
		System.out.printf("O valor da área do círculo é %.2f\n: " , area);
		
		sc.close();
		
		
	}

}