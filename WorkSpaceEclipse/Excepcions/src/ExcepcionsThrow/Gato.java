package ExcepcionsThrow;

public class Gato {

	protected String Nombre;
	protected int edad;
	
	public Gato(String Nombre, int edad) throws Exception {
		if (Nombre.length() < 3) {
			throw new Exception (Nombre + " es massa curt per a ser un nom de gat");
		}
		else {
			System.out.println(Nombre);
		}
		this.Nombre = Nombre;
		
		if (edad < 0) {
			throw new Exception (edad + " es massa petit per a ser l'edad d'un gat");
		}
		else {
			System.out.println(edad);
		}
		this.edad = edad;	
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return Nombre;
	}
	
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			throw new Exception (edad + " es massa petit per a ser l'edad d'un gat");
		}
		else {
			System.out.println(edad);
		}
		this.edad = edad;
	}
	public void setNombre(String Nombre) throws Exception {
		
		if (Nombre.length() < 3) {
			throw new Exception (Nombre + " es massa curt per a ser un nom de gat");
		}
		else {
			System.out.println(Nombre);
		}
		this.Nombre = Nombre;
		
	}
	public void Imprimir(){
		System.out.println("Nombre: " + Nombre + " Edad: " + edad);
	}
		
	}
	

