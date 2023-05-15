package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import modelo.Pessoa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmailLogin, lblSenhaLogin;
	private JTextField txtEmailLogin;
	private JPasswordField txtSenhaLogin;
	private ArrayList<Pessoa> ListaPessoas;

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
		setBounds(0, 0,screen.width,screen.height - 30);
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

		ListaPessoas = new ArrayList<>();

		// Email
		lblEmailLogin = new JLabel("Email: ");
		lblEmailLogin.setForeground(new Color(255, 255, 255));
		lblEmailLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEmailLogin.setBounds(346, 155, 100, 131);
		getContentPane().add(lblEmailLogin);

		txtEmailLogin = new JTextField();
		txtEmailLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailLogin.setForeground(new Color(0, 0, 0));
		txtEmailLogin.setBackground(new Color(192, 192, 192));
		txtEmailLogin.setBounds(482, 191, 613, 63);
		getContentPane().add(txtEmailLogin);
		txtEmailLogin.setColumns(10);

		// Senha
		lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(255, 255, 255));
		lblSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenhaLogin.setBounds(346, 294, 100, 131);
		getContentPane().add(lblSenhaLogin);

		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setForeground(Color.BLACK);
		txtSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBackground(new Color(192, 192, 192));
		txtSenhaLogin.setBounds(482, 330, 613, 63);
		getContentPane().add(txtSenhaLogin);

		// Btn
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new Principal().setVisible(true);

				this.dispose();
			}

			public void dispose() {

				setVisible(false);
			}

		});

		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		btnLogin.setBounds(482, 511, 402, 63);
		getContentPane().add(btnLogin);

	}

}
