import java.util.Scanner;
public class volume_cubo_esfera {

	public static void main(String[] args) {
	
		
		Double v_livre;
		Double v_cubo;
		Double v_esfera;
		Double a = 0.0;
		Double r = 0.0;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da aresta: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor do raio: ");
		r = sc.nextDouble();
		
		
		v_cubo = Math.pow(a, 3);
		
		v_esfera = (4.0/3.0)* Math.PI * Math.pow(r,3);
		
		v_livre = v_cubo - v_esfera;
		
		System.out.printf("O valor da volume é: %.2f", v_livre);
					
		sc.close();
		
		
	}

}