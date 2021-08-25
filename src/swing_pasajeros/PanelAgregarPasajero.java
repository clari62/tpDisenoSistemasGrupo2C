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
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.Component;
import javax.swing.Box;

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
private JLabel co2;
private JLabel telefono;
private JLabel co4;
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
private JLabel calle;
private JTextField textCalle;
private JTextField textNroCalle;
private JComboBox comboTipoDNI;
private JComboBox comboPosicionIVA;
private JTextField textField;

public PanelAgregarPasajero() {
	setBackground(SystemColor.controlHighlight);
	this.setSize(new Dimension(800,600));
	
	List<JLabel> labels = new ArrayList<JLabel>();

	GridBagLayout gridBagLayout = new GridBagLayout();
	
//	gridBagLayout.columnWidths = new int[]{0, 192, 150, 0, 151};
	gridBagLayout.rowHeights = new int[] { 40, 19, 19, 19, 0, 19, 0, 19, 0, 19, 0, 0, 0, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 110, 38, 0 };
	gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
	gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0 };
	setLayout(gridBagLayout);
	
	JLabel apellido = new JLabel("Apellido(*): ");
	apellido.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_2.insets = new Insets(10, 5, 5, 5);
	gbc_lblNewLabel_2.gridx = 1;
	gbc_lblNewLabel_2.gridy = 2;
	add(apellido, gbc_lblNewLabel_2);

	textApellido = new JTextField();
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.insets = new Insets(10, 0, 5, 5);
	gbc_textField_1.gridx = 2;
	gbc_textField_1.gridy = 2;
	add(textApellido, gbc_textField_1);
	textApellido.setColumns(10);
	
	nacimiento = new JLabel("Fecha de nacimiento(*):");
	nacimiento.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
	gbc_lblNewLabel_13.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_13.insets = new Insets(10, 0, 5, 5);
	gbc_lblNewLabel_13.gridx = 3;
	gbc_lblNewLabel_13.gridy = 2;
	add(nacimiento, gbc_lblNewLabel_13);
	
	textField = new JTextField();
	textField.setColumns(10);
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.insets = new Insets(10, 0, 5, 0);
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.gridx = 4;
	gbc_textField.gridy = 2;
	add(textField, gbc_textField);

	co1 = new JLabel("Campo obligatorio.");
	co1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	co1.setForeground(Color.RED);
	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
	gbc_lblNewLabel_1.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_1.gridx = 2;
	gbc_lblNewLabel_1.gridy = 3;
	gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
	
	add(co1, gbc_lblNewLabel_1);
	labels.add(co1);
	
	co2 = new JLabel("Campo obligatorio.");
	co2.setForeground(Color.RED);
	co2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
	gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_9.gridx = 3;
	gbc_lblNewLabel_9.gridy = 3;
	add(co2, gbc_lblNewLabel_9);
	labels.add(co2);
	
	JLabel nombre = new JLabel("Nombre(*):");
	nombre.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
	gbc_lblNewLabel_3.gridwidth = 2;
	gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_3.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_3.gridx = 0;
	gbc_lblNewLabel_3.gridy = 4;
	add(nombre, gbc_lblNewLabel_3);
	
	textNombre = new JTextField();
	textNombre.setColumns(10);
	GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_2.gridwidth = 1;
	gbc_textField_2.insets = new Insets(0, 0, 5, 5);
	gbc_textField_2.gridx = 2;
	gbc_textField_2.gridy = 4;
	add(textNombre, gbc_textField_2);
	
	telefono = new JLabel("Tel\u00E9fono(*):");
	telefono.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
	gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_10.gridx = 3;
	gbc_lblNewLabel_10.gridy = 4;
	add(telefono, gbc_lblNewLabel_10);
	
	textTelefono = new JTextField();
	textTelefono.setColumns(10);
	GridBagConstraints gbc_textField_6 = new GridBagConstraints();
	gbc_textField_6.insets = new Insets(0, 0, 5, 0);
	gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_6.gridx = 4;
	gbc_textField_6.gridy = 4;
	add(textTelefono, gbc_textField_6);
	
	co3 = new JLabel("Campo obligatorio.");
	co3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	co3.setForeground(Color.RED);
	GridBagConstraints gbc_co3 = new GridBagConstraints();
	gbc_co3.gridy = 5;
	gbc_co3.insets = new Insets(0, 5, 5, 5);
	gbc_co3.gridx = 1;
	gbc_co3.anchor = GridBagConstraints.EAST;
	add(co3, gbc_co3);
	labels.add(co3);

	co4 = new JLabel("Campo obligatorio.");
	co4.setForeground(Color.RED);
	co4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
	gbc_lblNewLabel_14.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_14.gridx = 3;
	gbc_lblNewLabel_14.gridy = 5;
	add(co4, gbc_lblNewLabel_14);
	labels.add(co4);

	JLabel tipoDni = new JLabel("Tipo de Documento(*):");
	tipoDni.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
	gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_4.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_4.gridx = 1;
	gbc_lblNewLabel_4.gridy = 6;
	add(tipoDni, gbc_lblNewLabel_4);
	
	comboTipoDNI = new JComboBox();
	comboTipoDNI.setModel(new DefaultComboBoxModel(new String[] {"DNI", "Pasaporte", "Libreta"}));
	GridBagConstraints gbc_comboBox = new GridBagConstraints();
	gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox.gridx = 2;
	gbc_comboBox.gridy = 6;
	add(comboTipoDNI, gbc_comboBox);
	
	mail = new JLabel("Email:");
	mail.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
	gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_11.gridx = 3;
	gbc_lblNewLabel_11.gridy = 6;
	add(mail, gbc_lblNewLabel_11);
	
	textEmail = new JTextField();
	textEmail.setColumns(10);
	GridBagConstraints gbc_textField_7 = new GridBagConstraints();
	gbc_textField_7.insets = new Insets(0, 0, 5, 0);
	gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_7.gridx = 4;
	gbc_textField_7.gridy = 6;
	add(textEmail, gbc_textField_7);
	
	co5 = new JLabel("Campo obligatorio.");
	co5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	co5.setForeground(Color.RED);
	GridBagConstraints horaCgbc = new GridBagConstraints();
	horaCgbc.gridy = 7;
	horaCgbc.insets = new Insets(0, 5, 5, 5);
	horaCgbc.gridx = 1;
	horaCgbc.anchor = GridBagConstraints.EAST;
	add(co5, horaCgbc);
	labels.add(co5);

	co6 = new JLabel("Campo obligatorio.");
	co6.setForeground(Color.RED);
	co6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
	gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_12.gridx = 3;
	gbc_lblNewLabel_12.gridy = 7;
	add(co6, gbc_lblNewLabel_12);
	labels.add(co6);

	
	JLabel numeroDni = new JLabel("N\u00FAmero de Documento(*):");
	numeroDni.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
	gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_5.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_5.gridx = 1;
	gbc_lblNewLabel_5.gridy = 8;
	add(numeroDni, gbc_lblNewLabel_5);
	
	textNroDNI = new JTextField();
	textNroDNI.setColumns(10);
	GridBagConstraints gbc_textCalle_1 = new GridBagConstraints();
	gbc_textCalle_1.insets = new Insets(0, 0, 5, 5);
	gbc_textCalle_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textCalle_1.gridx = 2;
	gbc_textCalle_1.gridy = 8;
	add(textNroDNI, gbc_textCalle_1);
		
	ocupacion = new JLabel("Ocupaci\u00F3n(*):");
	ocupacion.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
	gbc_lblNewLabel_15.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_15.gridx = 3;
	gbc_lblNewLabel_15.gridy = 8;
	add(ocupacion, gbc_lblNewLabel_15);
	
	textOcupacion = new JTextField();
	textOcupacion.setColumns(10);
	GridBagConstraints gbc_textField_8 = new GridBagConstraints();
	gbc_textField_8.insets = new Insets(0, 0, 5, 0);
	gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_8.gridx = 4;
	gbc_textField_8.gridy = 8;
	add(textOcupacion, gbc_textField_8);
	
	co8 = new JLabel("Campo obligatorio.");
	co8.setForeground(Color.RED);
	co8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
	gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_8.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_8.gridx = 1;
	gbc_lblNewLabel_8.gridy = 9;
	add(co8, gbc_lblNewLabel_8);
	labels.add(co8);

	co9 = new JLabel("Campo obligatorio.");
	co9.setForeground(Color.RED);
	co9.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
	gbc_lblNewLabel_16.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_16.gridx = 3;
	gbc_lblNewLabel_16.gridy = 9;
	add(co9, gbc_lblNewLabel_16);
	labels.add(co9);

	cuit = new JLabel("CUIT:");
	cuit.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel.gridx = 1;
	gbc_lblNewLabel.gridy = 10;
	add(cuit, gbc_lblNewLabel);
	
	textCUIT = new JTextField();
	textCUIT.setColumns(10);
	GridBagConstraints gbc_textField_3 = new GridBagConstraints();
	gbc_textField_3.insets = new Insets(0, 0, 5, 5);
	gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_3.gridx = 2;
	gbc_textField_3.gridy = 10;
	add(textCUIT, gbc_textField_3);
	
	nacionalidad = new JLabel("Nacionalidad(*):");
	nacionalidad.setFont(new Font("Arial", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
	gbc_lblNewLabel_17.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
	gbc_lblNewLabel_17.gridx = 3;
	gbc_lblNewLabel_17.gridy = 10;
	add(nacionalidad, gbc_lblNewLabel_17);
	comboNacionalidad = new JComboBox();
	comboNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"Argentina", "Brasil", "Chile"}));
	GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
	gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_2.gridx = 4;
	gbc_comboBox_2.gridy = 10;
	add(comboNacionalidad, gbc_comboBox_2);
	
	posicionIVA = new JLabel("Posici\u00F3n frente al IVA:");
	posicionIVA.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
	gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel_7.insets = new Insets(0, 5, 5, 5);
	gbc_lblNewLabel_7.gridx = 1;
	gbc_lblNewLabel_7.gridy = 12;
	add(posicionIVA, gbc_lblNewLabel_7);
	
	comboPosicionIVA = new JComboBox();
	comboPosicionIVA.setModel(new DefaultComboBoxModel(new String[] {"Responsable Inscripto", "Consumidor final"}));
	GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
	gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
	gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_1.gridx = 2;
	gbc_comboBox_1.gridy = 12;
	add(comboPosicionIVA, gbc_comboBox_1);

	
	botonSiguiente = new JButton("SIGUIENTE");
	botonSiguiente.setBackground(Color.WHITE);
	botonSiguiente.setFont(new Font("Arial", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	//gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
	gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton.gridx = 2;
	gbc_btnNewButton.gridy = 26;
	add(botonSiguiente, gbc_btnNewButton);
	
	botonCancelar = new JButton("CANCELAR");
	botonCancelar.setBackground(Color.WHITE);
	botonCancelar.setFont(new Font("Arial", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
	gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
	gbc_btnNewButton_1.gridx = 3;
	gbc_btnNewButton_1.gridy = 26;
	add(botonCancelar, gbc_btnNewButton_1);

	//this.limpiarWarnings(labels);
}

	public void limpiarWarnings(List<JLabel> labelAQuitar) {
		for(int i =0;i<labelAQuitar.size();i++) {
		labelAQuitar.get(i).setVisible(false);
		}
	}
	
}
