package jframe;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ClaseFrame extends JFrame 
	{
		private Container contenedor;
		JLabel labelTitulo;/*declaramos el objeto Label*/
		JTextArea areaDeTexto;
		String texto;
		
		public ClaseFrame()//constructor
		{
			contenedor=getContentPane();
			contenedor.setLayout(null);
			
			/*Propiedades del Label, lo instanciamos, posicionamos y
			 * activamos los eventos*/
			labelTitulo= new JLabel();
			labelTitulo.setText("CONTENIDOR JFRAME");
			labelTitulo.setBounds(120, 20, 180, 23);
			
			texto="Esta Finestra i la Finestra principal són unexemple de\n contenidors " +
					"JFrame, s'utilitzen per a finestres principals\n i permeten " +
					"emmagatzemar qualsevol tipus de component.";
			areaDeTexto = new JTextArea();
			areaDeTexto.setText(texto);
			areaDeTexto.setBounds(20, 50, 350, 100);
			
			/*Agregamos los componentes al Contenedor*/
			contenedor.add(labelTitulo);
			contenedor.add(areaDeTexto);
       		//Asigna un titulo a la barra de titulo
			setTitle("Finestra JFrame");
			//tamaño de la ventana
			setSize(400,200);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);
		}
	}