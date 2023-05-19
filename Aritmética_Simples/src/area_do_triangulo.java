import java.util.Scanner;
import java.util.Locale;
public class area_do_triangulo {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Double base;
		Double altura, area;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triangulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		altura = sc.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.printf("O valor da área é: %.2f\n", area);
					
		sc.close();
		
	}

}