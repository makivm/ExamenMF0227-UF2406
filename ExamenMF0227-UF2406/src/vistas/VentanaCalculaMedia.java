package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import funciones.Utilidades;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField textUF2404;
	private JTextField textUF2405;
	private JTextField textUF2406;
	private JTextField textNombre;
	private JLabel lblNota;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculaMedia() {
		setTitle("Calcular media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[91.00,fill][grow,fill][56.00,fill][grow,fill][fill][grow,fill]", "[][fill][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		contentPane.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textNombre = new JTextField();
		contentPane.add(textNombre, "cell 1 0 5 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UF2404:");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		textUF2404 = new JTextField();
		contentPane.add(textUF2404, "cell 1 1,growx");
		textUF2404.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UF2405:");
		contentPane.add(lblNewLabel_2, "cell 2 1,alignx left");
		
		textUF2405 = new JTextField();
		contentPane.add(textUF2405, "cell 3 1,growx");
		textUF2405.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("UF2406:");
		contentPane.add(lblNewLabel_3, "cell 4 1,alignx trailing");
		
		textUF2406 = new JTextField();
		contentPane.add(textUF2406, "cell 5 1,growx");
		textUF2406.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 0 3 6 1,alignx center,growy");
		
		JButton btnCalcular = new JButton("Calcular Nota");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularMedia();
			}
		});
		panel.add(btnCalcular);
		
		JLabel lblNewLabel_4 = new JLabel("Nota Media:");
		contentPane.add(lblNewLabel_4, "cell 0 5,alignx trailing");
		
		lblNota = new JLabel("0.0");
		contentPane.add(lblNota, "cell 1 5");
		
		JLabel lblNewLabel_5 = new JLabel("Resultado:");
		contentPane.add(lblNewLabel_5, "cell 0 6,alignx trailing");
		
		lblResultado = new JLabel("No calculado aún");
		contentPane.add(lblResultado, "cell 1 6");
	}

	protected void calcularMedia() {
		String nombre= textNombre.getText();
		double uf2404=Double.parseDouble(textUF2404.getText());
		double uf2405=Double.parseDouble(textUF2405.getText());
		double uf2406=Double.parseDouble(textUF2406.getText());
		double media =(uf2404+uf2405+uf2406)/3;
		lblNota.setText(""+media);
		
		Utilidades u=new Utilidades();
		lblResultado.setText(nombre+"ha sacado un "+u.devuelveNota(media));
		
	}

}
