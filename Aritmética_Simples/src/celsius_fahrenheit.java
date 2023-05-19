import java.util.Scanner;
import java.util.Locale;
public class celsius_fahrenheit {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double F,C;
		
		System.out.println("Digite os valores de Celsius para Fahrenheit");
		C = sc.nextDouble();
		
		F = C * 1.8 + 32;
		
		System.out.printf("Os valores convertidos são: %.2f\n" , F);
		
		sc.close();
		
	}

}