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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarAlfajor extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtPeso;
	private JTextField txtSabor;
	private JComboBox cboMarca;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarAlfajor dialog = new ConsultarAlfajor();
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
	public ConsultarAlfajor() {
		setTitle("Consultar Alfajor");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setBounds(10, 11, 92, 14);
			contentPanel.add(lblMarca);
		}
		{
			JLabel lblPrecios = new JLabel("Precio (S/)");
			lblPrecios.setBounds(10, 36, 92, 14);
			contentPanel.add(lblPrecios);
		}
		{
			JLabel lblContenido = new JLabel("Contenido (und)");
			lblContenido.setBounds(10, 61, 92, 14);
			contentPanel.add(lblContenido);
		}
		{
			JLabel lblPesog = new JLabel("Peso (g)");
			lblPesog.setBounds(10, 86, 92, 14);
			contentPanel.add(lblPesog);
		}
		{
			JLabel lblSabor = new JLabel("Sabor");
			lblSabor.setBounds(10, 111, 92, 14);
			contentPanel.add(lblSabor);
		}
		
		txtPrecio = new JTextField(Tienda.precio0 + "");
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(112, 33, 86, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtContenido = new JTextField(Tienda.contenido0 + "");
		txtContenido.setEditable(false);
		txtContenido.setBounds(112, 58, 86, 20);
		contentPanel.add(txtContenido);
		txtContenido.setColumns(10);
		
		txtPeso = new JTextField(Tienda.peso0 + "");
		txtPeso.setEditable(false);
		txtPeso.setBounds(112, 83, 86, 20);
		contentPanel.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtSabor = new JTextField(Tienda.sabor0 + "");
		txtSabor.setEditable(false);
		txtSabor.setBounds(112, 108, 86, 20);
		contentPanel.add(txtSabor);
		txtSabor.setColumns(10);
		
		cboMarca = new JComboBox <String>();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Alfano", "Delicia", "Vimar", "Turok", "Habanna"}));
		cboMarca.setBounds(112, 8, 86, 20);
		contentPanel.add(cboMarca);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		int marca = cboMarca.getSelectedIndex();
		switch(marca) {
			case 0:
				txtPrecio.setText(Tienda.precio0 + "");
				txtContenido.setText(Tienda.contenido0 + "");
				txtPeso.setText(Tienda.peso0 + "");
				txtSabor.setText(Tienda.sabor0);
				break;
			case 1:
				txtPrecio.setText(Tienda.precio1 + "");
				txtContenido.setText(Tienda.contenido1 + "");
				txtPeso.setText(Tienda.peso1 + "");
				txtSabor.setText(Tienda.sabor1);
				break;
			case 2:
				txtPrecio.setText(Tienda.precio2 + "");
				txtContenido.setText(Tienda.contenido2 + "");
				txtPeso.setText(Tienda.peso2 + "");
				txtSabor.setText(Tienda.sabor2);
				break;
			case 3:
				txtPrecio.setText(Tienda.precio3 + "");
				txtContenido.setText(Tienda.contenido3 + "");
				txtPeso.setText(Tienda.peso3 + "");
				txtSabor.setText(Tienda.sabor3);
				break;
			default:
				txtPrecio.setText(Tienda.precio4+ "");
				txtContenido.setText(Tienda.contenido4 + "");
				txtPeso.setText(Tienda.peso4 + "");
				txtSabor.setText(Tienda.sabor4);
				break;
		}
	}
}
