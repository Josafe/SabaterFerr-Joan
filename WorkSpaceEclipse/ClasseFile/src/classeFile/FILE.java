package classeFile;
import java.io.File;
import java.util.Scanner;

public class FILE {

	public static void main(String[] args) {
		
	Scanner llegir = new Scanner(System.in);
		
	String directori;
	File fitxerModificat = new File("C:\\Users\\Josafe\\Desktop\\ruta\\fitxerModificat.txt");
	
	System.out.println("Introdueix la ruta del directori");
	directori = llegir.nextLine();
	
	
	//Es pot crear amb 3 constructors diferents
	//1
	File fitxer1 = new File("C:\\Users\\Josafe\\Desktop\\ruta\\hola.txt");
	
	//Referenciar directori
	File refDirectori = new File("C:\\Users\\Josafe\\Desktop\\ruta");
	
	//2
	File fitxer2 = new File ("C:\\Users\\Josafe\\Desktop\\ruta", "hola.txt");
	
	//3
	File fitxer3 =  new File (directori, "hola.txt");
	
	for (String e : refDirectori.list()) {
		System.out.println(e);
	}
	
	System.out.println("Tornar el nom del fitxer");
	System.out.println(fitxer1.getName());
	
	System.out.println("Retornar la ruta relativa");
	System.out.println(fitxer1.getPath());
	
	System.out.println("Retornar la ruta absoluta");
	System.out.println(fitxer1.getAbsolutePath());
	
	System.out.println("Tornar un array String amb els elements continguts en el file");
	for(File e : refDirectori.listFiles()) {
		System.out.println(e);
	}
	
	System.out.println("Tornar el nom String del directori pare, si no existeix per ser l'arrel torna NULL");
	System.out.println(fitxer1.getParent());
	
	System.out.println("Retornar el directori pare com un FILE, si no existeix es NULL");
	System.out.println(fitxer1.getParentFile());
	
	System.out.println("Retorna true si el fitxer o directori existeix");
	System.out.println(fitxer1.exists());

	System.out.println("Retorna true si es un directori");
	System.out.println(refDirectori.isDirectory());
	System.out.println("Retorna true si es un arxiu");
	System.out.println(fitxer1.isFile());
	
	System.out.println("Retorna true si es un arxiu ocult");
	System.out.println(fitxer1.isHidden());
	
	System.out.println("Retorna el tamany en bytes de l'arxiu");
	System.out.println(fitxer1.length());
	
	System.out.println("Retorna la data de modificació de l'arxiu");
	System.out.println(fitxer1.lastModified());
	
	System.out.println("Esborra l'arxiu o directori");
	System.out.println(fitxer1.delete());
	
	System.out.println("Crea un directori amb el nom indicat a la creació del FILE");
	System.out.println(fitxer1.mkdir());
	
	System.out.println("Canvia el nom de l'arxiu");
	System.out.println(fitxer1.renameTo(fitxerModificat));
}
}