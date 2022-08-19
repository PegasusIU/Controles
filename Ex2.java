import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o seu número: ");
		float num = entrada.nextFloat();
		
		if (num > 0) {
			System.out.print("O número é o positivo!");
		}  else {
			if (num < 0) {
				System.out.print("O número é o negativo!");
			} else {
				System.out.print("O número é zero");
			}
		}
		
		
		
		entrada.close();
	}

}