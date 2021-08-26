package swing_habitacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;



public class PanelReservarHabitacion1 extends JPanel {
	private JTable table;
	private DefaultTableModel modelo = null;

	/**
	 * Create the panel.
	 */
	public PanelReservarHabitacion1() {
		setBackground(SystemColor.controlHighlight);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 117, 87, 0, 111, 126, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 30, 0, 0, 0, 0, 44, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {

		}
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 5;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 2;
		separator.setPreferredSize(new Dimension(5,2));
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		add(separator, gbc_separator);
		JLabel lblNewLabel = new JLabel("Desde fecha:");
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(mascara);
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.gridwidth = 3;
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 3;
		gbc_formattedTextField.gridy = 4;
		add(formattedTextField, gbc_formattedTextField);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Hasta fecha:");
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascara);
		GridBagConstraints gbc_formattedTextField_1 = new GridBagConstraints();
		gbc_formattedTextField_1.gridwidth = 3;
		gbc_formattedTextField_1.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField_1.gridx = 3;
		gbc_formattedTextField_1.gridy = 5;
		add(formattedTextField_1, gbc_formattedTextField_1);
		
		
		JButton botonBuscar = new JButton("Buscar");
		botonBuscar.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		botonBuscar.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 6;
		add(botonBuscar, gbc_btnNewButton_1);
		
		JPanel panel = new JPanel();
		//panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 3;
		add(panel, gbc_panel);
		
		try {
			modelo = construirTabla("");
		} catch (ClassNotFoundException | SQLException e) {

			JOptionPane.showMessageDialog(this, "Ocurrio un error al obtener los datos.","Error",JOptionPane.ERROR_MESSAGE);
		}
		panel.setLayout(new BorderLayout());
		table = new JTable (modelo);
        for (int i=0; i<13; i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setMinWidth(100);
            column.setMaxWidth(100);
            column.setPreferredWidth(100);
        }
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //Solo permitir seleccionar una fila
		table.setFillsViewportHeight(true);
		table.setPreferredScrollableViewportSize(new Dimension(700, 300));
		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
		panel.add(table.getTableHeader(), BorderLayout.PAGE_START);
		
		JButton botonCancelar= new JButton("Cancelar");
		botonCancelar.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		botonCancelar.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 6;
		add(botonCancelar, gbc_btnNewButton);
		
		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.gridheight = 5;	
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 7;
		gbc_separator_3.gridy = 2;
		add(separator_3, gbc_separator_3);
	
		JSeparator separator_1 = new JSeparator();

		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		separator_1.setPreferredSize(new Dimension(5,2));
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.gridwidth = 5;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 2;
		gbc_separator_1.gridy = 7;
		add(separator_1, gbc_separator_1);
		
		
		panel.add(table, BorderLayout.CENTER);
		JScrollPane js=new JScrollPane(table);
		GridBagConstraints gbc_js = new GridBagConstraints();
		gbc_js.gridheight = 3;
		gbc_js.gridwidth = 7;
		gbc_js.insets = new Insets(0, 0, 5, 0);
		gbc_js.gridx = 2;
		gbc_js.gridy = 8;
		add(js, gbc_js);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContinuar.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		btnContinuar.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnContinuar = new GridBagConstraints();
		gbc_btnContinuar.insets = new Insets(0, 0, 5, 5);
		gbc_btnContinuar.gridx = 4;
		gbc_btnContinuar.gridy = 11;
		add(btnContinuar, gbc_btnContinuar);
		js.setVisible(true);
			
	}

	private  DefaultTableModel construirTabla(String sql) throws ClassNotFoundException, SQLException{
		
		//Setear columnas
		String[] columnas = {"Fecha", "Habitacion 1", "Habitacion 2", "Habitacion 3", "Habitacion 4", "Habitacion 5", "Habitacion 6", "Habitacion 7", "Habitacion 8", "Habitacion 9", "Habitacion 10", "Habitacion 11", "Habitacion 12"};

		//Construir modelo de la tabla vacia
		DefaultTableModel modelo = new DefaultTableModel(null,columnas){
		    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
		};
		//Aca habria que cargar los datos de cada habitacion
		for(int i=0; i<60; i++) {
			Object[] fila = {((i % 30)+ 1) + "/" + ((i/30) + 1) , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"};
		    modelo.addRow(fila);
		}
								
		return modelo;
		
	}

}
