package ExamenUF4V2;

import java.util.Scanner;

public class TestRPN{
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		while(true) {
			
			
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce expresion Postfija o teclea \"fin\".");
			String linea = in.nextLine( );
			if(linea.equals("fin")) {
				System.out.println("Fin de programa");
				break;
			} else {
				RPNRefactoritzacio1 calc = new RPNRefactoritzacio1(linea);
				System.out.printf("El resultado es %f\n", calc.resultado( ));
			}
		}
	}
}    