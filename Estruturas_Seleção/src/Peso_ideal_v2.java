import java.util.Scanner;
public class Peso_ideal_v2 {

	public static void main(String[] args) {
	
		double peso,altura,imc;
		String sexo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite o sua altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite seu Sexo (M/F): ");
		sexo = sc.next();
			
		imc = peso/Math.pow(altura,2);
		
		if(sexo.equalsIgnoreCase("M")) { // COMPARAAS STRINGS PRA VER SE SÃO IGUAIS OU NAO
			
		if(imc < 20.0)
			System.out.println("Abaixo do Peso ");
		else if (imc > 20.0 && imc < 25.0)
			System.out.println("Peso Ideal ");
		else
			System.out.println("Acima do Peso ");
		}
		
		else if(sexo.equalsIgnoreCase("F")) {
			if (imc < 19.0)
				System.out.println("Abaixo do peso ");
			else if (imc > 19.0 && imc < 24.0)
				System.out.println("Peso ideal");
			else
				System.out.println("Acima do Peso");		
		}
		

		sc.close();
		
		
		
	}

}