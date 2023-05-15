package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JTextPane;

public class Sessao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sessao frame = new Sessao();
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
	public Sessao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 14500, 13000);
		contentPane = new JPanel();
		contentPane.setBounds(100, 100, 450, 300);
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 29, 2020, 125);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSessao = new JLabel("SESSÃO");
		lblSessao.setBounds(804, 25, 268, 74);
		lblSessao.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSessao.setFont(new Font("Verdana", Font.BOLD, 60));
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSessao);
		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2.png")).getImage();
		Image imgB = new ImageIcon(this.getClass().getResource("/Barbie.png")).getImage();
		Image imgG = new ImageIcon(this.getClass().getResource("/GuardioesG.png")).getImage();

	}
}
