package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JPanel panelMain;
	private JButton btnCadastro, btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {

		setTitle("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setToolTipText("Main");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMain = new JPanel();
		panelMain.setBackground(Color.WHITE);
		panelMain.setBounds(10, 36, 1904, 119);
		contentPane.add(panelMain);
		panelMain.setLayout(null);

		JLabel lblBilheteria = new JLabel("BILHETERIA");
		lblBilheteria.setBounds(502, 24, 395, 70);
		panelMain.add(lblBilheteria);
		lblBilheteria.setFont(new Font("Verdana", Font.BOLD, 57));

		btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}
		});

		btnLogin.setFont(new Font("Verdana", Font.BOLD, 24));
		btnLogin.setBounds(600, 365, 205, 70);

		contentPane.add(btnLogin);

		btnCadastro = new JButton("Cadastro");
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.setFont(new Font("Verdana", Font.BOLD, 24));
		btnCadastro.setBounds(600, 524, 205, 70);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new Cadastro().setVisible(true);

				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		contentPane.add(btnCadastro);

	}
}
