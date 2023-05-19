import java.util.Scanner;
public class Peso_ideal_v1 {

	public static void main(String[] args) {
	
		double peso,altura,imc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite o sua altura: ");
		altura = sc.nextDouble();
		
		imc = peso/Math.pow(altura,2);
		
		if(imc < 20.0)
			System.out.println("Abaixo do Peso ");
		else if (imc > 20.0 && imc < 25.0)
			System.out.println("Peso Ideal ");
		else
			System.out.println("Acima do Peso ");
			
		
		
		
		
		sc.close();
		
		// comparar "a" "b" "c" se "a" >= ambos entao é maior
		// comparar "b" com "c" se "b" >= a c entao b é maior, se nao o C é maior 
		
	}

}