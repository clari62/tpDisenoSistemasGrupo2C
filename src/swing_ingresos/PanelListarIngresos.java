package swing_ingresos;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.Icon;


public class PanelListarIngresos extends JPanel {

	private JTable table;
	private JTable table_4;


public PanelListarIngresos() {
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{757};
	gridBagLayout.columnWeights = new double[]{0.0};
	gridBagLayout.rowWeights = new double[]{0.0, 1.0};
	gridBagLayout.rowHeights = new int[]{75, 229};


	setLayout(gridBagLayout);
	
	JPanel panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel = new GridBagConstraints();
	gbc_panel.anchor = GridBagConstraints.NORTH;
	gbc_panel.insets = new Insets(5, 0, 5, 0);
	gbc_panel.fill = GridBagConstraints.HORIZONTAL;
	gbc_panel.gridx = 0;
	gbc_panel.gridy = 0;
	add(panel, gbc_panel);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{237, 136, 232, 0};
	gbl_panel.rowHeights = new int[]{45, 0, 0, 48, 52, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JLabel lblNewLabel = new JLabel("Desde fecha:");
	lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel.insets = new Insets(5, 0, 5, 5);
	gbc_lblNewLabel.gridx = 0;
	gbc_lblNewLabel.gridy = 1;
	panel.add(lblNewLabel, gbc_lblNewLabel);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser = new GridBagConstraints();
	gbc_dateChooser.gridwidth = 2;
	gbc_dateChooser.insets = new Insets(5, 0, 5, 0);
	gbc_dateChooser.fill = GridBagConstraints.BOTH;
	gbc_dateChooser.gridx = 1;
	gbc_dateChooser.gridy = 1;
	panel.add(dateChooser, gbc_dateChooser);
	
	JLabel lblHastaFecha = new JLabel("Hasta fecha:");
	lblHastaFecha.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblHastaFecha = new GridBagConstraints();
	gbc_lblHastaFecha.anchor = GridBagConstraints.EAST;
	gbc_lblHastaFecha.insets = new Insets(5, 0, 5, 5);
	gbc_lblHastaFecha.gridx = 0;
	gbc_lblHastaFecha.gridy = 2;
	panel.add(lblHastaFecha, gbc_lblHastaFecha);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	dateChooser_1.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
	gbc_dateChooser_1.gridwidth = 2;
	gbc_dateChooser_1.insets = new Insets(5, 0, 5, 0);
	gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
	gbc_dateChooser_1.gridx = 1;
	gbc_dateChooser_1.gridy = 2;
	panel.add(dateChooser_1, gbc_dateChooser_1);
	
	JButton btnNewButton = new JButton("BUSCAR");
	btnNewButton.setBackground(new Color(204,255,255));
	btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
	gbc_btnNewButton.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton.gridx = 1;
	gbc_btnNewButton.gridy = 4;
	panel.add(btnNewButton, gbc_btnNewButton);
	
	JButton btnCancelar = new JButton("CANCELAR");
	btnCancelar.setBackground(new Color(204,255,255));
	btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
	gbc_btnCancelar.anchor = GridBagConstraints.WEST;
	gbc_btnCancelar.gridx = 2;
	gbc_btnCancelar.gridy = 4;
	panel.add(btnCancelar, gbc_btnCancelar);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.insets = new Insets(0, 0, 5, 0);
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 1;
	add(panel_1, gbc_panel_1);
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{350, 71, 210};
	gbl_panel_1.rowHeights = new int[]{115, 0, 115, 0, 0, 0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0};
	gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	panel_1.setLayout(gbl_panel_1);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			},
		new String[] {
			"Tipo ingreso", "Fecha", "Monto"
		}
	));
	
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.gridwidth = 3;
	gbc_table.insets = new Insets(5, 5, 5, 0);
	gbc_table.fill = GridBagConstraints.HORIZONTAL;
	gbc_table.gridx = 0;
	gbc_table.gridy = 0;
	//panel_1.add(table, gbc_table);

	
	JScrollPane scrollPane = new JScrollPane(table);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 0;
	gbc_table.gridy = 0;
	//add(scrollPane, gbc_table);
	panel_1.add(scrollPane, gbc_table);
	
	
	table_4 = new JTable();
	table_4.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
		},
		new String[] {
			"Tipo ingreso", "Tipo moneda", "Monto ingresado"
		}
	));
	GridBagConstraints gbc_table_4 = new GridBagConstraints();
	gbc_table_4.gridwidth = 3;
	gbc_table_4.ipady = 1;
	gbc_table_4.insets = new Insets(5, 5, 5, 0);
	gbc_table_4.fill = GridBagConstraints.BOTH;
	gbc_table_4.gridx = 0;
	gbc_table_4.gridy = 2;
	
	
	JScrollPane scrollPane1 = new JScrollPane(table_4);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 1;
	gbc_table.gridy = 0;
	panel_1.add(scrollPane1,gbc_table_4);

	ImageIcon flechaDerecha = new ImageIcon(new ImageIcon("./images/flechaNavegacionDerecha.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
		
	ImageIcon flechaIzquierda = new ImageIcon(new ImageIcon("./images/flechaNavegacionIzquierda.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	
	JLabel lblNewLabel_1 = new JLabel("Pagina");
	lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	
	JButton btnIzquierda = new JButton(flechaIzquierda);
	btnIzquierda.setBackground(new Color(204, 255, 255));
	GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
	gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_1.gridx = 0;
	gbc_btnNewButton_1.gridy = 1;
	panel_1.add(btnIzquierda, gbc_btnNewButton_1);
	
	JLabel lblNewLabel_2 = new JLabel("P\u00E1gina");
	lblNewLabel_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2.gridx = 1;
	gbc_lblNewLabel_2.gridy = 1;
	panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
	
	JButton btnDerecha = new JButton(flechaDerecha);
	btnDerecha.setBackground(new Color(204, 255, 255));
	GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
	gbc_btnNewButton_3.anchor = GridBagConstraints.WEST;
	gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
	gbc_btnNewButton_3.gridx = 2;
	gbc_btnNewButton_3.gridy = 1;
	panel_1.add(btnDerecha, gbc_btnNewButton_3);

	

	JButton btnIzquierda1 = new JButton(flechaIzquierda);
	btnIzquierda1.setBackground(new Color(204, 255, 255));
	GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
	gbc_btnNewButton_11.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_11.gridx = 0;
	gbc_btnNewButton_11.gridy = 4;
	panel_1.add(btnIzquierda1, gbc_btnNewButton_11);
	
	JLabel lblNewLabel_21 = new JLabel("P\u00E1gina");
	lblNewLabel_21.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
	gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_21.gridx = 1;
	gbc_lblNewLabel_21.gridy = 4;
	panel_1.add(lblNewLabel_21, gbc_lblNewLabel_21);
	
	JButton btnDerecha1 = new JButton(flechaDerecha);
	btnDerecha1.setBackground(new Color(204, 255, 255));
	GridBagConstraints gbc_btnNewButton_31 = new GridBagConstraints();
	gbc_btnNewButton_31.anchor = GridBagConstraints.WEST;
	gbc_btnNewButton_31.insets = new Insets(0, 0, 5, 0);
	gbc_btnNewButton_31.gridx = 2;
	gbc_btnNewButton_31.gridy = 4;
	panel_1.add(btnDerecha1, gbc_btnNewButton_31);
	
		JButton imprimir = new JButton("IMPRIMIR LISTADO");
		imprimir.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		imprimir.setBackground(new Color(204, 255, 255));
		GridBagConstraints gbc_btnNewButton_311 = new GridBagConstraints();
		gbc_btnNewButton_311.gridwidth = 3;
		gbc_btnNewButton_311.insets = new Insets(0, 15, 5, 0);
		gbc_btnNewButton_311.gridx = 0;
		gbc_btnNewButton_311.gridy = 5;
		panel_1.add(imprimir, gbc_btnNewButton_311);

	
}

}
