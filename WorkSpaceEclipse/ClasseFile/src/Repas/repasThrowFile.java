package Repas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class repasThrowFile {


	public static void main(String[] args) throws Exception{
		File arxiu = new File(System.getProperty("user.dir"));
		Scanner llegir = new Scanner(System.in);
		/*
		
		
		FileReader fitxerLectura = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos");
		FileWriter fitxerEscritura = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos");*/
		try {
			FileReader fitxerLecturanum = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos\\numeros.txt");
			FileWriter fitxerEscrituranum = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos\\majorMenor.txt");
			
			BufferedReader capturarFitxer = new BufferedReader(fitxerLecturanum);
			String[] separador = null;
			separador = (llegir.nextLine().split(" "));
			
			String linea = "";
			
			while(linea != null) {
				linea = capturarFitxer.readLine();
				System.out.println(linea);
			}
		
		
		}
		catch(Exception x) {
			System.out.println("No s'ha trobat l'arxiu");
		}
		
		try {
			FileReader fitxerLecturaalumnos = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos\\alumnos_notas.txt");
			FileWriter fitxerEscrituraalumnos = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos\\AlumneMitjaNomCognom.txt");
			BufferedReader capturarNotes = new BufferedReader(fitxerLecturaalumnos);
			
			String linea = "";
			
			while (linea != null) {
				linea = capturarNotes.readLine();
				System.out.println(linea);
			}
		}catch(Exception x) {
			System.out.println("No s'ha trobat l'arxiu");
		}
		
		try{
			FileReader fitxerLecturapersones = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_personas.txt");
			FileWriter fitxerEscriturapersones = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\usa_personas_ordenat.txt");
			BufferedReader capturarPersones = new BufferedReader(fitxerLecturapersones);
			
			String linea = "";
			
			while(linea != null) {
				linea = capturarPersones.readLine();
				System.out.println(linea);
			}
		}catch(Exception x) {
			
		}
		
		PrintWriter escriuArxiu = new PrintWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos\\ProvaEscritura.txt");
		try {
			FileReader fitxerLecturadiccionari = new FileReader("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\WorkSpaceEclipse\\3r_Tri\\Documentos\\diccionario.txt");
			FileWriter fitxerEscrituradiccionari = new FileWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\DocumentosProvaEscritura.txt");
			
			
			BufferedReader capturardiccionari = new BufferedReader(fitxerLecturadiccionari);
			String cadena = "";
			String linea = "";
			while (linea != null) {
				linea = capturardiccionari.readLine();
				System.out.println(linea);
			}
			System.out.println("Introdueix una paraula / numero");
			
			
			while(!cadena.equalsIgnoreCase("FI")) {
			cadena = llegir.nextLine();
			escriuArxiu.println(cadena);
			}
		}catch(Exception x) {
			
		}finally {
			escriuArxiu.close();
		}
		
		PrintWriter escriuArxiu2 = new PrintWriter("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos\\ProvaEscritura2.txt");
		try {
			String cadena2 = "";
			System.out.println("Introdueix un num / paraula");
			
			
			while(!cadena2.equalsIgnoreCase("END")) {
				cadena2 = llegir.nextLine();
				escriuArxiu2.println(cadena2);
			}
		}catch(Exception x) {
			
		}finally {
			escriuArxiu2.close();
		}
		
		File arxiu2 = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma\\Java\\Documentos");
		
		
		
	}
}
