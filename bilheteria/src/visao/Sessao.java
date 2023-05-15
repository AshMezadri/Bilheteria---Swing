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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(-553, 238, 2558, 646);
		contentPane.add(panel_1);
		
		JLabel lblGuardioes = new JLabel("Guardiões da Galáxia 3");
		lblGuardioes.setBounds(944, 24, 194, 14);
		panel_1.add(lblGuardioes);
		lblGuardioes.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Barbie");
		lblNewLabel_1.setBounds(2046, 24, 61, 14);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JLabel lblShrek = new JLabel("Shrek 2");
		lblShrek.setBounds(1530, 24, 73, 14);
		panel_1.add(lblShrek);
		lblShrek.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JLabel labelS = new JLabel("");
		labelS.setBounds(1441, 69, 250, 365);
		panel_1.add(labelS);
		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2.png")).getImage();
		labelS.setIcon(new ImageIcon(imgS));
		
		JLabel labelB = new JLabel("");
		labelB.setBounds(1968, 69, 217, 365);
		panel_1.add(labelB);
		Image imgB = new ImageIcon(this.getClass().getResource("/Barbie.png")).getImage();
		labelB.setIcon(new ImageIcon(imgB));
		
		JLabel labelG = new JLabel("");
		labelG.setBounds(918, 49, 278, 384);
		panel_1.add(labelG);
		Image imgG = new ImageIcon(this.getClass().getResource("/Guardioes.png")).getImage();
		labelG.setIcon(new ImageIcon(imgG));
		
		JTextPane txtShrek = new JTextPane();
		txtShrek.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtShrek.setText("Shrek e Fiona acabaram de voltar da lua de mel e vivem felizes em sua casa no pântano. O casal recebe um convite dos pais da princesa, que querem conhecer o novo genro, para um jantar no castelo.");
		txtShrek.setBounds(1410, 463, 328, 107);
		panel_1.add(txtShrek);
		
		JTextPane txtGuardioes = new JTextPane();
		txtGuardioes.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtGuardioes.setText("Peter Quill deve reunir sua equipe para defender o universo e proteger um dos seus. Se a missão não for totalmente bem-sucedida, isso pode levar ao fim dos Guardiões.");
		txtGuardioes.setBounds(903, 463, 328, 96);
		panel_1.add(txtGuardioes);
		
		JTextPane txtBarbie = new JTextPane();
		txtBarbie.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtBarbie.setText("Depois de ser expulsa da Barbieland por ser uma boneca de aparência menos do que perfeita, Barbie parte para o mundo humano em busca da verdadeira felicidade.");
		txtBarbie.setBounds(1917, 463, 328, 78);
		panel_1.add(txtBarbie);

	}
}
