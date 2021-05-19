package ExcepcionsThrow;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
	Scanner llegir = new Scanner(System.in);
	
	static int p;
	static int n;
	
	public static void Positivo(int p) throws Exception{
		if (p < 0) {
			throw new Exception(p + " es un número negatiu");
		}
		else {
			System.out.println("El numero es positiu: " + p);
		}
	}
	
	public static void Negativo(int n) throws Exception{
		if (n >= 0) {
			throw new Exception(n + " es un numero positiu");
		}
		else {
			System.out.println("Es un numero negatiu: " + n);
		}
	}
	
	public static void main(String[] args) {
		
		try {
			Positivo(11);
			Negativo(1);
		}
		catch(InputMismatchException e) {
			e.getMessage();
			e.printStackTrace();
		}
		catch(Exception a) {
			a.getMessage();
			a.printStackTrace();
		}
		finally {
			
		}
	}
}
