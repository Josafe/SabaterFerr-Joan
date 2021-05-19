package ExcepcionsThrow;
import java.util.ArrayList;
import java.util.Scanner;

public class GatoMain {
public static void main(String[] args) throws Exception {
		
	Scanner llegir = new Scanner(System.in);
	ArrayList<Gato> listagatos = new ArrayList<>();
	
	String nombre;
	int edad;
	//No hem funciona al afegir més de 1 gat i no se com solucionar-ho
	//Manera 1
	for (int i = 0; i < 5; i++) {
		System.out.println("Introdueix el nom i l'edat del gat");
		nombre = llegir.nextLine();
		edad = llegir.nextInt();
	}
	//Manera 2
	for (int i = 0; i < 5; i++) {
		System.out.println("Introdueix el nom i l'edat del gat");
		listagatos.add(new Gato(llegir.nextLine(), llegir.nextInt()));
	}
	
	
	for(Gato x : listagatos) {
		x.Imprimir();
	}
		try {
			Gato gat1 = new Gato("Mishu", 12);
			gat1.Imprimir();
			Gato gat2 = new Gato("Kitsune", 2);
			gat2.Imprimir();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			
		}
}

}
