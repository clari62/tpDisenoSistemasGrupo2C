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
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class PanelAgregarPasajero extends JPanel {
	
private JLabel apellido;
private JTextField textApellido;
private JLabel nombres;
private JTextField textNombre;
private JLabel fechaNacimiento1;
private JLabel co1;
private JLabel co3;
private JTextField textNroDNI;
private JComboBox comboTipoDNI;
private JLabel co5;
private JLabel co6;
private JLabel cuit;
private JTextField textCUIT;
private JComboBox comboIVA;
private JLabel telefono;
private JTextField textTelefono;
private JLabel co2;
private JLabel co4;
private JLabel email;
private JLabel ocupacion;
private JLabel nacionalidad;
private JTextField textEmail;
private JTextField textField_7;
private JTextField textNacionalidad;
private JLabel co7;
private JLabel co8;
private JLabel pais;
private JComboBox comboPais;
private JLabel localidad;
private JLabel co8_1;
private JComboBox comboLocalidad;
private JLabel pisopsio;
private JTextField textPiso;
private JLabel codigoPostal;
private JLabel provincia;
private JComboBox comboProvincia;
private JTextField textCodigoPostal;
private JButton btnCancelar;
private JPanel panel;
private JLabel calle_1;
private JTextField textField;
private JLabel co9_1;
private JLabel departamento_1;
private JTextField textField_1;
private JLabel numero_1;
private JTextField textField_2;
private JLabel co8_2;
private JLabel co8_3;
private JLabel co8_4;
private JLabel co8_5;
private JButton btnSiguiente;
private JLabel nombres_1;
private JLabel nombres_2;
private JDateChooser dateChooser;

public PanelAgregarPasajero() {
	setBackground(SystemColor.controlHighlight);
	this.setSize(new Dimension(800,600));
	GridBagLayout gridBagLayout = new GridBagLayout();

	gridBagLayout.rowHeights = new int[]{36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 24, 0, 9, 0, 0, 0, 0, 30, 0, 0, 0, 8, 0};
	gridBagLayout.columnWidths = new int[]{127, 250, 104, 250, 0};
	
	setLayout(gridBagLayout);
	
	apellido = new JLabel("Apellido(*):");
	apellido.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_apellido = new GridBagConstraints();
	gbc_apellido.insets = new Insets(10, 0, 5, 5);
	gbc_apellido.anchor = GridBagConstraints.EAST;
	gbc_apellido.gridx = 0;
	gbc_apellido.gridy = 0;
	add(apellido, gbc_apellido);
	
	textApellido = new JTextField();
	GridBagConstraints gbc_textApellido = new GridBagConstraints();
	gbc_textApellido.insets = new Insets(10, 0, 5, 5);
	gbc_textApellido.fill = GridBagConstraints.HORIZONTAL;
	gbc_textApellido.gridx = 1;
	gbc_textApellido.gridy = 0;
	add(textApellido, gbc_textApellido);
	textApellido.setColumns(10);
	
	dateChooser = new JDateChooser();
	dateChooser.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser = new GridBagConstraints();
	gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
	gbc_dateChooser.insets = new Insets(0, 0, 5, 10);
	gbc_dateChooser.gridx = 3;
	gbc_dateChooser.gridy = 0;
	dateChooser.setBackground(SystemColor.controlHighlight);
	add(dateChooser, gbc_dateChooser);
	
	co1 = new JLabel("Campo obligatorio");
	co1.setForeground(Color.RED);
	co1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co1 = new GridBagConstraints();
	gbc_co1.anchor = GridBagConstraints.WEST;
	gbc_co1.insets = new Insets(0, 0, 5, 5);
	gbc_co1.gridx = 1;
	gbc_co1.gridy = 1;
	add(co1, gbc_co1);
	
	co2 = new JLabel("Campo obligatorio");
	co2.setForeground(Color.RED);
	co2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co2 = new GridBagConstraints();
	gbc_co2.anchor = GridBagConstraints.WEST;
	gbc_co2.insets = new Insets(0, 0, 5, 5);
	gbc_co2.gridx = 3;
	gbc_co2.gridy = 1;
	add(co2, gbc_co2);
	
	nombres = new JLabel("Nombres(*):");
	nombres.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_nombres = new GridBagConstraints();
	gbc_nombres.anchor = GridBagConstraints.EAST;
	gbc_nombres.insets = new Insets(0, 0, 5, 5);
	gbc_nombres.gridx = 0;
	gbc_nombres.gridy = 2;
	add(nombres, gbc_nombres);
	
	textNombre = new JTextField();
	textNombre.setColumns(10);
	GridBagConstraints gbc_textNombre = new GridBagConstraints();
	gbc_textNombre.insets = new Insets(0, 0, 5, 5);
	gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNombre.gridx = 1;
	gbc_textNombre.gridy = 2;
	add(textNombre, gbc_textNombre);
	
	telefono = new JLabel("Tel\u00E9fono(*):");
	telefono.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_telefono = new GridBagConstraints();
	gbc_telefono.anchor = GridBagConstraints.EAST;
	gbc_telefono.insets = new Insets(0, 0, 5, 5);
	gbc_telefono.gridx = 2;
	gbc_telefono.gridy = 2;
	add(telefono, gbc_telefono);
	
	textTelefono = new JTextField();
	textTelefono.setColumns(10);
	GridBagConstraints gbc_textTelefono = new GridBagConstraints();
	gbc_textTelefono.insets = new Insets(0, 0, 5, 10);
	gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
	gbc_textTelefono.gridx = 3;
	gbc_textTelefono.gridy = 2;
	add(textTelefono, gbc_textTelefono);
	
	co3 = new JLabel("Campo obligatorio");
	co3.setForeground(Color.RED);
	co3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co3 = new GridBagConstraints();
	gbc_co3.anchor = GridBagConstraints.WEST;
	gbc_co3.insets = new Insets(0, 0, 5, 5);
	gbc_co3.gridx = 1;
	gbc_co3.gridy = 3;
	add(co3, gbc_co3);
	
	co4 = new JLabel("Campo obligatorio");
	co4.setForeground(Color.RED);
	co4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co4 = new GridBagConstraints();
	gbc_co4.anchor = GridBagConstraints.WEST;
	gbc_co4.insets = new Insets(0, 0, 5, 5);
	gbc_co4.gridx = 3;
	gbc_co4.gridy = 3;
	add(co4, gbc_co4);
	
	/*nombres_1 = new JLabel("Tipo Documento(*):");
	nombres_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_nombres_1 = new GridBagConstraints();
	gbc_nombres_1.insets = new Insets(0, 0, 5, 5);
	gbc_nombres_1.anchor = GridBagConstraints.EAST;
	gbc_nombres_1.gridx = 0;
	gbc_nombres_1.gridy = 4;
	add(nombres_1, gbc_nombres_1);*/
	
	comboTipoDNI = new JComboBox();
	GridBagConstraints gbc_comboTipoDNI = new GridBagConstraints();
	gbc_comboTipoDNI.insets = new Insets(0, 0, 5, 5);
	gbc_comboTipoDNI.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboTipoDNI.gridx = 1;
	gbc_comboTipoDNI.gridy = 4;
	add(comboTipoDNI, gbc_comboTipoDNI);
	
	email = new JLabel("Email:");
	email.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_email = new GridBagConstraints();
	gbc_email.anchor = GridBagConstraints.EAST;
	gbc_email.insets = new Insets(0, 0, 5, 5);
	gbc_email.gridx = 2;
	gbc_email.gridy = 4;
	add(email, gbc_email);
	
	textEmail = new JTextField();
	textEmail.setColumns(10);
	GridBagConstraints gbc_textEmail = new GridBagConstraints();
	gbc_textEmail.insets = new Insets(0, 0, 5, 10);
	gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
	gbc_textEmail.gridx = 3;
	gbc_textEmail.gridy = 4;
	add(textEmail, gbc_textEmail);
	
	co5 = new JLabel("Campo obligatorio");
	co5.setForeground(Color.RED);
	co5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co5 = new GridBagConstraints();
	gbc_co5.anchor = GridBagConstraints.WEST;
	gbc_co5.insets = new Insets(0, 0, 5, 5);
	gbc_co5.gridx = 1;
	gbc_co5.gridy = 5;
	add(co5, gbc_co5);
	
	
	/*nombres_2 = new JLabel("Nro. de Documento(*):");
	nombres_2.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_nombres_2 = new GridBagConstraints();
	gbc_nombres_2.anchor = GridBagConstraints.EAST;
	gbc_nombres_2.insets = new Insets(0, 0, 5, 5);
	gbc_nombres_2.gridx = 0;
	gbc_nombres_2.gridy = 6;
	add(nombres_2, gbc_nombres_2);*/
	
	textNroDNI = new JTextField();
	textNroDNI.setColumns(10);
	GridBagConstraints gbc_textNroDNI = new GridBagConstraints();
	gbc_textNroDNI.insets = new Insets(0, 0, 5, 5);
	gbc_textNroDNI.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNroDNI.gridx = 1;
	gbc_textNroDNI.gridy = 6;
	add(textNroDNI, gbc_textNroDNI);
	
	ocupacion = new JLabel("Ocupaci\u00F3n(*):");
	ocupacion.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_ocupacion = new GridBagConstraints();
	gbc_ocupacion.anchor = GridBagConstraints.EAST;
	gbc_ocupacion.insets = new Insets(0, 0, 5, 5);
	gbc_ocupacion.gridx = 2;
	gbc_ocupacion.gridy = 6;
	add(ocupacion, gbc_ocupacion);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	GridBagConstraints gbc_textField_7 = new GridBagConstraints();
	gbc_textField_7.insets = new Insets(0, 0, 5, 10);
	gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_7.gridx = 3;
	gbc_textField_7.gridy = 6;
	add(textField_7, gbc_textField_7);
	
	co6 = new JLabel("Campo obligatorio");
	co6.setForeground(Color.RED);
	co6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co6 = new GridBagConstraints();
	gbc_co6.anchor = GridBagConstraints.WEST;
	gbc_co6.insets = new Insets(0, 0, 5, 5);
	gbc_co6.gridx = 1;
	gbc_co6.gridy = 7;
	add(co6, gbc_co6);
	
	co7 = new JLabel("Campo obligatorio");
	co7.setForeground(Color.RED);
	co7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co7 = new GridBagConstraints();
	gbc_co7.anchor = GridBagConstraints.WEST;
	gbc_co7.insets = new Insets(0, 0, 5, 5);
	gbc_co7.gridx = 3;
	gbc_co7.gridy = 7;
	add(co7, gbc_co7);
	
	cuit = new JLabel("CUIT:");
	cuit.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_cuit = new GridBagConstraints();
	gbc_cuit.anchor = GridBagConstraints.EAST;
	gbc_cuit.insets = new Insets(0, 0, 5, 5);
	gbc_cuit.gridx = 0;
	gbc_cuit.gridy = 8;
	add(cuit, gbc_cuit);
	
	textCUIT = new JTextField();
	textCUIT.setColumns(10);
	GridBagConstraints gbc_textCUIT = new GridBagConstraints();
	gbc_textCUIT.insets = new Insets(0, 0, 5, 5);
	gbc_textCUIT.fill = GridBagConstraints.HORIZONTAL;
	gbc_textCUIT.gridx = 1;
	gbc_textCUIT.gridy = 8;
	add(textCUIT, gbc_textCUIT);
	
	nacionalidad = new JLabel("Nacionalidad(*):");
	nacionalidad.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_nacionalidad = new GridBagConstraints();
	gbc_nacionalidad.anchor = GridBagConstraints.EAST;
	gbc_nacionalidad.insets = new Insets(0, 0, 5, 5);
	gbc_nacionalidad.gridx = 2;
	gbc_nacionalidad.gridy = 8;
	add(nacionalidad, gbc_nacionalidad);
	
	textNacionalidad = new JTextField();
	textNacionalidad.setColumns(10);
	GridBagConstraints gbc_textNacionalidad = new GridBagConstraints();
	gbc_textNacionalidad.insets = new Insets(0, 0, 5, 10);
	gbc_textNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	gbc_textNacionalidad.gridx = 3;
	gbc_textNacionalidad.gridy = 8;
	add(textNacionalidad, gbc_textNacionalidad);
	
	co8 = new JLabel("Campo obligatorio");
	co8.setForeground(Color.RED);
	co8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co8 = new GridBagConstraints();
	gbc_co8.anchor = GridBagConstraints.WEST;
	gbc_co8.insets = new Insets(0, 0, 5, 5);
	gbc_co8.gridx = 3;
	gbc_co8.gridy = 9;
	add(co8, gbc_co8);
	
	comboIVA = new JComboBox();
	GridBagConstraints gbc_comboIVA = new GridBagConstraints();
	gbc_comboIVA.insets = new Insets(0, 0, 5, 5);
	gbc_comboIVA.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboIVA.gridx = 1;
	gbc_comboIVA.gridy = 10;
	add(comboIVA, gbc_comboIVA);
	
	panel = new JPanel();
	panel.setBackground(SystemColor.controlHighlight);
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel = new GridBagConstraints();
	gbc_panel.fill = GridBagConstraints.VERTICAL;
	gbc_panel.insets = new Insets(0, 0, 5, 0);
	gbc_panel.gridheight = 7;
	gbc_panel.gridwidth = 5;
	gbc_panel.gridx = 0;
	gbc_panel.gridy = 12;
	add(panel, gbc_panel);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{118, 250, 101, 250, 0};
	gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	calle_1 = new JLabel("Calle(*):");
	calle_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_calle_1 = new GridBagConstraints();
	gbc_calle_1.insets = new Insets(10, 0, 5, 5);
	gbc_calle_1.anchor = GridBagConstraints.EAST;
	gbc_calle_1.gridx = 0;
	gbc_calle_1.gridy = 0;
	panel.add(calle_1, gbc_calle_1);
	
	textField = new JTextField();
	textField.setColumns(10);
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.insets = new Insets(10, 0, 5, 5);
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.gridx = 1;
	gbc_textField.gridy = 0;
	panel.add(textField, gbc_textField);
	
	numero_1 = new JLabel("N\u00FAmero(*):");
	numero_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_numero_1 = new GridBagConstraints();
	gbc_numero_1.anchor = GridBagConstraints.EAST;
	gbc_numero_1.insets = new Insets(10, 0, 5, 5);
	gbc_numero_1.gridx = 2;
	gbc_numero_1.gridy = 0;
	panel.add(numero_1, gbc_numero_1);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	GridBagConstraints gbc_textField_2 = new GridBagConstraints();
	gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_2.insets = new Insets(10, 0, 5, 5);
	gbc_textField_2.gridx = 3;
	gbc_textField_2.gridy = 0;
	panel.add(textField_2, gbc_textField_2);
	
	co9_1 = new JLabel("Campo obligatorio");
	co9_1.setForeground(Color.RED);
	co9_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co9_1 = new GridBagConstraints();
	gbc_co9_1.insets = new Insets(0, 0, 5, 5);
	gbc_co9_1.anchor = GridBagConstraints.WEST;
	gbc_co9_1.gridx = 1;
	gbc_co9_1.gridy = 1;
	panel.add(co9_1, gbc_co9_1);
	
	co8_5 = new JLabel("Campo obligatorio");
	co8_5.setForeground(Color.RED);
	co8_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co8_5 = new GridBagConstraints();
	gbc_co8_5.anchor = GridBagConstraints.WEST;
	gbc_co8_5.insets = new Insets(0, 0, 5, 0);
	gbc_co8_5.gridx = 3;
	gbc_co8_5.gridy = 1;
	panel.add(co8_5, gbc_co8_5);
	
	departamento_1 = new JLabel("Departamento:");
	departamento_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_departamento_1 = new GridBagConstraints();
	gbc_departamento_1.anchor = GridBagConstraints.EAST;
	gbc_departamento_1.insets = new Insets(0, 0, 5, 5);
	gbc_departamento_1.gridx = 0;
	gbc_departamento_1.gridy = 2;
	panel.add(departamento_1, gbc_departamento_1);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.insets = new Insets(0, 0, 5, 5);
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.gridx = 1;
	gbc_textField_1.gridy = 2;
	panel.add(textField_1, gbc_textField_1);
	
	pisopsio = new JLabel("Piso:");
	GridBagConstraints gbc_pisopsio = new GridBagConstraints();
	gbc_pisopsio.anchor = GridBagConstraints.EAST;
	gbc_pisopsio.insets = new Insets(0, 0, 5, 5);
	gbc_pisopsio.gridx = 2;
	gbc_pisopsio.gridy = 2;
	panel.add(pisopsio, gbc_pisopsio);
	pisopsio.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	
	textPiso = new JTextField();
	GridBagConstraints gbc_textPiso = new GridBagConstraints();
	gbc_textPiso.fill = GridBagConstraints.HORIZONTAL;
	gbc_textPiso.insets = new Insets(0, 0, 5, 5);
	gbc_textPiso.gridx = 3;
	gbc_textPiso.gridy = 2;
	panel.add(textPiso, gbc_textPiso);
	textPiso.setColumns(10);
	
	pais = new JLabel("Pa\u00EDs(*):");
	GridBagConstraints gbc_pais = new GridBagConstraints();
	gbc_pais.anchor = GridBagConstraints.EAST;
	gbc_pais.insets = new Insets(0, 0, 5, 5);
	gbc_pais.gridx = 0;
	gbc_pais.gridy = 3;
	panel.add(pais, gbc_pais);
	pais.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	
	comboPais = new JComboBox();
	GridBagConstraints gbc_comboPais = new GridBagConstraints();
	gbc_comboPais.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboPais.insets = new Insets(0, 0, 5, 5);
	gbc_comboPais.gridx = 1;
	gbc_comboPais.gridy = 3;
	panel.add(comboPais, gbc_comboPais);
	
	provincia = new JLabel("Provincia(*):");
	GridBagConstraints gbc_provincia = new GridBagConstraints();
	gbc_provincia.anchor = GridBagConstraints.EAST;
	gbc_provincia.insets = new Insets(0, 0, 5, 5);
	gbc_provincia.gridx = 2;
	gbc_provincia.gridy = 3;
	panel.add(provincia, gbc_provincia);
	provincia.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	
	comboProvincia = new JComboBox();
	GridBagConstraints gbc_comboProvincia = new GridBagConstraints();
	gbc_comboProvincia.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboProvincia.insets = new Insets(0, 0, 5, 5);
	gbc_comboProvincia.gridx = 3;
	gbc_comboProvincia.gridy = 3;
	panel.add(comboProvincia, gbc_comboProvincia);
	
	co8_1 = new JLabel("Campo obligatorio");
	GridBagConstraints gbc_co8_1 = new GridBagConstraints();
	gbc_co8_1.anchor = GridBagConstraints.WEST;
	gbc_co8_1.insets = new Insets(0, 0, 5, 5);
	gbc_co8_1.gridx = 1;
	gbc_co8_1.gridy = 4;
	panel.add(co8_1, gbc_co8_1);
	co8_1.setForeground(Color.RED);
	co8_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	
	co8_2 = new JLabel("Campo obligatorio");
	co8_2.setForeground(Color.RED);
	co8_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co8_2 = new GridBagConstraints();
	gbc_co8_2.anchor = GridBagConstraints.WEST;
	gbc_co8_2.insets = new Insets(0, 0, 5, 0);
	gbc_co8_2.gridx = 3;
	gbc_co8_2.gridy = 4;
	panel.add(co8_2, gbc_co8_2);
	
	localidad = new JLabel("Localidad(*):");
	GridBagConstraints gbc_localidad = new GridBagConstraints();
	gbc_localidad.anchor = GridBagConstraints.EAST;
	gbc_localidad.insets = new Insets(0, 0, 5, 5);
	gbc_localidad.gridx = 0;
	gbc_localidad.gridy = 5;
	panel.add(localidad, gbc_localidad);
	localidad.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	
	comboLocalidad = new JComboBox();
	GridBagConstraints gbc_comboLocalidad = new GridBagConstraints();
	gbc_comboLocalidad.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboLocalidad.insets = new Insets(0, 0, 5, 5);
	gbc_comboLocalidad.gridx = 1;
	gbc_comboLocalidad.gridy = 5;
	panel.add(comboLocalidad, gbc_comboLocalidad);
	
	codigoPostal = new JLabel("C\u00F3digo Postal(*):");
	GridBagConstraints gbc_codigoPostal = new GridBagConstraints();
	gbc_codigoPostal.anchor = GridBagConstraints.EAST;
	gbc_codigoPostal.insets = new Insets(0, 0, 5, 5);
	gbc_codigoPostal.gridx = 2;
	gbc_codigoPostal.gridy = 5;
	panel.add(codigoPostal, gbc_codigoPostal);
	codigoPostal.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	
	textCodigoPostal = new JTextField();
	GridBagConstraints gbc_textCodigoPostal = new GridBagConstraints();
	gbc_textCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
	gbc_textCodigoPostal.insets = new Insets(0, 0, 5, 5);
	gbc_textCodigoPostal.gridx = 3;
	gbc_textCodigoPostal.gridy = 5;
	panel.add(textCodigoPostal, gbc_textCodigoPostal);
	textCodigoPostal.setColumns(10);
	
	co8_3 = new JLabel("Campo obligatorio");
	co8_3.setForeground(Color.RED);
	co8_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co8_3 = new GridBagConstraints();
	gbc_co8_3.anchor = GridBagConstraints.WEST;
	gbc_co8_3.insets = new Insets(0, 0, 5, 5);
	gbc_co8_3.gridx = 1;
	gbc_co8_3.gridy = 6;
	panel.add(co8_3, gbc_co8_3);
	
	co8_4 = new JLabel("Campo obligatorio");
	co8_4.setForeground(Color.RED);
	co8_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
	GridBagConstraints gbc_co8_4 = new GridBagConstraints();
	gbc_co8_4.insets = new Insets(0, 0, 5, 0);
	gbc_co8_4.anchor = GridBagConstraints.WEST;
	gbc_co8_4.gridx = 3;
	gbc_co8_4.gridy = 6;
	panel.add(co8_4, gbc_co8_4);
	
	btnSiguiente = new JButton("SIGUIENTE");
	btnSiguiente.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnSiguiente.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
	gbc_btnSiguiente.anchor = GridBagConstraints.EAST;
	gbc_btnSiguiente.insets = new Insets(10, 0, 10, 5);
	gbc_btnSiguiente.gridx = 1;
	gbc_btnSiguiente.gridy = 19;
	add(btnSiguiente, gbc_btnSiguiente);
	
	btnCancelar = new JButton("CANCELAR");
	btnCancelar.setBackground(Color.WHITE);
	btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
	gbc_btnCancelar.anchor = GridBagConstraints.WEST;
	gbc_btnCancelar.gridwidth = 2;
	gbc_btnCancelar.insets = new Insets(10, 0, 10, 5);
	gbc_btnCancelar.gridx = 2;
	gbc_btnCancelar.gridy = 19;
	add(btnCancelar, gbc_btnCancelar);
	
	List<JLabel> labels = new ArrayList<JLabel>();
	
	labels.add(co1);labels.add(co2);labels.add(co3);labels.add(co4);
	labels.add(co5);labels.add(co6);labels.add(co7);labels.add(co8);
	labels.add(co8_1);labels.add(co8_2);labels.add(co8_3);labels.add(co8_4);
	labels.add(co9_1);
	
	//this.limpiarWarnings(labels);
}

	public void limpiarWarnings(List<JLabel> labelAQuitar) {
		for(int i =0;i<labelAQuitar.size();i++) {
		labelAQuitar.get(i).setVisible(false);
		}
	}
	
}
