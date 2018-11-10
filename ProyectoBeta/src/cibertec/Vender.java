package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Vender extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblMarca;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JComboBox cboMarca;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vender dialog = new Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 800, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(21, 21, 59, 14);
		contentPanel.add(lblMarca);
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(21, 60, 77, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(21, 99, 77, 14);
			contentPanel.add(lblCantidad);
		}
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(121, 96, 86, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(121, 57, 86, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboMarca = new JComboBox();
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Alfano", "Delicia", "Vimar", "Turok", "Havanna"}));
		cboMarca.setBounds(121, 18, 86, 20);
		contentPanel.add(cboMarca);
		{
			JButton btnVender = new JButton("Vender");
			btnVender.setBounds(638, 17, 111, 23);
			contentPanel.add(btnVender);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(638, 56, 111, 23);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 136, 728, 200);
			contentPanel.add(scrollPane);
			
			txtS = new JTextArea();
			scrollPane.setViewportView(txtS);
		}
	}
}
