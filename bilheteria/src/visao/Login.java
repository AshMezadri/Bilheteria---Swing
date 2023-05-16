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
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmailLogin, lblSenhaLogin;
	private JTextField txtEmailLogin;
	private JPasswordField txtSenhaLogin;

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
		lblEmailLogin.setBounds(450, 190, 105, 50);
		getContentPane().add(lblEmailLogin);

		txtEmailLogin = new JTextField();
		txtEmailLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailLogin.setForeground(new Color(0, 0, 0));
		txtEmailLogin.setBackground(Color.WHITE);
		txtEmailLogin.setBounds(575, 190, 500, 50);
		getContentPane().add(txtEmailLogin);
		txtEmailLogin.setColumns(10);

		// Senha
		lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(255, 255, 255));
		lblSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenhaLogin.setBounds(450, 328, 110, 50);
		getContentPane().add(lblSenhaLogin);

		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setForeground(Color.BLACK);
		txtSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBackground(Color.WHITE);
		txtSenhaLogin.setBounds(575, 330, 500, 50);
		getContentPane().add(txtSenhaLogin);

		// Btn
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
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
		btnLogin.setBounds(600, 500, 300, 60);
		getContentPane().add(btnLogin);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 350, 705);
		getContentPane().add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LogIn");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 57));
		lblLogin.setBounds(75, 250, 200, 70);
		panelLogin.add(lblLogin);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(125, 350, 75, 75);
		panelLogin.add(lblIcon);
		Image iconLogIn = new ImageIcon(this.getClass().getResource("/logIn.png")).getImage();
		lblIcon.setIcon(new ImageIcon(iconLogIn));

	}
}
