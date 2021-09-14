package swing_habitacion;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.SystemColor;



public class PanelReservarHabitacion1 extends JPanel {

	private JTable table;


public PanelReservarHabitacion1() {
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{757};
	gridBagLayout.columnWeights = new double[]{0.0};
	gridBagLayout.rowWeights = new double[]{0.0, 1.0};
	gridBagLayout.rowHeights = new int[]{75, 229};


	setLayout(gridBagLayout);
	
	JPanel panel = new JPanel();
	panel.setBackground(SystemColor.controlHighlight);
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel = new GridBagConstraints();
	gbc_panel.anchor = GridBagConstraints.NORTH;
	gbc_panel.insets = new Insets(5, 0, 5, 0);
	gbc_panel.fill = GridBagConstraints.HORIZONTAL;
	gbc_panel.gridx = 0;
	gbc_panel.gridy = 0;
	add(panel, gbc_panel);
	GridBagLayout gbl_panel = new GridBagLayout();
	gbl_panel.columnWidths = new int[]{237, 136, 232, 0};
	gbl_panel.rowHeights = new int[]{45, 0, 0, 48, 52, 0};
	gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gbl_panel);
	
	JLabel lblNewLabel = new JLabel("Desde fecha:");
	lblNewLabel.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
	gbc_lblNewLabel.insets = new Insets(5, 0, 5, 5);
	gbc_lblNewLabel.gridx = 0;
	gbc_lblNewLabel.gridy = 1;
	panel.add(lblNewLabel, gbc_lblNewLabel);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser = new GridBagConstraints();
	gbc_dateChooser.gridwidth = 2;
	gbc_dateChooser.insets = new Insets(5, 0, 5, 0);
	gbc_dateChooser.fill = GridBagConstraints.BOTH;
	gbc_dateChooser.gridx = 1;
	gbc_dateChooser.gridy = 1;
	panel.add(dateChooser, gbc_dateChooser);
	
	
	JLabel lblHastaFecha = new JLabel("Hasta fecha:");
	lblHastaFecha.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
	GridBagConstraints gbc_lblHastaFecha = new GridBagConstraints();
	gbc_lblHastaFecha.anchor = GridBagConstraints.EAST;
	gbc_lblHastaFecha.insets = new Insets(5, 0, 5, 5);
	gbc_lblHastaFecha.gridx = 0;
	gbc_lblHastaFecha.gridy = 2;
	panel.add(lblHastaFecha, gbc_lblHastaFecha);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	dateChooser_1.getCalendarButton().setBackground(Color.WHITE);
	GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
	gbc_dateChooser_1.gridwidth = 2;
	gbc_dateChooser_1.insets = new Insets(5, 0, 5, 0);
	gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
	gbc_dateChooser_1.gridx = 1;
	gbc_dateChooser_1.gridy = 2;
	panel.add(dateChooser_1, gbc_dateChooser_1);
	
	JButton btnBuscar = new JButton("BUSCAR");
	btnBuscar.setBackground(Color.WHITE);
	btnBuscar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
	gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
	gbc_btnNewButton.anchor = GridBagConstraints.EAST;
	gbc_btnNewButton.gridx = 1;
	gbc_btnNewButton.gridy = 4;
	panel.add(btnBuscar, gbc_btnNewButton);
	
	JButton btnCancelar = new JButton("CANCELAR");
	btnCancelar.setBackground(Color.WHITE);
	btnCancelar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
	gbc_btnCancelar.anchor = GridBagConstraints.WEST;
	gbc_btnCancelar.gridx = 2;
	gbc_btnCancelar.gridy = 4;
	panel.add(btnCancelar, gbc_btnCancelar);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(SystemColor.controlHighlight);
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	GridBagConstraints gbc_panel_1 = new GridBagConstraints();
	gbc_panel_1.insets = new Insets(0, 0, 5, 0);
	gbc_panel_1.fill = GridBagConstraints.BOTH;
	gbc_panel_1.gridx = 0;
	gbc_panel_1.gridy = 1;
	add(panel_1, gbc_panel_1);
	
	GridBagLayout gbl_panel_1 = new GridBagLayout();
	gbl_panel_1.columnWidths = new int[]{350, 71, 210};
	gbl_panel_1.rowHeights = new int[]{115, 0, 115, 0, 0, 0, 0};
	gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0};
	gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	panel_1.setLayout(gbl_panel_1);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{"01/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"02/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"03/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"04/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"05/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"06/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"07/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"08/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			{"09/09" , "OCUPADO", "LIBRE", "RESERVADO", "OCUPADO", "LIBRE"},
			},
		new String[] {
				"Fecha", "Habitacion 1", "Habitacion 2", "Habitacion 3", "Habitacion 4", "Habitacion 5", "Habitacion 6", "Habitacion 7", "Habitacion 8", "Habitacion 9", "Habitacion 10", "Habitacion 11", "Habitacion 12"
		}
	));
	
	table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
    for (int i=0; i<13; i++) {
        TableColumn column = table.getColumnModel().getColumn(i);
        column.setMinWidth(100);
        column.setMaxWidth(100);
        column.setPreferredWidth(100);
    }
	
	
	GridBagConstraints gbc_table = new GridBagConstraints();
	gbc_table.gridheight = 3;
	gbc_table.gridwidth = 3;
	gbc_table.insets = new Insets(5, 5, 5, 0);
	gbc_table.fill = GridBagConstraints.HORIZONTAL;
	gbc_table.gridx = 0;
	gbc_table.gridy = 0;

	
	JScrollPane scrollPane = new JScrollPane(table);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 0;
	gbc_table.gridy = 0;
	//add(scrollPane, gbc_table);
	panel_1.add(scrollPane, gbc_table);
	gbc_table.insets = new Insets(5, 5, 5, 5);
	gbc_table.fill = GridBagConstraints.BOTH;
	gbc_table.gridx = 1;
	gbc_table.gridy = 0;

	JButton btnContinuar = new JButton("CONTINUAR");
	btnContinuar.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
	btnContinuar.setBackground(Color.WHITE);
	GridBagConstraints gbc_btnContinuar = new GridBagConstraints();
	gbc_btnContinuar.gridwidth = 3;
	gbc_btnContinuar.insets = new Insets(0, 15, 5, 0);
	gbc_btnContinuar.gridx = 0;
	gbc_btnContinuar.gridy = 5;
	panel_1.add(btnContinuar, gbc_btnContinuar);

	
}

}