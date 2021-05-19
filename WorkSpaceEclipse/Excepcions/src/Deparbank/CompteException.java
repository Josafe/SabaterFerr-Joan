package Deparbank;

public class CompteException extends Exception {

	protected String IBAN;
	protected double ingresar;
	protected double retirar;
	protected double Saldo;
	
	public CompteException(String IBAN, double ingresar, double retirar, double Saldo) {
		this.IBAN = IBAN;
		this.ingresar = ingresar;
		this.retirar = retirar;
		this.Saldo = Saldo;
	}
	
	Exception ExcepcioIBAN(String IBAN) {
		return new Exception ("L'IBAN introduit es incorrecte: " + IBAN);
	}
	
	Exception ExcepcioRetira(double retirar) {
		return new Exception("La retirada realitzada no es pot efectuar degut a que el saldo es negatiu [" + retirar + "]");
	}
	static Exception ExcepcioSaldo(double Saldo) {
		return new Exception("El saldo es negatiu [" + Saldo + "]");
	}

	

}
