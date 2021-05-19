package Deparbank;
import java.util.ArrayList;
import java.util.Scanner;

public class CompteBancari {
	static Scanner llegir = new Scanner(System.in);

	private String IBAN;
	private String Titular;
	private double Saldo = 0;
	private ArrayList<Deparbank> llistamov = new ArrayList<>();
	private int ContadorMoviments = 100;
	private double ingresar;
	protected static double retirar;

	//CONSTRUCTOR
	public CompteBancari(String IBAN, String Titular, double Saldo) throws Exception{
	
	//AIXO VA AL METODE RETIRADA
		this.Saldo = Saldo;
		this.Titular = Titular;
		this.IBAN = IBAN;
	}
	//GETTER
public String getIban() {
	return IBAN;
}

public String getTitular() {
	return Titular;
}

public double getSaldo() {
	return Saldo;
}

public ArrayList getMoviments() {
	return llistamov;
}

public void Ingres(double ingresar) {
		
	
	
	for (int i = 0; i < 1; i++) {
		
		ingresar = llegir.nextDouble();
		
	if (ingresar <= 0) {
		System.err.println("Error: No pots ingressar una xifra inferior a 1");
		Saldo = 0;
		i--;
	}
		this.Saldo = Saldo + ingresar;
	}
	
	
}

public void Retira(double retirar) throws Exception {
	
	
	
	for (int i = 0; i < 1; i++) {
		
		retirar = llegir.nextDouble();
		this.Saldo = Saldo - retirar;
		
		
	if (retirar <= 0) {
		throw new Exception ("No pots afegir una xifra menor a 1 " + retirar);
		
	if(Saldo < -50) {
			CompteException.ExcepcioSaldo(llegir.nextInt());
	}
		Saldo = 0;
		i--;
	}

	if(Saldo < 0) {
		System.err.println("AVIS: Saldo negatiu");
	}
	
	
	else if (retirar > 3000) {
		AvisarHisendaException.toString();
	}
	
	
	}
}

public void imprimirRetira() {
	Retira(retirar);
}
public void imprimirIngres() {
	Ingres(ingresar);
	
}
public void imprimirMoviments() {
	
	for (int i = 0; i < 1; i++) {
	System.out.println(llistamov);
	}

	System.out.println("Has ingressat: " + ingresar);
	System.out.println("Has retirat: " + retirar);
	
	System.out.println("El teu saldo total es: " + Saldo);
	
}
public void imprimir() {
	imprimirRetira();
	imprimirIngres();
	imprimirMoviments();
	 
}
}