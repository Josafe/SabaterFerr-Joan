package jscrollpane;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import aplicacioPrincipal.VentanaPrincipal;

public class ClaseJScrollPane extends JDialog 
	{
		private Container contenedor;
		JLabel labelTitulo;/*declaramos el objeto Label*/
		private JPanel miPanel;//contenedor de los componentes
		private JScrollPane scrollPaneles;
		JTextArea areaDeTexto;
		String texto;
		
		public ClaseJScrollPane(VentanaPrincipal miVentanaPrincipal, boolean modal)//constructor
		{
			super(miVentanaPrincipal, modal);
			miPanel = new JPanel();
			miPanel.setLayout(null);
			scrollPaneles = new JScrollPane(); 
			
			/*Propiedades del Label, lo instanciamos, posicionamos y
			 * activamos los eventos*/
			labelTitulo= new JLabel();
			labelTitulo.setText("CONTNIDOR JSCROLLPANE");
			labelTitulo.setBounds(120, 20, 180, 23);
			
			texto="Permet mostrar las barres d'scroll en la nostra finestra o \n" +
					"Secció de la finestra (si l'afegim a un Panel)\n" +
					"D'aquesta manera podem crear molts components en \nuna finestra sense " +
					"necessitat de que siguen molt grans.\n\n" +
					"Els Scrolls es mostren segons el tamany de la finestra. \nSi rediemsionem el suficient no es mostraran";
			areaDeTexto = new JTextArea();
			areaDeTexto.setText(texto);
			areaDeTexto.setBounds(20, 50, 350, 120);
			
			/*Agregamos los componentes al Contenedor*/
			miPanel.add(labelTitulo);
			miPanel.add(areaDeTexto);
			add(miPanel);
			miPanel.setPreferredSize(new java.awt.Dimension(400, 220));

			/*Definimos las propiedades del JSCrollPanel*/
			scrollPaneles.setAutoscrolls(true);//indicamos que se creen automaticamente los scroll
		    getContentPane().add(scrollPaneles);
			scrollPaneles.setViewportView(miPanel);//agregamos el panel al scroll 
			
       		//Asigna un titulo a la barra de titulo
			setTitle("JScrollPane");
			//tamaño de la ventana
			setSize(400,200);
			//pone la ventana en el Centro de la pantalla
			setLocationRelativeTo(null);
		}
	}