package swing_habitacion;

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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PanelOcuparHabitacion2 extends JPanel {

	private JTable table;
	private JTable table_4;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textNumeroDocumento;


public PanelOcuparHabitacion2() {
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{757};
	gridBagLayout.columnWeights = new double[]{0.0};
	gridBagLayout.rowWeights = new double[]{0.0, 1.0};
	gridBagLayout.rowHeights = new int[]{75, 302};


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
	gbl_panel.columnWidths = new int[]{0, 212, 104, 0, 0, 0, 49, 44, 232, 0};
	gbl_panel.rowHeights = new int[]{45, 0, 0, 0, 0, 52, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JLabel labelApellido = new JLabel("Apellido:");
	labelApellido.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_labelApellido = new GridBagConstraints();
	gbc_labelApellido.anchor = GridBagConstraints.WEST;
	gbc_labelApellido.insets = new Insets(5, 0, 5, 5);
	gbc_labelApellido.gridx = 1;
	gbc_labelApellido.gridy = 1;
	panel.add(labelApellido, gbc_labelApellido);
	
	textApellido = new JTextField();
	GridBagConstraints gbc_textApellido = new GridBagConstraints();
	gbc_textApellido.gridwidth = 6;
	gbc_textApellido.insets = new Insets(0, 0, 5, 5);
	gbc_textApellido.fill = GridBagConstraints.HORIZONTAL;
	gbc_textApellido.gridx = 2;
	gbc_textApellido.gridy = 1;
	panel.add(textApellido, gbc_textApellido);
	textApellido.setColumns(10);
	
	JLabel labelNombre = new JLabel("Nombres:");
	labelNombre.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_labelNombre = new GridBagConstraints();
	gbc_labelNombre.anchor = GridBagConstraints.WEST;
	gbc_labelNombre.insets = new Insets(5, 0, 5, 5);
	gbc_labelNombre.gridx = 1;
	gbc_labelNombre.gridy = 2;
	panel.add(labelNombre, gbc_labelNombre);
	
	textNombre = new JTextField();
	textNombre.setColumns(10);
	GridBagConstraints gbc_textNombre = new GridBagConstraints();
	gbc_textNombre.gridwidth = 6;
	gbc_textNombre.insets = new Insets(0, 0, 5, 5);
	gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNombre.gridx = 2;
	gbc_textNombre.gridy = 2;
	panel.add(textNombre, gbc_textNombre);
	
	JLabel lblTipoDeDocumento = new JLabel("Tipo de documento:");
	lblTipoDeDocumento.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblTipoDeDocumento = new GridBagConstraints();
	gbc_lblTipoDeDocumento.anchor = GridBagConstraints.WEST;
	gbc_lblTipoDeDocumento.insets = new Insets(0, 0, 5, 5);
	gbc_lblTipoDeDocumento.gridx = 1;
	gbc_lblTipoDeDocumento.gridy = 3;
	panel.add(lblTipoDeDocumento, gbc_lblTipoDeDocumento);
	
	JComboBox comboBox = new JComboBox();
	GridBagConstraints gbc_comboBox = new GridBagConstraints();
	gbc_comboBox.gridwidth = 6;
	gbc_comboBox.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox.gridx = 2;
	gbc_comboBox.gridy = 3;
	panel.add(comboBox, gbc_comboBox);
	
	JLabel lblNumeroDeDocumento = new JLabel("Numero de documento:");
	lblNumeroDeDocumento.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNumeroDeDocumento = new GridBagConstraints();
	gbc_lblNumeroDeDocumento.anchor = GridBagConstraints.WEST;
	gbc_lblNumeroDeDocumento.insets = new Insets(0, 0, 5, 5);
	gbc_lblNumeroDeDocumento.gridx = 1;
	gbc_lblNumeroDeDocumento.gridy = 4;
	panel.add(lblNumeroDeDocumento, gbc_lblNumeroDeDocumento);
	
	textNumeroDocumento = new JTextField();
	textNumeroDocumento.setColumns(10);
	GridBagConstraints gbc_textNumeroDocumento = new GridBagConstraints();
	gbc_textNumeroDocumento.gridwidth = 6;
	gbc_textNumeroDocumento.insets = new Insets(0, 0, 5, 5);
	gbc_textNumeroDocumento.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNumeroDocumento.gridx = 2;
	gbc_textNumeroDocumento.gridy = 4;
	panel.add(textNumeroDocumento, gbc_textNumeroDocumento);
	
	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.setBackground(Color.WHITE);
	btnBuscar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
	gbc_btnBuscar.insets = new Insets(0, 0, 0, 5);
	gbc_btnBuscar.anchor = GridBagConstraints.EAST;
	gbc_btnBuscar.gridx = 3;
	gbc_btnBuscar.gridy = 5;
	panel.add(btnBuscar, gbc_btnBuscar);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.insets = new Insets(0, 0, 5, 0);
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 1;
	add(panel_1, gbc_panel_1);
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{350, 71, 0, 210};
	gbl_panel_1.rowHeights = new int[]{115, 0, 115, 0, 0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0};
	gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
			"Apellido", "Nombres", "Tipo de documento", "Numero de documento", "Responsable", "Acompañante"
		}
	));
	
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.gridwidth = 4;
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
			"Apellido", "Nombres", "Tipo de documento", "Numero de documento", "Responsable/Acompañante"
		}
	));
	GridBagConstraints gbc_table_4 = new GridBagConstraints();
	gbc_table_4.gridwidth = 4;
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
	
	JButton btnAgregar = new JButton("AGREGAR");
	btnAgregar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnAgregar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnAgregar.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
	gbc_btnAgregar.insets = new Insets(0, 0, 5, 0);
	gbc_btnAgregar.gridx = 3;
	gbc_btnAgregar.gridy = 1;
	panel_1.add(btnAgregar, gbc_btnAgregar);
	panel_1.add(scrollPane1,gbc_table_4);

	ImageIcon flechaDerecha = new ImageIcon(new ImageIcon("./images/flechaNavegacionDerecha.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
		
	ImageIcon flechaIzquierda = new ImageIcon(new ImageIcon("./images/flechaNavegacionIzquierda.png")
			.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
	
	JLabel lblNewLabel_1 = new JLabel("Pagina");
	lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	
	JButton btnIzquierda = new JButton(flechaIzquierda);
	btnIzquierda.setBackground(Color.WHITE);
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
	btnDerecha.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
	gbc_btnNewButton_3.anchor = GridBagConstraints.WEST;
	gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_3.gridx = 2;
	gbc_btnNewButton_3.gridy = 1;
	panel_1.add(btnDerecha, gbc_btnNewButton_3);


	

	JButton btnIzquierda1 = new JButton(flechaIzquierda);
	btnIzquierda1.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
	gbc_btnNewButton_11.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_11.gridx = 0;
	gbc_btnNewButton_11.gridy = 3;
	panel_1.add(btnIzquierda1, gbc_btnNewButton_11);
	
	JLabel lblNewLabel_21 = new JLabel("P\u00E1gina");
	lblNewLabel_21.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
	gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_21.gridx = 1;
	gbc_lblNewLabel_21.gridy = 3;
	panel_1.add(lblNewLabel_21, gbc_lblNewLabel_21);
	
	JButton btnDerecha1 = new JButton(flechaDerecha);
	btnDerecha1.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnNewButton_31 = new GridBagConstraints();
	gbc_btnNewButton_31.anchor = GridBagConstraints.WEST;
	gbc_btnNewButton_31.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_31.gridx = 2;
	gbc_btnNewButton_31.gridy = 3;
	panel_1.add(btnDerecha1, gbc_btnNewButton_31);
	
		JButton btnCargarOtraHabitacion = new JButton("CARGAR OTRA HABITACION");
		btnCargarOtraHabitacion.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnCargarOtraHabitacion.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnCargarOtraHabitacion = new GridBagConstraints();
		gbc_btnCargarOtraHabitacion.insets = new Insets(0, 15, 0, 5);
		gbc_btnCargarOtraHabitacion.gridx = 0;
		gbc_btnCargarOtraHabitacion.gridy = 4;
		panel_1.add(btnCargarOtraHabitacion, gbc_btnCargarOtraHabitacion);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnFinalizar.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnFinalizar = new GridBagConstraints();
		gbc_btnFinalizar.insets = new Insets(0, 0, 0, 5);
		gbc_btnFinalizar.gridx = 1;
		gbc_btnFinalizar.gridy = 4;
		panel_1.add(btnFinalizar, gbc_btnFinalizar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnCancelar.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 4;
		panel_1.add(btnCancelar, gbc_btnCancelar);

	
}

}