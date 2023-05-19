import java.util.Scanner;
import java.util.Locale;
public class media_geometrica {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x,y,media,mult;
		
		System.out.println("Digite dois valores da média geométrica: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		mult = x * y;
		media = Math.sqrt(mult);
		
		System.out.printf("a média geométrica é: %.2f\n ", media);
		
		sc.close();
		
		
	}

}