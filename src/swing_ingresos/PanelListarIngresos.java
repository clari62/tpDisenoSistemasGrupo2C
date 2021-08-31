package swing_ingresos;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelListarIngresos extends JPanel {
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table;
	private JTable table_4;


public PanelListarIngresos() {
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{700};
	gridBagLayout.rowWeights = new double[]{0.0, 0.0};
	gridBagLayout.rowHeights = new int[]{200, 300};
	gridBagLayout.columnWeights = new double[]{0.0};

	//gridBagLayout.rowWeights = new double[]{0.0, 1.0};
//	gridBagLayout.columnWeights = new double[]{1.0};

	setLayout(gridBagLayout);
	
	JPanel panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel = new GridBagConstraints();
	gbc_panel.insets = new Insets(0, 0, 5, 0);
	gbc_panel.fill = GridBagConstraints.BOTH;
	gbc_panel.gridx = 0;
	gbc_panel.gridy = 0;
	add(panel, gbc_panel);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{276, 333, 0};
	gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JLabel lblNewLabel = new JLabel("Desde fecha:");
	lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel.insets = new Insets(5, 0, 5, 5);
	gbc_lblNewLabel.gridx = 0;
	gbc_lblNewLabel.gridy = 1;
	panel.add(lblNewLabel, gbc_lblNewLabel);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser = new GridBagConstraints();
	gbc_dateChooser.insets = new Insets(5, 0, 5, 0);
	gbc_dateChooser.fill = GridBagConstraints.BOTH;
	gbc_dateChooser.gridx = 1;
	gbc_dateChooser.gridy = 1;
	panel.add(dateChooser, gbc_dateChooser);
	
	JLabel lblHastaFecha = new JLabel("Hasta fecha:");
	lblHastaFecha.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_lblHastaFecha = new GridBagConstraints();
	gbc_lblHastaFecha.anchor = GridBagConstraints.EAST;
	gbc_lblHastaFecha.insets = new Insets(5, 0, 5, 5);
	gbc_lblHastaFecha.gridx = 0;
	gbc_lblHastaFecha.gridy = 2;
	panel.add(lblHastaFecha, gbc_lblHastaFecha);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	dateChooser_1.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
	gbc_dateChooser_1.insets = new Insets(5, 0, 5, 0);
	gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
	gbc_dateChooser_1.gridx = 1;
	gbc_dateChooser_1.gridy = 2;
	panel.add(dateChooser_1, gbc_dateChooser_1);
	
	JButton btnNewButton = new JButton("BUSCAR");
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
	gbc_btnNewButton.anchor = GridBagConstraints.WEST;
	gbc_btnNewButton.gridx = 1;
	gbc_btnNewButton.gridy = 3;
	panel.add(btnNewButton, gbc_btnNewButton);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 1;
	add(panel_1, gbc_panel_1);
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{0};
	gbl_panel_1.rowHeights = new int[]{55, 69, -25, 0};
	gbl_panel_1.columnWeights = new double[]{1.0};
	gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
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
			"New column", "New column", "New column"
		}
	));
	
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
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
			"New column", "New column", "New column"
		}
	));
	GridBagConstraints gbc_table_4 = new GridBagConstraints();
	gbc_table_4.ipady = 1;
	gbc_table_4.insets = new Insets(5, 5, 5, 5);
	gbc_table_4.fill = GridBagConstraints.BOTH;
	gbc_table_4.gridx = 0;
	gbc_table_4.gridy = 1;
	//panel_1.add(table_4, gbc_table_4);
	
	
	JScrollPane scrollPane1 = new JScrollPane(table_4);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 1;
	gbc_table.gridy = 0;
	//add(scrollPane, gbc_table);
	panel_1.add(scrollPane1,gbc_table_4);
	
	
}

}
