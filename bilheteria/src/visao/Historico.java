package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Historico extends JFrame {

	private JPanel contentPane;

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
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setToolTipText("Histórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setBorder(new LineBorder(new Color(210, 123, 132), 4));
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(1150, 50, 150, 65);
		contentPane.add(btnTelaPrincipal);
		btnTelaPrincipal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Principal().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 1375, 125);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHistorico = new JLabel("HISTÓRICO");
		lblHistorico.setBounds(30, 25, 395, 75);
		panel.add(lblHistorico);
		lblHistorico.setFont(new Font("Verdana", Font.BOLD, 57));

	}
}
