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
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

public class PanelAgregarPasajero extends JPanel {
	
private JTextField textApellido;
private JButton botonSiguiente;
private JButton botonCancelar;
private JLabel co1;
private JLabel co3;
private JLabel co5;
private JTextField textNroDNI;
private JTextField textNombre;
private JLabel cuit;
private JTextField textCUIT;
private JLabel posicionIVA;
private JLabel co8;
private JLabel nacimiento;
private JTextField textFechaNacimiento;
private JLabel co2;
private JLabel telefono;
private JLabel co4;
private JTextField textField_5;
private JTextField textTelefono;
private JLabel mail;
private JLabel co6;
private JTextField textEmail;
private JLabel ocupacion;
private JLabel co9;
private JTextField textOcupacion;
private JLabel nacionalidad;
private JLabel co10;
private JComboBox comboNacionalidad;
private JPanel panel;
private JLabel calle;
private JTextField textCalle;
private JLabel co11;
private JLabel depto;
private JTextField textDepto;
private JLabel pais;
private JLabel co13;
private JComboBox comboPais;
private JLabel localidad;
private JLabel co15;
private JComboBox comboLocalidad;
private JLabel provincia;
private JComboBox comboProvincia;
private JLabel codPostal;
private JTextField textCodigoPostal;
private JLabel co14;
private JLabel co16;
private JLabel nroCalle;
private JLabel co12;
private JTextField textNroCalle;
private JComboBox comboTipoDNI;
private JComboBox comboPosicionIVA;

public PanelAgregarPasajero() {
	setBackground(Color.WHITE);
	GridBagLayout gridBagLayout = new GridBagLayout();

	gridBagLayout.columnWidths = new int[] { 30, 90, 141, 56, 0, 0, 93, 0 };
	gridBagLayout.rowHeights = new int[] { 0, 26, 19, 0, 19, 0, 19, 0, 19, 0, 0, 21, 0, 0, 85, 0, 0 };
	gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
	gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
			0.0, 0.0 };
	setLayout(gridBagLayout);

	JLabel apellido = new JLabel("Apellido(*): ");
	apellido.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_2.gridx = 1;
	gbc_lblNewLabel_2.gridy = 2;
	add(apellido, gbc_lblNewLabel_2);

	textApellido = new JTextField();
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	gbc_textField_1.gridwidth = 2;
	gbc_textField_1.gridx = 2;
	gbc_textField_1.gridy = 2;
	add(textApellido, gbc_textField_1);
	textApellido.setColumns(10);

	co1 = new JLabel("Campo obligatorio.");
	co1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	co1.setForeground(Color.RED);
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_1.gridx = 1;
	gbc_lblNewLabel_1.gridy = 3;
	gbc_lblNewLabel_1.gridwidth = 2;
	gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
	co1.setVisible(false);
	
	nacimiento = new JLabel("Fecha de nacimiento(*):");
	nacimiento.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
	gbc_lblNewLabel_13.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_13.gridx = 4;
	gbc_lblNewLabel_13.gridy = 2;
	add(nacimiento, gbc_lblNewLabel_13);
	
	textFechaNacimiento = new JTextField();
	textFechaNacimiento.setColumns(10);
	GridBagConstraints gbc_textField_4 = new GridBagConstraints();
	gbc_textField_4.insets = new Insets(0, 0, 5, 0);
	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_4.gridx = 6;
	gbc_textField_4.gridy = 2;
	add(textFechaNacimiento, gbc_textField_4);

	add(co1, gbc_lblNewLabel_1);
	
	co2 = new JLabel("Campo obligatorio.");
	co2.setForeground(Color.RED);
	co2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
	gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_9.gridx = 4;
	gbc_lblNewLabel_9.gridy = 3;
	add(co2, gbc_lblNewLabel_9);

	JLabel nombre = new JLabel("Nombre(*):");
	nombre.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
	gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_3.gridx = 1;
	gbc_lblNewLabel_3.gridy = 4;
	add(nombre, gbc_lblNewLabel_3);
	
	textNombre = new JTextField();
	textNombre.setColumns(10);
	GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	gbc_textField_2.gridwidth = 2;
	gbc_textField_2.insets = new Insets(0, 0, 5, 5);
	gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_2.gridx = 2;
	gbc_textField_2.gridy = 4;
	add(textNombre, gbc_textField_2);
	
	telefono = new JLabel("Tel\u00E9fono(*):");
	telefono.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
	gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_10.gridx = 4;
	gbc_lblNewLabel_10.gridy = 4;
	add(telefono, gbc_lblNewLabel_10);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	GridBagConstraints gbc_textField_5 = new GridBagConstraints();
	gbc_textField_5.anchor = GridBagConstraints.WEST;
	gbc_textField_5.insets = new Insets(0, 0, 5, 5);
	gbc_textField_5.gridx = 5;
	gbc_textField_5.gridy = 4;
	add(textField_5, gbc_textField_5);
	
	textTelefono = new JTextField();
	textTelefono.setColumns(10);
	GridBagConstraints gbc_textField_6 = new GridBagConstraints();
	gbc_textField_6.insets = new Insets(0, 0, 5, 0);
	gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_6.gridx = 6;
	gbc_textField_6.gridy = 4;
	add(textTelefono, gbc_textField_6);

	co3 = new JLabel("Campo obligatorio.");
	co3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	co3.setForeground(Color.RED);
	GridBagConstraints horaApgbc = new GridBagConstraints();
	horaApgbc.gridy = 5;
	horaApgbc.insets = new Insets(0, 0, 5, 5);
	horaApgbc.gridx = 1;
	horaApgbc.gridwidth = 2;
	horaApgbc.anchor = GridBagConstraints.WEST;
	add(co3, horaApgbc);
	co3.setVisible(false);
	
	co4 = new JLabel("Campo obligatorio.");
	co4.setForeground(Color.RED);
	co4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
	gbc_lblNewLabel_14.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_14.gridx = 4;
	gbc_lblNewLabel_14.gridy = 5;
	add(co4, gbc_lblNewLabel_14);

	JLabel tipoDni = new JLabel("Tipo de Documento(*):");
	tipoDni.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
	gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_4.gridx = 1;
	gbc_lblNewLabel_4.gridy = 6;
	add(tipoDni, gbc_lblNewLabel_4);
	
	comboTipoDNI = new JComboBox();
	comboTipoDNI.setModel(new DefaultComboBoxModel(new String[] {"DNI", "Pasaporte", "Libreta"}));
	GridBagConstraints gbc_comboBox = new GridBagConstraints();
	gbc_comboBox.gridwidth = 2;
	gbc_comboBox.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox.gridx = 2;
	gbc_comboBox.gridy = 6;
	add(comboTipoDNI, gbc_comboBox);
	
	mail = new JLabel("Email:");
	mail.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
	gbc_lblNewLabel_11.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_11.gridx = 4;
	gbc_lblNewLabel_11.gridy = 6;
	add(mail, gbc_lblNewLabel_11);
	
	textEmail = new JTextField();
	textEmail.setColumns(10);
	GridBagConstraints gbc_textField_7 = new GridBagConstraints();
	gbc_textField_7.insets = new Insets(0, 0, 5, 0);
	gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_7.gridx = 6;
	gbc_textField_7.gridy = 6;
	add(textEmail, gbc_textField_7);

	co5 = new JLabel("Campo obligatorio.");
	co5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	co5.setForeground(Color.RED);
	GridBagConstraints horaCgbc = new GridBagConstraints();
	horaCgbc.gridy = 7;
	horaCgbc.insets = new Insets(0, 0, 5, 5);
	horaCgbc.gridx = 1;
	horaCgbc.gridwidth = 2;
	horaCgbc.anchor = GridBagConstraints.WEST;
	add(co5, horaCgbc);
	co5.setVisible(false);
	
	co6 = new JLabel("Campo obligatorio.");
	co6.setForeground(Color.RED);
	co6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
	gbc_lblNewLabel_12.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_12.gridx = 4;
	gbc_lblNewLabel_12.gridy = 7;
	add(co6, gbc_lblNewLabel_12);

	JLabel numeroDni = new JLabel("N\u00FAmero de Documento(*):");
	numeroDni.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
	gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_5.gridx = 1;
	gbc_lblNewLabel_5.gridy = 8;
	add(numeroDni, gbc_lblNewLabel_5);
	
	textNroDNI = new JTextField();
	textNroDNI.setColumns(10);
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.gridwidth = 2;
	gbc_textField.insets = new Insets(0, 0, 5, 5);
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.gridx = 2;
	gbc_textField.gridy = 8;
	add(textNroDNI, gbc_textField);

		
	ocupacion = new JLabel("Ocupaci\u00F3n(*):");
	ocupacion.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
	gbc_lblNewLabel_15.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_15.gridx = 4;
	gbc_lblNewLabel_15.gridy = 8;
	add(ocupacion, gbc_lblNewLabel_15);
		
	textOcupacion = new JTextField();
	textOcupacion.setColumns(10);
	GridBagConstraints gbc_textField_8 = new GridBagConstraints();
	gbc_textField_8.insets = new Insets(0, 0, 5, 0);
	gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_8.gridx = 6;
	gbc_textField_8.gridy = 8;
	add(textOcupacion, gbc_textField_8);
	
	co8 = new JLabel("Campo obligatorio.");
	co8.setForeground(Color.RED);
	co8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
	gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_8.gridx = 1;
	gbc_lblNewLabel_8.gridy = 9;
	add(co8, gbc_lblNewLabel_8);
	
	co9 = new JLabel("Campo obligatorio.");
	co9.setForeground(Color.RED);
	co9.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
	gbc_lblNewLabel_16.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_16.gridx = 4;
	gbc_lblNewLabel_16.gridy = 9;
	add(co9, gbc_lblNewLabel_16);
		
	cuit = new JLabel("CUIT:");
	cuit.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel.gridx = 1;
	gbc_lblNewLabel.gridy = 10;
	add(cuit, gbc_lblNewLabel);
	
	textCUIT = new JTextField();
	textCUIT.setColumns(10);
	GridBagConstraints gbc_textField_3 = new GridBagConstraints();
	gbc_textField_3.gridwidth = 2;
	gbc_textField_3.insets = new Insets(0, 0, 5, 5);
	gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_3.gridx = 2;
	gbc_textField_3.gridy = 10;
	add(textCUIT, gbc_textField_3);
		
	nacionalidad = new JLabel("Nacionalidad(*):");
	nacionalidad.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
	gbc_lblNewLabel_17.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_17.gridx = 4;
	gbc_lblNewLabel_17.gridy = 10;
	add(nacionalidad, gbc_lblNewLabel_17);
		
	comboNacionalidad = new JComboBox();
	comboNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"Argentina", "Brasil", "Chile"}));
	GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
	gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_2.gridx = 6;
	gbc_comboBox_2.gridy = 10;
	add(comboNacionalidad, gbc_comboBox_2);
		
	posicionIVA = new JLabel("Posici\u00F3n frente al IVA:");
	posicionIVA.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
	gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_7.gridx = 1;
	gbc_lblNewLabel_7.gridy = 11;
	add(posicionIVA, gbc_lblNewLabel_7);
	
	comboPosicionIVA = new JComboBox();
	comboPosicionIVA.setModel(new DefaultComboBoxModel(new String[] {"Responsable Inscripto", "Consumidor final"}));
	GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
	gbc_comboBox_1.gridwidth = 2;
	gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_1.gridx = 2;
	gbc_comboBox_1.gridy = 11;
	add(comboPosicionIVA, gbc_comboBox_1);
		
	co10 = new JLabel("Campo obligatorio.");
	co10.setForeground(Color.RED);
	co10.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
	gbc_lblNewLabel_18.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_18.gridx = 4;
	gbc_lblNewLabel_18.gridy = 11;
	add(co10, gbc_lblNewLabel_18);
	
	panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0)));
	GridBagConstraints gbc_panel = new GridBagConstraints();
	gbc_panel.gridheight = 3;
	gbc_panel.gridwidth = 6;
	gbc_panel.insets = new Insets(0, 0, 5, 0);
	gbc_panel.fill = GridBagConstraints.BOTH;
	gbc_panel.gridx = 1;
	gbc_panel.gridy = 12;
	add(panel, gbc_panel);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{0, 43, 123, 0, 108, 0};
	gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	calle = new JLabel("Calle(*):");
	calle.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
	gbc_lblNewLabel_19.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_19.gridx = 0;
	gbc_lblNewLabel_19.gridy = 0;
	panel.add(calle, gbc_lblNewLabel_19);
	
	textCalle = new JTextField();
	textCalle.setColumns(10);
	GridBagConstraints gbc_textField_9 = new GridBagConstraints();
	gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_9.insets = new Insets(0, 0, 5, 5);
	gbc_textField_9.gridx = 2;
	gbc_textField_9.gridy = 0;
	panel.add(textCalle, gbc_textField_9);
		
	nroCalle = new JLabel("N\u00FAmero(*):");
	nroCalle.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_30 = new GridBagConstraints();
	gbc_lblNewLabel_30.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_30.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_30.gridx = 3;
	gbc_lblNewLabel_30.gridy = 0;
	panel.add(nroCalle, gbc_lblNewLabel_30);
	
	textNroCalle = new JTextField();
	textNroCalle.setColumns(10);
	GridBagConstraints gbc_textField_12 = new GridBagConstraints();
	gbc_textField_12.insets = new Insets(0, 0, 5, 0);
	gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_12.gridx = 4;
	gbc_textField_12.gridy = 0;
	panel.add(textNroCalle, gbc_textField_12);
	
	co11 = new JLabel("Campo obligatorio.");
	co11.setForeground(Color.RED);
	co11.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
	gbc_lblNewLabel_20.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_20.gridx = 0;
	gbc_lblNewLabel_20.gridy = 1;
	panel.add(co11, gbc_lblNewLabel_20);
	
	co12 = new JLabel("Campo obligatorio.");
	co12.setForeground(Color.RED);
	co12.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
	gbc_lblNewLabel_31.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_31.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_31.gridx = 3;
	gbc_lblNewLabel_31.gridy = 1;
	panel.add(co12, gbc_lblNewLabel_31);
	
	depto = new JLabel("Departamento:");
	depto.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
	gbc_lblNewLabel_21.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_21.gridx = 0;
	gbc_lblNewLabel_21.gridy = 2;
	panel.add(depto, gbc_lblNewLabel_21);
	
	textDepto = new JTextField();
	textDepto.setColumns(10);
	GridBagConstraints gbc_textField_10 = new GridBagConstraints();
	gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_10.insets = new Insets(0, 0, 5, 5);
	gbc_textField_10.gridx = 2;
	gbc_textField_10.gridy = 2;
	panel.add(textDepto, gbc_textField_10);
	
	pais = new JLabel("Pa\u00EDs(*):");
	pais.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
	gbc_lblNewLabel_22.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_22.gridx = 0;
	gbc_lblNewLabel_22.gridy = 3;
	panel.add(pais, gbc_lblNewLabel_22);
	
	comboPais = new JComboBox();
	GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
	gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_3.gridx = 2;
	gbc_comboBox_3.gridy = 3;
	panel.add(comboPais, gbc_comboBox_3);
		
	provincia = new JLabel("Provincia(*):");
	provincia.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
	gbc_lblNewLabel_26.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_26.gridx = 3;
	gbc_lblNewLabel_26.gridy = 3;
	panel.add(provincia, gbc_lblNewLabel_26);
	
	comboProvincia = new JComboBox();
	GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
	gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_5.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_5.gridx = 4;
	gbc_comboBox_5.gridy = 3;
	panel.add(comboProvincia, gbc_comboBox_5);
		
	co13 = new JLabel("Campo obligatorio.");
	co13.setForeground(Color.RED);
	co13.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
	gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_23.gridx = 0;
	gbc_lblNewLabel_23.gridy = 4;
	panel.add(co13, gbc_lblNewLabel_23);
	
	co14 = new JLabel("Campo obligatorio.");
	co14.setForeground(Color.RED);
	co14.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
	gbc_lblNewLabel_28.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_28.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_28.gridx = 3;
	gbc_lblNewLabel_28.gridy = 4;
	panel.add(co14, gbc_lblNewLabel_28);
	
	localidad = new JLabel("Localidad(*):");
	localidad.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
	gbc_lblNewLabel_24.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_24.gridx = 0;
	gbc_lblNewLabel_24.gridy = 5;
	panel.add(localidad, gbc_lblNewLabel_24);
	
	comboLocalidad = new JComboBox();
	GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
	gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_4.gridx = 2;
	gbc_comboBox_4.gridy = 5;
	panel.add(comboLocalidad, gbc_comboBox_4);

	codPostal = new JLabel("C\u00F3digo Postal(*):");
	codPostal.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
	gbc_lblNewLabel_27.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_27.gridx = 3;
	gbc_lblNewLabel_27.gridy = 5;
	panel.add(codPostal, gbc_lblNewLabel_27);
	
	textCodigoPostal = new JTextField();
	textCodigoPostal.setColumns(10);
	GridBagConstraints gbc_textField_11 = new GridBagConstraints();
	gbc_textField_11.insets = new Insets(0, 0, 5, 0);
	gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_11.gridx = 4;
	gbc_textField_11.gridy = 5;
	panel.add(textCodigoPostal, gbc_textField_11);
	
	co15 = new JLabel("Campo obligatorio.");
	co15.setForeground(Color.RED);
	co15.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
	gbc_lblNewLabel_25.insets = new Insets(0, 0, 0, 5);
	gbc_lblNewLabel_25.gridx = 0;
	gbc_lblNewLabel_25.gridy = 6;
	panel.add(co15, gbc_lblNewLabel_25);
	
	co16 = new JLabel("Campo obligatorio.");
	co16.setForeground(Color.RED);
	co16.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
	gbc_lblNewLabel_29.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_29.insets = new Insets(0, 0, 0, 5);
	gbc_lblNewLabel_29.gridx = 3;
	gbc_lblNewLabel_29.gridy = 6;
	panel.add(co16, gbc_lblNewLabel_29);

	botonSiguiente = new JButton("SIGUIENTE");
	botonSiguiente.setBackground(Color.WHITE);
	botonSiguiente.setFont(new Font("Arial", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
	gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton.gridx = 2;
	gbc_btnNewButton.gridy = 15;
	add(botonSiguiente, gbc_btnNewButton);
						
	botonCancelar = new JButton("CANCELAR");
	botonCancelar.setBackground(Color.WHITE);
	botonCancelar.setFont(new Font("Arial", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
	gbc_btnNewButton_1.fill = GridBagConstraints.VERTICAL;
	gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_1.gridx = 4;
	gbc_btnNewButton_1.gridy = 15;
	add(botonCancelar, gbc_btnNewButton_1);
	
	List<JLabel> labels = new ArrayList<JLabel>();
	labels.add(co1);labels.add(co2);labels.add(co3);labels.add(co4);labels.add(co5);
	labels.add(co6);labels.add(co8);labels.add(co9);labels.add(co10);labels.add(co11);
	labels.add(co12);labels.add(co13);labels.add(co14);labels.add(co15);labels.add(co16);

	
	this.limpiarWarnings(labels);
}

	public void limpiarWarnings(List<JLabel> labelAQuitar) {
		for(int i =0;i<labelAQuitar.size();i++) {
		labelAQuitar.get(i).setVisible(false);
		}
	}
	
}
