import java.util.Scanner;

public class Exponencial_e_logaritmo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double x,y,z;
		
		System.out.println("Digite os valores de X e Y:  ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		z = Math.pow(x, y);
		
		System.out.printf("O valor de %.2f\n", z);
		
		sc.close();
		
	}

}