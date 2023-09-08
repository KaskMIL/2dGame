package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el objeto JFrame
		JFrame windowFrame = new JFrame();
		
		// Permite al usurario cerrar la ventana cuando aprieta el boton [x]
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Seteamos que no se pueda resizear la ventana
		windowFrame.setResizable(false);
		// Seteamos nombre a la ventana
		windowFrame.setTitle("2D Adventures");
		// Especifica la posisicion relativa donde se va a abrir la pantalla
		windowFrame.setLocationRelativeTo(null);
		// Seteamos que sea visible la ventana
		windowFrame.setVisible(true);
		
		// Despues de crear la clase GamePanel y agregarle todos los settings de pantalla
		// la inicializamos y la agregamos a windowFrame
		GamePanel gamePanel = new GamePanel();
		windowFrame.add(gamePanel);
		
		// Luego la tenemos que packear para ver
		windowFrame.pack();

	}

}
