package ExcepcionsIntro;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcions4 {

	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		
		int valorVector = (int) Math.random()+10;
		int[] vector1 = new int[valorVector];
		int valorDintre = (int) Math.random()*1+10-1;	
		
		try {
			
			for(int i = 0; i < vector1.length+1; i++) {
				System.out.println("A quina posicio de l'array vols introduir aquest numero");
				i = llegir.nextInt();
				vector1[i] = valorDintre;
				
				System.out.println(vector1[i]);
			}
			
		}catch(IndexOutOfBoundsException errorIndexVector){
			
			System.out.println("No pots introduir valors fora del rang del array" + errorIndexVector);
			
		}
		catch(InputMismatchException errorTipusDato) {
			System.out.println("No pots introduir un index del vector amb decimals " + errorTipusDato);
		}
		
		finally {
			
		}
	}
}
