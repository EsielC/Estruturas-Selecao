import java.util.Scanner;

public class volume_cone {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Double v,h,a;
		
		System.out.println("Digite altura: ");
		h = sc.nextDouble();
		
		System.out.println("Digite o raio da base:  ");
		a = sc.nextDouble();
		
		v = (a * h)/3;
		
		System.out.printf("O volume do cone é: %.2f" , v);
		
		sc.close();
	}

}