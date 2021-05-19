package ExcepcionsIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcions2 {

	public static void main(String[] args) {
		
		Scanner llegir = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int resultat = 0;
		
		
		try {
			System.out.println("Introdueix un valor per a calcular");
			num1 = llegir.nextInt();		
			
			System.out.println("Introdueix un valor per a calcular");
			num2 = llegir.nextInt();
			
			resultat = num1 / num2;
		}
		catch(ArithmeticException valor1) {
			System.out.println("No pots dividir entre 0" + valor1);
		}
		catch(InputMismatchException valor1) {
			System.out.println("No pots dividir un numero amb una lletra");
		}
		finally {
			
		}
	}
}