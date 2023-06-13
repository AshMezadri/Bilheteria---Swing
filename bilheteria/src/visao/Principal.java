package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class Principal extends JFrame {

	private JPanel contentPane, panel;
	private JLabel lblHome, lblGuardioes, lblBarbie, lblShrek, lblPosterGuardioes;
	private JButton btnSessoes, btnPerfil, btnHistorico;
	private Image imgS, imgB, imgG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {

		setTitle("Home");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBounds(100, 100, 450, 300);
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 30, 1375, 125);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panelMain = new JPanel();
		panelMain.setLayout(null);
		panelMain.setBackground(new Color(255, 255, 255));
		panelMain.setBounds(0, 257, 1375, 450);
		contentPane.add(panelMain);

		// lbl home
		lblHome = new JLabel("Home");
		lblHome.setBounds(30, 25, 250, 75);
		lblHome.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHome.setFont(new Font("Verdana", Font.BOLD, 60));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblHome);

		// btn Sessoes
		btnSessoes = new JButton("Sessões");
		btnSessoes.setBounds(850, 30, 140, 65);
		btnSessoes.setFont(new Font("Verdana", Font.BOLD, 20));
		btnSessoes.setBackground(new Color(148, 121, 255));
		btnSessoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Sessao().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});
		panel.add(btnSessoes);

		// btn perfil
		btnPerfil = new JButton("Perfil");
		btnPerfil.setFont(new Font("Verdana", Font.BOLD, 20));
		btnPerfil.setBackground(new Color(160, 254, 165));
		btnPerfil.setBounds(1000, 30, 140, 65);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Perfil().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});
		panel.add(btnPerfil);

		// btn historico
		btnHistorico = new JButton("Histórico");
		btnHistorico.setFont(new Font("Verdana", Font.BOLD, 20));
		btnHistorico.setBackground(new Color(254, 141, 129));
		btnHistorico.setBounds(1150, 30, 140, 65);
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Historico().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});
		panel.add(btnHistorico);
		

		JPanel panelMain1 = new JPanel();
		panelMain1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		panelMain1.setLayout(null);
		panelMain1.setBackground(new Color(255, 255, 255));
		panelMain1.setBounds(0, 257, 1375, 450);
		contentPane.add(panelMain1);

		//======filmes====== 
		lblGuardioes = new JLabel("Guardiões da Galáxia 3");
		lblGuardioes.setBounds(139, 45, 210, 15);
		panelMain1.add(lblGuardioes);
		lblGuardioes.setFont(new Font("Verdana", Font.BOLD, 16));

		lblBarbie = new JLabel("Barbie");
		lblBarbie.setBounds(639, 45, 65, 15);
		panelMain1.add(lblBarbie);
		lblBarbie.setFont(new Font("Verdana", Font.BOLD, 16));

		lblShrek = new JLabel("Shrek 2");
		lblShrek.setBounds(1039, 45, 75, 15);
		panelMain1.add(lblShrek);
		lblShrek.setFont(new Font("Verdana", Font.BOLD, 16));

		new JLabel("");
		JLabel lblPosterShrek = new JLabel("");
		lblPosterShrek.setBorder(new LineBorder(Color.BLACK, 3));
		lblPosterShrek.setBounds(994, 80, 150, 215);
		panelMain1.add(lblPosterShrek);
		imgS = new ImageIcon(this.getClass().getResource("/Shrek2Resized.png")).getImage();
		lblPosterShrek.setIcon(new ImageIcon(imgS));

		new JLabel("");
		JLabel lblPosterBarbie = new JLabel("");
		lblPosterBarbie.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblPosterBarbie.setBounds(589, 80, 150, 215);
		panelMain1.add(lblPosterBarbie);
		imgB = new ImageIcon(this.getClass().getResource("/BarbieResized.png")).getImage();
		lblPosterBarbie.setIcon(new ImageIcon(imgB));

		lblPosterGuardioes = new JLabel("");
		lblPosterGuardioes.setBounds(169, 80, 150, 215);
		JLabel lblPosterGuardioes = new JLabel("");
		lblPosterGuardioes.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblPosterGuardioes.setBounds(163, 80, 156, 215);
		panelMain1.add(lblPosterGuardioes);
		imgG = new ImageIcon(this.getClass().getResource("/GuardioesGalaxia.png")).getImage();
		lblPosterGuardioes.setIcon(new ImageIcon(imgG));

		//=====sinopse=====
		JTextPane txtShrek = new JTextPane();
		txtShrek.setEditable(false);
		txtShrek.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtShrek.setText(
				"Shrek e Fiona acabaram de voltar da lua de mel e vivem felizes em sua casa no pântano. O casal recebe um convite dos pais da princesa, que querem conhecer o novo genro, para um jantar no castelo.");
		txtShrek.setBounds(914, 315, 300, 100);
		panelMain1.add(txtShrek);

		JTextPane txtGuardioes = new JTextPane();
		txtGuardioes.setEditable(false);
		txtGuardioes.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		txtGuardioes.setBackground(Color.WHITE);
		txtGuardioes.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtGuardioes.setText(
				"Peter Quill deve reunir sua equipe para defender o universo e proteger um dos seus. Se a missão não for totalmente bem-sucedida, isso pode levar ao fim dos Guardiões.");
		txtGuardioes.setBounds(109, 315, 300, 100);
		panelMain1.add(txtGuardioes);

		JTextPane txtBarbie = new JTextPane();
		txtBarbie.setEditable(false);
		txtBarbie.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtBarbie.setText(
				"Depois de ser expulsa da Barbieland por ser uma boneca de aparência menos do que perfeita, Barbie parte para o mundo humano em busca da verdadeira felicidade.");
		txtBarbie.setBounds(514, 315, 300, 100);
		panelMain1.add(txtBarbie);

	}
}