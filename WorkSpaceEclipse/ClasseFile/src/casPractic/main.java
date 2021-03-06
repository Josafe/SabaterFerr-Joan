/*CAS PR?CTIC - FITXERS
MiniTerminal & MiniFileManager
Implementa un programa que funcione com una xicoteta terminal Linux amb alguns comandos
(simplificats) que permeten a l'usuari realitzar diferents operacions de gesti? d'arxius. Els comandos
que l'usuari podr? executar s?n:
1 pwd: Mostra quina ?s la carpeta actual.
2 cd <DIR>: Canvia la carpeta actual a ?DIR?. Amb .. canvia a la carpeta superior.
3 ls: Mostra la llista de directoris i arxius de la carpeta actual (primer directoris, despr?s arxius,
tots dos ordenats alfab?ticament).
4 ll: Com ls per? mostra tamb? la grand?ria i la data d'?ltima modificaci?.
5 mkdir <DIR>: Crea el directori ?DIR? en la carpeta actual.
6 rm <FILE>: Esborra ?FILE?. Si ?s una carpeta, esborrar? primer els seus arxius i despr?s la
carpeta. Si t? subcarpetes, les deixar? intactes i mostrar? un av?s a l'usuari.
7 mv <FILE1> <FILE2>: Mou o canvia de nom ?FILE1? a ?FILE2?.
8 help: Mostra una breu ajuda amb els comandos disponibles.
9 exit: Acaba el programa.
Classe MiniTerminal: Classe principal (amb funci? main) que s'encarregar? d'interactuar amb
l'usuari i interpretar els comandos (quin comando es demana, arguments, etc.). Utilitzar? la segona
classe per a realitzar les operacions de gesti? d'arxius. Manejar? totes les possibles excepcions.
Classe MiniFileManager: Tindr? els atributs i m?todes que necessites per a realitzar les diferents
operacions relacionades amb la gesti? d'arxius. Necessitar?s almenys un m?tode per cada operaci?.
Es llan?ar? una excepci? si es produeix un error o l'operaci? sol?licitada no ?s possible. Alguns
exemples que podries implementar:
1 String getPWD(): Retorna una cadena de text amb la carpeta actual.
2 boolean changeDir(String dir): Canvia la carpeta actual a dir . Retorna ?true? si ?s possible.
3 void printList(boolean info): Mostra una llista amb els directoris i arxius de la carpeta actual.
Si info ?s ?true? mostrar? tamb? la seua grand?ria i data de modificaci?.
4 etc.*/
package casPractic;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		Scanner llegir = new Scanner(System.in);
		
		MiniFileManager terminal = new MiniFileManager();
		Lectura_Escritura ampliacio = new Lectura_Escritura();
		String sw = "";
		String[] vector;
		
		System.out.println("Introdueix la ruta que vulgues accedir-hi");
		try {
		do {
		
		System.out.println("Joan@IesBenigaslo.es");
		vector = (llegir.nextLine()).split(" ");
		
		sw = vector[0];
			System.out.println(sw);
		switch(sw) {
		case "pwd": //"PWD"
			terminal.getpwd();
			break;
		case "cd": //"cd"
			terminal.getcd(vector[1]);
			break;
		case "ls": //"ls"
			terminal.getls(vector);
			break;
		case "ll": //"ll"
			terminal.getll(vector[0]);
			break;
		case "mkdir": //"mkdir"
			terminal.getmkdir(vector[1]);
			break;
		case "rm": //"rm"
			terminal.getremove(vector[1]);
			break;
		case "mv": //"mv"
			terminal.getmv(vector[1], vector[2]);
			break;
		case "help": //"help"
			System.out.println(terminal.gethelp());
			break;
		case "ampliacio":
			ampliacio.majorMenor();
			ampliacio.notaAlumno();
			ampliacio.ordenaArxius();
			ampliacio.NomsCognoms();
			ampliacio.Diccionari();
			ampliacio.BusquedaPI();
		
		break;
		case "exit": //"exit"
			
			break;		
		}
		} while (!sw.equals("Has sortit del terminal")); {
			
		}	
	}	catch(Exception x) {
		throw new FileNotFoundException("No es poden mostrar les dades de una carpeta que no existeix");
			}
}
}

