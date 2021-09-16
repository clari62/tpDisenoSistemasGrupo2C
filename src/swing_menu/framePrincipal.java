package swing_menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import swing_facturacion.PanelFacturar1;

import swing_habitacion.PanelOcuparHabitacion2;
import swing_habitacion.PanelReservarHabitacion1;
import swing_ingresos.PanelListarIngresos;
import swing_pasajeros.PanelAgregarPasajero;

//import swing_pasajeros.PanelGestionarPasajero;

import swing_pasajeros.PanelGestionarPasajero;
import swing_reservas.PanelReservarHabitacion2;
//import swing_reservas.PanelReservarHabitacion2;


public class framePrincipal {
	private static JFrame ventana;
	private static PanelPrincipal panelPrincipal;
	private static PanelAgregarPasajero panelAgregarPasajero;

	private static PanelFacturar1 panelfacturar1;

	private static PanelOcuparHabitacion2 panelOcuparHabitacion2;
	private static PanelReservarHabitacion1 panelReservarHabitacion1;
	

//	private static PanelGestionarPasajero panelGestionarPasajero;


	private static PanelGestionarPasajero panelGestionarPasajero;

	public static void main(String[] args) {
	
			ventana = new JFrame();
			ventana.setTitle("MENU PRINCIPAL");
			ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

			panelPrincipal = new PanelPrincipal();
			ventana.setSize(new Dimension(800,600));

			ventana.setBackground(Color.GRAY);


		//	ventana.setContentPane(panelAgregarPasajero);

			ventana.setLocationRelativeTo(null);
		//	panelGestionarPasajero = new PanelGestionarPasajero();

		//ventana.setContentPane(panelGestionarPasajero);
			
					
		//PanelReservarHabitacion2 panelReservarHabitacion2 = new PanelReservarHabitacion2();
			
			panelAgregarPasajero = new PanelAgregarPasajero();
			panelGestionarPasajero = new PanelGestionarPasajero();
		//	ventana.setContentPane(panelReservarHabitacion2);
			panelfacturar1 = new PanelFacturar1();
			ventana.setContentPane(panelfacturar1);
			ventana.pack();
			ventana.setLocationRelativeTo(null);
			//ventana.setContentPane(panelGestionarPasajero);


			PanelReservarHabitacion2 panelReservarHabitacion2 = new PanelReservarHabitacion2();
			PanelListarIngresos panelListarIngresos = new PanelListarIngresos();
			
			panelAgregarPasajero = new PanelAgregarPasajero();
			panelGestionarPasajero = new PanelGestionarPasajero();
			//ventana.setContentPane(panelListarIngresos);
			//ventana.pack();
			ventana.setLocationRelativeTo(null); 

			//PanelReservarHabitacion2 panelReservarHabitacion2 = new PanelReservarHabitacion2();
			
			panelAgregarPasajero = new PanelAgregarPasajero();
			panelGestionarPasajero = new PanelGestionarPasajero();
			panelReservarHabitacion1 = new PanelReservarHabitacion1();
			panelOcuparHabitacion2 = new PanelOcuparHabitacion2();
			ventana.setContentPane(panelOcuparHabitacion2);

			ventana.setVisible(true);

	}
}
