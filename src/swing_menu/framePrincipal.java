package swing_menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import swing_pasajeros.PanelAgregarPasajero;
import swing_pasajeros.PanelAgregarPasajero2;
import swing_pasajeros.PanelAgregarPasajero3;

public class framePrincipal {
	private static JFrame ventana;
	private static PanelAgregarPasajero3 panelAgregarPasajero;
	
	public static void main(String[] args) {
	
			ventana = new JFrame();
			ventana.setTitle("MENU PRINCIPAL");
			ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

			//ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); 

			PanelPrincipal panelPrincipal = new PanelPrincipal();
			//ventana.setContentPane(panelPrincipal);
			//ventana.setBackground(Color.GRAY);
			ventana.setSize(new Dimension(800,600));
			//ventana.setMinimumSize(new Dimension(800,600));
			//ventana.setResizable(false);
			panelAgregarPasajero = new PanelAgregarPasajero3();
			ventana.setContentPane(panelAgregarPasajero);
			//ventana.pack();
			ventana.setLocationRelativeTo(null); 
			ventana.setVisible(true);

	}
}
