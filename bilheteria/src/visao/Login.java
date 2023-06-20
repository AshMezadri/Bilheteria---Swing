package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import controle.PessoaDAO;
import modelo.Pessoa;

public class Login extends JFrame {

	private JPanel contentPane, panelLogin;
	private JLabel lblEmailLogin, lblSenhaLogin, lblLogin, lblIcon;
	private JTextField txtEmailLogin;
	private JPasswordField txtSenhaLogin;
	private JButton btnLogin;
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
		lblEmailLogin.setBounds(450, 200, 100, 50);
		getContentPane().add(lblEmailLogin);

		txtEmailLogin = new JTextField();
		txtEmailLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailLogin.setForeground(new Color(0, 0, 0));
		txtEmailLogin.setBackground(Color.WHITE);
		txtEmailLogin.setBounds(555, 200, 500, 50);
		getContentPane().add(txtEmailLogin);
		txtEmailLogin.setColumns(10);

		// Senha
		lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(255, 255, 255));
		lblSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenhaLogin.setBounds(440, 325, 105, 50);
		getContentPane().add(lblSenhaLogin);

		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setForeground(Color.BLACK);
		txtSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBackground(Color.WHITE);
		txtSenhaLogin.setBounds(555, 325, 500, 50);
		getContentPane().add(txtSenhaLogin);

		// Btn login
		btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBorder(new LineBorder(new Color(149, 232, 236), 5, true));
		btnLogin.setBackground(new Color(183, 232, 174));
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
						JOptionPane.showMessageDialog(null, "Você não é cadastrado");
					}
				}

			}

			private void dispose() {
				setVisible(false);
			}
		});

		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		btnLogin.setBounds(660, 500, 210, 75);
		getContentPane().add(btnLogin);

		// panel
		panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 372, 781);
		getContentPane().add(panelLogin);
		panelLogin.setLayout(null);

		// lbl login
		lblLogin = new JLabel("LogIn");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 57));
		lblLogin.setBounds(70, 250, 200, 70);
		panelLogin.add(lblLogin);

		// lbl icon
		lblIcon = new JLabel("");
		lblIcon.setBounds(120, 350, 75, 75);
		panelLogin.add(lblIcon);

		Image iconLogIn = new ImageIcon(this.getClass().getResource("/logIn.png")).getImage();
		lblIcon.setIcon(new ImageIcon(iconLogIn));
		Image iconLogIn1 = new ImageIcon(this.getClass().getResource("/logIn.png")).getImage();

		JLabel lblLogin = new JLabel("Olá, faça seu Login");
		lblLogin.setBounds(550, 65, 460, 73);

		getContentPane().add(lblLogin);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 42));

		JButton btnCadastro = new JButton("Não possui \r\ncadastro?");
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastro.setFont(new Font("Verdana", Font.ITALIC, 17));
		btnCadastro.setBorder(new LineBorder(new Color(125, 169, 240), 5, true));
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.setBounds(1100, 600, 210, 70);

		btnCadastro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				new Cadastro().setVisible(true);
				dispose();
			}

			private void dispose() {
				setVisible(false);
			}
		});

		getContentPane().add(btnCadastro);

	}
}
