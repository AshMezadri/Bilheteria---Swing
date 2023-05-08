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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
		getContentPane().setBackground(new Color(69, 159, 185));
		getContentPane().setForeground(new Color(69, 159, 185));
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNome.setBounds(570, 216, 197, 131);
		getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Verdana", Font.BOLD, 20));
		textNome.setForeground(new Color(0, 0, 0));
		textNome.setBackground(new Color(69, 159, 185));
		textNome.setBounds(706, 256, 613, 63);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenha.setBounds(559, 358, 197, 131);
		getContentPane().add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setForeground(Color.BLACK);
		textSenha.setFont(new Font("Verdana", Font.BOLD, 20));
		textSenha.setColumns(10);
		textSenha.setBackground(new Color(69, 159, 185));
		textSenha.setBounds(706, 394, 613, 63);
		getContentPane().add(textSenha);
		
		JButton btnIr = new JButton("Ir para a página inicial");
		btnIr.setFont(new Font("Verdana", Font.BOLD, 20));
		btnIr.setBounds(730, 590, 402, 63);
		getContentPane().add(btnIr);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1947, 1017);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}

}
