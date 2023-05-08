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
	private JTextField textFaixa;
	private JTextField textFaixinha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1947, 1017);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHistorico = new JLabel("BILHETERIA");
		lblHistorico.setFont(new Font("Verdana", Font.BOLD, 57));
		lblHistorico.setBounds(706, 47, 664, 72);
		contentPane.add(lblHistorico);
		
		textFaixa = new JTextField();
		textFaixa.setEnabled(false);
		textFaixa.setEditable(false);
		textFaixa.setBounds(-23, 19, 1959, 136);
		contentPane.add(textFaixa);
		textFaixa.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
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
		btnLogin.setBounds(825, 327, 140, 47);
		
		contentPane.add(btnLogin);
		
		JButton btnCad = new JButton("Cadastro");
		btnCad.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCad.setBounds(825, 408, 140, 47);
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
			}
			});	

		contentPane.add(btnCad);
		

	}
	}

