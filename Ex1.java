import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		float primeiro = entrada.nextFloat();
		System.out.print("Informe o segundo número: ");
		float segundo = entrada.nextFloat();
		
		if (primeiro > segundo) {
			System.out.print("O maior número é o primeiro : " + primeiro);
		}  else {
			if (segundo > primeiro) {
				System.out.print("O maior número é o segundo : " + segundo);
			} else {
				System.out.print("Os números são iguais");
			}
		}
		
		
		
		entrada.close();
	}

}