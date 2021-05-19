package Numeros;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class NumeroMajorMenor {

	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		FileWriter fitxer = null;
		FileReader fit = null;
		
		int maximo = 0;
		int minimo = 0;
		
		try {
			
			//Ruta on es llegira l'arxiu
			fit = new FileReader("numeros.txt");
			//Ruta que s'exporta
			fitxer = new FileWriter("provaMajorMenor.txt", true);
			
			//Buffer
			BufferedReader fitxernum = new BufferedReader(fit);
			double numeros = Integer.parseInt(fit);
			
			String majorMenor = llegir.readLine(fit);
			maximo = Integer.parseInt(null);
			minimo = Integer.parseInt(null);
		
			
				while (fitxernum != null) {
					
					if(minimo != null)
					{
						minimo = Integer.parseInt(fitxernum);
					}
				}
			}
		catch(Exception x) {
			x.toString();
		}
	}
	public String toString() {
		return "Hi ha hagut un error";
	}
}
