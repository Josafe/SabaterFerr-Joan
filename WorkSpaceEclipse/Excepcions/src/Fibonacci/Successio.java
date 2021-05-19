package Fibonacci;
import java.util.Scanner;
import java.io.FileWriter;


public class Successio {

	public static void main(String[] args) throws Exception {
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		FileWriter fitxer = null;
		
		try {
			//Crearem el que llegira el fitxer, el document es creara al main del arxiu
			fitxer = new FileWriter("prova.txt");

		for (int i = 0; i < 20; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			if(n3%2==0) 
			{
				fitxer.write("Fibbonacci " + n3 + "\n");
			}
			}
		fitxer.close();
		} catch(Exception x) {
			
			x.toString();
			
		} finally {
		
		}
		
	}
	public String toString() {
		return "Hi ha hagut un error d'escriptura";
	}
	
}
