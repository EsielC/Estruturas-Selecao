import java.util.Scanner;
import java.util.Locale;
public class milhas_p_km {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double c, m = 0.0;
		
		System.out.println("Digite os valores das milhas: ");
		m = sc.nextDouble();
		
		c = (1.852 * m); 
		
		System.out.printf("os valores convertidos são: " + c + " Km's");
		
		sc.close();
		
		
	}

}