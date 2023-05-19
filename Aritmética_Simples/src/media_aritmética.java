import java.util.Scanner;
import java.util.Locale;
public class media_aritmética {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x,y,z,w,media;
		
		System.out.println("Digite os valores para obter a soma: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		w = sc.nextDouble();
		
		media = (x+y+z+w)/4;
		
		System.out.printf("A média dos números digitados é: ", media);
		
		sc.close();
		
		
	}

}