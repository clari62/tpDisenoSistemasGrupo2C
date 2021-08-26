package swing_menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import swing_pasajeros.PanelAgregarPasajero;


public class framePrincipal {
	private static JFrame ventana;
	private static PanelAgregarPasajero panelAgregarPasajero;
	
	public static void main(String[] args) {
	
			ventana = new JFrame();
			ventana.setTitle("MENU PRINCIPAL");
			ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

			//ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); 

			PanelPrincipal panelPrincipal = new PanelPrincipal();
		ventana.setContentPane(panelPrincipal);
			ventana.setBackground(Color.GRAY);


			panelAgregarPasajero = new PanelAgregarPasajero();
			//GridBagLayout gridBagLayout = (GridBagLayout) panelAgregarPasajero.getLayout();
			//gridBagLayout.columnWeights = new double[] { 1.0 };
			
		//	ventana.setContentPane(panelAgregarPasajero);
			ventana.pack();
			ventana.setLocationRelativeTo(null);
			ventana.setVisible(true);

	}
}
