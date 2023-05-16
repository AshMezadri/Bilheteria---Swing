package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Historico extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
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

		setTitle("Histórico de Compra");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 1904, 119);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHistorico = new JLabel("HISTÓRICO");
		lblHistorico.setBounds(755, 24, 395, 70);
		panel.add(lblHistorico);
		lblHistorico.setFont(new Font("Verdana", Font.BOLD, 57));

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

		textSemHistorico = new JTextField();
		textSemHistorico.setBackground(new Color(255, 255, 255));
		textSemHistorico.setEditable(false);
		textSemHistorico.setEnabled(false);
		textSemHistorico.setBounds(187, 259, 1023, 309);
		contentPane.add(textSemHistorico);
		textSemHistorico.setColumns(10);
	}
}
