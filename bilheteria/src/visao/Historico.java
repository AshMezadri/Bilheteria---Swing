package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Historico extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textFaixa;
	private JTextField textSemHistorico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historico frame = new Historico();
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
	public Historico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1947, 1017);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHistorico = new JLabel("Histórico de Compra");
		lblHistorico.setFont(new Font("Verdana", Font.BOLD, 57));
		lblHistorico.setBounds(358, 48, 664, 72);
		contentPane.add(lblHistorico);
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new Principal().setVisible(true);
					this.dispose();
				}

				private void dispose() {
					// TODO Auto-generated method stub	
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton.setBounds(1193, 612, 151, 58);
		contentPane.add(btnNewButton);
		
		textFaixa = new JTextField();
		textFaixa.setEnabled(false);
		textFaixa.setEditable(false);
		textFaixa.setBounds(-23, 19, 1959, 136);
		contentPane.add(textFaixa);
		textFaixa.setColumns(10);
		
		textSemHistorico = new JTextField();
		textSemHistorico.setBackground(new Color(69, 159, 185));
		textSemHistorico.setEditable(false);
		textSemHistorico.setEnabled(false);
		textSemHistorico.setBounds(187, 259, 1023, 309);
		contentPane.add(textSemHistorico);
		textSemHistorico.setColumns(10);
	}
}
