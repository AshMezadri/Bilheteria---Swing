package visao;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JPanel panelMain;

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
		setBounds(100, 100, 1947, 1017);
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
		lblBilheteria.setBounds(755, 24, 395, 70);
		panelMain.add(lblBilheteria);
		lblBilheteria.setFont(new Font("Verdana", Font.BOLD, 57));

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub

			}
		});
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		btnLogin.setBounds(885, 365, 140, 47);

		contentPane.add(btnLogin);

		JButton btnCad = new JButton("Cadastro");
		btnCad.setBackground(Color.WHITE);
		btnCad.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCad.setBounds(885, 495, 140, 47);
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cadastro().setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
			}
		});

		contentPane.add(btnCad);

	}
}
