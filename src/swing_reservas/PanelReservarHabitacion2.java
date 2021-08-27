package swing_reservas;

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
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.Button;
import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;

public class PanelReservarHabitacion2 extends JPanel {
private JLabel fechaNacimiento1;
private JButton btnCancelar;
private JPanel panel;
private JTable table;
private JButton btnSiguiente;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;

public PanelReservarHabitacion2() {
	
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.rowHeights = new int[]{0, 0, 186};
	gridBagLayout.columnWidths = new int[]{125, 125, 92, 128, 99, 173};
	gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0};
	//gridBagLayout.columnWidths = new int[]{144, 10, 0, 0, 0, 0, 0, 0};
	//gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0};
	//gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	//gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	setLayout(gridBagLayout);
	
	JPanel panel_1 = new JPanel();
	
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.gridheight = 2;
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.insets = new Insets(10, 5, 10, 0);
	gbc_panel_1.gridwidth = 6;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 0;
	add(panel_1, gbc_panel_1);
	
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{0, 0};
	gbl_panel_1.rowHeights = new int[]{0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 1.0};
	gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
	panel_1.setLayout(gbl_panel_1);
	
	table = new JTable();
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 0;
	gbc_table.gridy = 0;
	//panel_1.add(table, gbc_table);
	
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
		new Object[][] {
			{"Clarisa", "Espertino", "DNI", "42530390", null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
		},
		new String[] {
			"Apellido", "Nombres", "Tipo Documento", "Nro. Documento", "Modificar"
		}
	) {
		Class[] columnTypes = new Class[] {
			String.class, String.class, String.class, String.class, Boolean.class
		};
		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
	});
	
	JScrollPane scrollPane = new JScrollPane(table);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 1;
	gbc_table.gridy = 0;
	//add(scrollPane, gbc_table);
	panel_1.add(scrollPane, gbc_table);

	
	
	JPanel panel_2 = new JPanel();
	panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_2 = new GridBagConstraints();
	gbc_panel_2.gridwidth = 6;
	gbc_panel_2.insets = new Insets(0, 5, 10, 0);
	gbc_panel_2.fill = GridBagConstraints.BOTH;
	gbc_panel_2.gridx = 0;
	gbc_panel_2.gridy = 2;
	add(panel_2, gbc_panel_2);
	GridBagLayout gbl_panel_2 = new GridBagLayout();
	gbl_panel_2.columnWidths = new int[]{0, 124, 0, 147, 200, 0};
	gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel_2.setLayout(gbl_panel_2);
	
	JLabel lblNewLabel = new JLabel("RESERVA A NOMBRE DE:");
	lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.gridwidth = 2;
	gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
	gbc_lblNewLabel.insets = new Insets(0, 0, 10, 30);
	gbc_lblNewLabel.gridx = 2;
	gbc_lblNewLabel.gridy = 0;
	panel_2.add(lblNewLabel, gbc_lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Apellido(*):");
	lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1.gridx = 0;
	gbc_lblNewLabel_1.gridy = 1;
	panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
	
	textField = new JTextField();
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.gridwidth = 4;
	gbc_textField.insets = new Insets(0, 0, 5, 5);
	gbc_textField.gridx = 1;
	gbc_textField.gridy = 1;
	panel_2.add(textField, gbc_textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_2 = new JLabel("Campo obligatorio");
	lblNewLabel_2.setForeground(Color.RED);
	lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2.gridx = 1;
	gbc_lblNewLabel_2.gridy = 2;
	panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
	
	JLabel lblNewLabel_1_1 = new JLabel("Nombres(*):");
	lblNewLabel_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
	gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1_1.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1_1.gridx = 0;
	gbc_lblNewLabel_1_1.gridy = 3;
	panel_2.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
	
	textField_1 = new JTextField();
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.gridwidth = 4;
	gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.gridx = 1;
	gbc_textField_1.gridy = 3;
	panel_2.add(textField_1, gbc_textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_2_1 = new JLabel("Campo obligatorio");
	lblNewLabel_2_1.setForeground(Color.RED);
	lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
	gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2_1.gridx = 1;
	gbc_lblNewLabel_2_1.gridy = 4;
	panel_2.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
	
	JLabel lblNewLabel_1_2 = new JLabel("Tel\u00E9fono(*):");
	lblNewLabel_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
	gbc_lblNewLabel_1_2.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1_2.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1_2.gridx = 0;
	gbc_lblNewLabel_1_2.gridy = 5;
	panel_2.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	gbc_textField_2.gridwidth = 4;
	gbc_textField_2.insets = new Insets(0, 0, 5, 5);
	gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_2.gridx = 1;
	gbc_textField_2.gridy = 5;
	panel_2.add(textField_2, gbc_textField_2);
	
	JLabel lblNewLabel_2_2 = new JLabel("Campo obligatorio");
	lblNewLabel_2_2.setForeground(Color.RED);
	lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	GridBagConstraints gbc_lblNewLabel_2_2 = new GridBagConstraints();
	gbc_lblNewLabel_2_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2_2.gridx = 1;
	gbc_lblNewLabel_2_2.gridy = 6;
	panel_2.add(lblNewLabel_2_2, gbc_lblNewLabel_2_2);
	
	JButton btnRegistrar = new JButton("REGISTRAR");
	btnRegistrar.setBackground(Color.WHITE);
	btnRegistrar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
	gbc_btnRegistrar.anchor = GridBagConstraints.EAST;
	gbc_btnRegistrar.insets = new Insets(0, 10, 10, 5);
	gbc_btnRegistrar.gridx = 2;
	gbc_btnRegistrar.gridy = 7;
	panel_2.add(btnRegistrar, gbc_btnRegistrar);
	
	JButton btnCancelar_1 = new JButton("CANCELAR");
	btnCancelar_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnCancelar_1.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnCancelar_1 = new GridBagConstraints();
	gbc_btnCancelar_1.insets = new Insets(0, 5, 10, 10);
	gbc_btnCancelar_1.anchor = GridBagConstraints.WEST;
	gbc_btnCancelar_1.gridx = 3;
	gbc_btnCancelar_1.gridy = 7;
	panel_2.add(btnCancelar_1, gbc_btnCancelar_1);
	
}

	public void limpiarWarnings(List<JLabel> labelAQuitar) {
		for(int i =0;i<labelAQuitar.size();i++) {
		labelAQuitar.get(i).setVisible(false);
		}
	}
	
}
