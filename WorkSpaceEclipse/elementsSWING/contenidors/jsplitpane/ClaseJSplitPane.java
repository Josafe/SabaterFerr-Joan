package jsplitpane;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import aplicacioPrincipal.VentanaPrincipal;

public class ClaseJSplitPane extends JDialog {
	JSplitPane splitPanel1;
	JTextArea areaDeTexto;
	String texto;
	JLabel labelTitulo, tituloPanel1,tituloPanel2;/*declaramos el objeto Label*/
	
	public ClaseJSplitPane(VentanaPrincipal miVentanaPrincipal, boolean modal){
		/*Al llamar al constructor super(), le enviamos el
		 * JFrame Padre y la propiedad booleana que determina
		 * que es hija*/
		super(miVentanaPrincipal, modal);

   		//Asigna un titulo a la barra de titulo
		setTitle("JSplitPane");
		
		/*Agregamos los componentes al Contenedor*/
		inciaComponentes();
		
		//tamaño de la ventana
		setSize(600,300);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		
	}

	private void inciaComponentes() {
		
		splitPanel1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		iniciaPanel1();
		
		splitPanel1.add(labelTitulo);
		splitPanel1.add(areaDeTexto);
		
		getContentPane().add(splitPanel1, BorderLayout.CENTER);

		pack();
		
	}

	private void iniciaPanel1() {
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENIDOR JSPLITPANE");
		//labelTitulo.setBounds(120, 20, 180, 23);
		
		
		texto="El JSplitPane s'tulitza per dividir la pantalla \n(un JFrame o també un JPanel) amb una barra divisoria. \nPodem posar dos i SOLS dos " +
				"components. \nCada  part de la pantalla presenta un panell diferent \non podem posar els components que necessitem." +
				"\nEn este exemple hem posat un JLabel i un \nJTexArea (etiqueta i àrea de text)" + 
				"\nLa barra es pot moure, i podem ordenar \nels 2 componentes en horitzontal i en vertical.";
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		//areaDeTexto.setBounds(20, 50, 350, 100);
		
	}

}
