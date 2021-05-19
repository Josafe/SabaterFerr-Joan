package renombrarDirectori;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;


/*
 * Mètodes de la classe FILE:
 * renameTo()
 * File[] listFiles()
 * 
 * Mètodes de la classe ARRAYS
 * sort()
 * 
 * Per imprimir els axrius i directoris de manera ordenada, crearem una funció anomenada imprimirLlistaArxius() 
 * Per esborrar les extensions crearem una funció anomenada llevarExtensionsArxius()
 * 
 */

public class Exercici3 {
	

    /* **************************
     * Reanomenem les carpetes *
     * **************************/

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. (PER A LA CARPETA DOCUMENTS)       
	
	public static void main (String args[]) {
		
		File docOrigen = new File("Documentos");
		File docDesti = new File("DOCS");

// Comprove que la carpetada DOCUMENTOS esta creada, simplement és per acotar errors
		
		if(!docOrigen.exists())
			System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
		
// Reanomenem la carpeta Documents
		docOrigen.renameTo(docDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom
		
		File fotoOrigen = new File("DOCS/Fotografias");
		File fotoDesti = new File("DOCS/FOTOS");
		fotoOrigen.renameTo(fotoDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA LIBROS) i canviem el nom
		
		File llibreOrigen = new File("DOCS/Libros");
		File llibreDesti = new File("DOCS/LECTURES");
		llibreOrigen.renameTo(llibreDesti);
		

		/* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
           ********************************************************** */
        
// ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funció imprimirLlistaArxius()


		ImprimirLlista(llibreDesti);
		llevarExtensions(llibreDesti);
		ImprimirLlista(llibreDesti);
		
		

// Reanomenem els arxius, llenvant les Extensions cridant a la funció llevarExtensionsArxius()


		
		

// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funció imprimirLlistaArxius()


	
		
} // del main()
	
	public static void ImprimirLlista(File llibreDesti) {
		File[] llistaFitxers = llibreDesti.listFiles();
		Arrays.sort(llistaFitxers);
		
		for (File x : llistaFitxers) {
			if(x.isFile()) {
			System.out.println(x.getName());
			}
		}
	}
	
	public static void llevarExtensions(File llibreDesti) {
		
		for(File x : llibreDesti.listFiles()) {
			String[] S = x.getName().split("\\.");
			File fDesti = new File(x.getParent() + "/" + S[0]);
			
			//Reanomenar arxiu
			x.renameTo(fDesti);
		}
	}
	
/*
 * IMPRIMIR LLISTA ARXIUS
 * 
 */
	
	
/*
 * 
 * LLEVAR EXTENSIONS ARXIUS
 * 	
 */
	
	



} // de la classe
