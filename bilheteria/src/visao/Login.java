package visao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNomeLogin, lblSenhaLogin;
	private JTextField txtNomeLogin;
	private JTextField txtSenhaLogin;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1947, 1017);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().setBackground(new Color(7, 1, 88));
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		// Nome
		lblNomeLogin = new JLabel("Nome: ");
		lblNomeLogin.setForeground(new Color(255, 255, 255));
		lblNomeLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNomeLogin.setBounds(570, 216, 100, 131);
		getContentPane().add(lblNomeLogin);

		txtNomeLogin = new JTextField();
		txtNomeLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNomeLogin.setForeground(new Color(0, 0, 0));
		txtNomeLogin.setBackground(new Color(192, 192, 192));
		txtNomeLogin.setBounds(706, 256, 613, 63);
		getContentPane().add(txtNomeLogin);
		txtNomeLogin.setColumns(10);

		// Senha
		lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(255, 255, 255));
		lblSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenhaLogin.setBounds(570, 358, 100, 131);
		getContentPane().add(lblSenhaLogin);

		txtSenhaLogin = new JTextField();
		txtSenhaLogin.setForeground(Color.BLACK);
		txtSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBackground(new Color(192, 192, 192));
		txtSenhaLogin.setBounds(706, 394, 613, 63);
		getContentPane().add(txtSenhaLogin);

		// Btn
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Principal().setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
			}
		});

		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		btnLogin.setBounds(824, 587, 402, 63);
		getContentPane().add(btnLogin);
		
	}

}
