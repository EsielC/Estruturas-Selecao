import java.util.Scanner;
import java.util.Locale;
public class tensao_do_circuito {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double V,I,R;
		
		System.out.println("Digite os valores de resistência: ");
		R = sc.nextDouble();
		System.out.println("Digite os valores da corrente elétrica: ");
		I = sc.nextDouble();
		
		V = I * R;
		
		System.out.printf("A tensão presente no circuito é: " + V);
		
		
		sc.close();
	}

}