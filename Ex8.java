import java.util.Scanner;


public class Ex8 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua primeira nota : ");
		int nota1 = entrada.nextInt();
		System.out.print("Informe a sua segunda nota : ");
		int nota2 = entrada.nextInt();
		
		float media = (nota1 + nota2) / 2; 
		
		if (media > 6.99) {
			System.out.print("Aprovado");
		}  else {
			System.out.print("Reprovado");
		}
		
		entrada.close();
	}

}