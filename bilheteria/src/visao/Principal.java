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

public class Principal extends JFrame {

	private JPanel contentPane;

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

		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 1375, 125);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(30, 25, 250, 75);
		lblHome.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHome.setFont(new Font("Verdana", Font.BOLD, 60));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblHome);

		// btn Sessoes
		JButton btnSessoes = new JButton("Sessões");
		btnSessoes.setBounds(850, 30, 140, 65);
		panel.add(btnSessoes);
		btnSessoes.setFont(new Font("Verdana", Font.BOLD, 20));
		btnSessoes.setBackground(new Color(203, 199, 254));
		btnSessoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Sessao().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		// btn perfil
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setFont(new Font("Verdana", Font.BOLD, 20));
		btnPerfil.setBackground(new Color(203, 199, 254));
		btnPerfil.setBounds(1000, 30, 140, 65);
		panel.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Perfil().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});
		
		
		// btn historico
		JButton btnHistorico = new JButton("Histórico");
		btnHistorico.setFont(new Font("Verdana", Font.BOLD, 20));
		btnHistorico.setBackground(new Color(203, 199, 254));
		btnHistorico.setBounds(1150, 30, 140, 65);
		panel.add(btnHistorico);
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Historico().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});
		

		JPanel panelMain = new JPanel();
		panelMain.setLayout(null);
		panelMain.setBackground(new Color(255, 255, 255));
		panelMain.setBounds(0, 257, 1375, 450);
		contentPane.add(panelMain);

		JLabel lblGuardioes = new JLabel("Guardiões da Galáxia 3");
		lblGuardioes.setBounds(139, 45, 210, 15);
		panelMain.add(lblGuardioes);
		lblGuardioes.setFont(new Font("Verdana", Font.BOLD, 16));

		JLabel lblBarbie = new JLabel("Barbie");
		lblBarbie.setBounds(639, 45, 65, 15);
		panelMain.add(lblBarbie);
		lblBarbie.setFont(new Font("Verdana", Font.BOLD, 16));

		JLabel lblShrek = new JLabel("Shrek 2");
		lblShrek.setBounds(1039, 45, 75, 15);
		panelMain.add(lblShrek);
		lblShrek.setFont(new Font("Verdana", Font.BOLD, 16));

		JLabel lblPosterShrek = new JLabel("");
		lblPosterShrek.setBounds(994, 80, 150, 215);
		panelMain.add(lblPosterShrek);
		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2Resized.png")).getImage();
		lblPosterShrek.setIcon(new ImageIcon(imgS));

		JLabel lblPosterBarbie = new JLabel("");
		lblPosterBarbie.setBounds(589, 80, 150, 215);
		panelMain.add(lblPosterBarbie);
		Image imgB = new ImageIcon(this.getClass().getResource("/BarbieResized.png")).getImage();
		lblPosterBarbie.setIcon(new ImageIcon(imgB));

		JLabel lblPosterGuardioes = new JLabel("");
		lblPosterGuardioes.setBounds(169, 80, 150, 215);
		panelMain.add(lblPosterGuardioes);
		Image imgG = new ImageIcon(this.getClass().getResource("/GuardioesGalaxia.png")).getImage();
		lblPosterGuardioes.setIcon(new ImageIcon(imgG));

		JTextPane txtShrek = new JTextPane();
		txtShrek.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtShrek.setText(
				"Shrek e Fiona acabaram de voltar da lua de mel e vivem felizes em sua casa no pântano. O casal recebe um convite dos pais da princesa, que querem conhecer o novo genro, para um jantar no castelo.");
		txtShrek.setBounds(914, 315, 300, 100);
		panelMain.add(txtShrek);

		JTextPane txtGuardioes = new JTextPane();
		txtGuardioes.setBackground(Color.WHITE);
		txtGuardioes.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtGuardioes.setText(
				"Peter Quill deve reunir sua equipe para defender o universo e proteger um dos seus. Se a missão não for totalmente bem-sucedida, isso pode levar ao fim dos Guardiões.");
		txtGuardioes.setBounds(109, 315, 300, 100);
		panelMain.add(txtGuardioes);

		JTextPane txtBarbie = new JTextPane();
		txtBarbie.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtBarbie.setText(
				"Depois de ser expulsa da Barbieland por ser uma boneca de aparência menos do que perfeita, Barbie parte para o mundo humano em busca da verdadeira felicidade.");
		txtBarbie.setBounds(514, 315, 300, 100);
		panelMain.add(txtBarbie);

	}
}