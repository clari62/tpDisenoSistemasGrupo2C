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
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.Button;
import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;

public class PanelReservarHabitacion2 extends JPanel {

private JTable table;
private JTextField textApellido;
private JTextField textNombre;
private JTextField textTelefono;

public PanelReservarHabitacion2() {
	
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.rowHeights = new int[]{0, 0, 186};
	gridBagLayout.columnWidths = new int[]{125, 125, 99, 173};
	gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
	gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0};
	setLayout(gridBagLayout);
	
	JPanel panel_1 = new JPanel();
	
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.gridheight = 2;
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.insets = new Insets(10, 5, 10, 0);
	gbc_panel_1.gridwidth = 4;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 0;
	add(panel_1, gbc_panel_1);
	
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{0, 323, 53, 151};
	gbl_panel_1.rowHeights = new int[]{0, 0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0};
	gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE, 0.0};
	panel_1.setLayout(gbl_panel_1);
	
	table = new JTable();
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.gridwidth = 3;
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 1;
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
			"Tipo de habitación", "Día de ingreso", "Fecha ingreso", "Día de egreso", "Fecha egreso"
		}
	) {
		Class[] columnTypes = new Class[] {
			String.class, String.class, String.class, String.class, String.class
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
	gbc_panel_2.gridwidth = 4;
	gbc_panel_2.insets = new Insets(0, 5, 10, 0);
	gbc_panel_2.fill = GridBagConstraints.BOTH;
	gbc_panel_2.gridx = 0;
	gbc_panel_2.gridy = 2;
	add(panel_2, gbc_panel_2);
	GridBagLayout gbl_panel_2 = new GridBagLayout();
	gbl_panel_2.columnWidths = new int[]{0, 124, 0, 147, 200, 0};
	gbl_panel_2.rowHeights = new int[]{0, 0, 25, 0, 25, 0, 0, 0, 0};
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
	gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
	gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1.gridx = 0;
	gbc_lblNewLabel_1.gridy = 1;
	panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
	
	textApellido = new JTextField();
	GridBagConstraints gbc_textApellido = new GridBagConstraints();
	gbc_textApellido.fill = GridBagConstraints.HORIZONTAL;
	gbc_textApellido.gridwidth = 4;
	gbc_textApellido.insets = new Insets(0, 0, 5, 5);
	gbc_textApellido.gridx = 1;
	gbc_textApellido.gridy = 1;
	panel_2.add(textApellido, gbc_textApellido);
	textApellido.setColumns(10);
	
	JLabel co1 = new JLabel("Campo obligatorio");
	co1.setForeground(Color.RED);
	co1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	GridBagConstraints gbc_co1 = new GridBagConstraints();
	gbc_co1.insets = new Insets(0, 0, 5, 5);
	gbc_co1.gridx = 1;
	gbc_co1.gridy = 2;
	panel_2.add(co1, gbc_co1);
	
	JLabel lblNewLabel_1_1 = new JLabel("Nombres(*):");
	lblNewLabel_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
	gbc_lblNewLabel_1_1.fill = GridBagConstraints.VERTICAL;
	gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1_1.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1_1.gridx = 0;
	gbc_lblNewLabel_1_1.gridy = 3;
	panel_2.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
	
	textNombre = new JTextField();
	GridBagConstraints gbc_textNombre = new GridBagConstraints();
	gbc_textNombre.gridwidth = 4;
	gbc_textNombre.insets = new Insets(0, 0, 5, 5);
	gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNombre.gridx = 1;
	gbc_textNombre.gridy = 3;
	panel_2.add(textNombre, gbc_textNombre);
	textNombre.setColumns(10);
	
	JLabel co2 = new JLabel("Campo obligatorio");
	co2.setForeground(Color.RED);
	co2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	GridBagConstraints gbc_co2 = new GridBagConstraints();
	gbc_co2.insets = new Insets(0, 0, 5, 5);
	gbc_co2.gridx = 1;
	gbc_co2.gridy = 4;
	panel_2.add(co2, gbc_co2);
	
	JLabel lblNewLabel_1_2 = new JLabel("Tel\u00E9fono(*):");
	lblNewLabel_1_2.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
	gbc_lblNewLabel_1_2.fill = GridBagConstraints.VERTICAL;
	gbc_lblNewLabel_1_2.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_1_2.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1_2.gridx = 0;
	gbc_lblNewLabel_1_2.gridy = 5;
	panel_2.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
	
	textTelefono = new JTextField();
	textTelefono.setColumns(10);
	GridBagConstraints gbc_textTelefono = new GridBagConstraints();
	gbc_textTelefono.gridwidth = 4;
	gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
	gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
	gbc_textTelefono.gridx = 1;
	gbc_textTelefono.gridy = 5;
	panel_2.add(textTelefono, gbc_textTelefono);
	
	JLabel co3 = new JLabel("Campo obligatorio");
	co3.setForeground(Color.RED);
	co3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	GridBagConstraints gbc_co3 = new GridBagConstraints();
	gbc_co3.insets = new Insets(0, 0, 5, 5);
	gbc_co3.gridx = 1;
	gbc_co3.gridy = 6;
	panel_2.add(co3, gbc_co3);
	
	JButton btnRegistrar = new JButton("REGISTRAR");
	btnRegistrar.setBackground(new Color(204,255,255));
	btnRegistrar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
	gbc_btnRegistrar.anchor = GridBagConstraints.EAST;
	gbc_btnRegistrar.insets = new Insets(0, 50, 10, 5);
	gbc_btnRegistrar.gridx = 2;
	gbc_btnRegistrar.gridy = 7;
	panel_2.add(btnRegistrar, gbc_btnRegistrar);
	
	JButton btnCancelar = new JButton("CANCELAR");
	btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnCancelar.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
	gbc_btnCancelar.insets = new Insets(0, 5, 10, 10);
	gbc_btnCancelar.anchor = GridBagConstraints.WEST;
	gbc_btnCancelar.gridx = 3;
	gbc_btnCancelar.gridy = 7;
	panel_2.add(btnCancelar, gbc_btnCancelar);
	
	ImageIcon flechaDerecha = new ImageIcon(new ImageIcon("./images/flechaNavegacionDerecha.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
		
	ImageIcon flechaIzquierda = new ImageIcon(new ImageIcon("./images/flechaNavegacionIzquierda.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	
	JButton btnIzquierda = new JButton(flechaIzquierda);
	btnIzquierda.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnIzquierda.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnIzquierda = new GridBagConstraints();
	gbc_btnIzquierda.anchor = GridBagConstraints.EAST;
	gbc_btnIzquierda.insets = new Insets(0, 50, 10, 0);
	gbc_btnIzquierda.gridx = 1;
	gbc_btnIzquierda.gridy = 2;
	panel_1.add(btnIzquierda, gbc_btnIzquierda);
	
	JLabel lblNewLabel_11 = new JLabel("Pagina");
	lblNewLabel_11.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
	gbc_lblNewLabel_11.insets = new Insets(0, 0, 10, 0);
	gbc_lblNewLabel_11.gridx = 2;
	gbc_lblNewLabel_11.gridy = 2;
	panel_1.add(lblNewLabel_11, gbc_lblNewLabel_11);
	
	JButton btnDerecha = new JButton(flechaDerecha);
	btnDerecha.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnDerecha.setBackground(new Color(204,255,255));
	GridBagConstraints gbc_btnDerecha = new GridBagConstraints();
	gbc_btnDerecha.insets = new Insets(0, 0, 10, 0);
	gbc_btnDerecha.anchor = GridBagConstraints.WEST;
	gbc_btnDerecha.gridx = 3;
	gbc_btnDerecha.gridy = 2;
	panel_1.add(btnDerecha, gbc_btnDerecha);	
	
	List<JLabel> labels = new ArrayList<JLabel>();
	labels.add(co1); labels.add(co2); labels.add(co3);
	//limpiarWarnings(labels);
	
}

	public void limpiarWarnings(List<JLabel> labelAQuitar) {
		for(int i =0;i<labelAQuitar.size();i++) {
		labelAQuitar.get(i).setVisible(false);
		}
	}
	
}
