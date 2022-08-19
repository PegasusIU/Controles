import java.util.Scanner;


public class Ex9 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua altura : ");
		int h = entrada.nextInt();
		System.out.print("Informe o seu peso : ");
		int peso = entrada.nextInt();
		System.out.print("Informe o seu sexo : (Masculino = 1) (Feminino = 2) ");
		int sexo = entrada.nextInt();
		
		double pesoi = 0;
		
		if (sexo = 1){
			double pesoi = ((72.7 * h) - 58);
		} else {
			double pesoi = ((62.1 * h) - 44.7);
		}
		 
		System.out.println("Altura é: " + h);
		System.out.println("Peso é: " + peso);
		
		if (sexo = 1){
			System.out.println("Seu sexo é: Masculino");
		} else {
			System.out.println("Seu sexo é: Feminino");
		}
		
		
		System.out.println("Seu peso ideal é: " + pesoi);
		
		if (pesoi > peso){
			System.out.println("Você está abaixo do seu peso ideal");
		} else {
			if (pesoi < peso) {
				System.out.println("Você está acima do seu peso ideal");
			} else {
				System.out.println("Você está no seu peso ideal");
			}
		}
		
		
		entrada.close();
	}

}