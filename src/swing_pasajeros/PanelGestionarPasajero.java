package swing_pasajeros;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;


import java.awt.SystemColor;
import java.awt.Button;
import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.Icon;

public class PanelGestionarPasajero extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private DefaultTableModel model;
	private Object datosFila[][];


@SuppressWarnings("serial")
public PanelGestionarPasajero() {
	setBackground(SystemColor.controlHighlight);
	this.setSize(new Dimension(800,600));
	GridBagLayout gridBagLayout = new GridBagLayout();
//	gridBagLayout.rowHeights = new int[]{151, 0};
//	gridBagLayout.columnWeights = new double[]{1.0, 0.0};
	gridBagLayout.rowWeights = new double[]{0.0, 1.0};
	gridBagLayout.columnWidths = new int[]{36, 244};
	
	setLayout(gridBagLayout);
	
	JPanel panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel = new GridBagConstraints();
	gbc_panel.gridwidth = 2;
	gbc_panel.insets = new Insets(5, 10, 5, 10);
	gbc_panel.fill = GridBagConstraints.BOTH;
	gbc_panel.gridx = 0;
	gbc_panel.gridy = 0;
	add(panel, gbc_panel);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{0, 254, 360, 0};
	gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JLabel lblNewLabel = new JLabel("Apellido:");
	lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.insets = new Insets(5, 0, 5, 5);
	gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel.gridx = 0;
	gbc_lblNewLabel.gridy = 0;
	panel.add(lblNewLabel, gbc_lblNewLabel);
	
	textField = new JTextField();
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.gridwidth = 2;
	gbc_textField.insets = new Insets(5, 0, 5, 5);
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.gridx = 1;
	gbc_textField.gridy = 0;
	panel.add(textField, gbc_textField);
	textField.setColumns(10);
	
	JLabel lblNombres = new JLabel("Nombres:");
	lblNombres.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNombres = new GridBagConstraints();
	gbc_lblNombres.anchor = GridBagConstraints.EAST;
	gbc_lblNombres.insets = new Insets(0, 0, 5, 5);
	gbc_lblNombres.gridx = 0;
	gbc_lblNombres.gridy = 1;
	panel.add(lblNombres, gbc_lblNombres);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.gridwidth = 2;
	gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.gridx = 1;
	gbc_textField_1.gridy = 1;
	panel.add(textField_1, gbc_textField_1);
	
	JLabel lblTipoDocumento = new JLabel("Tipo Documento:");
	lblTipoDocumento.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblTipoDocumento = new GridBagConstraints();
	gbc_lblTipoDocumento.anchor = GridBagConstraints.EAST;
	gbc_lblTipoDocumento.insets = new Insets(0, 0, 5, 5);
	gbc_lblTipoDocumento.gridx = 0;
	gbc_lblTipoDocumento.gridy = 2;
	panel.add(lblTipoDocumento, gbc_lblTipoDocumento);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
	comboBox.setBackground(Color.WHITE);
	GridBagConstraints gbc_comboBox = new GridBagConstraints();
	gbc_comboBox.gridwidth = 2;
	gbc_comboBox.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox.gridx = 1;
	gbc_comboBox.gridy = 2;
	panel.add(comboBox, gbc_comboBox);
	
	JLabel lblNroDocumento = new JLabel("Nro. Documento:");
	lblNroDocumento.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNroDocumento = new GridBagConstraints();
	gbc_lblNroDocumento.anchor = GridBagConstraints.EAST;
	gbc_lblNroDocumento.insets = new Insets(0, 5, 5, 5);
	gbc_lblNroDocumento.gridx = 0;
	gbc_lblNroDocumento.gridy = 3;
	panel.add(lblNroDocumento, gbc_lblNroDocumento);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	GridBagConstraints gbc_textField_3 = new GridBagConstraints();
	gbc_textField_3.gridwidth = 2;
	gbc_textField_3.insets = new Insets(0, 0, 5, 5);
	gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_3.gridx = 1;
	gbc_textField_3.gridy = 3;
	panel.add(textField_3, gbc_textField_3);
	
	JButton btnNewButton = new JButton("  BUSCAR");
	btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnNewButton.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton.gridx = 1;
	gbc_btnNewButton.gridy = 4;
	panel.add(btnNewButton, gbc_btnNewButton);
	
	JButton btnCancelar = new JButton("CANCELAR");
	btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnCancelar.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
	gbc_btnCancelar.insets = new Insets(0, 5, 5, 0);
	gbc_btnCancelar.anchor = GridBagConstraints.WEST;
	gbc_btnCancelar.gridx = 2;
	gbc_btnCancelar.gridy = 4;
	panel.add(btnCancelar, gbc_btnCancelar);
	
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.insets = new Insets(5, 10, 5, 10);
	gbc_panel_1.gridwidth = 2;
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 1;
	add(panel_1, gbc_panel_1);
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{0, 0, 100, 0, 0, 0, 0, 0, 65, 0, 0, 0, 0, 0, 0};
	gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel_1.setLayout(gbl_panel_1);

	table = new JTable();
	table.setSurrendersFocusOnKeystroke(true);
	table.setBackground(Color.WHITE);
	table.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
	
	Object[][] datos = new Object[][] {
		{"Clarisa", "Espertino", "DNI", "42530390", null}		
	};
	
	String[] nombresColumnas = new String[] {
			"Apellido", "Nombres", "Tipo Documento", "Nro. Documento", "Modificar"
		};
	
	table.setModel(new DefaultTableModel(
		datos,nombresColumnas) {
		Class[] columnTypes = new Class[] {
			String.class, String.class, String.class, String.class, Boolean.class
		};
		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
		boolean[] columnEditables = new boolean[] {
			false, false, false, false, true
		};
		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}
	});

//table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	autoajustarAnchoColumnas(table);
	table.setBorder(new LineBorder(new Color(0, 0, 0)));
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.gridwidth = 16;

	JScrollPane scrollPane = new JScrollPane(table);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 1;
	gbc_table.gridy = 0;
	//add(scrollPane, gbc_table);
	panel_1.add(scrollPane, gbc_table);
	
	ImageIcon flechaDerecha = new ImageIcon(new ImageIcon("./images/flechaNavegacionDerecha.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
		
	ImageIcon flechaIzquierda = new ImageIcon(new ImageIcon("./images/flechaNavegacionIzquierda.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	
	JLabel lblNewLabel_1 = new JLabel("Pagina");
	lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));

	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_1.gridx = 3;
	gbc_lblNewLabel_1.gridy = 2;
	panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

	JButton btnIzquierda = new JButton(flechaIzquierda);
	btnIzquierda.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
	gbc_btnNewButton_1.fill = GridBagConstraints.VERTICAL;
	gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_1.gridx = 2;
	gbc_btnNewButton_1.gridy = 2;
	panel_1.add(btnIzquierda, gbc_btnNewButton_1);
			
	JButton btnDerecha = new JButton(flechaDerecha);
	btnDerecha.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnSiguiente_1 = new GridBagConstraints();
	gbc_btnSiguiente_1.fill = GridBagConstraints.VERTICAL;
	gbc_btnSiguiente_1.gridwidth = 2;
	gbc_btnSiguiente_1.anchor = GridBagConstraints.WEST;
	gbc_btnSiguiente_1.insets = new Insets(0, 0, 5, 5);
	gbc_btnSiguiente_1.gridx = 4;
	gbc_btnSiguiente_1.gridy = 2;
	panel_1.add(btnDerecha, gbc_btnSiguiente_1);
	
	JButton btnSiguiente = new JButton("SIGUIENTE");
	btnSiguiente.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
	gbc_btnSiguiente.gridwidth = 5;
	gbc_btnSiguiente.insets = new Insets(0, 50, 5, 5);
	gbc_btnSiguiente.gridx = 2;
	gbc_btnSiguiente.gridy = 4;
	panel_1.add(btnSiguiente, gbc_btnSiguiente);
	
}


public DefaultTableModel getModel() {
	return model;
}

public void setModel(DefaultTableModel model) {
	this.model = model;
	table_1.setModel(model);
}

/*public DefaultTableModel renovarTabla() {
	String nombreColumnas[] = { "Apellido", "Nombres", "Tipo Documento", "Nro. Documento"};
	datosFila = new Object[2][4];
	//for (int i = 0; i < nuevosDatos.size(); i++) {
		datosFila[0][0] = "Espertino";
		datosFila[0][1] = "Clarisa";
		datosFila[0][2] = "DNI";
		datosFila[0][3] = "42530390";
		datosFila[1][0] = "Espertino";
		datosFila[1][1] = "Clarisa";
		datosFila[1][2] = "DNI";
		datosFila[1][3] = "42530390";
	//}
	// Crear modelo de la tabla
	model = new DefaultTableModel(datosFila, nombreColumnas) {
		private static final long serialVersionUID = 1L;

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return false;
		}
	};
	return model;
}*/

public void autoajustarAnchoColumnas(JTable table) {
	final TableColumnModel columnModel = table.getColumnModel();
	for (int column = 0; column < table.getColumnCount(); column++) {
		int width = 15; // Min width
		for (int row = 0; row < table.getRowCount(); row++) {
			TableCellRenderer renderer = table.getCellRenderer(row, column);
			Component comp = table.prepareRenderer(renderer, row, column);
			width = Math.max(comp.getPreferredSize().width + 1, width);
		}
		if (width > 300)
			width = 300;
		columnModel.getColumn(column).setPreferredWidth(width);
	}
}
}
