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
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JPanel panelMain;
	private JButton btnCadastro, btnLogin;
	private JLabel lblBilheteria;

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
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
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
		panelMain.setBorder(new MatteBorder(0, 0, 0, 5, (Color) new Color(0, 0, 0)));
		panelMain.setBackground(Color.WHITE);
		panelMain.setBounds(0, 0, 550, 710);
		contentPane.add(panelMain);
		panelMain.setLayout(null);

		lblBilheteria = new JLabel("BILHETERIA");
		lblBilheteria.setBorder(null);
		lblBilheteria.setForeground(Color.BLACK);
		lblBilheteria.setBounds(50, 300, 405, 110);
		panelMain.add(lblBilheteria);
		lblBilheteria.setFont(new Font("Verdana", Font.BOLD, 57));

		// btn login
		btnLogin = new JButton("Login");
		btnLogin.setBorder(new LineBorder(new Color(125, 169, 240), 5, true));
		btnLogin.setForeground(Color.BLACK);
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
		btnLogin.setBounds(800, 225, 210, 75);

		contentPane.add(btnLogin);

		// btn cadastro
		btnCadastro = new JButton("Cadastro");
		btnCadastro.setBorder(new LineBorder(new Color(122, 166, 239), 5, true));
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.setFont(new Font("Verdana", Font.BOLD, 24));
		btnCadastro.setBounds(800, 450, 210, 75);
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
