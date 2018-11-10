package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarAlfajor;
	private JMenuItem mntmModificarAlfajor;
	private JMenuItem mntmListarAlfajores;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfiguracion;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarAlfajor = new JMenuItem("Consultar Alfajor");
		mntmConsultarAlfajor.addActionListener(this);
		mnMantenimiento.add(mntmConsultarAlfajor);
		
		mntmModificarAlfajor = new JMenuItem("Modificar Alfajor");
		mntmModificarAlfajor.addActionListener(this);
		mnMantenimiento.add(mntmModificarAlfajor);
		
		mntmListarAlfajores = new JMenuItem("Listar Alfajores");
		mntmListarAlfajores.addActionListener(this);
		mnMantenimiento.add(mntmListarAlfajores);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad \u00D3ptima");
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar Premio Sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarPremioSorpresa);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmListarAlfajores) {
			actionPerformedMntmListarAlfajores(arg0);
		}
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmModificarAlfajor) {
			actionPerformedMntmModificarAlfajor(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmConsultarAlfajor) {
			actionPerformedMntmConsultarAlfajor(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		dispose();
	}
	
	protected void actionPerformedMntmConsultarAlfajor(ActionEvent arg0) {
		ConsultarAlfajor dc = new ConsultarAlfajor();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmModificarAlfajor(ActionEvent arg0) {
		ModificarAlfajor dc = new ModificarAlfajor();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		Vender dc = new Vender();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		GenerarReportes dc = new GenerarReportes();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	

	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		ConfigurarDescuentos dc = new ConfigurarDescuentos();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		ConfigurarObsequio dc = new ConfigurarObsequio();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	

	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent arg0) {
		ConfigurarCantidadOptima dc = new ConfigurarCantidadOptima();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		ConfigurarPremio dc = new ConfigurarPremio();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent arg0) {
		ConfigurarObsequio dc = new ConfigurarObsequio();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		AcercaTienda dc = new AcercaTienda();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	
	protected void actionPerformedMntmListarAlfajores(ActionEvent arg0) {
		ListarAlfajor dc = new ListarAlfajor();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
		
	}
}
