package swing_facturacion;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import javax.swing.JScrollPane;

import javax.swing.JButton;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;


import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.JTable;


public class PanelFacturar1 extends JPanel {
	private JTextField textNumero;
	private JTextField textHora;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private DefaultTableModel model;
	private Object datosFila[][];


@SuppressWarnings("serial")
public PanelFacturar1() {
	setBackground(SystemColor.controlHighlight);
	this.setSize(new Dimension(800,600));
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.rowHeights = new int[]{175, 0};
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
	gbl_panel.columnWidths = new int[]{0, 254, 254};
	gbl_panel.rowHeights = new int[]{0, 0, 0};
	panel.setLayout(gbl_panel);
	
	JLabel numeroHabitacion = new JLabel("Numero de habitación:");
	numeroHabitacion.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
	GridBagConstraints gbc_lblNumero = new GridBagConstraints();
	gbc_lblNumero.insets = new Insets(10, 10, 10, 10);
	gbc_lblNumero.anchor = GridBagConstraints.EAST;
	gbc_lblNumero.gridx = 0;
	gbc_lblNumero.gridy = 0;
	panel.add(numeroHabitacion, gbc_lblNumero);
	
	textNumero = new JTextField();
	GridBagConstraints gbc_textNumero = new GridBagConstraints();
	gbc_textNumero.gridwidth = 2;
	gbc_textNumero.insets = new Insets(10, 10, 10, 10);
	gbc_textNumero.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNumero.gridx = 1;
	gbc_textNumero.gridy = 0;
	panel.add(textNumero, gbc_textNumero);
	textNumero.setColumns(10);
	
	JLabel lblHoraSalida = new JLabel("Hora de salida:");
	lblHoraSalida.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
	GridBagConstraints gbc_lblHora= new GridBagConstraints();
	gbc_lblHora.anchor = GridBagConstraints.EAST;
	gbc_lblHora.insets = new Insets(10, 10, 10, 10);
	gbc_lblHora.gridx = 0;
	gbc_lblHora.gridy = 1;
	panel.add(lblHoraSalida, gbc_lblHora);
	
	textHora = new JTextField();
	textHora.setColumns(10);
	GridBagConstraints gbc_textHora = new GridBagConstraints();
	gbc_textHora.gridwidth = 2;
	gbc_textHora.insets = new Insets(10, 10, 10, 10);
	gbc_textHora.fill = GridBagConstraints.HORIZONTAL;
	gbc_textHora.gridx = 1;
	gbc_textHora.gridy = 1;
	panel.add(textHora, gbc_textHora);
	
	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnBuscar.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
	gbc_btnBuscar.anchor = GridBagConstraints.EAST;
	gbc_btnBuscar.gridx = 1;
	gbc_btnBuscar.gridy = 2;
	panel.add(btnBuscar, gbc_btnBuscar);
	
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
	gbl_panel_1.columnWidths = new int[]{0, 254, 254};
	gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel_1.setLayout(gbl_panel_1);

	table = new JTable();
	table.setSurrendersFocusOnKeystroke(true);
	table.setBackground(Color.WHITE);
	table.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
	
	Object[][] datos = new Object[][] {
		{"Clarisa", "Espertino", "DNI", "42530390", null}		
	};
	
	String[] nombresColumnas = new String[] {
			"Apellido", "Nombres", "Tipo Documento", "Nro. Documento", "Responsable de pago"
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

	autoajustarAnchoColumnas(table);
	table.setBorder(new LineBorder(new Color(0, 0, 0)));
	table.setPreferredSize(new Dimension(800,200));
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.gridwidth = 11;
	JScrollPane scrollPane = new JScrollPane(table);
	gbc_table.insets = new Insets(5, 5, 5, 0);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 0;
	gbc_table.gridy = 0;
	//add(scrollPane, gbc_table);
	panel_1.add(scrollPane, gbc_table);

	JLabel lblResponsable = new JLabel("FACTURAR A NOMBRE DE TERCERO");
	lblResponsable.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblResponsable= new GridBagConstraints();
	gbc_lblResponsable.insets = new Insets(0, 0, 5, 0);
	gbc_lblResponsable.gridx = 0;
	gbc_lblResponsable.gridy = 1;
	gbc_lblResponsable.gridwidth=11;
	gbc_lblResponsable.anchor= GridBagConstraints.CENTER;
	panel_1.add(lblResponsable, gbc_lblResponsable);
	
	JLabel lblCUIT = new JLabel ("CUIT:");
	lblCUIT.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
	GridBagConstraints gbc_lblCUIT= new GridBagConstraints();
	gbc_lblCUIT.insets = new Insets(10, 40, 10, 5);
	gbc_lblCUIT.gridx=0;
	gbc_lblCUIT.gridy=2;
	gbc_lblCUIT.anchor= GridBagConstraints.EAST;
	panel_1.add(lblCUIT,gbc_lblCUIT );
	
	JTextField textCUIT = new JTextField();
	textCUIT.setColumns(10);
	GridBagConstraints gbc_textCUIT = new GridBagConstraints();
	gbc_textCUIT.gridwidth = 2;
	gbc_textCUIT.insets = new Insets(10, 10, 10, 10);
	gbc_textCUIT.fill = GridBagConstraints.HORIZONTAL;
	gbc_textCUIT.gridx = 1;
	gbc_textCUIT.gridy = 2;
	panel_1.add(textCUIT, gbc_textCUIT);
	
	JLabel lblRazonSocial = new JLabel ("RAZÓN SOCIAL:");
	lblRazonSocial.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
	GridBagConstraints gbc_lblRazonSocial= new GridBagConstraints();
	gbc_lblRazonSocial.insets = new Insets(10, 40, 10, 5);
	gbc_lblRazonSocial.gridx=0;
	gbc_lblRazonSocial.gridy=3;
	gbc_lblRazonSocial.anchor= GridBagConstraints.EAST;
	panel_1.add(lblRazonSocial,gbc_lblRazonSocial );
	
	JTextField textRazonSocial = new JTextField();
	textRazonSocial.setColumns(10);
	GridBagConstraints gbc_textRazonSocial = new GridBagConstraints();
	gbc_textRazonSocial.gridwidth =2;
	gbc_textRazonSocial.insets = new Insets(10, 10, 10, 10);
	gbc_textRazonSocial.fill = GridBagConstraints.HORIZONTAL;
	gbc_textRazonSocial.gridx = 1;
	gbc_textRazonSocial.gridy = 3;
	panel_1.add(textRazonSocial, gbc_textRazonSocial);
	
	JButton btnAceptar = new JButton("ACEPTAR");
	btnAceptar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnAceptar.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
	gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
	gbc_btnAceptar.anchor = GridBagConstraints.CENTER;
	gbc_btnAceptar.gridx = 1;
	gbc_btnAceptar.gridy = 4;
	panel_1.add(btnAceptar, gbc_btnAceptar);
	
	JButton btnCancelar = new JButton("CANCELAR");
	btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnCancelar.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
	gbc_btnCancelar.insets = new Insets(0, 5, 5, 5);
	gbc_btnCancelar.anchor = GridBagConstraints.CENTER;
	gbc_btnCancelar.gridx = 2;
	gbc_btnCancelar.gridy = 4;
	panel_1.add(btnCancelar, gbc_btnCancelar);
	
	
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