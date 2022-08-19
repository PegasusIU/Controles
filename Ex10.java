import java.util.Scanner;


public class Ex10 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o seu primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o seu segundo número: ");
		int num2 = entrada.nextInt();
		System.out.print("Informe o seu terceiro número: ");
		int num3 = entrada.nextInt();
		
		int ordem1 = 0;
		int ordem2 = 0;
		int ordem3 = 0;
		
		if ((num1 > num2) && (num1 > num3)) {
			ordem1 = num1;
		}  else {
			if (((num1 > num2) && (num1 < num3)) || ((num1 < num2) && (num1 > num3))) {
				ordem2 = num1;
			} else {
				ordem3 = num1;
			}
		}
		
		if ((num2 > num1) && (num2 > num3)) {
			ordem1 = num2;
		}  else {
			if (((num2 > num1) && (num2 < num3)) || ((num2 < num1) && (num2 > num3))) {
				ordem2 = num2;
			} else {
				ordem3 = num2;
			}
		}
		
		if ((num3 > num1) && (num3 > num2)) {
			ordem1 = num3;
		}  else {
			if (((num3 > num1) && (num3 < num2)) || ((num3 < num1) && (num3 > num2))) {
				ordem2 = num3;
			} else {
				ordem3 = num3;
			}
		}
		
		
		System.out.print("O maior númeeo é : " + ordem1 + " E o menor número é :" + ordem3);
		
		
		entrada.close();
	}

}