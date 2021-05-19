package ExcepcionsIntro;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcions3 {

	public static void main(String[] args) {
	
	Scanner llegir = new Scanner(System.in);
		
	double vector1[] = new double[5];
	double valor1 = 0;
	
	try {
		
		for (int i = 0; i <= vector1.length + 1; i++)
		{
		System.out.println("Introdueix un numero per a almacenar a l'array [" + i + "]");
		vector1[i] = llegir.nextDouble();
		}
	}
	catch(IndexOutOfBoundsException errorArray) {
		System.out.println("No pots almacenar valors fora dels rangs peremessos per el vector");
	}
	catch(InputMismatchException errorArray) {
		System.out.println("No pots almacenar lletres dintre d'un array de double");
	}
	
	}
}

