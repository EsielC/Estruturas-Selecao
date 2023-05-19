import java.util.Scanner;
import java.util.Locale;
public class area_retangulo {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Double base;
		Double altura;
		Double area;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da Base: "); 
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da Altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		System.out.printf("O valor da ÁREA é: %.2f\n", area);
	   
		sc.close();
		
		
	}

}