package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ModificarAlfajor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtPeso;
	private JTextField txtSabor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModificarAlfajor dialog = new ModificarAlfajor();
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
	public ModificarAlfajor() {
		setTitle("Modifica alfajor");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setBounds(10, 11, 93, 14);
			contentPanel.add(lblMarca);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 36, 93, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblContenidoud = new JLabel("Contenido (ud)");
			lblContenidoud.setBounds(10, 61, 93, 14);
			contentPanel.add(lblContenidoud);
		}
		{
			JLabel lblPeso = new JLabel("Peso (g)");
			lblPeso.setBounds(10, 86, 72, 14);
			contentPanel.add(lblPeso);
		}
		{
			JLabel lblSabor = new JLabel("Sabor");
			lblSabor.setBounds(10, 111, 72, 14);
			contentPanel.add(lblSabor);
		}
		{
			JComboBox cboLista = new JComboBox();
			cboLista.setModel(new DefaultComboBoxModel(new String[] {"Alfajor", "Delicia", "Vimar", "Turok", "Havanna"}));
			cboLista.setBounds(113, 8, 104, 20);
			contentPanel.add(cboLista);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(113, 33, 104, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtContenido = new JTextField();
			txtContenido.setBounds(113, 58, 104, 20);
			contentPanel.add(txtContenido);
			txtContenido.setColumns(10);
		}
		{
			txtPeso = new JTextField();
			txtPeso.setBounds(113, 83, 104, 20);
			contentPanel.add(txtPeso);
			txtPeso.setColumns(10);
		}
		{
			txtSabor = new JTextField();
			txtSabor.setBounds(113, 108, 104, 20);
			contentPanel.add(txtSabor);
			txtSabor.setColumns(10);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			JButton btnGrabar = new JButton("Grabar");
			btnGrabar.setBounds(335, 36, 89, 23);
			contentPanel.add(btnGrabar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
