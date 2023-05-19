import java.util.Scanner;

public class raio_e_aresta {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Double vl1,r,a,vl2;
		r = 0.0;
		a = 0.0;
		
		System.out.println("Digite o valor do raio: ");
		r = sc.nextDouble();
		
		System.out.println("Digite o valor da aresta");
		a = sc.nextDouble();
		
		vl1 = Math.pow(a, 3);
		vl2 = 4 * 3.14 * Math.pow(r,3)/3;

		System.out.printf("O valor do raio é: %.2f\n", vl1);
		System.out.printf("O valor da aresta é: %.2f\n", vl2);
		
		sc.close();
		
	}

}