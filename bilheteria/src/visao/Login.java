package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import modelo.Pessoa;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import modelo.Pessoa;
import controle.PessoaDAO;

public class Login extends JFrame {

	private JPanel contentPane, panelLogin;
	private JLabel lblEmailLogin, lblSenhaLogin, lblLogin, lblIcon;
	private JTextField txtEmailLogin;
	private JPasswordField txtSenhaLogin;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	private PessoaDAO pDAO = PessoaDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public Login() {

		setTitle("Login");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		getContentPane().setBackground(new Color(7, 1, 88));
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		// Email
		lblEmailLogin = new JLabel("Email: ");
		lblEmailLogin.setForeground(new Color(255, 255, 255));
		lblEmailLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEmailLogin.setBounds(644, 192, 105, 50);
		getContentPane().add(lblEmailLogin);

		txtEmailLogin = new JTextField();
		txtEmailLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailLogin.setForeground(new Color(0, 0, 0));
		txtEmailLogin.setBackground(Color.WHITE);
		txtEmailLogin.setBounds(775, 192, 500, 50);
		getContentPane().add(txtEmailLogin);
		txtEmailLogin.setColumns(10);

		// Senha
		lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(255, 255, 255));
		lblSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenhaLogin.setBounds(644, 328, 110, 50);
		getContentPane().add(lblSenhaLogin);

		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setForeground(Color.BLACK);
		txtSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBackground(Color.WHITE);
		txtSenhaLogin.setBounds(775, 330, 500, 50);
		getContentPane().add(txtSenhaLogin);

		// Btn login
		btnLogin = new JButton("Login");
		btnLogin.setBorder(new LineBorder(new Color(226, 226, 197), 4));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(txtSenhaLogin.getPassword());

				if (txtEmailLogin.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O email deve ser inserido!");
				} else if (senha.isEmpty()) {
					JOptionPane.showMessageDialog(null, "A senha deve ser inserida!");
				} else {
					boolean loginSucesso = false;
					for (Pessoa pessoa : pDAO.listaPessoas()) {
						if (pessoa.getEmail().equals(txtEmailLogin.getText()) && pessoa.getSenha().equals(senha)) {
							loginSucesso = true;
							break;
						}
					}

					if (loginSucesso) {
						JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
						// Lógica adicional após o login bem-sucedido
						new Principal().setVisible(true);
						this.dispose();

					} else {
						JOptionPane.showMessageDialog(null, "O login não foi possível");
					}
				}

			}

			private void dispose() {
				setVisible(false);

			}
		});

		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		btnLogin.setBounds(889, 450, 300, 60);
		getContentPane().add(btnLogin);

		// panel
		panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 350, 705);
		getContentPane().add(panelLogin);
		panelLogin.setLayout(null);

		// lbl login
		lblLogin = new JLabel("LogIn");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 57));
		lblLogin.setBounds(75, 250, 200, 70);
		panelLogin.add(lblLogin);

		// lbl icon
		lblIcon = new JLabel("");
		lblIcon.setBounds(125, 350, 75, 75);
		panelLogin.add(lblIcon);

		Image iconLogIn = new ImageIcon(this.getClass().getResource("/logIn.png")).getImage();
		lblIcon.setIcon(new ImageIcon(iconLogIn));
		Image iconLogIn1 = new ImageIcon(this.getClass().getResource("/logIn.png")).getImage();

		JLabel lblLogin = new JLabel("Olá, faça seu Login");
		lblLogin.setBounds(775, 39, 460, 73);

		getContentPane().add(lblLogin);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 42));

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Aluno\\Desktop\\Bilheteria-Swing\\bilheteria\\img\\Red Orange Cinema Festival Your Story.png"));
		lblNewLabel.setBounds(-156, 0, 713, 787);
		getContentPane().add(lblNewLabel);

	}
}
