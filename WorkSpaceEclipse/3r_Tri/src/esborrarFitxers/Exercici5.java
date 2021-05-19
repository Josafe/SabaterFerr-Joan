package esborrarFitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.InputMismatchException;

public class Exercici5 {
	public static void main(String[] args) throws Exception {

        // Instaciem a la classe FILE amb les rutes relatives a les carpetes que volem esborrar
		  File fotografies = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r Tri\\Documentos\\Fotografias");
	      File llibres = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r Tri\\Documentos\\Libros");
	      File documents = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r Tri\\Documentos");

        boolean resultat = false;

        try {
            // Esborrem la carpeta 'Fotografias' i tot el seu contingut
        	resultat = esborrarTot(fotografies);
            if (resultat) {
                System.out.println("La carpeta 'Fotografias' ha segut esborrada");
            }

            // Esborrem la carpeta 'Libros' i tot el seu contingut
            resultat = esborrarTot(llibres);
            if (resultat) {
                System.out.println("La carpeta 'Libros' ha segut esborrada");
            }

            // Esborrem la carpeta 'Documentos' i tot el seu contingut
            resultat = esborrarTot(documents);
            if (resultat) {
                System.out.println("La carpeta 'Documentos' ha segut esborrada");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    } // Del main()
	

   /* Crea una funció anemomenada esborrarTot() que elimine tots els arxius i carpetes d'una ruta,
    * 
    * Si no existeix la ruta mostra una excepció.
    * Si és un arxiu l'esborrem
    * Si és una carpeta, primer eliminem tots els seus arxius, i després, esborre la carpeta
    * 
    */
  public static boolean esborrarTot(File f) throws Exception {
	  
	  boolean resultat = false;
	  
	 if (f.exists()) {
		 throw new FileNotFoundException("Esta mal introduida la ruta");
	 }
	 if (f.isFile() == true) {
			 f.delete();
			 resultat = true;
		 
	 }
	 File[] llista = f.listFiles();
	 
	 if (f.isDirectory()) {
	 for (File x : llista) { //Primer s'esborraran els arxius
		 System.out.println(x + "Han estat esborrats correctament");
		 x.delete();
	 }
	 f.delete(); //Despres eliminarem f (el directori)
	 }
	 return resultat;
	  
  }


} // de la classe
