package swing_facturacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import java.awt.GridBagLayout;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.util.ArrayList;

public class IngresarPago2 extends JPanel {
	public IngresarPago2() {
		
		setBackground(SystemColor.controlHighlight);
		this.setSize(new Dimension(800,600));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{45, 45, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{13, 13, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
//------------------ PANEL 1 ------------------------------------------
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		gbc_panel1.insets = new Insets(10, 10, 5, 5);
		gbc_panel1.fill = GridBagConstraints.BOTH;
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 0;
		add(panel1, gbc_panel1);
		
		GridBagLayout gbl_panel1 = new GridBagLayout();
		gbl_panel1.columnWidths = new int[]{200, 200, 40};
		gbl_panel1.rowHeights = new int[]{45,45,45};
		panel1.setLayout(gbl_panel1);
		
		
		JLabel nroFactura = new JLabel("Número de factura:");
		nroFactura.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_nroFactura = new GridBagConstraints();
		gbc_nroFactura.insets = new Insets(0, 10, 0, 0);
		gbc_nroFactura.anchor= GridBagConstraints.WEST;
		gbc_nroFactura.gridx=0;
		gbc_nroFactura.gridy=0;
		panel1.add(nroFactura, gbc_nroFactura);

		JLabel nombreResponsable = new JLabel("Nombre responsable de pago:");
		nombreResponsable.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_nombreResponsable = new GridBagConstraints();
		gbc_nombreResponsable.insets = new Insets(0, 10, 0, 0);
		gbc_nombreResponsable.gridx=0;
		gbc_nombreResponsable.gridy=1;
		gbc_nombreResponsable.anchor= GridBagConstraints.WEST;
		panel1.add(nombreResponsable, gbc_nombreResponsable);
		
		JLabel formaDePago = new JLabel("FORMA DE PAGO:");
		formaDePago.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_formaDePago = new GridBagConstraints();
		gbc_formaDePago.insets = new Insets(0, 10, 0, 0);
		gbc_formaDePago.gridx=0;
		gbc_formaDePago.gridy=2;
		gbc_formaDePago.anchor= GridBagConstraints.WEST;
		panel1.add(formaDePago, gbc_formaDePago);
		
		JComboBox comboFormaDePago = new JComboBox();
		GridBagConstraints gbc_comboFormaDePago = new GridBagConstraints();
		comboFormaDePago.setBackground(new Color(204,255,255));
		gbc_comboFormaDePago.insets = new Insets(0, 0, 0, 10);
		gbc_comboFormaDePago.gridx=1;
		gbc_comboFormaDePago.gridy=2;
		gbc_comboFormaDePago.fill = GridBagConstraints.HORIZONTAL;
		panel1.add(comboFormaDePago, gbc_comboFormaDePago);
		
//------------------ PANEL 2 ------------------------------------------
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.insets = new Insets(10, 10, 5, 5);
		gbc_panel2.fill = GridBagConstraints.BOTH;
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 1;
		add(panel2, gbc_panel2);
		
		GridBagLayout gbl_panel2 = new GridBagLayout();

		gbl_panel2.columnWidths = new int[]{200,200,0};
		gbl_panel2.rowHeights = new int[]{45,45,45,45,45,45,45,45,45};
		panel2.setLayout(gbl_panel2);
		
		JLabel importe = new JLabel("Importe:");
		importe.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_importe = new GridBagConstraints();
		gbc_importe.insets = new Insets(0, 10, 0, 0);
		gbc_importe.gridx=0;
		gbc_importe.gridy=0;
		gbc_importe.anchor= GridBagConstraints.WEST;
		panel2.add(importe, gbc_importe);
		
		JTextField textImporte = new JTextField();
		GridBagConstraints gbc_textImporte = new GridBagConstraints();
		gbc_textImporte.insets = new Insets(0, 0, 0, 10);
		gbc_textImporte.gridx=1;
		gbc_textImporte.gridy=0;
		gbc_textImporte.fill = GridBagConstraints.HORIZONTAL;
		//textImporte.setColumns(10);
		panel2.add(textImporte, gbc_textImporte);
		
		JLabel moneda = new JLabel("Moneda:");
		moneda.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_moneda = new GridBagConstraints();
		gbc_moneda.insets = new Insets(0, 10, 0, 0);
		gbc_moneda.gridx=0;
		gbc_moneda.gridy=1;
		gbc_moneda.anchor= GridBagConstraints.WEST;
		panel2.add(moneda, gbc_moneda);
		
		JComboBox comboMoneda= new JComboBox();
		comboMoneda.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_comboMoneda = new GridBagConstraints();
		gbc_comboMoneda.insets = new Insets(0, 0, 0, 10);
		gbc_comboMoneda.gridx=1;
		gbc_comboMoneda.gridy=1;
		gbc_comboMoneda.fill = GridBagConstraints.HORIZONTAL;
		panel2.add(comboMoneda, gbc_comboMoneda);
		
		JLabel cotizacion = new JLabel("Cotización:");
		cotizacion.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_cotizacion = new GridBagConstraints();
		gbc_cotizacion.insets = new Insets(0, 10, 0, 0);
		gbc_cotizacion.gridx=0;
		gbc_cotizacion.gridy=2;
		gbc_cotizacion.anchor= GridBagConstraints.WEST;
		panel2.add(cotizacion, gbc_cotizacion);
		
		JTextField textCotizacion = new JTextField();
		GridBagConstraints gbc_textCotizacion = new GridBagConstraints();
		gbc_textCotizacion.insets = new Insets(0, 0, 0, 10);
		gbc_textCotizacion.gridx=1;
		gbc_textCotizacion.gridy=2;
		gbc_textCotizacion.fill = GridBagConstraints.HORIZONTAL;
		//textImporte.setColumns(10);
		panel2.add(textCotizacion, gbc_textCotizacion);
		
		JLabel tarjetaCredito = new JLabel("Tarjeta de crédito:");
		tarjetaCredito.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_tarjetaCredito = new GridBagConstraints();
		gbc_tarjetaCredito.insets = new Insets(0, 10, 0, 0);
		gbc_tarjetaCredito.gridx=0;
		gbc_tarjetaCredito.gridy=3;
		gbc_tarjetaCredito.anchor= GridBagConstraints.WEST;
		panel2.add(tarjetaCredito, gbc_tarjetaCredito);
		
		JComboBox comboTarjetaCredito= new JComboBox();
		comboTarjetaCredito.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_comboTarjetaCredito = new GridBagConstraints();
		gbc_comboTarjetaCredito.insets = new Insets(0, 0, 0, 10);
		gbc_comboTarjetaCredito.gridx=1;
		gbc_comboTarjetaCredito.gridy=3;
		gbc_comboTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		panel2.add(comboTarjetaCredito, gbc_comboTarjetaCredito);
		
		JLabel tarjetaDebito = new JLabel("Tarjeta de débito:");
		tarjetaDebito.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_tarjetaDebito = new GridBagConstraints();
		gbc_tarjetaDebito.insets = new Insets(0, 10, 0, 0);
		gbc_tarjetaDebito.gridx=0;
		gbc_tarjetaDebito.gridy=4;
		gbc_tarjetaDebito.anchor= GridBagConstraints.WEST;
		panel2.add(tarjetaDebito, gbc_tarjetaDebito);
		
		JComboBox comboTarjetaDebito= new JComboBox();
		comboTarjetaDebito.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_comboTarjetaDebito = new GridBagConstraints();
		gbc_comboTarjetaDebito.insets = new Insets(0, 0, 0, 10);
		gbc_comboTarjetaDebito.gridx=1;
		gbc_comboTarjetaDebito.gridy=4;
		gbc_comboTarjetaDebito.fill = GridBagConstraints.HORIZONTAL;
		panel2.add(comboTarjetaDebito, gbc_comboTarjetaDebito);
		
		JLabel cheque = new JLabel("Nro de cheque:");
		cheque.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_cheque = new GridBagConstraints();
		gbc_cheque.insets = new Insets(0, 10, 0, 0);
		gbc_cheque.gridx=0;
		gbc_cheque.gridy=5;
		gbc_cheque.anchor= GridBagConstraints.WEST;
		panel2.add(cheque, gbc_cheque);
		
		JTextField textCheque = new JTextField();
		GridBagConstraints gbc_textCheque = new GridBagConstraints();
		gbc_textCheque.insets = new Insets(0, 0, 0, 10);
		gbc_textCheque.gridx=1;
		gbc_textCheque.gridy=5;
		gbc_textCheque.fill = GridBagConstraints.HORIZONTAL;
		//textCheque.setColumns(10);
		panel2.add(textCheque, gbc_textCheque);
		
		JLabel banco = new JLabel("Banco:");
		banco.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_banco = new GridBagConstraints();
		gbc_banco.insets = new Insets(0, 10, 0, 0);
		gbc_banco.gridx=0;
		gbc_banco.gridy=6;
		gbc_banco.anchor= GridBagConstraints.WEST;
		panel2.add(banco, gbc_banco);
		
		JComboBox comboBanco= new JComboBox();
		comboBanco.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_comboBanco = new GridBagConstraints();
		gbc_comboBanco.insets = new Insets(0, 0, 0, 10);
		gbc_comboBanco.gridx=1;
		gbc_comboBanco.gridy=6;
		gbc_comboBanco.fill = GridBagConstraints.HORIZONTAL;
		panel2.add(comboBanco, gbc_comboBanco);
		
		JLabel plaza = new JLabel("Plaza:");
		plaza.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_plaza = new GridBagConstraints();
		gbc_plaza.insets = new Insets(0, 10, 0, 0);
		gbc_plaza.gridx=0;
		gbc_plaza.gridy=7;
		gbc_plaza.anchor= GridBagConstraints.WEST;
		panel2.add(plaza, gbc_plaza);
		
		JTextField textPlaza = new JTextField();
		GridBagConstraints gbc_textPlaza = new GridBagConstraints();
		gbc_textPlaza.insets = new Insets(0, 0, 0, 10);
		gbc_textPlaza.gridx=1;
		gbc_textPlaza.gridy=7;
		gbc_textPlaza.fill = GridBagConstraints.HORIZONTAL;
		//textCheque.setColumns(10);
		panel2.add(textPlaza, gbc_textPlaza);
		
		JLabel fechaCobro = new JLabel("Fecha de cobro:");
		fechaCobro.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_fechaCobro = new GridBagConstraints();
		gbc_fechaCobro.insets = new Insets(0, 10, 0, 0);
		gbc_fechaCobro.gridx=0;
		gbc_fechaCobro.gridy=8;
		gbc_fechaCobro.anchor= GridBagConstraints.WEST;
		panel2.add(fechaCobro, gbc_fechaCobro);
		
		JButton btnCargar = new JButton("CARGAR");
		btnCargar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnCargar.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_btnCargar = new GridBagConstraints();
		gbc_btnCargar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargar.anchor = GridBagConstraints.CENTER;
		gbc_btnCargar.gridwidth=2;
		gbc_btnCargar.gridx = 0;
		gbc_btnCargar.gridy = 9;
		panel2.add(btnCargar, gbc_btnCargar);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnFinalizar.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_btnFinalizar = new GridBagConstraints();
		gbc_btnFinalizar.insets = new Insets(5, 0, 5, 5);
		gbc_btnFinalizar.anchor = GridBagConstraints.CENTER;
		gbc_btnFinalizar.gridx = 0;
		gbc_btnFinalizar.gridy = 10;
		panel2.add(btnFinalizar, gbc_btnFinalizar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		btnCancelar.setBackground(new Color(204,255,255));
		GridBagConstraints gbc_btnCancelar= new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(5, 0, 5, 5);
		gbc_btnCancelar.anchor = GridBagConstraints.CENTER;
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 10;
		panel2.add(btnCancelar, gbc_btnCancelar);
		
//------------------ PANEL 3 ------------------------------------------
		JPanel panel3 = new JPanel();
		
		GridBagLayout gbl_panel3 = new GridBagLayout();
		gbl_panel3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

		gbl_panel3.columnWidths = new int[]{300};
		gbl_panel3.rowHeights = new int[]{45,60,45,45,45,45};
		panel3.setLayout(gbl_panel3);
		
		panel3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel3 = new GridBagConstraints();
		gbc_panel3.insets = new Insets(10, 5, 5, 10);
		gbc_panel3.fill = GridBagConstraints.BOTH;
		gbc_panel3.gridx = 1;
		gbc_panel3.gridy = 0;
		gbc_panel3.gridheight=2;
		add(panel3, gbc_panel3);
		
		JLabel resumenPago = new JLabel("RESUMEN DE PAGO");
		resumenPago.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		GridBagConstraints gbc_resumenPago = new GridBagConstraints();
		gbc_resumenPago.insets = new Insets(5, 0, 5, 0);
		gbc_resumenPago.anchor= GridBagConstraints.EAST;
		gbc_resumenPago.gridx=0;
		gbc_resumenPago.gridy=0;
		panel3.add(resumenPago, gbc_resumenPago);
		
		JTable table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		


		Object[][] datos = new Object[][] {
			{"Tarjeta de crédito VISA Macro", "500", true}		
		};
		
		String[] nombresColumnas = new String[] {
				"Concepto", "Importe", ""
			};
		
		table.setModel(new DefaultTableModel(
			datos,nombresColumnas) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		autoajustarAnchoColumnas(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setPreferredSize(new Dimension(800, 200));
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 11;
		JScrollPane scrollPane = new JScrollPane(table);
		gbc_table.insets = new Insets(5, 5, 5, 0);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 1;
		//add(scrollPane, gbc_table);
		panel3.add(scrollPane, gbc_table);
		
		
		JLabel total = new JLabel("TOTAL A PAGAR: $...");
		total.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_total = new GridBagConstraints();
		gbc_total.insets = new Insets(0, 10, 5, 0);
		gbc_total.gridx=0;
		gbc_total.gridy=2;
		gbc_total.anchor= GridBagConstraints.WEST;
		panel3.add(total, gbc_total);
		
		JLabel vuelto = new JLabel("Vuelto:");
		vuelto.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_vuelto = new GridBagConstraints();
		gbc_vuelto.insets = new Insets(0, 10, 5, 0);
		gbc_vuelto.gridx=0;
		gbc_vuelto.gridy=3;
		gbc_vuelto.anchor= GridBagConstraints.WEST;
		panel3.add(vuelto, gbc_vuelto);
		
		JLabel monto = new JLabel("Monto acumulado: ");
		monto.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_monto = new GridBagConstraints();
		gbc_monto.insets = new Insets(0, 10, 5, 0);
		gbc_monto.gridx=0;
		gbc_monto.gridy=4;
		gbc_monto.anchor= GridBagConstraints.WEST;
		panel3.add(monto, gbc_monto);
		
		JLabel deuda = new JLabel("DEUDA: ");
		deuda.setFont(new Font("Leelawadee UI", Font.BOLD, 16));
		GridBagConstraints gbc_deuda = new GridBagConstraints();
		gbc_deuda.insets = new Insets(0, 10, 5, 0);
		gbc_deuda.gridx=0;
		gbc_deuda.gridy=5;
		gbc_deuda.anchor= GridBagConstraints.WEST;
		panel3.add(deuda, gbc_deuda);

		
		

	}
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
