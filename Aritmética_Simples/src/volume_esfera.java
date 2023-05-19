import java.util.Scanner;
public class volume_esfera {

	public static void main(String[] args) {
	
		
		Double volume;
		Double diametro;
		Double raio;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do diametro: ");
		diametro = sc.nextDouble();
		
		raio = diametro/2.0;
		volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
		
		System.out.printf("O valor da volume é: %.2f", volume);
					
		sc.close();
		
		
	}

}