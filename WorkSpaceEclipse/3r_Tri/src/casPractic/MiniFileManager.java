package casPractic;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MiniFileManager { 

	File rutaActual = new File(System.getProperty("user.dir"));
	//File ruta = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java");
	
	public MiniFileManager() {
		this.rutaActual = rutaActual;
	}
	
	
	public String gethelp() {
		return "PWD-    Mostra el directori actual \n cd-	Canvia la carpeta actual a 'DIR' Amb .. canvia a la carpeta superior \n ls-		Mostra la llista de directoris i arxius de la carpeta actual (primer directoris, després arxius, tots dos ordenats alfabèticament \n ll- Com ls però mostra també la grandària i la data d'última modificació \n mkdir- Crea el directori DIR en la carpeta actual \n rm- Esborra el FILE si es una carpeta esborrara primer els arxius i despres la carpeta \n mv-		 Mou o canvia de nom FILE1 a FILE2 \n help- 	Mostra una breu ajuda amb les comandes disponibles \n exit:	 Finalitza el programa";
	}
	
	public void getpwd() {
		System.out.println(rutaActual.getPath()); 
	}
	
	/*cd <DIR>: Canvia la carpeta actual a ‘DIR’.
	Amb .. canvia a la carpeta superior. Moure's entre directoris*/
	
	public void getcd(String rutaDesti) throws Exception {
	
		String move = (rutaActual.getAbsolutePath() + "\\" + rutaDesti);
		System.out.println(move);
		try {
			
		if (rutaDesti.equals("..")) {
			rutaActual = new File(rutaActual.getParent());
		}
		else {
		File novaRuta = new File(move);
		rutaActual = novaRuta;
		}}
		catch(Exception x) {
			throw new FileNotFoundException("No s'ha trobat l'arxiu");
		}
	}
 	
	/*ls: Mostra la llista de directoris i arxius de la carpeta actual (primer directoris, després arxius,
	tots dos ordenats alfabèticament).*/

	public void getls(String[] vector) {
		 
		File[] llista = rutaActual.listFiles(); //Per a ordenar-los alfabeticament necessitarem fer us de una llista d'arxius ¡¡¡Falta acabar-ho!!!+
		
		if(rutaActual.exists()) {
			System.out.println("El nom del fitxer es: " + rutaActual.getName());
		}
		
		Arrays.sort(llista);
		
		for(File x : llista) {
			if(x.isFile()) {
				System.out.println("[A]" + rutaActual.getPath());
			}
			else if(x.isDirectory()) {
				System.out.println("[D]" + rutaActual.getPath());
			}
		}
		
	}
	/*ll: Com ls però mostra també la grandària i la data d'última modificació.*/
	public void getll(String vector) throws Exception{
		
		File[] llista = rutaActual.listFiles(); //Per a ordenar-los alfabeticament necessitarem fer us de una llista d'arxius ¡¡¡Falta acabar-ho!!!
		try {
		if(rutaActual.exists()) {
			System.out.println("El nom del fitxer es: " + rutaActual.getName());
		}
		
		Arrays.sort(llista); //Ordenar llista
		
		for(File x : llista) {
			
			if(x.isFile()) {
			System.out.println("[A]" + rutaActual.getPath());
			System.out.print(rutaActual.lastModified());
			System.out.print(" " + rutaActual.length());
			}
		
			else if(x.isDirectory()) {
			
				System.out.println("[D]" + rutaActual.getPath());
				System.out.print("Ultima modificació: " + rutaActual.lastModified());	
				System.out.print("  Llargaria en bits:  " + rutaActual.length());
			}
		} 
		
	}catch(Exception x) {
			throw new FileNotFoundException();
	}
	}
	
	public void getmkdir(String rutaDesti){
		
		boolean crearCarpeta = false;
		
		File novaCarpeta = new File(rutaActual + "\\" + rutaDesti);
		
		if (crearCarpeta = true) {
			System.out.println("S'ha creat el directori " + rutaDesti);
			novaCarpeta.mkdir();	 
		}
		else if (crearCarpeta = false)
			System.out.println("No s'ha pogut crear la carpeta");
	}
	
	/*rm <FILE>: Esborra ‘FILE’. Si és una carpeta, esborrarà primer els seus arxius i després la
carpeta. Si té subcarpetes, les deixarà intactes i mostrarà un avís a l'usuari. */
	
	public void getremove(String rutaDesti) throws FileNotFoundException {
		
		boolean borrarCarpeta = false;
		
		File borrar = new File(rutaActual + "\\" + rutaDesti);
		
		try {
			if (borrarCarpeta = true) {
				borrar.delete();
				System.out.println("S'ha esborrat la seguent carpeta " + rutaDesti);
			}
			else if (borrarCarpeta = false){
				System.out.println("El directori que has introduit no existeix." + borrar.delete());
			} 
		
		File[] llista = rutaActual.listFiles();
		
		if(borrar.isDirectory()) {
			for (File x : llista) {
				System.out.println(x + "Han estat esborrats correctament");
				
			}
			borrar.delete();
			
		}
		}catch (Exception x) {
			System.out.println("No pots eliminar l'arxiu");
		}
	}
	/* mv <FILE1> <FILE2>: Mou o canvia de nom ‘FILE1’ a ‘FILE2’.*/
	public void getmv(String rutaOrigen, String rutaDesti) throws FileNotFoundException {
	
		try {
		File directoriO = new File(rutaActual.getAbsolutePath()); 
		System.out.println("ruta actual: " + rutaActual);
		File directoriD = new File (rutaActual.getAbsolutePath() + "\\" + rutaDesti);
		System.out.println("ruta actual: " + rutaActual + " || ruta desti: " + rutaDesti);
		
		if (directoriO.exists()) {
		directoriO.renameTo(directoriD);
		}
		else {
			throw new Exception("No pots moure això");
		}
		System.out.println("S'ha mogut la carpeta a: " + directoriD);
		}
		catch (Exception x) {
			System.out.println("No s'ha trobat l'arxiu");
		}
	}
}
