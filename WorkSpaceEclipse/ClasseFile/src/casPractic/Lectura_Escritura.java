package casPractic;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;

public class Lectura_Escritura {
Scanner llegir = new Scanner(System.in);

	//public void majorMenor(int min, int max) {
		public void majorMenor() {
		FileWriter fitxerEscritura = null;
		FileReader fitxerLectura = null;
		
		
		try {
			fitxerLectura = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\numeros.txt");
			fitxerEscritura = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\majorMenor.txt", true);
			
			//BufferedReader
			BufferedReader numFitxers = new BufferedReader(fitxerLectura);
			String linea = "";
			//List <String> llista = new ArrayList<String>(); //Llista metode List de java "no emprat a classe"
			String arrayDesordenat[] = null;
			
			while (linea != null) {
				linea = numFitxers.readLine(); 
					System.out.println(linea);
			}
			
			for (int i = 0; i < arrayDesordenat.length; i++) {
				for (int y = 0; y < linea.length(); i++){
				 
				}
			}

		}
		catch(Exception x) {
			
		}
		}
	
	public void notaAlumno() throws Exception{
		
		FileReader fitxerLectura = null;
		FileWriter fitxerEscritura = null;
		
		try {
		fitxerLectura = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\alumnos_notas.txt");
		fitxerEscritura = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\AlumneMitjaNomCognom", true);
		
		BufferedReader numFitxers = new BufferedReader(fitxerLectura);
		String linea = "";
		String vectorNotes[] = null;
		
		while (linea != null) {
			linea = numFitxers.readLine();
			System.out.println(linea);
		}
		for (int i = 0; i < vectorNotes.length; i++){
			for (int j = 0; j < vectorNotes[1].length(); j++)
			{
				
			}
		}
		}
		catch(FileNotFoundException x)
		{
			System.out.println("No s'ha trobat l'arxiu que es busca");
		}
	}
	
	public void ordenaArxius() throws Exception {
		
		
		
		try {
			FileReader fitxerLectura = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_personas.txt");
			FileWriter fitxerEscritura = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_personas_ordenat.txt");
			
			BufferedReader nomPersones = new BufferedReader(fitxerLectura);
			String lineaP = "";
			String arrayDesordenat[] = null;
			
			while (lineaP != null) {
				lineaP = nomPersones.readLine();
				System.out.println(lineaP);
			}
			
			for (int i = 0; i < arrayDesordenat.length; i++) {
				for (int j = 0; j < arrayDesordenat[1].length(); i++) {
					arrayDesordenat[i] = nomPersones.readLine();
					Arrays.sort(arrayDesordenat);
				}
			}
		}catch(FileNotFoundException x) {
			System.out.println("No s'ha trobat l'arxiu que es busca");
		}
	}
	
	public void NomsCognoms() throws Exception {
		Scanner llegir = new Scanner(System.in);
		int contador = 0;
		
		try {
		FileReader fitxerLecturaNoms = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_nombres.txt");
		FileReader fitxerLecturaCognoms = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_apellidos.txt");
		
		String linea = "";
		String[] array = null;
		BufferedReader Noms = new BufferedReader(fitxerLecturaNoms);
		BufferedReader Cognoms = new BufferedReader(fitxerLecturaCognoms);
		
		PrintWriter EscriuFitxer = new PrintWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_personas.txt");
		System.out.println("Quants noms i cognoms vols introduir al arxiu?");
		contador = llegir.nextInt();
		
		while (linea != null) {
			linea = Noms.readLine();
			linea = Cognoms.readLine();
			System.out.println(linea);
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < contador; i++) {
				
				EscriuFitxer.println("Nom:" + j);
				array[i] = Noms.readLine();
				array[i] = Cognoms.readLine();
			}
		}
		
		}catch(FileNotFoundException x){
			System.out.println("No s'ha trobat l'arxiu que es busca" + x);
		}finally {
			FileWriter fitxerEscritura = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_personas.txt");
			if (null != fitxerEscritura) {
				fitxerEscritura.close();
			}
		}
			
		}
	
	public void Diccionari() throws Exception{
		Scanner llegir = new Scanner(System.in);
		
		try {
		FileWriter fitxerEscritura = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\diccionario.txt");
		FileReader fitxerLectura = null;
		BufferedReader diccionari = new BufferedReader(fitxerLectura);
		String[] abecedari = null;
		abecedari = (llegir.nextLine()).split(" ");
		PrintWriter escriuArxiu = new PrintWriter(fitxerEscritura);
		for (int i = 0; i < abecedari.length; i++) {
			fitxerLectura = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\" + abecedari);
			escriuArxiu.println("Lletra" + i);
		}
		}catch(FileNotFoundException x) {
			System.out.println("No s'ha trobat l'arxiu que es busca" + x);
		}
	}
	public void BusquedaPI() {
		
		try {
		FileReader fitxerLecturaNoms = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\pi-million.txt");
		FileReader fitxerLecturaCognoms = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\");
		
		double numeropi = 0;
		System.out.println("Introdueix el numero per a veure si  existeix a la busqueda pi");
		numeropi = llegir.nextInt();
		
		/*if () {
			
		}*/
		
		}catch(FileNotFoundException x){
		System.out.println("No s'ha trobat l'arxiu especificat");
	}
	}
	
	
	}

