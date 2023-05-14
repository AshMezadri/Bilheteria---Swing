package visao;

import java.awt.Color;
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

		ListaPessoas = new ArrayList<>();

		// Email
		lblEmailLogin = new JLabel("Email: ");
		lblEmailLogin.setForeground(new Color(255, 255, 255));
		lblEmailLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEmailLogin.setBounds(570, 216, 100, 131);
		getContentPane().add(lblEmailLogin);

		txtEmailLogin = new JTextField();
		txtEmailLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailLogin.setForeground(new Color(0, 0, 0));
		txtEmailLogin.setBackground(new Color(192, 192, 192));
		txtEmailLogin.setBounds(706, 256, 613, 63);
		getContentPane().add(txtEmailLogin);
		txtEmailLogin.setColumns(10);

		// Senha
		lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setForeground(new Color(255, 255, 255));
		lblSenhaLogin.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenhaLogin.setBounds(570, 358, 100, 131);
		getContentPane().add(lblSenhaLogin);

		txtSenhaLogin = new JPasswordField();
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
                // Get the email and password from the input fields
                String email = txtEmailLogin.getText();
                String senha = new String(txtSenhaLogin.getPassword());

                // Check if a user with the given email and password exists in the ArrayList
                boolean userFound = false;
                for (Pessoa pessoa : ListaPessoas) {
                	if (pessoa.getEmail().equals(email) && pessoa.getSenha().equals(senha)) {
                        userFound = true;
                        // Show a welcome message to the user
                        JOptionPane.showMessageDialog(null, "Bem-vindo, " + pessoa.getNome() + "!");
                        break;
                    }
				}

                // Show an error message if the email and password combination was not found
                if (!userFound) {
                    JOptionPane.showMessageDialog(null, "Email ou senha incorretos.");
                }

                // Clear the password field
                txtSenhaLogin.setText("");
            }
        });

		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		btnLogin.setBounds(824, 587, 402, 63);
		getContentPane().add(btnLogin);
		


	}

}
