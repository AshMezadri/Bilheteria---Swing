package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controle.PessoaDAO;
import modelo.Pessoa;
import java.awt.Button;
import javax.swing.SwingConstants;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmailCadastro, lblSenhaCadastro, lblCPFCadastro, lblNomeCadastro, lblCadastro;
	private JTextField txtNomeCadastro;
	private JPasswordField txtSenhaCadastro;
	private JTextField txtEmailCadastro;
	private JTextField txtCPFCadastro;
	private JPanel panelCadastro;
	private JButton btnTelaPrincipal, btnCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * CONSTRUTOR DA CLASSE
	 */
	public Cadastro() {
		setTitle("Cadastro");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(new Color(7, 1, 88));
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Histórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		panelCadastro = new JPanel();
		panelCadastro.setBackground(Color.WHITE);
		panelCadastro.setBounds(0, 0, 400, 705);
		getContentPane().add(panelCadastro);
		panelCadastro.setLayout(null);

		lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setForeground(Color.BLACK);
		lblCadastro.setBounds(21, 250, 330, 70);
		panelCadastro.add(lblCadastro);
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 53));

		JLabel lblIconCadastro = new JLabel("");
		lblIconCadastro.setBounds(150, 350, 75, 75);
		panelCadastro.add(lblIconCadastro);
		Image iconCadastro = new ImageIcon(this.getClass().getResource("/signUp.png")).getImage();
		lblIconCadastro.setIcon(new ImageIcon(iconCadastro));

		// Nome
		lblNomeCadastro = new JLabel("Nome: ");
		lblNomeCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCadastro.setForeground(Color.WHITE);
		lblNomeCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNomeCadastro.setBounds(500, 135, 95, 50);
		getContentPane().add(lblNomeCadastro);

		txtNomeCadastro = new JTextField();
		txtNomeCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNomeCadastro.setForeground(new Color(0, 0, 0));
		txtNomeCadastro.setBackground(Color.WHITE);
		txtNomeCadastro.setBounds(625, 135, 500, 50);
		getContentPane().add(txtNomeCadastro);

		// Email
		lblEmailCadastro = new JLabel("Email: ");
		lblEmailCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailCadastro.setForeground(new Color(255, 255, 255));
		lblEmailCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEmailCadastro.setBounds(500, 235, 90, 50);
		getContentPane().add(lblEmailCadastro);

		txtEmailCadastro = new JTextField();
		txtEmailCadastro.setForeground(Color.BLACK);
		txtEmailCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailCadastro.setColumns(10);
		txtEmailCadastro.setBackground(Color.WHITE);
		txtEmailCadastro.setBounds(625, 235, 500, 50);
		getContentPane().add(txtEmailCadastro);

		// CPF
		lblCPFCadastro = new JLabel("CPF: ");
		lblCPFCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCPFCadastro.setForeground(Color.WHITE);
		lblCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblCPFCadastro.setBounds(520, 335, 75, 50);
		getContentPane().add(lblCPFCadastro);

		/*****************/
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCPFCadastro = new JFormattedTextField(mascaraCpf);
		/*****************/
		
		txtCPFCadastro.setForeground(Color.BLACK);
		txtCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCPFCadastro.setColumns(10);
		txtCPFCadastro.setBackground(Color.WHITE);
		txtCPFCadastro.setBounds(625, 335, 500, 50);
		getContentPane().add(txtCPFCadastro);

		// Senha
		lblSenhaCadastro = new JLabel("Senha:");
		lblSenhaCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaCadastro.setForeground(new Color(255, 255, 255));
		lblSenhaCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblSenhaCadastro.setBounds(500, 435, 95, 50);
		getContentPane().add(lblSenhaCadastro);

		txtSenhaCadastro = new JPasswordField();
		txtSenhaCadastro.setForeground(Color.BLACK);
		txtSenhaCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaCadastro.setColumns(10);
		txtSenhaCadastro.setBackground(Color.WHITE);
		txtSenhaCadastro.setBounds(625, 435, 500, 50);
		getContentPane().add(txtSenhaCadastro);

		// Btn Cadastro
		btnCadastro = new JButton("Cadastrar");
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// saveUserInfo();
			}
		});

		btnCadastro.setFont(new Font("Verdana", Font.BOLD, 19));
		btnCadastro.setBounds(525, 575, 275, 55);
		getContentPane().add(btnCadastro);

		// Btn TelaPrincipal
		btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setForeground(Color.BLACK);
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(925, 575, 275, 55);

		btnTelaPrincipal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		getContentPane().add(btnTelaPrincipal);

	}

}
