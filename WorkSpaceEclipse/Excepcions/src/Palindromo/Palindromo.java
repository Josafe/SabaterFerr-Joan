package Palindromo;
import java.io.FileWriter;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		
		FileWriter fitxer = null;
		
	 String cadena = "";
	 boolean palindromo = false;
	 
	 System.out.println("Introdueix una paraula palindromo / o no");
	 cadena = llegir.nextLine();
	 
	 //Llevar accents, separacions entre paraules per a detectar si es palindromo o no
	 cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
	 int x = cadena.length();
	 
	 try {
		 fitxer = new FileWriter("provaPalindromo.txt");
	 for (int i = 0; i < (cadena.length()); i++) {
		
		 if(cadena.charAt(i) == cadena.charAt(x)) {
			 x--;
			 i++;
			 System.out.println("La lletra " + i + "coincideix");
			 palindromo = true;
		 }
		 else 
		 {
			 x--;
			 i++;
			 System.out.println("La paraula no es capicua");
			 palindromo = false;
		 }
	 	}
	 	if(palindromo = true) {
		 System.out.println("La paraula es palindromo");
	 	}
	 	else { 
	 		System.out.println("La paraula no es palindromo");
	 	}
	 	
	 fitxer.close();
	}
	 catch(Exception e){
		 e.toString();
	 }
	 
	 
}
	public String toString() {
		 return "Hi ha hagut un error";
	 }
}
