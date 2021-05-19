package AdivinaNum;
import java.util.InputMismatchException;
import java.util.Scanner;



public class AdivinaNum {

	public static void main(String[] args) throws Exception {
		
		Scanner llegir = new Scanner(System.in);
		int numAleatori = ((int) Math.random()*500);
		int adivina = 10;
		int contador = 0;
		boolean esEntero = false;
		
		System.out.println(numAleatori);
		
		
		do {
			do {
		try {
			contador++;
			System.out.println("Adivina quin número es: ");
			adivina = llegir.nextInt();
			System.out.println("Aquest es el intent: " + contador);
			esEntero = true;
		}
		catch(InputMismatchException x) {
			System.err.print("El error es degut a Input Mismatch Exception" + x);
			llegir.next();
			esEntero = false;
			
		}} while (esEntero = true);
		
		if (adivina < numAleatori) {
			System.out.println("El numero introduit es menor que el numero aleatori");
		}
		else {
			System.out.println("El numero introduit es major que el numero aleatori");
		}
		if (adivina < 0) {
			System.err.println("No pots introduir un numero inferior a 0");
		}
		else if (adivina > 500) {
		
		}
		}
		while (numAleatori != adivina);
		
	System.out.println("Enhorabona, has encertat el numero " + adivina);
	}
}


