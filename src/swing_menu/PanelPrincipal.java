package swing_menu;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;

public class PanelPrincipal extends JPanel{
	public PanelPrincipal() {
	//	setBackground(new Color(192, 192, 192));
		setBackground(SystemColor.controlHighlight);
		//setBackground(Color.white);
		GridBagLayout gridBagLayout = new GridBagLayout();

		//gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		//gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

		gridBagLayout.columnWidths = new int[]{120, 120, 120, 120, 120,120,100};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		ImageIcon usuario = new ImageIcon("C:\\Users\\antof\\git\\tpDisenoSistemasGrupo2C\\src");
		
		JButton btnNewButton = new JButton(usuario);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 1;
		add(btnNewButton, gbc_btnNewButton);
		
		String fechaStr = LocalDate.now().toString();
		JLabel fecha = new JLabel(fechaStr);
		fecha.setFont(new Font("Leelawadee UI", Font.BOLD, 17));
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor= GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(10, 0, 5, 15);
		gbc_lblFecha.gridx = 4;
		gbc_lblFecha.gridy = 1;
		add(fecha, gbc_lblFecha);
		
		String horaStr = LocalTime.now().toString();
		JLabel hora = new JLabel(horaStr);
		hora.setFont(new Font("Leelawadee UI", Font.BOLD, 17));
		GridBagConstraints gbc_hora = new GridBagConstraints();
		gbc_hora.insets = new Insets(10, 0, 5, 15);
		gbc_hora.gridx = 4;
		gbc_hora.gridy = 2;
		add(hora, gbc_hora);
		
		JLabel lblMenuPrincipal = new JLabel("MENÚ PRINCIPAL");
		lblMenuPrincipal.setFont(new Font("Leelawadee UI", Font.BOLD, 23));
		GridBagConstraints gbc_lblMenu = new GridBagConstraints();
		gbc_lblMenu.insets = new Insets(5, 10, 5, 10);
		gbc_lblMenu.gridx = 3;
		gbc_lblMenu.gridy = 3;
		add(lblMenuPrincipal, gbc_lblMenu);
		
		JButton btnGestionarPasajero = new JButton("GESTIONAR PASAJERO");
		btnGestionarPasajero.setBackground(new Color(204, 255, 255));
		btnGestionarPasajero.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnGestionarPasajero.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnGestionarPasajero = new GridBagConstraints();
		gbc_btnGestionarPasajero.insets = new Insets(5, 10, 5, 10);
		gbc_btnGestionarPasajero.gridx = 2;
		gbc_btnGestionarPasajero.gridy = 4;
		add(btnGestionarPasajero, gbc_btnGestionarPasajero);
		
		JButton btnReservarHabitacin = new JButton("RESERVAR HABITACIÓN");
		btnReservarHabitacin.setBackground(new Color(204, 255, 255));
		btnReservarHabitacin.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		GridBagConstraints gbc_btnReservarHabitacin = new GridBagConstraints();
		btnReservarHabitacin.setPreferredSize(new Dimension(250, 55));
		gbc_btnReservarHabitacin.insets = new Insets(5, 10, 5, 10);
		gbc_btnReservarHabitacin.gridx = 3;
		gbc_btnReservarHabitacin.gridy = 4;
		add(btnReservarHabitacin, gbc_btnReservarHabitacin);
		
		JButton btnCancelarReserva = new JButton("CANCELAR RESERVA");
		btnCancelarReserva.setBackground(new Color(204, 255, 255));
		btnCancelarReserva.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnCancelarReserva.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnCancelarReserva = new GridBagConstraints();
		gbc_btnCancelarReserva.insets = new Insets(5, 10, 5, 10);
		gbc_btnCancelarReserva.gridx = 4;
		gbc_btnCancelarReserva.gridy = 4;
		add(btnCancelarReserva, gbc_btnCancelarReserva);
		
		JButton btnCheckIn= new JButton("CHECK-IN");
		btnCheckIn.setBackground(new Color(204, 255, 255));
		btnCheckIn.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnCheckIn.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnCheckIn = new GridBagConstraints();
		gbc_btnCheckIn.insets = new Insets(5, 10, 5, 10);
		gbc_btnCheckIn.gridx = 2;
		gbc_btnCheckIn.gridy = 5;
		add(btnCheckIn, gbc_btnCheckIn);
		
		JButton btnCheckOut= new JButton("CHECK-OUT");
		btnCheckOut.setBackground(new Color(204, 255, 255));
		btnCheckOut.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnCheckOut.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnCheckOut= new GridBagConstraints();
		gbc_btnCheckOut.insets = new Insets(5, 10, 5, 10);
		gbc_btnCheckOut.gridx = 3;
		gbc_btnCheckOut.gridy = 5;
		add(btnCheckOut, gbc_btnCheckOut);
		
		JButton btnGestionarResponsable = new JButton("<html><body><center> GESTIONAR RESPONSABLE</br> DE PAGO</body></center></html>");
		btnGestionarResponsable.setBackground(new Color(204, 255, 255));
		btnGestionarResponsable.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnGestionarResponsable.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnGestionarResponsable = new GridBagConstraints();
		gbc_btnGestionarResponsable.insets = new Insets(5, 10, 5, 10);
		gbc_btnGestionarResponsable.gridx = 4;
		gbc_btnGestionarResponsable.gridy = 5;
		add(btnGestionarResponsable, gbc_btnGestionarResponsable);
		
		JButton btnIngresarPago = new JButton("INGRESAR PAGO");
		btnIngresarPago.setBackground(new Color(204, 255, 255));
		btnIngresarPago.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnIngresarPago.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnIngresarPago = new GridBagConstraints();
		gbc_btnIngresarPago.insets = new Insets(5, 10, 5, 10);
		gbc_btnIngresarPago.gridx = 2;
		gbc_btnIngresarPago.gridy = 6;
		add(btnIngresarPago, gbc_btnIngresarPago);
		
		JButton btnGestionarListados = new JButton("GESTIONAR LISTADOS");
		btnGestionarListados.setBackground(new Color(204, 255, 255));
		btnGestionarListados.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnGestionarListados.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnGestionarListados = new GridBagConstraints();
		gbc_btnGestionarListados.insets = new Insets(5, 10, 5, 10);
		gbc_btnGestionarListados.gridx = 3;
		gbc_btnGestionarListados.gridy = 6;
		add(btnGestionarListados, gbc_btnGestionarListados);
		
		JButton btnDarAlta= new JButton("DAR DE ALTA PASAJERO");
		btnDarAlta.setBackground(new Color(204, 255, 255));
		btnDarAlta.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnDarAlta.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnDarAlta = new GridBagConstraints();
		gbc_btnDarAlta.insets = new Insets(5, 10, 5, 10);
		gbc_btnDarAlta.gridx = 4;
		gbc_btnDarAlta.gridy = 6;
		add(btnDarAlta, gbc_btnDarAlta);
		
		JButton btnIngresarNotaCredito = new JButton("<html><body><center> INGRESAR NOTA</br> DE CREDITO <center></body> </html>");
		btnIngresarNotaCredito.setPreferredSize(new Dimension(250, 40));
		btnIngresarNotaCredito.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnIngresarNotaCredito.setBackground(new Color(204, 255, 255));
		btnIngresarNotaCredito.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnIngresarNotaCredito= new GridBagConstraints();
		gbc_btnIngresarNotaCredito.insets = new Insets(5, 10, 0, 10);
		gbc_btnIngresarNotaCredito.gridx = 3;
		gbc_btnIngresarNotaCredito.gridy = 7;
		add(btnIngresarNotaCredito, gbc_btnIngresarNotaCredito);
	}

	
}