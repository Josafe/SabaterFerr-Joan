package jdialog;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import aplicacioPrincipal.VentanaPrincipal;

public class ClaseJDialog extends JDialog{
	private Container contenedor;
	JLabel labelTitulo;/*declaramos el objeto Label*/
	JTextArea areaDeTexto;
	String texto;
	
	public ClaseJDialog(VentanaPrincipal miVentanaPrincipal, boolean modal){
		/*Al llamar al constructor super(), le enviamos el
		 * JFrame Padre y la propiedad booleana que determina
		 * que es hija*/
		super(miVentanaPrincipal, modal);
		contenedor=getContentPane();
		contenedor.setLayout(null);
   		//Asigna un titulo a la barra de titulo
		setTitle("JDialog");
		
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENIDOR JDIALOG");
		labelTitulo.setBounds(140, 20, 180, 23);
		
		texto="Esta finestra és un JDialog, normalment s'utilitza com una finestra \n"+ 
				"de confirmació o com una finestra de dialeg aplicació-usuari. \n\n"+
				"Conté una propiedat que li permiteix ser filla d'un JFrame o un\n"+ 
				"altre JDialog, de esta forma podem inhabilitar la finestra pare\n"+
				"fins que tanquem la finestra filla (OBLIGA A TANCAR LA FINESTRA)\n";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(20, 50, 370, 100);
		
		/*Agregamos los componentes al Contenedor*/
		contenedor.add(labelTitulo);
		contenedor.add(areaDeTexto);
		//tamaño de la ventana
		setSize(430,200);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}
}
