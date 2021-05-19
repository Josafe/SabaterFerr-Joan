package Deparbank;

public class AvisarHisendaException extends Exception{

	private double retirar;
	private String nombre;
	private static String IBAN;
	
	public AvisarHisendaException(double retirar) throws Exception {

		this.retirar = retirar;
		this.nombre = nombre;
		this.IBAN = IBAN;
	}
	
	public static String toString(){
			return "Notificació a HICENDA per una retirada superior a 3000€ en el compte " + nombre + "amb l'IBAN" + IBAN;
	}
}
