package exercicisFitxers;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//fer servir try-catch end la restriccio FileNotFound
public class InformacionFicheros {

	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		
		String ruta ="";
		System.out.println("Introdueix la ruta que vulgues: ");
		 //Introduirem la ruta de l'arxiu
		try {
		do {
			ruta = llegir.nextLine();
		
		} while (!ruta.equals(""));{
			File fitxer = new File(ruta);
			muestraRuta(fitxer);
		}
		}
		catch (FileNotFoundException e) {
			System.err.println("Error, ruta incorrecta");
		}
	}
	
	public static void muestraRuta (File fitxer) throws FileNotFoundException{
		
		if (fitxer.exists())
			System.out.println("El nom del fitxer es: " + fitxer.getName());
		
		if (fitxer.isFile()) {
			System.out.println("[A]" + fitxer.getPath());
		}
		
		else if (fitxer.isDirectory()) {
			while (fitxer.length() > 0) {
			System.out.println("[D]" + fitxer.getPath());
			}

	}
}
}