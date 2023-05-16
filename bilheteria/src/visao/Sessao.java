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

import javax.swing.JButton;

import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		panel.setBounds(0, 30, 1375, 115);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblSessao = new JLabel("Sessão");
		lblSessao.setBounds(30, 25, 250, 65);
		lblSessao.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSessao.setFont(new Font("Verdana", Font.BOLD, 55));
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSessao);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(50, 170, 1250, 515);
		contentPane.add(tabbedPane);
		Image img = new ImageIcon(this.getClass().getResource("/GuardioesGalaxia.png")).getImage();
		Image imgShrek = new ImageIcon(this.getClass().getResource("/Shrek2Resized.png")).getImage();
		Image imgBarb = new ImageIcon(this.getClass().getResource("/BarbieResized.png")).getImage();

		JPanel horarios = new JPanel();
		horarios.setForeground(new Color(7, 1, 88));
		horarios.setBackground(Color.WHITE);
		tabbedPane.addTab("Horários", null, horarios, null);
		horarios.setLayout(null);

		JLabel lblGuardioes = new JLabel("Guardiões da Galáxia");
		lblGuardioes.setFont(new Font("Verdana", Font.BOLD, 14));
		lblGuardioes.setBounds(265, 25, 170, 15);
		horarios.add(lblGuardioes);

		JLabel lblShrek = new JLabel("Shrek 2");
		lblShrek.setFont(new Font("Verdana", Font.BOLD, 14));
		lblShrek.setBounds(615, 25, 65, 14);
		horarios.add(lblShrek);

		JLabel lblBarbie = new JLabel("Barbie");
		lblBarbie.setFont(new Font("Verdana", Font.BOLD, 14));
		lblBarbie.setBounds(915, 25, 65, 14);
		horarios.add(lblBarbie);

		JLabel lblDub = new JLabel("Dublado");
		lblDub.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDub.setBounds(45, 320, 100, 26);
		horarios.add(lblDub);

		JLabel lblLeg = new JLabel("Legendado");
		lblLeg.setFont(new Font("Verdana", Font.BOLD, 20));
		lblLeg.setBounds(30, 402, 130, 23);
		horarios.add(lblLeg);

		JButton btnDubladoG = new JButton("16:00h");
		btnDubladoG.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDubladoG.setBackground(Color.WHITE);
		btnDubladoG.setBounds(295, 315, 115, 50);
		horarios.add(btnDubladoG);

		JButton btnLegendadoG = new JButton("18:30h");
		btnLegendadoG.setBackground(new Color(255, 255, 255));
		btnLegendadoG.setFont(new Font("Verdana", Font.BOLD, 16));
		btnLegendadoG.setBounds(295, 400, 115, 50);
		horarios.add(btnLegendadoG);

		JButton btnDubladoS = new JButton("20:00h");
		btnDubladoS.setBackground(new Color(255, 255, 255));
		btnDubladoS.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDubladoS.setBounds(590, 315, 112, 44);
		horarios.add(btnDubladoS);

		JButton btnLegendadoS = new JButton("19:30h");
		btnLegendadoS.setFont(new Font("Verdana", Font.BOLD, 16));
		btnLegendadoS.setBackground(new Color(255, 255, 255));
		btnLegendadoS.setBounds(590, 400, 112, 44);
		horarios.add(btnLegendadoS);

		JButton btnDubladoB = new JButton("17:00h");
		btnDubladoB.setFont(new Font("Verdana", Font.BOLD, 16));
		btnDubladoB.setBackground(new Color(255, 255, 255));
		btnDubladoB.setBounds(890, 315, 112, 44);
		horarios.add(btnDubladoB);

		JButton btnLegendadoB = new JButton("18:30h");
		btnLegendadoB.setFont(new Font("Verdana", Font.BOLD, 16));
		btnLegendadoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLegendadoB.setBackground(new Color(255, 255, 255));
		btnLegendadoB.setBounds(890, 400, 112, 44);
		horarios.add(btnLegendadoB);

		JLabel lblPosterGuardioes = new JLabel("");
		lblPosterGuardioes.setBounds(275, 50, 150, 215);
		horarios.add(lblPosterGuardioes);
		lblPosterGuardioes.setIcon(new ImageIcon(img));

		JLabel lblPosterShrek = new JLabel("");
		lblPosterShrek.setBounds(565, 50, 150, 215);
		horarios.add(lblPosterShrek);
		lblPosterShrek.setIcon(new ImageIcon(imgShrek));

		JLabel lblPosterBarbie = new JLabel("");
		lblPosterBarbie.setBounds(865, 50, 150, 215);
		horarios.add(lblPosterBarbie);
		lblPosterBarbie.setIcon(new ImageIcon(imgBarb));

		JPanel Assentos = new JPanel();
		Assentos.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Assentos", null, Assentos, null);
		Assentos.setLayout(null);

		JButton btn1A = new JButton("");
		btn1A.setBackground(new Color(255, 255, 255));
		btn1A.setBounds(185, 76, 66, 65);
		Assentos.add(btn1A);

		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Verdana", Font.BOLD, 22));
		lblA.setBounds(150, 96, 25, 28);
		Assentos.add(lblA);

		JLabel lbl1 = new JLabel("1");
		lbl1.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl1.setBounds(210, 37, 19, 28);
		Assentos.add(lbl1);

		JLabel lbl2 = new JLabel("2");
		lbl2.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl2.setBounds(297, 35, 19, 32);
		Assentos.add(lbl2);

		JLabel lbl3 = new JLabel("3");
		lbl3.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl3.setBounds(381, 35, 19, 32);
		Assentos.add(lbl3);

		JLabel lbl4 = new JLabel("4");
		lbl4.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl4.setBounds(461, 35, 19, 32);
		Assentos.add(lbl4);

		JLabel lbl5 = new JLabel("5");
		lbl5.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl5.setBounds(549, 35, 17, 32);
		Assentos.add(lbl5);

		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Verdana", Font.BOLD, 22));
		lblB.setBounds(150, 176, 25, 28);
		Assentos.add(lblB);

		JButton btn2A = new JButton("");
		btn2A.setBackground(new Color(255, 255, 255));
		btn2A.setBounds(273, 76, 66, 65);
		Assentos.add(btn2A);

		JButton btn3A = new JButton("");
		btn3A.setBackground(new Color(255, 255, 255));
		btn3A.setBounds(358, 76, 66, 65);
		Assentos.add(btn3A);

		JButton btn4A = new JButton("");
		btn4A.setBackground(new Color(255, 255, 255));
		btn4A.setFont(new Font("Verdana", Font.BOLD, 22));
		btn4A.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4A.setBounds(441, 76, 66, 65);
		Assentos.add(btn4A);

		JButton btn5A = new JButton("");
		btn5A.setBackground(new Color(255, 255, 255));
		btn5A.setFont(new Font("Verdana", Font.BOLD, 22));
		btn5A.setBounds(526, 76, 66, 65);
		Assentos.add(btn5A);

		JButton btn1B = new JButton("");
		btn1B.setBackground(new Color(255, 255, 255));
		btn1B.setFont(new Font("Verdana", Font.BOLD, 22));
		btn1B.setBounds(185, 162, 66, 65);
		Assentos.add(btn1B);

		JButton btn2B = new JButton("");
		btn2B.setBackground(new Color(255, 255, 255));
		btn2B.setFont(new Font("Verdana", Font.BOLD, 22));
		btn2B.setHorizontalAlignment(SwingConstants.RIGHT);
		btn2B.setBounds(273, 162, 66, 65);
		Assentos.add(btn2B);

		JButton btn3B = new JButton("");
		btn3B.setBackground(new Color(255, 255, 255));
		btn3B.setHorizontalAlignment(SwingConstants.RIGHT);
		btn3B.setBounds(358, 162, 66, 65);
		Assentos.add(btn3B);

		JButton btn4B = new JButton("");
		btn4B.setBackground(new Color(255, 255, 255));
		btn4B.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4B.setBounds(441, 162, 66, 65);
		Assentos.add(btn4B);

		JButton btn5B = new JButton("");
		btn5B.setBackground(new Color(255, 255, 255));
		btn5B.setBounds(526, 162, 66, 65);
		Assentos.add(btn5B);

		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Verdana", Font.BOLD, 22));
		lblC.setBounds(150, 270, 25, 21);
		Assentos.add(lblC);

		JButton btn1C = new JButton("");
		btn1C.setBackground(new Color(255, 255, 255));
		btn1C.setBounds(185, 248, 66, 65);
		Assentos.add(btn1C);

		JButton btn2C = new JButton("");
		btn2C.setBackground(new Color(255, 255, 255));
		btn2C.setBounds(273, 248, 66, 65);
		Assentos.add(btn2C);

		JButton btn3C = new JButton("");
		btn3C.setBackground(new Color(255, 255, 255));
		btn3C.setBounds(358, 248, 66, 65);
		Assentos.add(btn3C);

		JButton btn4C = new JButton("");
		btn4C.setBackground(new Color(255, 255, 255));
		btn4C.setBounds(441, 248, 66, 65);
		Assentos.add(btn4C);

		JButton btn5C = new JButton("");
		btn5C.setBackground(new Color(255, 255, 255));
		btn5C.setBounds(526, 248, 66, 65);
		Assentos.add(btn5C);

		JLabel lblD = new JLabel("D");
		lblD.setFont(new Font("Verdana", Font.BOLD, 22));
		lblD.setBounds(150, 354, 19, 21);
		Assentos.add(lblD);

		JButton btn1D = new JButton("");
		btn1D.setBackground(new Color(255, 255, 255));
		btn1D.setFont(new Font("Verdana", Font.BOLD, 22));
		btn1D.setBounds(185, 335, 66, 65);
		Assentos.add(btn1D);

		JButton btn2D = new JButton("");
		btn2D.setBackground(new Color(255, 255, 255));
		btn2D.setHorizontalAlignment(SwingConstants.RIGHT);
		btn2D.setBounds(273, 335, 66, 65);
		Assentos.add(btn2D);

		JButton btn3D = new JButton("");
		btn3D.setBackground(new Color(255, 255, 255));
		btn3D.setBounds(358, 335, 66, 65);
		Assentos.add(btn3D);

		JButton btn = new JButton("");
		btn.setBackground(new Color(255, 255, 255));
		btn.setBounds(441, 335, 66, 65);
		Assentos.add(btn);

		JButton btn5D = new JButton("");
		btn5D.setBackground(new Color(255, 255, 255));
		btn5D.setBounds(526, 335, 66, 65);
		Assentos.add(btn5D);
		
		JButton btnPagamento = new JButton("PAGAR");
		btnPagamento.setBounds(925, 200, 200, 70);
		Assentos.add(btnPagamento);
		btnPagamento.setFont(new Font("Verdana", Font.BOLD, 22));
		btnPagamento.setBackground(Color.WHITE);
		btnPagamento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Pagamento().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});
		
		JButton btnTelaPrincipal = new JButton("Voltar");
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
		
		
		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2.png")).getImage();
		Image imgB = new ImageIcon(this.getClass().getResource("/Barbie.png")).getImage();
		Image imgG = new ImageIcon(this.getClass().getResource("/GuardioesG.png")).getImage();

	}
}