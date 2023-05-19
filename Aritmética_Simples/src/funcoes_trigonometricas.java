import java.util.Scanner;

public class funcoes_trigonometricas {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double graus;
		double rad;
		
		System.out.println("Digite o angulo em graus : ");
		graus = sc.nextDouble(); 
		
		rad = Math.toRadians(graus);
		
		System.out.printf("O valor do Seno em Radianos é: %.2f\n", Math.sin(rad));
		System.out.printf("O valor do Cos em Radianos é: %.2f\n", Math.cos(rad));
		System.out.printf("O valor do Tag em Radianos é: %.2f\n", Math.tan(rad));
		System.out.printf("O valor da Cossec em Radianos é: %.2f\n",(1/Math.cos(rad)));
		
		sc.close();
		
	}

}