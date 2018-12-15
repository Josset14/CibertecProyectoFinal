package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ConfigurarObsequio extends JDialog implements ActionListener {
	private JLabel lblMinimoCajas;
	private JLabel lblObsequio;
	private JTextField txtMinimoCajas;
	private JTextField txtObsequio;
	private JButton btnAceptar;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequio dialog = new ConfigurarObsequio();
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
	public ConfigurarObsequio() {
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblMinimoCajas = new JLabel("Cantidad Minima de Cajas Adquiridas");
		lblMinimoCajas.setBounds(10, 26, 213, 14);
		getContentPane().add(lblMinimoCajas);
		
		lblObsequio = new JLabel("Obsequio");
		lblObsequio.setBounds(10, 51, 213, 14);
		getContentPane().add(lblObsequio);
		
		txtMinimoCajas = new JTextField();
		txtMinimoCajas.setBounds(235, 23, 86, 20);
		getContentPane().add(txtMinimoCajas);
		txtMinimoCajas.setColumns(10);
		
		txtObsequio = new JTextField();
		txtObsequio.setColumns(10);
		txtObsequio.setBounds(235, 48, 86, 20);
		getContentPane().add(txtObsequio);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(333, 22, 89, 23);
		getContentPane().add(btnAceptar);
		
		button = new JButton("Cancelar");
		button.addActionListener(this);
		button.setBounds(333, 47, 89, 23);
		getContentPane().add(button);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		Tienda.cantidadObsequiable = leerMin(txtMinimoCajas);
		Tienda.obsequio = leerObsequio(txtObsequio);
		
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		dispose();
	}
	
	int leerMin(JTextField txt) {
		return Integer.parseInt(txt.getText());
	}
	
	String leerObsequio(JTextField txt) {
		return txt.getText();
	}
}
