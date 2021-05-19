package crearMoureCarpetes;

import java.io.File;

public class Exercici4 {
	
	public static void main(String args[]) {
		
		
		// Creem Instancies de la classe FILE amb les RUTES RELATIVES de les carpetes que volem crear
		
		File lesMeuesCoses = new File ("Documentos/LesMeuesCoses"); //Crear la carpeta miscosas
		File alfabet = new File("Documentos/Alfabet"); //Crear la carpeta alfabets
		
		File[] llistaAlfabet = alfabet.listFiles();
		
		boolean resultat1 = lesMeuesCoses.mkdir();
		boolean resultat2 = alfabet.mkdir();
		
		/*
		if (lesMeuesCoses.exists()) {
			Fotografias.renameTo();
			Libros.renameTo("Documentos/Les Meues Coses");
		}
		 */
		
		
		
		// Creem les carpetes i ho comprovem. (NOTA: les variables resultat1 i resultat2 són BOOLEANES)
		
		/* Crea carpeta "Les Meues Coses" */
		System.out.println("S'ha creat la carpeta 'Documents/Les Meues Coses'?? " + resultat1);
		
		/* Crea carpeta "Alfabet" */
		System.out.println("S'ha creat la carpeta 'Documents/Alfabet'?? " + resultat2);
		
		// Anem a moure les carpetes. Primer creem instacies d'Objectes de la classe FILE amb les rutes origen i destí
		
		File fotoOrigen = new File("Documentos/Fotografias");
		File fotoDesti = new File("Documentos/Les Meues Coses/Fotografias");
		
		/* Crea les instancies Origen i Destí per a Libros */
		
		// Movem la carpeta 'Fotografias' dins de 'Les Meues Coses', i comprovem que s'ha mogut correctament 
		
		resultat1 = fotoOrigen.renameTo(fotoDesti);
		System.out.println("S'ha mogut la carpeta 'Documentos/Fotografias' a 'Documentos/Les Meues Coses/Fotografias'? " + resultat1);
		
		/* Mou la carpeta libros */
		
		/*Crea dins de la carpeta 'Alfabet', una carpeta per cada una de les lletres de l'alfabet en majuscules. AJUDA: consulta la taula de codi ASCII, utilitza un for i in CASTING de enter a char. */
		
		for (int i = 65; i <= 90; i++) {
			File abecedari = new File(alfabet.getParent() + " / " + alfabet.getName() + " / " + (char) i);
			abecedari.mkdir();
		}
		/* mostra per pantalla el contingut de la carpeta Alfabet*/
		
		for (File x : llistaAlfabet) {
		System.out.println(x.getName() + " ");
		}
	}
		
	} // Del Main()
	
 // De la Classe		