package swing_menu;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class PanelPrincipal extends JPanel{
	public PanelPrincipal() {
		setBackground(new Color(192, 192, 192));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		GridBagConstraints gbc= new GridBagConstraints();
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("MENÚ PRINCIPAL");
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 23));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(5, 10, 5, 10);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton = new JButton("GESTIONAR PASAJERO");
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnReservarHabitacin = new JButton("RESERVAR HABITACIÓN");
		btnReservarHabitacin.setBackground(new Color(204, 255, 255));
		btnReservarHabitacin.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		GridBagConstraints gbc_btnReservarHabitacin = new GridBagConstraints();
		btnReservarHabitacin.setPreferredSize(new Dimension(250, 55));
		gbc_btnReservarHabitacin.insets = new Insets(5, 10, 5, 10);
		gbc_btnReservarHabitacin.gridx = 3;
		gbc_btnReservarHabitacin.gridy = 2;
		add(btnReservarHabitacin, gbc_btnReservarHabitacin);
		
		JButton btnCancelarReserva = new JButton("CANCELAR RESERVA");
		btnCancelarReserva.setBackground(new Color(204, 255, 255));
		btnCancelarReserva.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnCancelarReserva.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnCancelarReserva = new GridBagConstraints();
		gbc_btnCancelarReserva.insets = new Insets(5, 10, 5, 10);
		gbc_btnCancelarReserva.gridx = 4;
		gbc_btnCancelarReserva.gridy = 2;
		add(btnCancelarReserva, gbc_btnCancelarReserva);
		
		JButton btnNewButton_3 = new JButton("CHECK-IN");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBackground(new Color(204, 255, 255));
		btnNewButton_3.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_3.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 3;
		add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CHECK-OUT");
		btnNewButton_4.setBackground(new Color(204, 255, 255));
		btnNewButton_4.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_4.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 3;
		add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("<html><body><center> GESTIONAR RESPONSABLE</br> DE PAGO</body></center></html>");
		btnNewButton_5.setBackground(new Color(204, 255, 255));
		btnNewButton_5.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_5.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_5.gridx = 4;
		gbc_btnNewButton_5.gridy = 3;
		add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("INGRESAR PAGO");
		btnNewButton_6.setBackground(new Color(204, 255, 255));
		btnNewButton_6.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_6.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_6.gridx = 2;
		gbc_btnNewButton_6.gridy = 4;
		add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("GESTIONAR LISTADOS");
		btnNewButton_7.setBackground(new Color(204, 255, 255));
		btnNewButton_7.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_7.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_7.gridx = 3;
		gbc_btnNewButton_7.gridy = 4;
		add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("DAR DE ALTA PASAJERO");
		btnNewButton_8.setBackground(new Color(204, 255, 255));
		btnNewButton_8.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_8.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_8.gridx = 4;
		gbc_btnNewButton_8.gridy = 4;
		add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_7_1 = new JButton("<html><body><center> INGRESAR NOTA</br> DE CREDITO <center></body> </html>");
		btnNewButton_7_1.setPreferredSize(new Dimension(250, 40));
		btnNewButton_7_1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnNewButton_7_1.setBackground(new Color(204, 255, 255));
		btnNewButton_7_1.setPreferredSize(new Dimension(250, 55));
		GridBagConstraints gbc_btnNewButton_7_1 = new GridBagConstraints();
		gbc_btnNewButton_7_1.insets = new Insets(5, 10, 5, 10);
		gbc_btnNewButton_7_1.gridx = 3;
		gbc_btnNewButton_7_1.gridy = 5;
		add(btnNewButton_7_1, gbc_btnNewButton_7_1);
	}

	
}