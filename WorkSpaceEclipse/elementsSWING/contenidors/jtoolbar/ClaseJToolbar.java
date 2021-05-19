package jtoolbar;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import aplicacioPrincipal.VentanaPrincipal;

public class ClaseJToolbar extends JDialog{

	JLabel labelTitulo;/*declaramos el objeto Label*/
	JTextArea areaDeTexto;
	String texto;
	JToolBar barraDeOpciones;
	JButton boton1,boton2,boton3;
	JTextField campo1;
	JPanel miPanel;
	public ClaseJToolbar(VentanaPrincipal miVentanaPrincipal, boolean modal){
		/*Al llamar al constructor super(), le enviamos el
		 * JFrame Padre y la propiedad booleana que determina
		 * que es hija*/
		super(miVentanaPrincipal, modal);
		
		miPanel=new JPanel();
		miPanel.setLayout(null);

   		//Asigna un titulo a la barra de titulo
		setTitle(" JToolbar");
				
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setText("CONTENIDOR JTOOLBAR");
		labelTitulo.setBounds(120, 30, 180, 23);
		
		texto="Este contenidor representa una barra d'eines om podem posar \ndiferents components de JAVA SWING (en este cas 3 botos \ni una caixa de text)." +
			  "\nPodem arrastrar esta barra a qualsevol posici� dels extrems \nde la finestra" +
			  "o treure fora com una finestra independent." ;
		areaDeTexto = new JTextArea();
		areaDeTexto.setText(texto);
		areaDeTexto.setBounds(40, 60, 350, 100);
		
		boton1=new JButton();
		boton2=new JButton();
		boton3=new JButton();
		boton1.setText("bot�1");
		boton2.setText("bot�2");
		boton3.setText("bot�3");
		campo1= new JTextField();
				
		/*Propiedades de jtoolbar*/
		barraDeOpciones = new JToolBar();
        barraDeOpciones.add(boton1);
        barraDeOpciones.add(boton2);
        barraDeOpciones.add(boton3);
        barraDeOpciones.add(campo1);
        
        //Agrega la barra a la ventana y define como se distribuyen los componentes en ella 
		getContentPane().add(barraDeOpciones, BorderLayout.NORTH);
		pack();
		/*Agregamos los componentes al Contenedor*/
		miPanel.add(labelTitulo);
		miPanel.add(areaDeTexto);
		add(miPanel);
		//tama�o de la ventana
		setSize(440,300);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
	}
}
