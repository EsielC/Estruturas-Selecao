import java.util.Scanner;
import java.util.Locale;
public class area_quadrado_v2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Double diagonal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da diagonal do quadrado: ");
		diagonal = sc.nextDouble();
		
		diagonal = (diagonal * diagonal)/2;
		
		System.out.printf("O valor da área é: %.2f\n", diagonal);
					
		sc.close();
		
		
	}

}