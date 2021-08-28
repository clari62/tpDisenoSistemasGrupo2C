package swing_menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import swing_pasajeros.PanelAgregarPasajero;
//import swing_pasajeros.PanelGestionarPasajero;

public class framePrincipal {
	private static JFrame ventana;
	private static PanelAgregarPasajero panelAgregarPasajero;
//	private static PanelGestionarPasajero panelGestionarPasajero;

	public static void main(String[] args) {
	
			ventana = new JFrame();
			ventana.setTitle("MENU PRINCIPAL");
			ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

			//ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); 

			PanelPrincipal panelPrincipal = new PanelPrincipal();
			ventana.setSize(new Dimension(800,600));
			ventana.setContentPane(panelPrincipal);
			ventana.setBackground(Color.GRAY);


			panelAgregarPasajero = new PanelAgregarPasajero();
			//GridBagLayout gridBagLayout = (GridBagLayout) panelAgregarPasajero.getLayout();
			//gridBagLayout.columnWeights = new double[] { 1.0 };
			
		//	ventana.setContentPane(panelAgregarPasajero);
			ventana.pack();
			ventana.setLocationRelativeTo(null);

			panelAgregarPasajero = new PanelAgregarPasajero();
		//	panelGestionarPasajero = new PanelGestionarPasajero();
			//ventana.setContentPane(panelGestionarPasajero);
			//ventana.pack();
			ventana.setLocationRelativeTo(null); 

			ventana.setVisible(true);

	}
}
