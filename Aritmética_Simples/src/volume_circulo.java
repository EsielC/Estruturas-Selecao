import java.util.Scanner;
import java.util.Locale;
public class volume_circulo {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Double volume;
		Double raio;
		Double pi;
		
		pi = 3.14;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		volume = 4 * pi * Math.pow(raio,3)/3;
		
		System.out.printf("O valor da volume é: %.2f\n",volume);
					
		sc.close();
		
		
	}

}