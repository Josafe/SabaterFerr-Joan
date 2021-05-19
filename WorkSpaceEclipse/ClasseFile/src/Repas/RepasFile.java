package Repas;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;

public class RepasFile {

	public static void main() {
		File ruta = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos");
		
		File[] llista = ruta.listFiles();
		
		Arrays.sort(llista);
		
		if (ruta.exists()) {
			System.out.println("Existeix");
		}
		else {
			System.out.println("No existeix");
		}
		
		for(File x : llista) {
			if(x.isFile()) {
			System.out.println("A: " + ruta.getPath());
			}
			else if(x.isDirectory())
				System.out.println("D " + ruta.getPath());
		}
	}
	
}
