import java.util.Scanner;
public class Velocidade_permitida {

	public static void main(String[] args) {
	
		double a,vi,t,vf = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da Aceleração (m/s²): ");
		a = sc.nextDouble();
		System.out.println("Digite o valor da Velocidade Inicial (m/s): ");
		vi = sc.nextDouble();
		System.out.println("Digite o valor do Tempo (s): ");
		t = sc.nextDouble();	
		
		vf = vf * 3.6;
		
		vf = vi + (a * t);
		
		if (vf < 40 ) 
			System.out.println("Veiculo muito lento");
		else if (vf >= 40 && vf < 60)
			System.out.println("Velocidade Permitida");
		else if (vf >= 60 && vf < 80)
			System.out.println("Velocidade de Cruzeiro");
		else if (vf >= 80 && vf < 120)
			System.out.println("Veículo muito rápido");
		else
			System.out.println("Veículo muito rápido");
		
		System.out.printf("Velocidade do veículo é de %.2f", vf);
		

		sc.close();
		
		
		
	}

}