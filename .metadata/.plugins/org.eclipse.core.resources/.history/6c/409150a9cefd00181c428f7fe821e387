package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class GenerarReportes extends JDialog {
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblTipoDeReporte;
	private JComboBox cboTipoDeReporte;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes dialog = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar reportes");
		setBounds(100, 100, 800, 400);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 73, 744, 265);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setBounds(10, 24, 121, 14);
		getContentPane().add(lblTipoDeReporte);
		
		cboTipoDeReporte = new JComboBox();
		cboTipoDeReporte.setBounds(136, 21, 440, 20);
		getContentPane().add(cboTipoDeReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(646, 20, 89, 23);
		getContentPane().add(btnCerrar);

	}

}
