package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarPremio extends JDialog implements ActionListener {
	private JLabel lblNmeroDeCliente;
	private JLabel lblPremioSorpresa;
	private JTextField txtNumeroCliente;
	private JTextField txtPremio;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarPremio dialog = new ConfigurarPremio();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarPremio() {
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);
		
		lblNmeroDeCliente = new JLabel("N\u00FAmero de cliente");
		lblNmeroDeCliente.setBounds(10, 11, 104, 16);
		getContentPane().add(lblNmeroDeCliente);
		
		lblPremioSorpresa = new JLabel("Premio sorpresa");
		lblPremioSorpresa.setBounds(10, 39, 94, 16);
		getContentPane().add(lblPremioSorpresa);
		
		txtNumeroCliente = new JTextField();
		txtNumeroCliente.setBounds(126, 9, 86, 20);
		getContentPane().add(txtNumeroCliente);
		txtNumeroCliente.setColumns(10);
		
		txtPremio = new JTextField();
		txtPremio.setBounds(126, 37, 86, 20);
		getContentPane().add(txtPremio);
		txtPremio.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 35, 89, 23);
		getContentPane().add(btnCancelar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
		
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		Tienda.numeroClienteSorpresa = leerNCliente(txtNumeroCliente);
		Tienda.premioSorpresa = leerPremio(txtPremio);
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	// MÉTODO CON RETORNO DE DATO
	// Lectura de número de cliente
	int leerNCliente(JTextField txt) {
		return Integer.parseInt(txt.getText());
	}
	//Lectura de premio sorpresa
	String leerPremio(JTextField txt) {
		return txt.getText();
	}
}
